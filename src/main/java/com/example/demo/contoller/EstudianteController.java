package com.example.demo.contoller;

import com.example.demo.domain.Estudiantes.Datos_ingreso_estudiante;
import com.example.demo.domain.Estudiantes.Datos_respuesta_estudiante;
import com.example.demo.domain.Estudiantes.Estudiante;
import com.example.demo.domain.Estudiantes.EstudianteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    EstudianteRepository estudianteRepository
            ;
    //Creamos un metodo para recibir estudiantes y guardarlos
    @PostMapping
    public ResponseEntity<Datos_respuesta_estudiante> registrarEstudiante(@RequestBody @Valid Datos_ingreso_estudiante datos){
        System.out.println("El request llega correctamente");
        System.out.println("Los datos son: " + datos);
        Estudiante estudianteguardar = new Estudiante(datos);
        System.out.println(datos.codigo_estudiante());
        System.out.println(estudianteguardar.getCodigo_estudiante()); //Sale correctamente 1
        Estudiante estudiante = estudianteRepository.save(estudianteguardar);

        //Obtenemos los datos de respuesta del medico
        Datos_respuesta_estudiante respuesta_estudiante = new Datos_respuesta_estudiante(estudiante);

        return new ResponseEntity<Datos_respuesta_estudiante>(respuesta_estudiante, HttpStatus.CREATED);

    }
}
