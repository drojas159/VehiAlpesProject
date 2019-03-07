/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probar;

import co.edu.uniminuto.pa.bds.conexionprueba;
import java.sql.Connection;

/**
 *
 * @author Daniela
 */
public class probar {
    conexionprueba conn=new conexionprueba();
    Connection reg=conn.getConnection();
    
}
