/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.edu.proyect.prueba.Model.repositorio;

import com.edu.proyect.prueba.Model.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Jon
 */
public interface CancionRepository extends JpaRepository<Cancion, Integer>{

     @Query(value = "Select * from cancion c where c.nombre = :nombre", nativeQuery = true)
    public Cancion buscarCAncion(String nombre);
    
}
