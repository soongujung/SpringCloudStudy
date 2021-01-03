package io.study.eurekafeignclient.employee;

import lombok.Data;

@Data
public class EmployeeDto {
	private String name;
	private String id;
	private Long deptId;
}
