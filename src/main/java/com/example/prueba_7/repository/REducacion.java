package com.example.prueba_7.repository;

import com.example.prueba_7.model.Educacion;
//import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alejandro
 */
@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
    //public Optional<Educacion> findByTitulo(String titulo_educacion);
    //public boolean existsByTitulo(String titulo_educacion);
}

