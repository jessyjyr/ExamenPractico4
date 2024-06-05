package com.example;

/*	Crear otra rama y nombrarla rama_2
a. Crear un array de objetos empleados, de diferentes géneros y departamentos.
b. Recorrer el array de empleados y mostrar por consola el salario promedio, agrupado por cada
Departamento y Género del empleado.*/

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

		double sumatorioSalariosHombre = 0.0;
		double sumatorioSalariosMujer = 0.0;

		int totalGeneroHombre = 0;
		int totalGeneroMujer = 0;

		double salarioPromedioHombres = 0.0;
		double salarioPromedioMujeres = 0.0;

		for (Empleado e : empleados) {
			if (e.getGenero().equals(Genero.HOMBRE)) {
				sumatorioSalariosHombre += e.getSalario();
				totalGeneroHombre++;

			} else if (e.getGenero().equals(Genero.MUJER)) {
				sumatorioSalariosMujer += e.getSalario();
				totalGeneroMujer++;

			}
		}
		salarioPromedioHombres = sumatorioSalariosHombre / totalGeneroHombre;
		salarioPromedioMujeres = sumatorioSalariosMujer / totalGeneroMujer;

		System.out.println("Salario Promedio de los Hombres: " + salarioPromedioHombres);
		System.out.println("Salario Promedio de los Mujeres: " + salarioPromedioMujeres);

		double sumatorioSalariosRRHH = 0.0;
		double sumatorioSalariosCONTABILIDAD = 0.0;

		int totalDepartamentoRRHH = 0;
		int totalDepartamentoCONTABILIDAD = 0;

		double salarioPromedioRRHH = 0.0;
		double salarioPromedioCONTABILIDAD = 0.0;

		for (Empleado e : empleados) {
			if (e.getDepartamento().equals(Departamento.CONTABILIDAD)) {
				sumatorioSalariosHombre += e.getSalario();
				totalDepartamentoCONTABILIDAD++;

			} else if (e.getDepartamento().equals(Departamento.RRHH)) {
				sumatorioSalariosHombre += e.getSalario();
				totalDepartamentoRRHH++;

			}
		}
		salarioPromedioCONTABILIDAD = sumatorioSalariosHombre / totalDepartamentoCONTABILIDAD;
		salarioPromedioRRHH = sumatorioSalariosHombre / totalDepartamentoRRHH;

		System.out.println("salario Promedio CONTABILIDAD: " + salarioPromedioMujeres);
		System.out.println("salario Promedio RRHH: " + salarioPromedioHombres);

	}

}
