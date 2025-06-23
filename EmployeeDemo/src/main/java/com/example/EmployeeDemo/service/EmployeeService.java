package com.example.EmployeeDemo.service;

import com.example.EmployeeDemo.config.ResponseApi;
import com.example.EmployeeDemo.dto.EmployeeDto;

public interface EmployeeService {
   EmployeeDto registerEmployee(EmployeeDto employeeDto);
  ResponseApi restTempEmployee(EmployeeDto employeeDto);
}
