package com.example.prueba_7.controller;

import com.example.prueba_7.model.Persona;
import com.example.prueba_7.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Controller {


    @Autowired
    private IPersonaService persoServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona per){
        persoServ.crearPersona(per);
    }
    
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona editarPersona(@PathVariable Long id, @RequestParam ("nombre") String nuevonombre, @RequestParam ("apellido") String nuevoapellido){
        
        //Busco Persona en cuestion
        Persona perso = persoServ.buscarPersona(id);
        //Esto puede ir en el service para desacoplar
        //mejor aún el codigo en un nuevo metodo.
        perso.setNombre(nuevonombre);
        perso.setApellido(nuevoapellido);
        persoServ.crearPersona(perso);
        return perso;
    }
    
    @GetMapping("/personas/traer/perfil")
    public Persona buscarPersona(Long id) {
        return persoServ.buscarPersona((long)1);
    }
    
    
}
