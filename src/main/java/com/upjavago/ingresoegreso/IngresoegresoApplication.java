package com.upjavago.ingresoegreso;

import com.upjavago.ingresoegreso.entity.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IngresoegresoApplication {


	public static void main(String[] args) {

		SpringApplication.run(IngresoegresoApplication.class, args);

		Empresa Cococola = new Empresa(1, "Cococola", "Cra 12 con 23", "321232345", "90053442133");
		System.out.println(Cococola.getDireccion());

	}

}
