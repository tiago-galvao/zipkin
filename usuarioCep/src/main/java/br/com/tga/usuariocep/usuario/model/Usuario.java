package br.com.tga.usuariocep.usuario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.tga.usuariocep.usuario.client.GetCepUsuarioClientResponse;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Usuario {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    @Getter @Setter private String nome;
    @Getter @Setter private String cep;
    @Getter @Setter private String logradouro;
    @Getter @Setter private String complemento;
    @Getter @Setter private String bairro;
    @Getter @Setter private String localidade;
    @Getter @Setter private String uf;

}