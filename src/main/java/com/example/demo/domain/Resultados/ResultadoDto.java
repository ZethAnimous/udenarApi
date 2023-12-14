package com.example.demo.domain.Resultados;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultadoDto {
    // Propiedades de Estudiante
    private Long codigoEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;

    // Propiedades de Examen
    private Long examenId;
    private Integer calificacionExamen;
    private Integer comunicacionExamen;
    private Integer razonamientoExamen;
    private Integer lecturaExamen;
    private Integer ciudadanasExamen;
    private Integer inglesExamen;

    // Constructor que incluye todas las propiedades
    public ResultadoDto(Long codigoEstudiante, String nombreEstudiante, String apellidoEstudiante,
                        Long examenId, Integer calificacionExamen, Integer comunicacionExamen,
                        Integer razonamientoExamen, Integer lecturaExamen,
                        Integer ciudadanasExamen, Integer inglesExamen) {
        this.codigoEstudiante = codigoEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.examenId = examenId;
        this.calificacionExamen = calificacionExamen;
        this.comunicacionExamen = comunicacionExamen;
        this.razonamientoExamen = razonamientoExamen;
        this.lecturaExamen = lecturaExamen;
        this.ciudadanasExamen = ciudadanasExamen;
        this.inglesExamen = inglesExamen;
    }

}

