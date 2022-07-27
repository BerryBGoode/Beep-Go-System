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
public class ModelLogin {
    public static int ValidarLogin(String usuario, String clave){
        int i = 0;
        Connection con;
        PreparedStatement ps;
        
        try{
            con = ModelConexion.getConnection();
            ps = con.prepareStatement("SELECT * FROM tbUsuarios WHERE nombre_usuario = ? AND contraseña = ?");
            ps.setString(1, usuario);
            ps.setString(2, clave);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                i = 1;
            }else{
                i = 0;
            }
            return i;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error durante la verificacion de las credenciales" + e.toString(),"ERROR CRITICO", JOptionPane.WARNING_MESSAGE);
            return 0;
        }
    }
    
    public static ResultSet CapturarDatos(String usuario){
        Connection con;
        PreparedStatement ps;
        try{
            con = ModelConexion.getConnection();
            ps = con.prepareStatement("SELECT a.idUsuario, a.nombre_usuario, b.tipo_usuario FROM tbUsuarios a, tbTipoUsuario b WHERE a.idTipoUsuario = b.idTipoUsuario AND a.nombre_usuario = ?");
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            return rs;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error durante la verificacion de las credenciales" + e.toString(),"ERROR CRITICO", JOptionPane.WARNING_MESSAGE);
            return null;
        }
    }
}
