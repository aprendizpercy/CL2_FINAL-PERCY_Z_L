package com.PercyZunigaL.CL2crudPersonas.interfaces;

import com.PercyZunigaL.CL2crudPersonas.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cl2PRACTICA DE CLASE
 */
@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {
    
}
