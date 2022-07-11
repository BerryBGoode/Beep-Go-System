/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author danlo
 */
public class ModelP_U_Personal {
    PreparedStatement ps;
    Connection con;
    public ResultSet cargarTipoP(){
        try {
            con=ModelConexion.getConnection();
            String query="SELECT * FROM tbTipoPersonal";
            ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            return rs;    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista "+e.toString());
            return null;
        }
    }
    public ResultSet cargarGeneroP(){
        try {
            con=ModelConexion.getConnection();
            String query="SELECT * FROM tbGeneros";
            ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista"+e.toString());
            return null;
        }
    }
    public boolean IngresarPPersonal(String nombrep,String apellidop,Date fecha, String Correo,String direccion,String DUI,int idtipop,int genero, byte[] logo){
        try {
            con=ModelConexion.getConnection();
            String query="INSERT INTO tbPersonal VALUES (?,?,?,?,?,?,?,?,?)";
            ps=con.prepareStatement(query); 
            ps.setString(1, nombrep);
            ps.setString(2, apellidop);
            ps.setDate(3, fecha);
            ps.setString(4, Correo);
            ps.setString(5, direccion);
            ps.setString(6, DUI);
            ps.setInt(7, idtipop);
            ps.setInt(8, genero);
            ps.setBytes(9, logo);
            ps.execute();
            return  true;
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error al realizaR el proceso","Error al agregar",JOptionPane.ERROR_MESSAGE);
             return false;
        }
    }
}
