/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author i3
 */
public class ConnectionFactory {
    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Connection getConexao(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/voto", "root", "");
        } 
        catch (Exception erro){
            throw new RuntimeException("Erro 1: " + erro );
        }
    }
}
