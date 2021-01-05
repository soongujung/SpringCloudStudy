package io.study.eurekafeignclient.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private final EmployeeClient client;

	public EmployeeController(EmployeeClient client){
		this.client = client;
	}

	@ResponseBody
	public EmployeeDto getEmployeeById(Long id){
		return client.getEmployee(id);
	}
}
