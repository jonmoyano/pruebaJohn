/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.proyect.prueba.Service;

import com.edu.proyect.prueba.Model.Cancion;
import com.edu.proyect.prueba.Model.repositorio.CancionRepository;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class CancionServiceImpl extends GenericServiceImpl<Cancion, Integer> implements CancionService {

    @Autowired
    CancionRepository cancionRepository;

    @Override
    public CrudRepository<Cancion, Integer> getDao() {
        return cancionRepository;
    }

    public Cancion buscarCAncion (String nombre) {
        return cancionRepository.buscarCAncion(nombre);
    }
    
    public Cancion ModificarCliente(@RequestBody Cancion cli,@PathVariable String cedula){
        return cancionRepository.save(cli);
    }
    
}
