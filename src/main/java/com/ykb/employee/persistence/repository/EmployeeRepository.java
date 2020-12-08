package com.ykb.employee.persistence.repository;

import com.ykb.employee.persistence.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "select * from employee", nativeQuery = true)
    List<Employee> getAllByOrderByIdAscAndStartDateDesc();
}