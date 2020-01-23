/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle_empresa;
import java.sql.*;
/**
 *
 * @author luish
 */
public class SqliteConnection {
    public static Connection Connector(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:AppDb.sqlite");
            return conn;
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
        }
    }
}
