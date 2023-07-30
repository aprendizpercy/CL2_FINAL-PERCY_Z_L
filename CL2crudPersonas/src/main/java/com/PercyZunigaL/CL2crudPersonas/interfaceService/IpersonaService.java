package com.PercyZunigaL.CL2crudPersonas.interfaceService;

import  com.PercyZunigaL.CL2crudPersonas.modelo.Persona;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author cl2PRACTICA DE CLASE
 */
public interface IpersonaService {
    
    public List<Persona>listar();
    public Optional<Persona>listarId(int id);
    public int save(Persona p);
    public void delete(int id);
}
