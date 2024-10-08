package ges.javaguides.employeeservice.service;

import ges.javaguides.employeeservice.dto.APIResponseDto;
import ges.javaguides.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
