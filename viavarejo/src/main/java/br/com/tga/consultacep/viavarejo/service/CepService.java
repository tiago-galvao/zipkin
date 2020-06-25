package br.com.tga.consultacep.viavarejo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tga.consultacep.viavarejo.client.CepClient;
import br.com.tga.consultacep.viavarejo.client.GetCepClientResponse;

@Service
public class CepService {
    
    @Autowired
    private CepClient cepClient;

    public GetCepClientResponse getInfoCep(String cep){
        GetCepClientResponse getCepClientResponse = cepClient.getCepViaVarejo(cep);
        return getCepClientResponse;
    }
}