package com.example.EmployeeDemo.controller;

import com.example.EmployeeDemo.config.ResponseApi;
import com.example.EmployeeDemo.dto.EmployeeDto;
import com.example.EmployeeDemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/employee/v1")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;
    @PostMapping(path = "")
    public ResponseEntity<ResponseApi> registerEmp(@RequestBody EmployeeDto employeeDto){
        ResponseApi savedEmployee=employeeService.restTempEmployee(employeeDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedEmployee);
    }

}
