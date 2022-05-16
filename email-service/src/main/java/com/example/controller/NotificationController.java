package com.example.controller;

import com.example.service.NotificationService;
import com.util.EmailProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    NotificationService service;

    @PostMapping("/sendMail")
    public ResponseEntity<String> sendNotification(@RequestBody EmailProperties emailProperties){
        try {
            service.sendNotificationList(emailProperties.getSubject(),
                    emailProperties.getContent(), emailProperties.getRecipient());
            return new ResponseEntity<>("Message sent successfully.",HttpStatus.ACCEPTED);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>("Message failed.",HttpStatus.EXPECTATION_FAILED);
        }
    }
}
