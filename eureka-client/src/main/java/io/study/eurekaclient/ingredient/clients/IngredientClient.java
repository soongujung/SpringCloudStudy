package io.study.eurekaclient.ingredient.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("ingredient-service")
public interface IngredientClient {
	@GetMapping("/ingredients/{id}")
	Ingredient getIngredient (@PathVariable("id") String id);
}
