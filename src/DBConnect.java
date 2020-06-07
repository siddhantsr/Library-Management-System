


import com.mysql.cj.jdbc.ConnectionImpl;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;



        
public class DBConnect {
    
    public static ConnectionImpl connect()
    {
        ConnectionImpl con=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                
                con=  (ConnectionImpl) DriverManager.getConnection("jdbc:mysql://localhost:3308/library?","root","");
                JOptionPane.showMessageDialog(null, "Connection Success");
                
        
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
           
            
        
        
        }
            return con;
    
    }
    
}
