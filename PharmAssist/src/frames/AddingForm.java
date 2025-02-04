
package frames;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.table.TableModel;
import javax.swing.border.Border;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Shehan Chamudith
 */
public class AddingForm extends javax.swing.JFrame {

    /**
     * Creates new form AddingForm
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public AddingForm() {
        this.fullTextArray = new JTextField[]{t1, t2, t3, t4, t5, t6, t7};
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cl.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        l3 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        cl = new javax.swing.JButton();
        clearr = new javax.swing.JButton();
        addd = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        combo1 = new javax.swing.JComboBox<>();
        combo2 = new javax.swing.JComboBox<>();
        edate = new com.toedter.calendar.JDateChooser();
        mdate = new com.toedter.calendar.JDateChooser();
        sdate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Data");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        rootPanel.setBackground(new java.awt.Color(255, 255, 255));
        rootPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        l3.setText("Title3");
        rootPanel.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 160, 27));

        l1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        l1.setText("Title1");
        rootPanel.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 150, 27));

        l2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        l2.setText("Title2");
        rootPanel.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 127, 160, 27));

        l7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        l7.setText("Title7");
        rootPanel.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 170, 27));

        l4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        l4.setText("Title4");
        rootPanel.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 160, 27));

        l5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        l5.setText("Title5");
        rootPanel.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 160, 27));

        l6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        l6.setText("Title6");
        rootPanel.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 170, 27));

        cl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/close.png"))); // NOI18N
        cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clMouseExited(evt);
            }
        });
        cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clActionPerformed(evt);
            }
        });
        rootPanel.add(cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, -1));
        cl.setOpaque(false);
        cl.setContentAreaFilled(false);
        cl.setBorderPainted(false);

        clearr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/clear.png"))); // NOI18N
        clearr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearrMouseExited(evt);
            }
        });
        clearr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearrActionPerformed(evt);
            }
        });
        rootPanel.add(clearr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));
        clearr.setOpaque(false);
        clearr.setContentAreaFilled(false);
        clearr.setBorderPainted(false);

        addd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/add_1.png"))); // NOI18N
        addd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adddMouseExited(evt);
            }
        });
        addd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddActionPerformed(evt);
            }
        });
        rootPanel.add(addd, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));
        addd.setOpaque(false);
        addd.setContentAreaFilled(false);
        addd.setBorderPainted(false);
        rootPanel.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 300, -1));
        rootPanel.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 300, -1));
        rootPanel.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 300, -1));
        rootPanel.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 300, -1));
        rootPanel.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 300, -1));
        rootPanel.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 300, -1));

        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        rootPanel.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 300, -1));

        rootPanel.add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 300, -1));

        rootPanel.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 300, -1));

        rootPanel.add(combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 300, -1));
        rootPanel.add(edate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 300, -1));
        rootPanel.add(mdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 300, -1));
        rootPanel.add(sdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 300, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/adding.jpg"))); // NOI18N
        rootPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clActionPerformed
        // TODO add your handling code here:
        this.dispose();


    }//GEN-LAST:event_clActionPerformed

    private void clearrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearrMouseEntered
        clearr.setIcon(new ImageIcon(getClass().getResource("/Graphics/clear1.png")));
    }//GEN-LAST:event_clearrMouseEntered

    private void clearrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearrMouseExited
        clearr.setIcon(new ImageIcon(getClass().getResource("/Graphics/clear.png")));
    }//GEN-LAST:event_clearrMouseExited

    private void adddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adddMouseEntered
        addd.setIcon(new ImageIcon(getClass().getResource("/Graphics/add1_1.png")));
    }//GEN-LAST:event_adddMouseEntered

    private void adddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adddMouseExited
        addd.setIcon(new ImageIcon(getClass().getResource("/Graphics/add_1.png")));
    }//GEN-LAST:event_adddMouseExited

    private void clMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clMouseEntered
        cl.setIcon(new ImageIcon(getClass().getResource("/Graphics/close 1.png")));
    }//GEN-LAST:event_clMouseEntered

    private void clMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clMouseExited
        cl.setIcon(new ImageIcon(getClass().getResource("/Graphics/close.png")));
    }//GEN-LAST:event_clMouseExited

    private void clearrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearrActionPerformed
        JTextField[] textArray = {t1, t2, t3, t4, t5, t6, t7};
        for (JTextField i : textArray) {
            i.setText("");
        }
    }//GEN-LAST:event_clearrActionPerformed

    private void adddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddActionPerformed
        //writeToDB();
        dbwrite();
    }//GEN-LAST:event_adddActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        

    }//GEN-LAST:event_t7ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    
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
            java.util.logging.Logger.getLogger(AddingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddingForm().setVisible(true);
            }
        });
    }

    static TableModel model;
    JLabel[] labelArray;
    int cct;
    JTextField[] fullTextArray;

    protected void addCustomize1() throws SQLException {
        
        model = logged_admin.table1.getModel();
        
        
        int cct = logged_admin.table1.getColumnCount();
        int rest = 7 - cct;
        JLabel[] fulllabelArray = {l1, l2, l3, l4, l5, l6, l7};
        JTextField[] fullTextArray = {t1, t2, t3, t4, t5, t6, t7};
        JLabel[] labelArray = new JLabel[cct];
        JTextField[] textArray = new JTextField[cct];
        String[] THArray = new String[cct];

        for (int i = 0; i < cct; i++) {
            labelArray[i] = fulllabelArray[i];
            THArray[i] = model.getColumnName(i).toString();
        }

        for (int i = 0; i < cct; i++) {

            textArray[i] = fullTextArray[i];
            labelArray[i].setText(THArray[i].toString());
        }

        while (rest > 0) {
            fulllabelArray[7 - rest].setText("");
            fullTextArray[7 - rest].setVisible(false);
            rest--;
        }
        
    String tname = model.getColumnName(0); 
    String tname1 = model.getColumnName(2);
     
        if (tname.equals("DID")) {
            mdate.setVisible(true);
            edate.setVisible(true);
            combo.setVisible(true);
            t5.setVisible(false);
            t6.setVisible(false);
            t7.setVisible(false);
            sdate.setVisible(false);
            try{
            Connection connn=DbmsConn.connect();
            java.sql.Statement stm = connn.createStatement();
            ResultSet rss = stm.executeQuery("select GID from generic");
            while(rss.next()){
                String name= rss.getString("GID");
                combo.addItem(name);
            }
            connn.close();
            }catch(Exception e){
                
            }
            
        } else if(tname1.equals("SDATE")){
            sdate.setVisible(true);
            combo1.setVisible(true);
            combo2.setVisible(true);
            t1.setVisible(false);
            t2.setVisible(false);
            t3.setVisible(false);
            combo.setVisible(false);
            edate.setVisible(false);
            mdate.setVisible(false);
            
            try{
            Connection connn=DbmsConn.connect();
            java.sql.Statement stm = connn.createStatement();
            ResultSet rss = stm.executeQuery("select SID from supplier");
            while(rss.next()){
                String name= rss.getString("SID");
                combo1.addItem(name);
            }
            connn.close();
            }catch(Exception e){
                
            }
            
            try{
            Connection connn=DbmsConn.connect();
            java.sql.Statement stm = connn.createStatement();
            ResultSet rss = stm.executeQuery("select DID from drug");
            while(rss.next()){
                String name= rss.getString("DID");
                combo2.addItem(name);
            }
            connn.close();
            }catch(Exception e){
                
            }
            
        }else{
            combo.setVisible(false);
            edate.setVisible(false);
            mdate.setVisible(false);  
            sdate.setVisible(false);
                }

    }

//    protected void addCustomize() {
//        model = logged_admin.table1.getModel();
//        cct = logged_admin.table1.getColumnCount();
//        int rest = 7 - cct;
//        JLabel[] fulllabelArray = {l1, l2, l3, l4, l5, l6, l7};
////        JTextField[] fullTextArray={t1, t2, t3, t4, t5, t6, t7};
//        labelArray = new JLabel[cct];
//        String[] THArray = new String[cct];
//
//        for (int i = 0; i < cct; i++) {
//            labelArray[i] = fulllabelArray[i];
//            THArray[i] = model.getColumnName(i).toString();
//        }
//
//        for (int i = 0; i < cct; i++) {
//
//            labelArray[i].setText(THArray[i].toString());
//
//        }
//
//        while (rest > 0) {
//            fulllabelArray[7 - rest].setText("");
//            fullTextArray[7 - rest].setVisible(false);
//            rest--;
//        }
//    }

    public void dbwrite() {
        String value1 = t1.getText();
        String value2 = t2.getText();
        String value3 = t3.getText();
        String value4 = t4.getText();
        String value5 = t5.getText();
        String value6 = t6.getText();
        String value7 = t7.getText();

        var dropDownMenu = logged_admin.getDropDownMenu();
        String selectedValue = dropDownMenu.getSelectedItem().toString();

        System.out.println(selectedValue);

        Connection conn = DbmsConn.connect();

        if (selectedValue == "Select Table") {
            
            // Retrieve the selected date from the JDateChooser
            Date selectedDate1 = mdate.getDate();
            Date selectedDate2 = edate.getDate();

            // Create a SimpleDateFormat object to format the date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            // Format the date as a string
            String formattedDate1 = dateFormat.format(selectedDate1);
            String formattedDate2 = dateFormat.format(selectedDate2);

            try {
                String sql = "INSERT INTO drug VALUES ( ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, value1);
                pst.setString(2, value2);
                pst.setString(3, value3);
                pst.setString(4, value4);
                pst.setString(5, formattedDate1);
                pst.setString(6, formattedDate2);
                pst.setString(7, combo.getSelectedItem().toString());
                pst.executeUpdate();
                System.out.println("Data sent to the Database succefully !!");
                JOptionPane.showMessageDialog(rootPane, "Data sent to the Database succefully !!");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                mdate.setDate(null);
                edate.setDate(null);
                combo.setSelectedItem(null);
            } catch (SQLException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (selectedValue == "Drug") {
            
            
            // Retrieve the selected date from the JDateChooser
            Date selectedDate1 = mdate.getDate();
            Date selectedDate2 = edate.getDate();

            // Create a SimpleDateFormat object to format the date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            // Format the date as a string
            String formattedDate1 = dateFormat.format(selectedDate1);
            String formattedDate2 = dateFormat.format(selectedDate2);

            try {
                String sql = "INSERT INTO drug VALUES ( ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, value1);
                pst.setString(2, value2);
                pst.setString(3, value3);
                pst.setString(4, value4);
                pst.setString(5, formattedDate1);
                pst.setString(6, formattedDate2);
                pst.setString(7, combo.getSelectedItem().toString());
                pst.executeUpdate();
                System.out.println("Data sent to the Database succefully !!");
                JOptionPane.showMessageDialog(rootPane, "Data sent to the Database succefully !!");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                mdate.setDate(null);
                edate.setDate(null);
                combo.setSelectedItem(null);
            } catch (SQLException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (selectedValue == "Generic") {

            try {
                String sql = "INSERT INTO generic VALUES ( ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, value1);
                pst.setString(2, value2);
                pst.executeUpdate();
                System.out.println("Data sent to the Database succefully !!");
                JOptionPane.showMessageDialog(rootPane, "Data sent to the Database succefully !!");
                t1.setText("");
                t2.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (selectedValue == "Customer") {

            try {
                String sql = "INSERT INTO customer VALUES ( ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, value1);
                pst.setString(2, value2);
                pst.setString(3, value3);
                pst.executeUpdate();
                System.out.println("Data sent to the Database succefully !!");
                JOptionPane.showMessageDialog(rootPane, "Data sent to the Database succefully !!");
                t1.setText("");
                t2.setText("");
                t3.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (selectedValue == "Employee") {

            try {
                String sql = "INSERT INTO employee VALUES ( ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, value1);
                pst.setString(2, value2);
                pst.setString(3, value3);
                pst.setString(4, value4);
                pst.setString(5, value5);
                pst.setString(6, value6);
                pst.setString(7, value7);
                pst.executeUpdate();
                System.out.println("Data sent to the Database succefully !!");
                JOptionPane.showMessageDialog(rootPane, "Data sent to the Database succefully !!");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (selectedValue == "Supplier") {

            try {
                String sql = "INSERT INTO supplier VALUES ( ?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, value1);
                pst.setString(2, value2);
                pst.setString(3, value3);
                pst.setString(4, value4);
                pst.executeUpdate();
                System.out.println("Data sent to the Database succefully !!");
                JOptionPane.showMessageDialog(rootPane, "Data sent to the Database succefully !!");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (selectedValue == "Supply_Details") {
            
            
            // Retrieve the selected date from the JDateChooser
            Date selectedDate1 = sdate.getDate();

            // Create a SimpleDateFormat object to format the date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            // Format the date as a string
            String formattedDate1 = dateFormat.format(selectedDate1);
           

            try {
                String sql = "INSERT INTO Supply_Details VALUES ( ?, ?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, combo1.getSelectedItem().toString());
                pst.setString(2, combo2.getSelectedItem().toString());
                pst.setString(3, formattedDate1);
                pst.setString(4, value4);
                pst.setString(5, value5);
                pst.executeUpdate();
                System.out.println("Data sent to the Database succefully !!");
                JOptionPane.showMessageDialog(rootPane, "Data sent to the Database succefully !!");
                combo1.setSelectedItem(null);
                combo2.setSelectedItem(null);
                sdate.setDate(null);
                t4.setText("");
                t5.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (selectedValue == "Bill") {

            try {
                String sql = "INSERT INTO Bill VALUES ( ?, ?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, value1);
                pst.setString(2, value2);
                pst.setString(3, value3);
                pst.setString(4, value4);
                pst.setString(5, value5);
                pst.executeUpdate();
                System.out.println("Data sent to the Database succefully !!");
                JOptionPane.showMessageDialog(rootPane, "Data sent to the Database succefully !!");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private void writeToDB(String sql) {
        conn = DbmsConn.connect();
        String value1 = t1.getText();
        String value2 = t2.getText();
        String value3 = t3.getText();
        String value4 = t4.getText();
        String value5 = t5.getText();
        String value6 = t6.getText();
        String value7 = t7.getText();

        String[] stringAry = {value1, value2, value3, value4, value5, value6, value7};

        String placeHolders = "?";
        String qm = ",?";
        for (int i = 1; i < logged_admin.table1.getColumnCount(); i++) {
            placeHolders = placeHolders + qm;
        }

        String sql1 = sql; //"INSERT INTO " + logged_admin.drop_down_menu.getSelectedItem().toString() + " VALUES ("+placeHolders+")";
        try {
            pst = conn.prepareStatement(sql);

            for (int i = 0; i < logged_admin.table1.getColumnCount(); i++) {
                pst.setString(i + 1, stringAry[i].toString());
            }

            pst.execute();

//            pst.close;
            conn.close();
            JOptionPane.showMessageDialog(null, "Done Successfully!");
//                "INSERT INTO"+ logged_admin.drop_down_menu.getSelectedItem().toString()+ "VALUES ("+value1+", ";
        } catch (SQLException ex) {
            Logger.getLogger(AddingForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Data Error!");
        }
    }

    protected void modifyCustomize() {
        model = logged_admin.table1.getModel();;
        int selectedRowIndex = logged_admin.table1.getSelectedRow();
        int cct = logged_admin.table1.getColumnCount();
        int rest = 7 - cct;
        JLabel[] fulllabelArray = {l1, l2, l3, l4, l5, l6, l7};
        JTextField[] fullTextArray = {t1, t2, t3, t4, t5, t6, t7};
        JLabel[] labelArray = new JLabel[cct];
        JTextField[] textArray = new JTextField[cct];
        String[] THArray = new String[cct];

        for (int i = 0; i < cct; i++) {
            labelArray[i] = fulllabelArray[i];
            THArray[i] = model.getColumnName(i).toString();
        }

        for (int i = 0; i < cct; i++) {

            textArray[i] = fullTextArray[i];
            labelArray[i].setText(THArray[i].toString());
        }

        for (int i = 0; i < cct; i++) {
            if (selectedRowIndex != -1) {
                model = logged_admin.table1.getModel();
                Object data = model.getValueAt(selectedRowIndex, i);
                textArray[i].setText(data.toString());
                Object heading = model.getColumnName(i);
                labelArray[i].setText(heading.toString());
            }
        }

        while (rest > 0) {
            fulllabelArray[7 - rest].setText("");
            fullTextArray[7 - rest].setVisible(false);
            rest--;
        }
        
        String tname = model.getColumnName(0); 
    String tname1 = model.getColumnName(2);
     
        if (tname.equals("DID")) {
            mdate.setVisible(true);
            edate.setVisible(true);
            combo.setVisible(true);
            t5.setVisible(false);
            t6.setVisible(false);
            t7.setVisible(false);
            sdate.setVisible(false);
            try{
            Connection connn=DbmsConn.connect();
            java.sql.Statement stm = connn.createStatement();
            ResultSet rss = stm.executeQuery("select GID from generic");
            while(rss.next()){
                String name= rss.getString("GID");
                combo.addItem(name);
            }
            connn.close();
            }catch(Exception e){
                
            }
            
        } else if(tname1.equals("SDATE")){
            sdate.setVisible(true);
            combo1.setVisible(true);
            combo2.setVisible(true);
            t1.setVisible(false);
            t2.setVisible(false);
            t3.setVisible(false);
            combo.setVisible(false);
            edate.setVisible(false);
            mdate.setVisible(false);
            
            try{
            Connection connn=DbmsConn.connect();
            java.sql.Statement stm = connn.createStatement();
            ResultSet rss = stm.executeQuery("select SID from supplier");
            while(rss.next()){
                String name= rss.getString("SID");
                combo1.addItem(name);
            }
            connn.close();
            }catch(Exception e){
                
            }
            
            try{
            Connection connn=DbmsConn.connect();
            java.sql.Statement stm = connn.createStatement();
            ResultSet rss = stm.executeQuery("select DID from drug");
            while(rss.next()){
                String name= rss.getString("DID");
                combo2.addItem(name);
            }
            connn.close();
            }catch(Exception e){
                
            }
            
        }else{
            combo.setVisible(false);
            edate.setVisible(false);
            mdate.setVisible(false);  
            sdate.setVisible(false);
                }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addd;
    private javax.swing.JButton cl;
    private javax.swing.JButton clearr;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private com.toedter.calendar.JDateChooser edate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private com.toedter.calendar.JDateChooser mdate;
    private javax.swing.JPanel rootPanel;
    private com.toedter.calendar.JDateChooser sdate;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    // End of variables declaration//GEN-END:variables
}
