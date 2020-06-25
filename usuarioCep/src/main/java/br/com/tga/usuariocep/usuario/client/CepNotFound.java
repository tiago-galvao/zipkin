package br.com.tga.usuariocep.usuario.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "CEP informado não encontrado")
public class CepNotFound extends RuntimeException {
}