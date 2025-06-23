package com.example.EmployeeDemo.service.imple;

import com.example.EmployeeDemo.config.ResponseApi;
import com.example.EmployeeDemo.dto.EmployeeDto;
import com.example.EmployeeDemo.entity.Employee;
import com.example.EmployeeDemo.repo.EmployeeRepo;
import com.example.EmployeeDemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final ModelMapper modelMapper;
    private final RestTemplate restTemplate;

    @Override
    public EmployeeDto registerEmployee(EmployeeDto employeeDto) {
        Employee employee=modelMapper.map(employeeDto,Employee.class);
      Employee saved= employeeRepo.save(employee);
        return modelMapper.map(saved,EmployeeDto.class);
    }

    @Override
    public ResponseApi restTempEmployee(EmployeeDto employeeDto) {
        Employee employee=modelMapper.map(employeeDto,Employee.class);
        Employee savedEmployee=employeeRepo.save(employee);
        String senderEmail="sri@gmail.com";
        String recieverEmail=employee.getEmail();
        return restTemplate.postForObject("http://localhost:8081/api/v1/notification/send-email?sender_email={senderEmail}&reciever_email={recieverEmail}",
               null,ResponseApi.class,senderEmail,recieverEmail);
    }

}
