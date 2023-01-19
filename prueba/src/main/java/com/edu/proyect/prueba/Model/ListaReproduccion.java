/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.proyect.prueba.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



/**
 *
 * @author Jon
 */

@Setter
@Getter
@Entity
@Table(name = "listareproduccion")
public class ListaReproduccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_listareproduccion")
    private Integer id_listareproduccion;
    
    @Column(name = "name")
    private Integer name;

    @Column(name = "description")
    private String description;

    @Column(name = "songs")
    private String songs;
   
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cancion", referencedColumnName = "id_cancion")
    private Cancion cancion;

}
