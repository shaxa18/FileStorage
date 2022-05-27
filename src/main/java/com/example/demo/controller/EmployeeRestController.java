package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.model.FileStorage;
import com.example.demo.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee")
    public ResponseEntity create(@RequestBody Employee employee){
        Employee employee1=employeeService.save(employee);
        return ResponseEntity.ok("successfully saved");
    }
    @GetMapping("/employees")
    public ResponseEntity getAll(){
        List<Employee>employeeList=employeeService.findAll();
        return ResponseEntity.ok(employeeList);
    }
}
