package io.study.eurekaservice.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
public class Employee {

	public Employee (String id, String name, Long deptId){
		this.id = id;
		this.name = name;
		this.deptId = deptId;
	}

	@GeneratedValue
	@Id @Column(name = "employee_seq")
	private Long seq;

	@Column(name = "employee_id")
	private String id;

	@Column(name = "employee_name")
	private String name;

	@Column(name = "dept_id")
	private Long deptId;
}
