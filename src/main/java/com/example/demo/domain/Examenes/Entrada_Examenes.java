package com.example.demo.domain.Examenes;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


public record Entrada_Examenes(
        @NotNull
        Long estudianteId,
        @NotNull
        Integer calificacionGeneral,
        @NotNull
        Integer comunicacion,
        @NotNull
        Integer razonamiento,
        @NotNull
        Integer lectura,
        @NotNull
        Integer ciudadanas,
        @NotNull
        Integer ingles
) {
}
