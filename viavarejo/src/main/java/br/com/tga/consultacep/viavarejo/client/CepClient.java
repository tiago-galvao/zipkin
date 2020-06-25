package br.com.tga.consultacep.viavarejo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "cep", url = "https://viacep.com.br")
public interface CepClient {
    @RequestMapping("/ws/{cep}/json")
    GetCepClientResponse getCepViaVarejo(@PathVariable String cep);
}   