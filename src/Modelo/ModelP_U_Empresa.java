/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author danlo
 */
public class ModelP_U_Empresa {

    //Hermoso papucho
    PreparedStatement ps;
    Connection con;

    public boolean IngresarPEmpresa(String nombre, String representante_Legal, String direccion, String NIT, String CNR, byte[] logo) {
        try {
            con = ModelConexion.getConnection();
            String query = ("INSERT INTO tbEmpresas VALUES (?,?,?,?,?,?)");
            ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, representante_Legal);
            ps.setString(3, direccion);
            ps.setString(4, NIT);
            ps.setString(5, CNR);
            ps.setBytes(6, logo);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al realizar el proceso" + e.toString());
            return false;
        }
    }
}
