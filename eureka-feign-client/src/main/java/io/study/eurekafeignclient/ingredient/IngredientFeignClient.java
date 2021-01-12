package io.study.eurekafeignclient.ingredient;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("ingredient-service")	// ingredient-service 는 유레카 레지스트리에 등록되어 있는 서비스 명 (유레카 서비스의 application.name 으로 입력한 값이 서비스명으로 등록된다.)
public interface IngredientFeignClient {

	@GetMapping("/ingredients")
	List<IngredientDto> getIngredientsAll();

	@GetMapping("/ingredients/{id}")
	IngredientDto getIngredient (@PathVariable("id") Long id);
}
