/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jgame
 */
public class Conection {
    static public Connection getConection() throws SQLException{
        Connection con;
        try{
         con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/clientes","postgres","4Ud3f3kD");
         return con;
        }catch (SQLException e){
             System.out.println(e);
        }
        return null;
    }
}
