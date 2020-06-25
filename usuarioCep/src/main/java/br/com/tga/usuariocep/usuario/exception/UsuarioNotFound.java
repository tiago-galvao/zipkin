package br.com.tga.usuariocep.usuario.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Usuario Não Encontrado")
public class UsuarioNotFound extends RuntimeException{}