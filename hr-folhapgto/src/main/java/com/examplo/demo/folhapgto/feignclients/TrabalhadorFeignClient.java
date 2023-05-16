package com.examplo.demo.folhapgto.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.examplo.demo.folhapgto.entities.Trabalhador;

@Component
@FeignClient(name="hr-trabalhador", url="localhost:8001", path="/trabalhadores")
public interface TrabalhadorFeignClient {
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Trabalhador> findById(@PathVariable Long id);

}
