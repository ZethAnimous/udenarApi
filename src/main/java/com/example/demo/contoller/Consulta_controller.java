package com.example.demo.contoller;
import com.example.demo.Errors.ApiError;
import com.example.demo.domain.Resultados.ResultadoDto;
import com.example.demo.domain.Resultados.ResultadoDtoSimulacros;
import com.example.demo.domain.Resultados.ResultadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/estudiantes")
public class Consulta_controller {
    @Autowired
    ResultadoRepositorio resultadoRepositorio;

    @GetMapping("/{codigoEstudiante}/resultados")
    public ResponseEntity<Object> obtenerResultadosPorCodigoEstudiante(@PathVariable Long codigoEstudiante) {
        List<ResultadoDto> resultados = resultadoRepositorio.encontrarResultadosPorCodigoEstudiante(codigoEstudiante);
        if (resultados.isEmpty()) {
            ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, "No se encontraron resultados para el código del estudiante proporcionado.");
            return new ResponseEntity<>(apiError, apiError.getStatus());
        }
        return ResponseEntity.ok(resultados);
    }

    @GetMapping("/{codigoEstudiante}/simulacros")
    public ResponseEntity<List<ResultadoDtoSimulacros>> encontrarResultadosIcfesController(@PathVariable Long codigoEstudiante) {
        List<ResultadoDtoSimulacros> resultados = resultadoRepositorio.encontrarResultadosIcfes(codigoEstudiante);
        if (resultados.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(resultados);
    }

}
