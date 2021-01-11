package io.study.eurekafeignclient.employee;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("ingredient-service")
public interface EmployeeFeignClient {

	@GetMapping("/ingredient-service/employees")
	EmployeeDto getEmployeeAll();

	@GetMapping("/ingredient-service/employees/{id}")
	EmployeeDto getEmployee (@PathVariable("id") Long id);
}
