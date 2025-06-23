package com.example.NotificationDemo.config;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class ResponseConfig {
    private String message;
    private HttpStatus status;
    private Object data;
    private LocalDateTime timestamp;
}
