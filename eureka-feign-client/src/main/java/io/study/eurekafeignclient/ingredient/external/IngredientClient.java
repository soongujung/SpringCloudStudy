package io.study.eurekafeignclient.ingredient.external;

import io.study.eurekafeignclient.ingredient.dto.IngredientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// ingredient-service 는 서비스 레지스트리에 등록되어 있는 서비스 명
@FeignClient("ingredient-service")
public interface IngredientClient {
	@GetMapping("/ingredients/{id}")
	IngredientDto getIngredient (@PathVariable("id") String id);
}
