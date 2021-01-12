package io.study.eurekaservice.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeRepositoryTest {

	@Autowired EmployeeRepository repository;

	@Test
	public void testFindAll(){
		Iterable<Employee> all = repository.findAll();
		System.out.println(all);
	}
}
