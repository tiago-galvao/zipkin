package br.com.tga.usuariocep.usuario.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "consultaCep", configuration = UsuarioCepClientConfiguration.class)
public interface UsuarioCepClient {

    @RequestMapping("/{cep}")
    GetCepUsuarioClientResponse getCep(@PathVariable String cep);
}   