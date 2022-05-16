package com.example.service;

import com.exception.MessageFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Date;
import java.util.Properties;

@Component
public class NotificationService {
    @Autowired
    private Environment env;
    public void sendNotificationList(String subject, String content, String recipient) {
        try {
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            Session session = Session.getInstance(props, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(env.getProperty("app.email.id"), env.getProperty("app.email.password"));
                }
            });
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(env.getProperty("app.email.id"), false));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            msg.setSubject(subject);
            msg.setContent(content, "text/html");
            msg.setSentDate(new Date());
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(content, "text/html");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            msg.setContent(multipart);
            Transport.send(msg);
        } catch (MessagingException e) {
            e.printStackTrace();
            throw new MessageFailedException(e.getMessage());
        }

    }
}
