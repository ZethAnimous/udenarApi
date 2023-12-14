package com.example.demo.domain.Estudiantes;

import com.example.demo.domain.Examenes.Examen;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "estudiantes")
@Getter
@Setter
public class Estudiante {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) Esto solo lo ponemos cuando la base de datos genera el valor en este caso es el usuario el que lo ingresa
    private long codigo_estudiante;
    //atributos
    private String nombre;
    private String apellido;
    private Carrera carrera;

    @ManyToMany(mappedBy = "estudiantes")
    @JsonIgnore //Esto es para que vacicamente la ingnore y no la muestre en los Json tambien se debe poner porque hacia algo similar a un while(true)
    private List<Examen> examenes;

    public Estudiante(Datos_ingreso_estudiante ingreso_estudiante) {
        this.codigo_estudiante = ingreso_estudiante.codigo_estudiante();
        this.nombre = ingreso_estudiante.nombre();
        this.apellido = ingreso_estudiante.apellido();
        this.carrera = ingreso_estudiante.carrera();
    }

    public Estudiante() {

    }
}
