package com.project.coches.domain.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * Se crea Pojo para definicion de la entidad MarcaCoche
 */
@Getter
@Setter
public class MarcaCochePojo {
    /**
     * Id  del coche
     */
    private Integer id;
    /**
     * Descripcion del coche
     */
    private String description;
}
