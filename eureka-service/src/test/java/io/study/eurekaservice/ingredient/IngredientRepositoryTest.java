package io.study.eurekaservice.ingredient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IngredientRepositoryTest {

	@Autowired IngredientRepository repository;

	@Test
	public void testFindAll(){
		Iterable<Ingredient> all = repository.findAll();
		System.out.println(all);
	}
}
