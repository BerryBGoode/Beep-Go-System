/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import Controlador.*;
/**
 *
 * @author danlo
 */
public class ModelConexion {
    
    public static Connection getConnection(){
        String username = ControllerConfig.getUsername();
        String password = ControllerConfig.getPassword();
        String ip = ControllerConfig.getIp();
        String host = ControllerConfig.getHost();
        String db = "dbBeep&Go";
        
        String url = "jdbc:sqlserver://"+ip+":"+host+";"
                + "database= "+db+";"
                + "user= "+username+";"
                + "password= "+password+";"
                + "loginTimeout = 10";
        
        Connection connection;
        try {
            connection = DriverManager.getConnection(url);
            return connection;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
