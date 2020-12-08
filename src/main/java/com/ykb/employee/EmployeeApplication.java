package com.ykb.employee;

import com.ykb.employee.persistence.entity.Employee;
import com.ykb.employee.persistence.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		employeeRepository.deleteAll();

		Employee employee = new Employee();
		employee.setId(1L);
		employee.setName("name");
		employee.setSurname("surname");
		employee.setStartDate(LocalDate.of(2020, 1, 1));
		employee.setEndDate(LocalDate.of(2020, 1, 15));

		employeeRepository.save(employee);

		employee = new Employee();
		employee.setId(1L);
		employee.setName("name");
		employee.setSurname("surname");
		employee.setStartDate(LocalDate.of(2020, 1, 1));
		employee.setEndDate(LocalDate.of(2020, 1, 15));

		employeeRepository.save(employee);

		employee = new Employee();
		employee.setId(1L);
		employee.setName("name");
		employee.setSurname("surname");
		employee.setStartDate(LocalDate.of(2020, 1, 1));
		employee.setEndDate(LocalDate.of(2020, 1, 15));

		employeeRepository.save(employee);

		employee = new Employee();
		employee.setId(2L);
		employee.setName("name");
		employee.setSurname("surname");
		employee.setStartDate(LocalDate.of(2020, 1, 1));
		employee.setEndDate(LocalDate.of(2020, 1, 15));

		employeeRepository.save(employee);

		employee = new Employee();
		employee.setId(2L);
		employee.setName("name");
		employee.setSurname("surname");
		employee.setStartDate(LocalDate.of(2020, 1, 1));
		employee.setEndDate(LocalDate.of(2020, 1, 15));

		employeeRepository.save(employee);

		employee = new Employee();
		employee.setId(2L);
		employee.setName("name");
		employee.setSurname("surname");
		employee.setStartDate(LocalDate.of(2020, 1, 1));
		employee.setEndDate(LocalDate.of(2020, 1, 15));

		employeeRepository.save(employee);

		employee = new Employee();
		employee.setId(2L);
		employee.setName("name");
		employee.setSurname("surname");
		employee.setStartDate(LocalDate.of(2020, 1, 1));
		employee.setEndDate(LocalDate.of(2020, 1, 15));

		employeeRepository.save(employee);

		employee = new Employee();
		employee.setId(3L);
		employee.setName("name");
		employee.setSurname("surname");
		employee.setStartDate(LocalDate.of(2020, 1, 1));
		employee.setEndDate(LocalDate.of(2020, 1, 15));

		employeeRepository.save(employee);

		employee = new Employee();
		employee.setId(3L);
		employee.setName("name");
		employee.setSurname("surname");
		employee.setStartDate(LocalDate.of(2020, 1, 1));
		employee.setEndDate(LocalDate.of(2020, 1, 15));

		employeeRepository.save(employee);

		employee = new Employee();
		employee.setId(4L);
		employee.setName("name");
		employee.setSurname("surname");
		employee.setStartDate(LocalDate.of(2020, 1, 1));
		employee.setEndDate(LocalDate.of(2020, 1, 15));

		employeeRepository.save(employee);

		employee = new Employee();
		employee.setId(4L);
		employee.setName("name");
		employee.setSurname("surname");
		employee.setStartDate(LocalDate.of(2020, 1, 1));
		employee.setEndDate(LocalDate.of(2020, 1, 15));

		employeeRepository.save(employee);

		employee = new Employee();
		employee.setId(4L);
		employee.setName("name");
		employee.setSurname("surname");
		employee.setStartDate(LocalDate.of(2020, 1, 1));
		employee.setEndDate(LocalDate.of(2020, 1, 15));

		employeeRepository.save(employee);

	}
}
