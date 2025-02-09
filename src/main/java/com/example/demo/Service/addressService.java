package com.example.demo.Service;


import org.springframework.stereotype.Service;

import com.example.demo.Repository.addressRepository;
import com.example.demo.models.address;

import java.util.List;
import java.util.Optional;

@Service
public class addressService {
    private final addressRepository employeeRepository;

    public addressService(addressRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<address> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public address saveEmployee(address employee) {
        return employeeRepository.save(employee);
    }

    public Optional<address> getEmployeeByUserName(String userName) {
        return employeeRepository.findByUserName(userName);
    }
}
