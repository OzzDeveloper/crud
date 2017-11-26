/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetag.crud.servicio;

import com.codetag.crud.modelo.Empleado;

/**
 *
 * @author CarlosColin
 */
public interface servicioEmpleado {

    Iterable<Empleado> lstAllEmpleados();

    Empleado getEmpleadoById(Integer id);

    Empleado guardarEmpleado(Empleado emple);

    void deleteEmpleado(Integer id);

}
