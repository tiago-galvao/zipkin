package br.com.tga.usuariocep.usuario.client;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

public class GetCepUsuarioClientResponse {

    @JsonProperty("logradouro")
    @Getter @Setter private String logradouro;

    @JsonProperty("complemento")
    @Getter @Setter private String  complemento;

    @JsonProperty("bairro")
    @Getter @Setter private String  bairro;

    @JsonProperty("localidade")
    @Getter @Setter private String  localidade;

    @JsonProperty("uf")
    @Getter @Setter private String  uf;
    
}