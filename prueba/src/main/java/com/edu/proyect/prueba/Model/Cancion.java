/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.proyect.prueba.Model;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author Jon
 */

@Setter
@Getter
@Entity
@Table(name ="cancion")
public class Cancion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cancion")
    private Integer id_cancion;
    
    @Column(name = "title")
    private Integer title;

    @Column(name = "artist")
    private String artist;

    @Column(name = "album")
    private String album;

    @Column(name = "year")
    private String year;
    
    @OneToMany(mappedBy = "cancion")
    private List<ListaReproduccion> listareproduccion;
    
}
