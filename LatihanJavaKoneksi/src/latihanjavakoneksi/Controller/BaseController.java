/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavakoneksi.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import latihanjavakoneksi.Connection.DBConnection;

/**
 *
 * @author Edgar Hadhyra J
 */
public class BaseController {
    DBConnection koneksi = new DBConnection();
    
    public boolean preparedStatement(Map<Integer, Object> map, String sql){
        try{
            Connection con = koneksi.open();
            PreparedStatement ps = con.prepareStatement(sql);
            
            for(Map.Entry<Integer, Object> entry : map.entrySet()){
                ps.setString(entry.getKey(), entry.getValue().toString());
            }
            
            int rows = ps.executeUpdate();
            con.close();
            return rows != 0;
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }
    }
}
