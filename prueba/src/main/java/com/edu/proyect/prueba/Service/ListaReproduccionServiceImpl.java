/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.proyect.prueba.Service;

import com.edu.proyect.prueba.Model.ListaReproduccion;
import com.edu.proyect.prueba.Model.repositorio.ListaReproduccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jon
 */

@Service
public class ListaReproduccionServiceImpl extends GenericServiceImpl<ListaReproduccion, Integer> implements ListaReproduccionService{
    
    @Autowired
    ListaReproduccionRepository listareproduccionrepository;

    @Override
    public CrudRepository<ListaReproduccion, Integer> getDao() {
        return listareproduccionrepository;
    }
}
