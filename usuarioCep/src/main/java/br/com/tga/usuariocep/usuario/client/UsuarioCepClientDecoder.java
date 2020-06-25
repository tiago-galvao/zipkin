package br.com.tga.usuariocep.usuario.client;

import feign.Response;
import feign.codec.ErrorDecoder;

public class UsuarioCepClientDecoder implements ErrorDecoder {

    private ErrorDecoder errorDecoder = new Default();

    @Override
    public Exception decode(String s, Response response) {
        if (response.status() == 400){
            throw new CepNotFound();
        }
        else {
            return errorDecoder.decode(s, response);
        }
    }
}