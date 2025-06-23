package com.example.EmployeeDemo.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ResponseApi {
    private String message;
    private HttpStatus status;
    private Object data;
    private LocalDateTime timestamp;
}
