/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetag.crud.servicio;

import com.codetag.crud.modelo.Empleado;
import com.codetag.crud.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author CarlosColin
 */
@Service
public class ServicioEmpleadoImpl implements servicioEmpleado {

    @Autowired
    private EmpleadoRepositorio repoEmple;

    @Override
    public Iterable<Empleado> lstAllEmpleados() {
        return repoEmple.findAll();
    }

    @Override
    public Empleado getEmpleadoById(Integer id) {
        return repoEmple.findOne(id);
    }

    @Override
    public Empleado guardarEmpleado(Empleado emple) {
        return repoEmple.save(emple);
    }

    @Override
    public void deleteEmpleado(Integer id) {
        repoEmple.delete(id);
    }

}
