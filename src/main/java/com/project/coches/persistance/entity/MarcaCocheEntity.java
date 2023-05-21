package com.project.coches.persistance.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Entidad de Marca Coche
 */
@Getter
@Setter
@Entity
@Table(name = "marca_coche")
public class MarcaCocheEntity {

    /**
     * Id  del coche
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Descripcion del coche
     */
    @Column(name ="descripcion")
    private String description;

}
