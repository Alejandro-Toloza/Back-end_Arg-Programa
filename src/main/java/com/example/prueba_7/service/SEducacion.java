
package com.example.prueba_7.service;

import com.example.prueba_7.model.Educacion;
import com.example.prueba_7.repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejandro
 */
@Service
@Transactional
public class SEducacion {
    
    @Autowired
    REducacion rEducacion;
    
    public SEducacion(REducacion rEducacion) {
        this.rEducacion = rEducacion;
    }
    
    public Educacion agregarEducacion(Educacion edu) {
        return rEducacion.save(edu);
    }

     public List<Educacion> list(){
         return rEducacion.findAll();
     }
     
     public Optional<Educacion> getOne(int id){
         return rEducacion.findById(id);
     }
     
     public void delete(int id){
         rEducacion.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rEducacion.existsById(id);
     }

}