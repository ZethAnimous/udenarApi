package com.example.demo.domain.Estudiantes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Datos_respuesta_estudiante(
        @NotBlank(message = "No se puede dejar el nombre del estudiante vacio")
        String name,
        @NotBlank(message = "Falta el apellido")
        String apellido,
        @NotNull(message = "falta la carrera")
        Carrera carrera
) {
        public Datos_respuesta_estudiante(Estudiante datos) {
                this(datos.getNombre(), datos.getApellido(), datos.getCarrera());
        }
}
