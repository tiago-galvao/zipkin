package br.com.tga.usuariocep.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UsuarioCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioCepApplication.class, args);
	}

}
