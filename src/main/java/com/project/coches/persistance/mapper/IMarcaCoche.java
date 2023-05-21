package com.project.coches.persistance.mapper;


import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.persistance.entity.MarcaCocheEntity;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper  que trabsforma objetos de MarcaCoch a pojos o entidades
 */
@Mapper(componentModel = "spring")
public interface IMarcaCoche {

    /**
     *  Convierte una entidad  a un pojo  de Marca Coche
     * @param marcaEntity   Entidad a convertir
     * @return Pojo convertido
     */
    @Mapping(source = "id" , target = "id")
    @Mapping(source = "description" , target = "description")
    MarcaCochePojo toMarcaCochePojo(MarcaCocheEntity marcaEntity);

    /**
     * Convierte un pojo a una entidad Marca Coche
     * @param marcaPojo  Pojo a convertor
     * @return Entity convertido
     */
    @InheritConfiguration
    MarcaCocheEntity toMarcaCocheEntity(MarcaCochePojo marcaPojo);

    /**
     * Retorna una Lista de marcas coche transformada a pojo de una lista de entidades
     * @param marcasCocheEntityentidad a transformar
     * @return Lista transformada
     */
    List<MarcaCochePojo>  toMarcasCochePojo(List<MarcaCocheEntity> marcasCocheEntity);
}
