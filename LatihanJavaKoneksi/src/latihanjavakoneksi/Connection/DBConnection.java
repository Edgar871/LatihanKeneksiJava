/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavakoneksi.Connection;

import java.sql.*;

/**
 *
 * @author Edgar Hadhyra J
 */
public class DBConnection {
    public Connection open(){
        Connection con;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3306/latihanjava";
            String username = "root";
            String password = "";
            
            con = (Connection) DriverManager.getConnection(url, username, password);
            
            return con;
        }
        catch(Exception e){
            System.err.println(e);
            return null;
        }
    }
}
