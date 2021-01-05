package io.study.eurekaservice.ingredient;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ingredients", produces = "application/json")
@CrossOrigin(origins = "*")
public class IngredientController {

	private final IngredientRepository repository;

	public IngredientController(IngredientRepository repository){
		this.repository = repository;
	}

	@GetMapping
	public List<Ingredient> getIngredients(){
		return (List<Ingredient>) repository.findAll();
	}

	@GetMapping("/{id}")
	public Ingredient getIngredientById(Long id){
		return repository.findById(id).get();
	}
}
