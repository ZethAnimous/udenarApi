package com.example.demo.contoller;
import com.example.demo.domain.Resultados.ResultadoDto;
import com.example.demo.domain.Resultados.ResultadoDtoSimulacros;
import com.example.demo.domain.Resultados.ResultadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class Consulta_controller {
    @Autowired
    ResultadoRepositorio resultadoRepositorio;

    @GetMapping("/{codigoEstudiante}/resultados")
    public ResponseEntity<List<ResultadoDto>> obtenerResultadosPorCodigoEstudiante(@PathVariable Long codigoEstudiante) {
        List<ResultadoDto> resultados = resultadoRepositorio.encontrarResultadosPorCodigoEstudiante(codigoEstudiante);
        if (resultados.isEmpty()) {
            return ResponseEntity.notFound().build();
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
