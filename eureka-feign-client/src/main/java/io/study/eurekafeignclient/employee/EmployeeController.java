package io.study.eurekafeignclient.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private final EmployeeFeignClient client;

	public EmployeeController(EmployeeFeignClient client){
		this.client = client;
	}

	@GetMapping
	public EmployeeDto getEmployeeAll(){
		return client.getEmployeeAll();
	}

	@GetMapping("/{id}")
	public EmployeeDto getEmployeeById(Long id){
		return client.getEmployee(id);
	}
}
