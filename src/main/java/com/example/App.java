package com.example;

public class App {

	public static void main(String[] args) {

		Empleado[] empleados = {
				Empleado.builder().nombre("Leo").primerApellido("Rojas").segundoApellido("Casas").genero(Genero.HOMBRE)
						.departamento("RRHH").salario(1500.50).build(),
				Empleado.builder().nombre("Victor").primerApellido("Rios").segundoApellido("Torres")
						.genero(Genero.HOMBRE).departamento("RRHH").salario(2200.50).build(),
				Empleado.builder().nombre("Elena").primerApellido("Salas").segundoApellido("Dias").genero(Genero.MUJER)
						.departamento("CONTABILIDAD").salario(2500.50).build(),

		};



	}

}
