package com.example.demo.Controller;


import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.addressService;
import com.example.demo.models.address;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "*")
public class addressController {
    private final addressService employeeService;

    public addressController(addressService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<address> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public address createEmployee(@RequestBody address employee) {
        return employeeService.saveEmployee(employee);
    }

    @PostMapping("/login")
    public Optional<address> login(@RequestBody address employee) {
        return employeeService.getEmployeeByUserName(employee.getUserName());
    }
}
