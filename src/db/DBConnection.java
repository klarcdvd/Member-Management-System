/*
 * Create by Chanaka fernando
 * email <nuwan.c.fernando@gmail.com>
 * This class should be plased under the db Package of the project
 */

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Chanaka Fernando
 */
public class DBConnection {
    private static DBConnection dBConnection;
    private Connection conn;
    private DBConnection() throws ClassNotFoundException, SQLException{
        if(conn==null){
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/mhctest?useSSL=false", "Chanaka", "19941215");
        }        
    }
    public static  DBConnection getDBConnection() throws ClassNotFoundException, SQLException{
        if(dBConnection==null){
            dBConnection=new DBConnection();
        }
        return  dBConnection;
    }
    public Connection getConnection(){
        return conn;
    }
}
