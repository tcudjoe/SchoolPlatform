package org.tcudjoe.eduplatformbackend.domain.shared;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Getter
@Setter
public class BaseEmployee extends BaseUser{
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long employeeNumber;
	private LocalDate hireDate;
	private String phonenumber;
	private String function;
}
