package utilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Oscar Andres y Daniel Quirós 
 */
public class Conexion {
        
  static Connection contacto = null;
    
  /**
  *
  * @return Connection, que es la coxion de la base
  */
  public static Connection getConexion(){
    try{
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    }
    catch(ClassNotFoundException e){
      System.out.println(e);
    }
    try{
      String  url = "jdbc:sqlserver://localhost:1433;databaseName=lab8";
      contacto = DriverManager.getConnection(url,"sa","123");
     }
    catch(SQLException e){
      System.out.println(e);
    }
    return contacto;
}
    

}