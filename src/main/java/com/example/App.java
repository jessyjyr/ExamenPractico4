package com.example;

public class App {

	public static void main(String[] args) {


		Object[] empleadosYEstudiantes = {
				Empleado.builder().nombre("Leo").primerApellido("Rojas").segundoApellido("Casas").genero(Genero.HOMBRE)
				.departamento("RRHH").salario(1500.50).build(),
				Empleado.builder().nombre("Victor").primerApellido("Rios").segundoApellido("Torres")
				.genero(Genero.HOMBRE).departamento("RRHH").salario(2200.50).build(),
				Estudiante.builder().nombre("Maria").primerApellido("alas").segundoApellido("Rios")
						.genero(Genero.MUJER).facultad(Facultad.CIENCIAS).totalAsignaturasMatriculadas(4)
						.build(),
				Estudiante.builder().nombre("Roberto").primerApellido("Perez").segundoApellido("Reverte")
						.genero(Genero.HOMBRE).facultad(Facultad.LENGUA).totalAsignaturasMatriculadas(2)
						.build(),
		};

		for (Object object : empleadosYEstudiantes) {
			if (object instanceof Empleado) {
				Empleado em = (Empleado) object;
				System.out.println("Nombre del empleado: " + em.getNombre());
				
			} else if (object instanceof Estudiante) {
				Estudiante es = (Estudiante) object;
				System.out.println("El nombre del estudiante es: " + es.getNombre());
				System.out.println("La Facultad del estudiante es: " + es.getFacultad());
				System.out.println("El total de asignaturas del estudiante son: "
						+ es.getTotalAsignaturasMatriculadas());

	}

}
	
}
}