package frames;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Pramod Pinimal
 *
*/
public class WcScreen extends javax.swing.JFrame {

    Dimension scrnSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    public WcScreen() throws IOException, InterruptedException {
        initComponents();
        customize();
    }
    
    public final void customize() throws InterruptedException{
        //JFrame
        this.setExtendedState(MAXIMIZED_BOTH);
        
        //localTime
        localTime.setText(Time.getCurrentTime());
        while(this.isFocused()){
            localTime.setText(Time.getCurrentTime());
            Thread.sleep(200);
        }
        
        //greet
        greet.setText(Time.getGreeting());
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

        greet.setFont(new java.awt.Font("Kozuka Gothic Pr6N EL", 1, 70)); // NOI18N
        greet.setForeground(new java.awt.Color(19, 158, 13));
        greet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greet.setText("Good Morning!");
        mainPanel.add(greet, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 570, 130));

        localTime.setFont(new java.awt.Font("Kozuka Gothic Pr6N EL", 1, 50)); // NOI18N
        localTime.setForeground(new java.awt.Color(255, 255, 255));
        localTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        localTime.setText("00:00:00");
        mainPanel.add(localTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 700, 230, 90));

        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/login-mouse out.png"))); // NOI18N
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
        mainPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 60, -1, 50));

        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/welcome_screen2.jpg"))); // NOI18N
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
        closeBtn.setBackground(new Color(19, 180, 13));
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
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMouseClicked

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
}
