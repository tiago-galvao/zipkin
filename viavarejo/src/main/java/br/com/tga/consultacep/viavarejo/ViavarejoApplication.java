package br.com.tga.consultacep.viavarejo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ViavarejoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViavarejoApplication.class, args);
	}

}
