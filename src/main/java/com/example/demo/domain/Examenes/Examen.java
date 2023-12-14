package com.example.demo.domain.Examenes;

import com.example.demo.domain.Estudiantes.Estudiante;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "examenes")
@Setter
@Getter
@NoArgsConstructor
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "calificacion")
    private Integer calificacionGeneral;

    @Column(name = "comunicacion")
    private Integer comunicacion;

    @Column(name = "razonamiento")
    private Integer razonamiento;

    @Column(name = "lectura")
    private Integer lectura;

    @Column(name = "ciudadanas")
    private Integer ciudadanas;

    @Column(name = "ingles")
    private Integer ingles;

    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(  //Esta es la tabla de union donde especificamos que columnas se deben unir
            name = "estudiantes_examenes",
            joinColumns = @JoinColumn(name = "examen_id"),
            inverseJoinColumns = @JoinColumn(name = "codigo_estudiante")
    )
    private List<Estudiante> estudiantes;


    public Examen(Entrada_Examenes datos) {
        this.calificacionGeneral = datos.calificacionGeneral();
        this.comunicacion = datos.comunicacion();
        this.razonamiento = datos.razonamiento();
        this.lectura = datos.lectura();
        this.ciudadanas = datos.ciudadanas();
        this.ingles = datos.ingles();
    }

    // Getters y setters...
}