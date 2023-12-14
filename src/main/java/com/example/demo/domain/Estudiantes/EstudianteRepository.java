package com.example.demo.domain.Estudiantes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    //Los metodos basicos de interacción con una base de datos estan puestos por defecto

}
