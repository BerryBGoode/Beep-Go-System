/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author danlo
 */
public class ModelP_U_Usuarios {
    PreparedStatement ps;
    Connection con;

            public boolean checkUsuario(){
    
        try {
            con = ModelConexion.getConnection();
            ps = con.prepareStatement("SELECT * FROM tbUsuarios");            
            ResultSet rs = ps.executeQuery();            
            return rs.next();
        } catch (SQLException e) {
            return false;
        }
    }
 public boolean IngresarPUsuario(String Usuario,byte[]perfil,String Contra){
        int idpersonal=1;
        int PIN=0;
        int idtipousuario=1;
        int idestadousuario=1;
        int idempresa=1;
        try {
            con=ModelConexion.getConnection();
            String querys="INSERT INTO tbUsuarios VALUES (?,?,?,?,?,?,?,? )";
            ps=con.prepareStatement(querys);
            ps.setInt(1, idpersonal);
            ps.setString(2, Usuario);
            ps.setString(3, Contra);
            ps.setInt(4,PIN);
            ps.setInt(5, idtipousuario);
            ps.setInt(6, idestadousuario);
            ps.setInt(7, idempresa);
            ps.setBytes(8, perfil);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al realizar el proceso"+e.toString(),"Error al registrar",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }       
}
