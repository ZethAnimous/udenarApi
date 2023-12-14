package com.example.demo.domain.Resultados;

import com.example.demo.domain.Estudiantes.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.domain.Icfes.Icfes;

import java.util.List;

@Repository
public interface ResultadoRepositorio extends JpaRepository<Estudiante, Long> {
    @Query("SELECT new com.example.demo.domain.Resultados.ResultadoDto(" +
            "est.codigo_estudiante, est.nombre, est.apellido, " +
            "ex.id, ex.calificacionGeneral, ex.comunicacion, ex.razonamiento, " +
            "ex.lectura, ex.ciudadanas, ex.ingles) " +
            "FROM Estudiante est " +
            "JOIN est.examenes ex " +
            "WHERE est.codigo_estudiante = :codigoEstudiante")
    List<ResultadoDto> encontrarResultadosPorCodigoEstudiante(@Param("codigoEstudiante") Long codigoEstudiante);


    @Query("SELECT new com.example.demo.domain.Resultados.ResultadoDtoSimulacros(" +
            "icf.lectura, icf.matematicas, icf.naturales, icf.ingles, " +
            "icf.sociales, icf.resultado) " +
            "FROM Icfes icf " +
            "WHERE icf.estudiante = :codigoEstudiante")
    List<ResultadoDtoSimulacros> encontrarResultadosIcfes(@Param("codigoEstudiante") Long codigoEstudiante);


}