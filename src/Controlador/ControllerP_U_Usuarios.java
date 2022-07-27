/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModelP_U_Usuarios;
import java.sql.ResultSet;

/**
 *
 * @author danlo
 */
public class ControllerP_U_Usuarios {
    ModelP_U_Usuarios objController=new ModelP_U_Usuarios();
    public Boolean checkControllerUsuario(){
        return  objController.checkUsuario();
    }
    public String Usuario;
    public String Clave;
    public byte[] foto;

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    public boolean IngresarPUsuarioController(){
        return objController.IngresarPUsuario(Usuario, foto, Clave);
    }
}
