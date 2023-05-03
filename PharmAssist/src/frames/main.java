package frames;
import java.io.IOException;
import java.sql.SQLException;

public class main {
    
    static WcScreen mainFrame=null;
    
    public static void main(String[] args) throws IOException, InterruptedException, SQLException {
        mainFrame=new WcScreen();
        
        mainFrame.setVisible(true);
        Time newThread=new Time();
        
        if(main.mainFrame.isFocused()){
            newThread.start();
        }else{
            newThread.interrupt();
        }
    }
}