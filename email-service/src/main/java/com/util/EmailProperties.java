package com.util;

import lombok.Data;

@Data
public class EmailProperties {
    private String subject;
    private String content;
    private String recipient;
}
