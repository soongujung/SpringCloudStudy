package io.study.eurekafeignclient.ingredient;

import io.study.eurekafeignclient.config.IngredientFeignClient;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

	private final IngredientFeignClient ingredientFeignClient;

	public IngredientController(IngredientFeignClient ingredientFeignClient){
		this.ingredientFeignClient = ingredientFeignClient;
	}

	@GetMapping
	public List<IngredientDto> getIngredientAll(){
		return ingredientFeignClient.getIngredientsAll();
	}

	@GetMapping("/{id}")
	public IngredientDto getIngredient(@PathVariable Long id){
		return ingredientFeignClient.getIngredient(id);
	}
}
