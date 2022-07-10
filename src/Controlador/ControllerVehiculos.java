
package Controlador;

import java.sql.ResultSet;

import Modelo.ModelVehiculos;

/**
 *
 * @author danlo
 */
public class ControllerVehiculos {
    
    public static int idvehiculo;
    public static int idpersonal;
    public static String placa;
    public static String color;

    public static int getIdpersonal() {
        return idpersonal;
    }

    public static void setIdpersonal(int idpersonal) {
        ControllerVehiculos.idpersonal = idpersonal;
    }

    public static String getPlaca() {
        return placa;
    }

    public static void setPlaca(String placa) {
        ControllerVehiculos.placa = placa;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        ControllerVehiculos.color = color;
    }
    
    public ControllerVehiculos() {
    }
    
    public static ResultSet CargarTablaVehiculos_Controller() {
        return ModelVehiculos.CargarTabla(ControllerConfig.ip, ControllerConfig.host, ControllerConfig.username, ControllerConfig.password);
    }
    
    public static int RegistrarVehiculo_Controller() {
        return ModelVehiculos.RegistrarVehiculo(idpersonal, placa, color, ControllerConfig.ip, ControllerConfig.host, ControllerConfig.username, ControllerConfig.password);
    }
    
    public static boolean ActualizarVehiculo_Controller() {
        return ModelVehiculos.ActualizarVehiculo(idvehiculo, idpersonal, placa, color, ControllerConfig.ip, ControllerConfig.host, ControllerConfig.username, ControllerConfig.password);
    }
    
    public static boolean EliminarVehiculo_Controller() {
        return ModelVehiculos.EliminarVehiculo(idvehiculo, ControllerConfig.ip, ControllerConfig.host, ControllerConfig.username, ControllerConfig.password);
    }
}
