/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileReader;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jabor
 */
public class Utilitario {
    
    public static String obtenerPropiedades(String key){
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("factura.properties"));
            return properties.getProperty(key);
        } catch (Exception e) {
            Logger.getLogger(Utilitario.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
    
}
