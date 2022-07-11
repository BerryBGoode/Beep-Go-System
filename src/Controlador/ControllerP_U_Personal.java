/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModelP_U_Personal;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author danlo
 */
public class ControllerP_U_Personal {
    ModelP_U_Personal useControllerP=new ModelP_U_Personal();
    public ResultSet cargarTipoPersonalController(){
        return useControllerP.cargarTipoP();
    }
    public ResultSet cargarGeneroController(){
        return useControllerP.cargarGeneroP();
    }
    public int idpersonal;
    public String nombre;
    public String apellido;
    public Date fechanac;
    public String correo;
    public String direccion;
    public String dui;
    public int idtipopersonal;
    public int idgenero;
    public byte[] foto;

    public int getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(int idpersonal) {
        this.idpersonal = idpersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public int getIdtipopersonal() {
        return idtipopersonal;
    }

    public void setIdtipopersonal(int idtipopersonal) {
        this.idtipopersonal = idtipopersonal;
    }

    public int getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(int idgenero) {
        this.idgenero = idgenero;
    }

    public byte[] getLogo() {
        return foto;
    }

    public void setLogo(byte[] foto) {
        this.foto = foto;
    }
    
    public boolean IngresarPPersonalController(){
        return useControllerP.IngresarPPersonal(nombre, apellido, fechanac, correo, direccion, dui, idgenero, idgenero,foto);
    }
    
}