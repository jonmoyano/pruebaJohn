/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.proyect.prueba.Controller;

import com.edu.proyect.prueba.Model.ListaReproduccion;
import com.edu.proyect.prueba.Service.ListaReproduccionService;
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
@RequestMapping("/Lista")
public class ListaReproduccionController {
    
    @Autowired
    ListaReproduccionService lista;
    
    @GetMapping("/listar")
    public ResponseEntity< List<ListaReproduccion>> obtenerLista() {
        return new ResponseEntity<>(lista.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<ListaReproduccion> crear(@RequestBody ListaReproduccion l){
     return new ResponseEntity<>(lista.save(l), HttpStatus.CREATED);
    }
    
    @PutMapping("/listar/{id_listareproduccion}")
    @ResponseStatus(HttpStatus.CREATED)
    public ListaReproduccion update(@RequestBody ListaReproduccion cli, @PathVariable String songs){
        ListaReproduccion c =new ListaReproduccion();
        c.setCancion(cli.getCancion());
        c.setDescription(cli.getDescription());
        c.setSongs(cli.getSongs());
        return lista.save(c);
    }
    
    @DeleteMapping("/listar/{id_listareproduccion}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
	lista.delete(id);
    }
}
