package com.example.NotificationDemo.controller;

import com.example.NotificationDemo.config.ResponseConfig;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
@RestController
@RequestMapping(path = "/api/v1/notification")
public class NotificationController {
    @PostMapping(path = "send-email")
    public ResponseConfig sendEmail(
            @RequestParam(name = "sender_email")String senderEmail,@RequestParam(name = "reciever_email")String recieverEmail){
        return ResponseConfig.builder()
                .message("Email sent")
                .status(HttpStatus.OK)
                .data("Email sent to "+recieverEmail)
                .timestamp(LocalDateTime.now())
                .build();
    }
}

