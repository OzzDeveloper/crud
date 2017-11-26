/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetag.crud.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author CarlosColin
 */
@Entity
@Table(name = "tbEmpleado")

public class Empleado implements Serializable {

    public Empleado() {
    }

    public Empleado(String idempleado, String nombre, String ap, String am, String usuario, String password) {
        this.idempleado = idempleado;
        this.nombre = nombre;
        this.ap = ap;
        this.am = am;
        this.usuario = usuario;
        this.password = password;
    }

    @Id
    @NotNull
    @Column(name = "idempleado")
    private String idempleado;
    @NotNull
    @Column(name = "nombre")
    private String nombre;
    @NotNull
    @Column(name = "apaterno")
    private String ap;
    @NotNull
    @Column(name = "amaterno")
    private String am;
    @NotNull
    @Column(name = "usuario")
    private String usuario;
    @NotNull
    @Column(name = "password")
    private String password;

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
