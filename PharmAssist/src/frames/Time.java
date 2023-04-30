package frames;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Time extends Thread{
    
    static int localhour;
    static int localminute;
    static int localsecond;
    
//    JLabel lt=main.mainFrame.getLocalTime();
    @Override
    public void run(){
        try{
            while(main.mainFrame.isFocused()){
                main.mainFrame.getLocalTime().setText(Time.getCurrentTime());
                main.mainFrame.getGreet().setText(Time.getGreeting());
                Thread.sleep(1000);
            }
        }catch (InterruptedException ex) {
            Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    //get current time
    public static String getCurrentTime(){
        localhour=LocalTime.now().getHour();
        localminute=LocalTime.now().getMinute();
        localsecond=LocalTime.now().getSecond();
        
        if(localminute<10 && localsecond<10){
            return localhour+":0"+localminute+":0"+localsecond;
        }else if(localminute<10){
            return localhour+":0"+localminute+":"+localsecond;
        }else if(localsecond<10){
            return localhour+":"+localminute+":0"+localsecond;
        }else{
            return localhour+":"+localminute+":"+localsecond;
        }
    }
    
    //get greeting
    public static String getGreeting(){
        if(localhour<11){
            return "Good Morning:)";
        }else if(localhour<15){
            return "Good Afternoon:)";
        }else{
            return "Good Evening:)";
        }
    }
    
}
