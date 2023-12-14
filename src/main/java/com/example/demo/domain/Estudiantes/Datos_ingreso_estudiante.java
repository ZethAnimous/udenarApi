package com.example.demo.domain.Estudiantes;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Datos_ingreso_estudiante(
    @NotNull(message = "Cada estudiante necesita de un codigo")
    Long codigo_estudiante,
    @NotBlank(message = "No se puede dejar el nombre del estudiante vacio")
    String nombre,
    @NotBlank(message = "Falta el apellido")
    String apellido,
    @NotNull(message = "falta la carrera")
    Carrera carrera
) {

}
