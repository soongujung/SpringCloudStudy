package io.study.eurekaservice.config;

import io.study.eurekaservice.employee.Employee;
import io.study.eurekaservice.employee.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeDataProvider {

	@Bean(name = "employeeDataLoader")
	public CommandLineRunner dataLoader(EmployeeRepository repository){
		return args -> {
			repository.save(new Employee("gosgjung", "꾸준함의대가", 99L));
			repository.save(new Employee("sukhyang", "이웃집워런버핏", 7L));
			repository.save(new Employee("ahdyrkey", "꾸준함의대가", 99L));
		};
	}
}
