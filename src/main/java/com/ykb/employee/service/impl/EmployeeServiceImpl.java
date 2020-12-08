package com.ykb.employee.service.impl;

import com.ykb.employee.persistence.entity.Employee;
import com.ykb.employee.persistence.repository.EmployeeRepository;
import com.ykb.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.ListUtils;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public void migrateEmployees() {
        List<Employee> employeeList = employeeRepository.getAllByOrderByIdAscAndStartDateDesc();

        List<List<Employee>> partitionList = ListUtils.partition(employeeList, 5);
        Iterator<List<Employee>> iterator = partitionList.iterator();
        List<List<Employee>> resultPartitionList = new ArrayList<>();
        List<Employee> nextEmployees = new ArrayList<>();

        List<Employee> previousList = null;
        if (iterator.hasNext()) previousList = iterator.next(); // previous listeyi al

        while (iterator.hasNext()) {
            List<Employee> currentList = iterator.next(); // next listeyi al
            List<Employee> previousEmployees = new ArrayList<>(nextEmployees);

            Employee lastEmployee = previousList.get(previousList.size() - 1);

            nextEmployees = currentList.stream()
                    .filter(employee -> employee.getId().equals(lastEmployee.getId()))
                    .collect(Collectors.toList());

            if (nextEmployees.size() > 0) {
                List<Employee> copyOfPreviousEmployeeList = new ArrayList<>(previousList);
                copyOfPreviousEmployeeList.addAll(nextEmployees);
                if (previousEmployees.size() > 0)
                    copyOfPreviousEmployeeList.removeAll(previousEmployees);
                resultPartitionList.add(copyOfPreviousEmployeeList);
            }

            previousList = currentList;
        }

        System.out.println(resultPartitionList);
    }
}
