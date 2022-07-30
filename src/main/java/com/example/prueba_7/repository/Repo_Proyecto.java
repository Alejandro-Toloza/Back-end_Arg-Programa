
package com.example.prueba_7.repository;

import com.example.prueba_7.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alejandro
 */
@Repository
public interface Repo_Proyecto extends JpaRepository<Proyecto, Integer>{
    
}
