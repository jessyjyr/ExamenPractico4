package com.example;

public class App {

	public static void main(String[] args) {

		Object[] estudiantesMujeres = {
				Estudiante.builder().nombre("Maria").primerApellido("alas").segundoApellido("Rios").genero(Genero.MUJER)
						.facultad(Facultad.CIENCIAS).totalAsignaturasMatriculadas(4).build(),
				Estudiante.builder().nombre("Leyre").primerApellido("Talas").segundoApellido("Rojas")
						.genero(Genero.MUJER).facultad(Facultad.LENGUA).totalAsignaturasMatriculadas(2).build() };

		System.out.println("Recorriendo el array de Estudiantes: ......................................");
		for (Object object : estudiantesMujeres) {
			System.out.println(estudiantesMujeres);

			int totalAsignaturas = 0;
			int toEstudiantes = 0;
			for (Object object1 : estudiantesMujeres) {
				if (object instanceof Estudiante) {
					Estudiante estudiante = (Estudiante) object;
					totalAsignaturas += estudiante.getTotalAsignaturasMatriculadas();
					toEstudiantes++;
				}
			}

			double mediaAsignaturas = (double) totalAsignaturas / toEstudiantes;

			int estudianteMujeres = 0;
			for (Object object2 : estudiantesMujeres) {
				if (object instanceof Estudiante) {
					Estudiante estudiante = (Estudiante) object;
					if (estudiante.getGenero() == Genero.MUJER
							&& estudiante.getTotalAsignaturasMatriculadas() >= mediaAsignaturas) {
						estudianteMujeres++;

						for (Object object_2 : estudiantesMujeres) {
							System.out.println("Nombre: " + estudiante.getNombre());
							System.out.println("Facultad: " + estudiante.getFacultad());
							System.out.println(
									"Total Asignaturas Matriculadas: " + estudiante.getTotalAsignaturasMatriculadas());
							
							
							
							
							
							
							
							
							
							
							
							
						}

					}
				}
			}
		}
	}
}
