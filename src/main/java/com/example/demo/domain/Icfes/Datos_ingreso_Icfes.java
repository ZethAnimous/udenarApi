package com.example.demo.domain.Icfes;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record Datos_ingreso_Icfes(
        @NotNull(message = "El campo LC no puede ser nulo") //Es Not Null porque Not Blank solo es para String
        @Min(value = 0, message = "El campo LC no puede ser menor que 0")
        @Max(value = 100, message = "El campo LC no puede ser mayor que 100")
        int Lectura_critica,
        @NotNull(message = "El campo Mat no puede ser nulo") //Es Not Null porque Not Blank solo es para String
        @Min(value = 0, message = "El campo Mat no puede ser menor que 0")
        @Max(value = 100, message = "El campo Mat no puede ser mayor que 100")
        int Matematicas,
        @NotNull(message = "El campo SC no puede ser nulo") //Es Not Null porque Not Blank solo es para String
        @Min(value = 0, message = "El campo SC no puede ser menor que 0")
        @Max(value = 100, message = "El campo SC no puede ser mayor que 100")
        int Sociales_y_Ciudadanas,
        @NotNull(message = "El campo Nat no puede ser nulo") //Es Not Null porque Not Blank solo es para String
        @Min(value = 0, message = "El campo Nat no puede ser menor que 0")
        @Max(value = 100, message = "El campo Nat no puede ser mayor que 100")
        int Naturales,
        @NotNull(message = "El campo ING no puede ser nulo") //Es Not Null porque Not Blank solo es para String
        @Min(value = 0, message = "El campo ING no puede ser menor que 0")
        @Max(value = 100, message = "El campo ING no puede ser mayor que 100")
        int Ingles,
        @NotNull
        Long idEstudiante,

        @NotNull
        @Min(value = 0, message = "El campo calificacion no puede ser menor que 0")
        @Max(value = 100, message = "El campo calificacion no puede ser mayor que 100")
        int calificacion
) {
}
