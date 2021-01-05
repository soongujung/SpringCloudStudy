package io.study.eurekafeignclient.employee;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("ingredient-service")
public interface EmployeeClient {

	@GetMapping("/ingredient-service/{id}")
	EmployeeDto getEmployee (@PathVariable("id") Long id);
}
