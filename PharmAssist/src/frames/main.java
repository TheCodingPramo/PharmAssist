package frames;
import java.io.IOException;
import java.sql.SQLException;
import splashscreen.SplashScreen;

public class main {
    
    static WcScreen mainFrame=null;
    
    public static void main(String[] args) throws IOException, InterruptedException, SQLException {
        
        
        new SplashScreen(null, true).setVisible(true); 
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