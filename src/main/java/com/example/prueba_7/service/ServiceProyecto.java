
package com.example.prueba_7.service;

import com.example.prueba_7.model.Proyecto;
import com.example.prueba_7.repository.Repo_Proyecto;
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
public class ServiceProyecto {
    
    @Autowired
    Repo_Proyecto repoProyecto;

    public ServiceProyecto(Repo_Proyecto repoProyecto) {
        this.repoProyecto = repoProyecto;
    }
    
    public Proyecto agregarProyecto(Proyecto proyecto) {
        return repoProyecto.save(proyecto);
    }

     public List<Proyecto> list(){
         return repoProyecto.findAll();
     }
     
     public Optional<Proyecto> getOne(int id){
         return repoProyecto.findById(id);
     }
     
     public void delete(int id){
        repoProyecto.deleteById(id);
     }
     
     public boolean existsById(int id){
         return repoProyecto.existsById(id);
     }
    
}
