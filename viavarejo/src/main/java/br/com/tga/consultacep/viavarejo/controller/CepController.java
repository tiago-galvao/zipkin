package br.com.tga.consultacep.viavarejo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.tga.consultacep.viavarejo.client.GetCepClientResponse;
import br.com.tga.consultacep.viavarejo.service.CepService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class CepController {
    
    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public GetCepClientResponse getCep(@PathVariable String cep) {
        return cepService.getInfoCep(cep);
    }
    
}
