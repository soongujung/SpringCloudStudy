package io.study.eurekaservice.employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
}
