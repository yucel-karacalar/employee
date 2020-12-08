package com.ykb.employee.api;

import com.ykb.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/migrate-employees")
    private ResponseEntity<Void> migrateEmployees() {
        employeeService.migrateEmployees();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
