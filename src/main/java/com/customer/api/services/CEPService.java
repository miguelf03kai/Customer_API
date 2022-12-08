package com.customer.api.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.customer.api.models.Andress;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface CEPService {

	@GetMapping("/{cep}/json/")
	Andress searchCEP(@PathVariable("cep") String cep);
}
