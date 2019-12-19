package utilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Oscar Andres
 */
public class Conexion {
        
  static Connection contacto = null;
    
    /**
     *
     * @return
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