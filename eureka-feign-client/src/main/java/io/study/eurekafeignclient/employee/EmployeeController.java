package io.study.eurekafeignclient.employee;

import io.study.eurekafeignclient.config.IngredientFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private IngredientFeignClient client;

	public EmployeeController(IngredientFeignClient client){
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
