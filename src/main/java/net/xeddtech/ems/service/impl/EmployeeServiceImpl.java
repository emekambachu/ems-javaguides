package net.xeddtech.ems.service.impl;

import lombok.AllArgsConstructor;
import net.xeddtech.ems.dto.EmployeeDto;
import net.xeddtech.ems.entity.Employee;
import net.xeddtech.ems.mapper.EmployeeMapper;
import net.xeddtech.ems.repository.EmployeeRepository;
import net.xeddtech.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto){

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
