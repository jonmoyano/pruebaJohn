/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.proyect.prueba.Controller;



import com.edu.proyect.prueba.Model.Cancion;
import com.edu.proyect.prueba.Service.CancionService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jon
 */

@RestController
@RequestMapping("/cancion")

public class CancionController {
    
    @Autowired
    CancionService cancionservice;

    @GetMapping("/listar")
    public ResponseEntity< List<Cancion>> obtenerLista() {
        return new ResponseEntity<>(cancionservice.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Cancion> crear(@RequestBody Cancion c){
     return new ResponseEntity<>(cancionservice.save(c), HttpStatus.CREATED);
    }
    
    @PutMapping("/ccancion/{id_cancion}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cancion update(@RequestBody Cancion cli, @PathVariable String Title){
        Cancion c =new Cancion();
        c.setTitle(cli.getTitle());
        c.setAlbum(cli.getAlbum());
        c.setArtist(cli.getArtist());
        c.setYear(cli.getYear());
        return cancionservice.save(c);
    }
    
    @DeleteMapping("/canacion/{id_cancion}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id_cancion) {
	cancionservice.delete(id_cancion);
    }
}
