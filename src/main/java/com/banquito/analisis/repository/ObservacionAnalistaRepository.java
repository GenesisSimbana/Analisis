package com.banquito.analisis.repository;

import com.banquito.analisis.model.ObservacionAnalista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObservacionAnalistaRepository extends JpaRepository<ObservacionAnalista, Long> {
    
    List<ObservacionAnalista> findByIdEvaluacion(Long idEvaluacion);
    
    List<ObservacionAnalista> findByIdUsuario(Long idUsuario);
}