package com.ykb.employee.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue
    private Long id_key;

    private Long id;

    private String name;

    private String surname;

    private LocalDate startDate;

    private LocalDate endDate;
}
