package frames;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
/**
 *
 * @author Pramod Pinimal
 *
*/
public class WcScreen extends javax.swing.JFrame {
    
    Connection conn =null;

    public WcScreen() throws IOException, InterruptedException, SQLException {
        initComponents();
        conn = DbmsConn.connect();
    }

    public JLabel getLocalTime() {
        return localTime;
    }

    public JLabel getGreet() {
        return greet;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        closeBtn = new javax.swing.JLabel();
        greet = new javax.swing.JLabel();
        localTime = new javax.swing.JLabel();
        loginBtn = new javax.swing.JLabel();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PharmAssist");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        mainPanel.setPreferredSize(new java.awt.Dimension(1366, 768));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/Close.png"))); // NOI18N
        closeBtn.setAlignmentX(0.5F);
        closeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
        });
        mainPanel.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 40, 30));

        greet.setFont(new java.awt.Font("Kozuka Gothic Pr6N EL", 1, 33)); // NOI18N
        greet.setForeground(new java.awt.Color(228, 240, 220));
        greet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greet.setText("Good Evening:)");
        mainPanel.add(greet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 330, 110));

        localTime.setFont(new java.awt.Font("Kozuka Gothic Pr6N EL", 1, 50)); // NOI18N
        localTime.setForeground(new java.awt.Color(255, 255, 255));
        localTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        localTime.setText("00:00:00");
        mainPanel.add(localTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 680, 230, 90));

        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/login-mouse out.png"))); // NOI18N
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });
        mainPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 60, 110, 50));

        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/welcome screen3.jpg"))); // NOI18N
        mainPanel.add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tempClr=closeBtn.getBackground();
        closeBtn.setOpaque(true);
        closeBtn.setBackground(new Color(19, 100, 13));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        closeBtn.setBackground(tempClr);
        closeBtn.setOpaque(false);
    }//GEN-LAST:event_closeBtnMouseExited

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        loginBtn.setIcon(new ImageIcon(getClass().getResource("/Graphics/login-mouse in.png")));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
       loginBtn.setIcon(new ImageIcon(getClass().getResource("/Graphics/login-mouse out.png")));
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        //hide login btn
        loginBtn.setVisible(false);
        bgImage.setEnabled(false);
        //bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/welcome screen3-disabled.jpg")));
        
        //loginbg- login screen background
        loginBg=new JLabel();
        loginBg.setIcon(new ImageIcon(getClass().getResource("/Graphics/login form.png")));
        loginBg.setText(null);
        
        //login panel
        loginPanel=new JPanel(new AbsoluteLayout());
        loginPanel.setBackground(null);
        mainPanel.add(loginPanel, new AbsoluteConstraints(1020,50,320,375));
        mainPanel.setComponentZOrder(loginPanel, 0);
        loginPanel.add(loginBg, new AbsoluteConstraints(0, 0,320,375));

        //closeGreen- login form->close button
        closeGreen=new JLabel(new ImageIcon(getClass().getResource("/Graphics/Close_green.png")));
        loginPanel.add(closeGreen, new AbsoluteConstraints(295, 0,25,25));
        loginPanel.setComponentZOrder(closeGreen, 0);
        closeGreen.setCursor(new Cursor(Cursor.HAND_CURSOR));
        closeGreen.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt){
                bgImage.setEnabled(true);
                bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/welcome screen3.jpg")));
                loginPanel.setVisible(false);
                loginBtn.setVisible(true);
            }
        });
        
        //login2Btn -login button of login form
        login2Btn= new JLabel(new ImageIcon(getClass().getResource("/Graphics/login-out.png")));
        loginPanel.add(login2Btn, new AbsoluteConstraints(170, 180,74,29));
        loginPanel.setComponentZOrder(login2Btn, 0);
        login2Btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login2Btn.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt){
                try {
                    loginSubmit();
                } catch (SQLException ex) {
                    Logger.getLogger(WcScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent evt){
                login2Btn.setIcon(new ImageIcon(getClass().getResource("/Graphics/login-in.png")));
            }
            
            @Override
            public void mouseExited(MouseEvent evt){
                login2Btn.setIcon(new ImageIcon(getClass().getResource("/Graphics/login-out.png")));
                
            }
        });
        
        //reset2Btn-reset button of login form
        reset2Btn= new JLabel(new ImageIcon(getClass().getResource("/Graphics/reset-out.png")));
        loginPanel.add(reset2Btn, new AbsoluteConstraints(77, 180,74,29));
        loginPanel.setComponentZOrder(reset2Btn, 0);
        reset2Btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        reset2Btn.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseEntered(MouseEvent evt){
                reset2Btn.setIcon(new ImageIcon(getClass().getResource("/Graphics/reset-in.png")));
            }
            
            @Override
            public void mouseClicked(MouseEvent evt){
                uname.setEditable(true);
                pwd.setEditable(true);
                uname.setText("");
                pwd.setText("");
            }
            
            @Override
            public void mouseExited(MouseEvent evt){
                reset2Btn.setIcon(new ImageIcon(getClass().getResource("/Graphics/reset-out.png")));
            }
        });
        
        //uname-user name text field
        uname=new JTextField();
        loginPanel.add(uname, new AbsoluteConstraints(115, 85, 164, 28));
        loginPanel.setComponentZOrder(uname, 0);
        uname.setBorder(null);
        uname.setBackground(null);
        uname.setHorizontalAlignment(JTextField.CENTER);
        uname.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        uname.setForeground(new Color(30,50,30));
        uname.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                int keyCode=e.getKeyCode();
                if(keyCode==10){
                    try {
                    loginSubmit();
                } catch (SQLException ex) {
                    Logger.getLogger(WcScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            }
        });
        
        //pwd-login password
        pwd=new JPasswordField();
        loginPanel.add(pwd, new AbsoluteConstraints(115, 132, 164, 28));
        loginPanel.setComponentZOrder(pwd, 0);
        pwd.setBorder(null);
        pwd.setBackground(null);
        pwd.setHorizontalAlignment(JTextField.CENTER);
        pwd.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                int keyCode=e.getKeyCode();
                if(keyCode==10){
                    try {
                    loginSubmit();
                } catch (SQLException ex) {
                    Logger.getLogger(WcScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            }
        });
        
        pwd.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        pwd.setForeground(new Color(30,50,30));
    }//GEN-LAST:event_loginBtnMouseClicked
    
    private void loginSubmit() throws SQLException{
        try{
            connt=new DbmsConn();
            String enteredUname, enteredPwd, query2login;
            
            enteredUname=uname.getText().toLowerCase();
            enteredPwd=pwd.getText();
            
            query2login="SELECT USER_NAME, PASSWORD FROM employee WHERE USER_NAME='"+enteredUname+"' AND PASSWORD='"+enteredPwd+"'";
            PreparedStatement stm=connt.getConn().prepareStatement(query2login);
            ResultSet rs=stm.executeQuery(query2login);
            
            if(rs.next()){
                currentUser=enteredUname;
                
                //getting usertype
                currentUserType=null;
                String query2UserType="SELECT job_role FROM employee WHERE user_name=\""+currentUser+"\";";
                PreparedStatement stm2=connt.getConn().prepareStatement(query2UserType);
                ResultSet rs2=stm2.executeQuery(query2UserType);
                while(rs2.next()){
                    currentUserType=rs2.getString("job_role");
                }
                
                JOptionPane.showMessageDialog(null, "Successfully logged in!\nLogged user :"+ currentUser +" ("+currentUserType+")");
                
            }else{
                JOptionPane.showMessageDialog(null, "Login failed!");
            }
            uname.setEditable(false);
            pwd.setEditable(false);
            
            connt.getConn().close();
            
            if("ADMIN".equals(currentUserType) && currentUserType!=null){
                loginPanel.setVisible(false);
                new logged_admin().setVisible(true);
                this.setVisible(false);
            }else if("CASHIER".equals(currentUserType) && currentUserType!=null){
                loginPanel.setVisible(false);
                new Bill().setVisible(true);
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WcScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WcScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WcScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WcScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new WcScreen().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(WcScreen.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(WcScreen.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(WcScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel greet;
    private javax.swing.JLabel localTime;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
    
    //custom variables
    Color tempClr;
    JPanel loginPanel;
    JLabel loginBg;
    JLabel closeGreen;
    JLabel login2Btn, reset2Btn;
    JTextField uname;
    JPasswordField pwd;
    DbmsConn connt=null;
    String currentUser, currentUserType;
}
