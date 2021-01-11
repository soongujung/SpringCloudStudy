package io.study.eurekaservice.config;

import io.study.eurekaservice.ingredient.Ingredient;
import io.study.eurekaservice.ingredient.Ingredient.Type;
import io.study.eurekaservice.ingredient.IngredientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IngredientDataProvider {

	@Bean(name = "ingredientDataLoader")
	public CommandLineRunner dataLoader(IngredientRepository repository){
		return args -> {
			repository.save(new Ingredient("apple", 		Type.FRUIT));
			repository.save(new Ingredient("cheda", 		Type.CHEESE));
			repository.save(new Ingredient("egg", 		Type.PROTEIN));
			repository.save(new Ingredient("hot-sauce", 	Type.SAUCE));
			repository.save(new Ingredient("radish", 	Type.VEGGIES));
		};
	}
}
