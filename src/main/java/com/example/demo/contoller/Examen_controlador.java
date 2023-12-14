package com.example.demo.contoller;

import com.example.demo.domain.Estudiantes.Datos_respuesta_estudiante;
import com.example.demo.domain.Estudiantes.Estudiante;
import com.example.demo.domain.Estudiantes.EstudianteRepository;
import com.example.demo.domain.Examenes.Entrada_Examenes;
import com.example.demo.domain.Examenes.Examen;
import com.example.demo.domain.Examenes.Examen_respository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/Examen")
public class Examen_controlador {
    @Autowired
    private Examen_respository examenRepository;

    @Autowired
    private EstudianteRepository estudianteRepository;

    @PostMapping
    public ResponseEntity<Examen> createExamen(@RequestBody Entrada_Examenes examenDTO) {
        Examen examen = new Examen(examenDTO);

        Estudiante estudiante = estudianteRepository.findById(examenDTO.estudianteId())
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));

        examen.setEstudiantes(Collections.singletonList(estudiante));

        Examen savedExamen = examenRepository.save(examen);
        return new ResponseEntity<Examen>(savedExamen, HttpStatus.CREATED);

    }
}
