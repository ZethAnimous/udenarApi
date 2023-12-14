package com.example.demo.domain.Icfes;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "icfes")
@NoArgsConstructor
public class Icfes {
    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int lectura;
    private int matematicas;
    private int sociales;
    private int naturales;
    private int ingles;

    private int resultado;

    private Long estudiante;
    //Metodo constructor
    public Icfes(Datos_ingreso_Icfes datos) {
        this.lectura = datos.Lectura_critica();
        this.matematicas = datos.Matematicas();
        this.sociales = datos.Sociales_y_Ciudadanas();
        this.naturales = datos.Naturales();
        this.ingles = datos.Ingles();
        this.estudiante = datos.idEstudiante();
    }
}
