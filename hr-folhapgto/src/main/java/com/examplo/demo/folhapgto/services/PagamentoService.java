package com.examplo.demo.folhapgto.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.examplo.demo.folhapgto.entities.Pagamento;
import com.examplo.demo.folhapgto.entities.Trabalhador;
import com.examplo.demo.folhapgto.feignclients.TrabalhadorFeignClient;

@Service
public class PagamentoService {

    @Autowired
    private TrabalhadorFeignClient trabalhadorFeignClient;
	public Pagamento getPagamento(long trabalhadorId, int dias) {
			
		Trabalhador trabalhador=trabalhadorFeignClient.findById(trabalhadorId).getBody();
		return new Pagamento(trabalhador.getNome(), trabalhador.getRendadiaria(), dias);
	}

}
