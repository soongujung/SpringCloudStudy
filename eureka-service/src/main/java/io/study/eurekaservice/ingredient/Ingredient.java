package io.study.eurekaservice.ingredient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
public class Ingredient {

	@Id @GeneratedValue
	private Long id;

	private String name;
	private Type type;

	public Ingredient(String name, Type type){
		this.name = name;
		this.type = type;
	}

	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE, FRUIT;
	}
}
