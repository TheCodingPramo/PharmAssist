package splashscreen;

import java.awt.Color;
import javax.swing.JDialog;

/**
 *
 * @author SHEHAN CHAMUDITH
 */
public class SplashScreen extends javax.swing.JDialog {

    public SplashScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(new Color(76, 214, 6));
        //  To disable key Alt+F4 to close dialog
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    }

    public SplashScreen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        curvesPanel1 = new splashscreen.CurvesPanel();
        jLabel1 = new javax.swing.JLabel();
        pro = new splashscreen.ProgressBarCustom();
        lbStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/pa128.png"))); // NOI18N

        pro.setForeground(new java.awt.Color(81, 228, 6));

        lbStatus.setForeground(new java.awt.Color(200, 200, 200));
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus.setText("Status");

        javax.swing.GroupLayout curvesPanel1Layout = new javax.swing.GroupLayout(curvesPanel1);
        curvesPanel1.setLayout(curvesPanel1Layout);
        curvesPanel1Layout.setHorizontalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(curvesPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                        .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        curvesPanel1Layout.setVerticalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbStatus)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(curvesPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(curvesPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    doTask("Initializing ...", 1);
                    doTask("Initializing ...", 2);
                    doTask("Initializing ...", 3);
                    doTask("Initializing ...", 4);
                    doTask("Initializing ...", 5);
                    doTask("Initializing ...", 6);
                    doTask("Initializing ...", 7);
                    doTask("Initializing ...", 8);
                    doTask("Initializing ...", 9);
                    doTask("Initializing ...", 10);
                    doTask("Loading database ...", 11);
                    doTask("Loading database ...", 12);
                    doTask("Loading database ...", 13);
                    doTask("Loading database ...", 14);
                    doTask("Loading database ...", 15);
                    doTask("Loading database ...", 16);
                    doTask("Loading database ...", 17);
                    doTask("Loading database ...", 18);
                    doTask("Loading database ...", 19);
                    doTask("Loading database ...", 20);
                    doTask("Authenticating user credentials ...", 21);
                    doTask("Authenticating user credentials ...", 22);
                    doTask("Authenticating user credentials ...", 23);
                    doTask("Authenticating user credentials ...", 24);
                    doTask("Authenticating user credentials ...", 25);
                    doTask("Authenticating user credentials ...", 26);
                    doTask("Authenticating user credentials ...", 27);
                    doTask("Authenticating user credentials ...", 28);
                    doTask("Authenticating user credentials ...", 29);
                    doTask("Authenticating user credentials ...", 30);
                    doTask("Loading history ...", 35);
                    doTask("Loading history ...", 40);
                    doTask("Loading history ...", 45);
                    doTask("Loading history ...", 47);
                    doTask("Loading history ...", 49);
                    doTask("Loading history ...", 50);
                    doTask("Preparing inventory data ...", 55);
                    doTask("Preparing inventory data ...", 58);
                    doTask("Preparing inventory data ...", 60);
                    doTask("Configuring the billing system ...", 70);
                    doTask("Establishing ...", 80);
                    doTask("Loading modules ...", 90);
                    doTask("Loading modules ...", 100);
                    doTask("Done ...", 100);
                    dispose();
                    curvesPanel1.stop();    //  To Stop animation
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }//GEN-LAST:event_formWindowOpened

    private void doTask(String taskName, int progress) throws Exception {
        lbStatus.setText(taskName);
        Thread.sleep(100); //  For Test
        pro.setValue(progress);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SplashScreen dialog = new SplashScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private splashscreen.CurvesPanel curvesPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbStatus;
    private splashscreen.ProgressBarCustom pro;
    // End of variables declaration//GEN-END:variables
}
