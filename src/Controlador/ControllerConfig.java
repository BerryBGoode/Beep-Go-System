/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author ferna
 */
public class ControllerConfig {
    
    public static String username;
    public static String password;
    public static String ip;
    public static String host;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        ControllerConfig.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        ControllerConfig.password = password;
    }

    public static String getIp() {
        return ip;
    }

    public static void setIp(String ip) {
        ControllerConfig.ip = ip;
    }

    public static String getHost() {
        return host;
    }

    public static void setHost(String host) {
        ControllerConfig.host = host;
    }
       
}
