package io.study.eurekafeignclient.ingredient;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class IngredientDto {

	@JsonProperty("name")
	private String name;

	@JsonProperty("type")
	private Type type;

	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE, FRUIT;
	}
}
