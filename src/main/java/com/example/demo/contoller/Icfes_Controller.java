package com.example.demo.contoller;

import com.example.demo.domain.Icfes.Datos_ingreso_Icfes;
import com.example.demo.domain.Icfes.Icfes;
import com.example.demo.domain.Icfes.IcfesREpository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Icfes")
public class Icfes_Controller {
    @Autowired
    IcfesREpository icfesRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<Icfes> subirPuntajeIcfes(@RequestBody @Valid Datos_ingreso_Icfes datos){
        System.out.println("Los datos son: " + datos);
        //Guardamos los datos
        Icfes icfes = icfesRepository.save(new Icfes(datos));
        return new ResponseEntity<>(icfes, HttpStatus.CREATED);
    }
}
