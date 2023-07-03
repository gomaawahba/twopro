
package javaapplication5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class JavaApplication5 {
    static String url="jdbc:sqlserver://gomaa/gom";
    static String username="root";
    static String password="";
    static Connection c;

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
              try{
            c=DriverManager.getConnection(url,username,password);
            System.out.println("ok");
        }catch(SQLException ee){
            System.out.println(ee.getMessage());
        }
            

    }
}
    
            
    
