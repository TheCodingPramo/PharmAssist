package frames;

//importing packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

public class DbmsConn {
    private Connection conn=null;
    
    String url="jdbc:mysql://localhost:3306/PHARMASSIST"; 
    String username="root";
    String password="";

    public DbmsConn() throws SQLException{
        createDbConnection();
    }
    
    public final void createDbConnection(){ //crete the connection with DB
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //load and reg the JDBC Driver
            
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(main.mainFrame, "Driver cannot be loaded!");
        }
        
        try{
            conn=DriverManager.getConnection(url,username, password); //Establish the connection
            System.out.println("Successfully connected to the database!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(main.mainFrame, "Invalid credentials!");
        }
    }
    
    public Connection getConn() {
        return conn;
    }
    public static Connection connect(){
        
        Connection conn = null;
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/PHARMASSIST","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         
         
        return conn;
        
    }
    
    public static void main(String[] args) throws SQLException {
        DbmsConn dc=new DbmsConn();
        System.out.println(dc.toString());
    }
    
}
