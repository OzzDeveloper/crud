/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetag.crud.repositorio;
import com.codetag.crud.modelo.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author CarlosColin
 */
@Repository
public interface EmpleadoRepositorio extends CrudRepository<Empleado, Integer>{
    
}
