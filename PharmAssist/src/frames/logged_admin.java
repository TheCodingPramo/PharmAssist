
package frames;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Shehan Chamudith
 */
public class logged_admin extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form logged_admin
     */
    public logged_admin() {
        initComponents();

        conn = DbmsConn.connect();
        tableload("drug");
        close1.setVisible(false);
    }

    public void tableload(String tname) {
        try {
            String sql = "select * from " + tname + "";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        view_table = new javax.swing.JButton();
        bill = new javax.swing.JButton();
        drop_down_menu = new frames.Combobox();
        addButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        close1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 840, 570));

        view_table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/table.png"))); // NOI18N
        view_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                view_tableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                view_tableMouseExited(evt);
            }
        });
        view_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_tableActionPerformed(evt);
            }
        });
        jPanel1.add(view_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 210, 170, 70));
        view_table.setOpaque(false);
        view_table.setContentAreaFilled(false);
        view_table.setBorderPainted(false);

        bill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/bill.png"))); // NOI18N
        bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                billMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                billMouseExited(evt);
            }
        });
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });
        jPanel1.add(bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 580, 250, 150));
        bill.setOpaque(false);
        bill.setContentAreaFilled(false);
        bill.setBorderPainted(false);

        drop_down_menu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Table", "Drug", "Generic", "Customer", "Employee", "Supplier", "Supply_Details", "Bill" }));
        drop_down_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drop_down_menuActionPerformed(evt);
            }
        });
        jPanel1.add(drop_down_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 220, 160, -1));

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/add.png"))); // NOI18N
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButtonMouseExited(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 300, -1, 80));
        addButton.setOpaque(false);
        addButton.setContentAreaFilled(false);
        addButton.setBorderPainted(false);

        modifyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/export.png"))); // NOI18N
        modifyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifyButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifyButtonMouseExited(evt);
            }
        });
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(modifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 382, -1, 80));
        modifyButton.setOpaque(false);
        modifyButton.setContentAreaFilled(false);
        modifyButton.setBorderPainted(false);

        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/remove.png"))); // NOI18N
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeButtonMouseExited(evt);
            }
        });
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 472, -1, 80));
        removeButton.setOpaque(false);
        removeButton.setContentAreaFilled(false);
        removeButton.setBorderPainted(false);

        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/close.png"))); // NOI18N
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close1MouseExited(evt);
            }
        });
        close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close1ActionPerformed(evt);
            }
        });
        jPanel1.add(close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 50, 50));
        close1.setOpaque(false);
        close1.setContentAreaFilled(false);
        close1.setBorderPainted(false);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        Bill billing = new Bill();
        billing.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_billActionPerformed

    private void billMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billMouseEntered
        bill.setIcon(new ImageIcon(getClass().getResource("/Graphics/bill 1.png")));
    }//GEN-LAST:event_billMouseEntered

    private void billMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billMouseExited
        bill.setIcon(new ImageIcon(getClass().getResource("/Graphics/bill.png")));
    }//GEN-LAST:event_billMouseExited

    public String drop(){
       String tabless;
       tabless = drop_down_menu.getSelectedItem().toString(); 
       return tabless;
    }
    
    private void view_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_tableActionPerformed
        
        String tables;
        tables = drop_down_menu.getSelectedItem().toString();

        if (tables == "Select Table") {
            JOptionPane.showOptionDialog(
                    null, // parent component
                    "Please Select a Table !!",
                    "Message",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    null,
                    null
            );
        } else if (tables == "Drug") {
            try {
                String sql = "select * from " + tables;
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                table1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (tables == "Generic") {
            try {
                String sql = "select * from " + tables;
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                table1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (tables == "Employee") {
            try {
                String sql = "select * from " + tables;
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                table1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (tables == "Customer") {
            try {
                String sql = "select * from " + tables;
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                table1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (tables == "Supplier") {
            try {
                String sql = "select * from " + tables;
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                table1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (tables == "Supply_Details") {
            try {
                String sql = "select * from " + tables;
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                table1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (tables == "Bill") {
            try {
                String sql = "select * from " + tables;
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                table1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (tables == "Pres_Order") {
            try {
                String sql = "select * from " + tables;
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                table1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (tables == "Drug_Order") {
            try {
                String sql = "select * from " + tables;
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                table1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_view_tableActionPerformed

    private void view_tableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_tableMouseExited
        view_table.setIcon(new ImageIcon(getClass().getResource("/Graphics/table.png")));
    }//GEN-LAST:event_view_tableMouseExited

    private void view_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_tableMouseEntered
        view_table.setIcon(new ImageIcon(getClass().getResource("/Graphics/table 1.png")));
    }//GEN-LAST:event_view_tableMouseEntered

    AddingForm adf=null;
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        adf = new AddingForm();
        try {
            adf.addCustomize1();
        } catch (SQLException ex) {
            Logger.getLogger(logged_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        adf.setVisible(true);
        
//        Connection conn=DbmsConn.connect();
//        String sql="INSERT INTO ? VALUES ( ";
//        for (int i = 0; i < adf.cct; i++) {
//            sql=sql+" ?,";
//        }
//        sql=sql+ ");";
//        try {
//            PreparedStatement pst=conn.prepareStatement(sql);
//            pst.setString(1, (String)drop_down_menu.getSelectedItem());
//            for (int i = 0; i < adf.cct; i++) {
//                pst.setString(i, adf.labelArray[i].toString());
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(logged_admin.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        addButton.setIcon(new ImageIcon(getClass().getResource("/Graphics/add1.png")));
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        addButton.setIcon(new ImageIcon(getClass().getResource("/Graphics/add.png")));
    }//GEN-LAST:event_addButtonMouseExited

    private void modifyButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyButtonMouseEntered
        modifyButton.setIcon(new ImageIcon(getClass().getResource("/Graphics/export1.png")));
    }//GEN-LAST:event_modifyButtonMouseEntered

    private void modifyButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyButtonMouseExited
        modifyButton.setIcon(new ImageIcon(getClass().getResource("/Graphics/export.png")));
    }//GEN-LAST:event_modifyButtonMouseExited

    private void removeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseEntered
        removeButton.setIcon(new ImageIcon(getClass().getResource("/Graphics/remove1.png")));
    }//GEN-LAST:event_removeButtonMouseEntered

    private void removeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseExited
        removeButton.setIcon(new ImageIcon(getClass().getResource("/Graphics/remove.png")));
    }//GEN-LAST:event_removeButtonMouseExited

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed

        int r = table1.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(rootPane, "No row is selected !! Please select a row !!");
        } else {
            int check = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete this record ? ");
            if (check == 0 && r != -1) {
                String tables = drop_down_menu.getSelectedItem().toString();

                String id =  table1.getValueAt(r, 0).toString();

                String idColumn = null;
                String tt = null;
                switch (tables) {
                    case "Drug" -> {
                        idColumn = "did";
                        tt = "drug";
                    }
                    case "Generic" -> {
                        idColumn = "gid";
                        tt = "generic";
                    }
                    case "Employee" -> {
                        idColumn = "eid";
                        tt = "employee";
                    }
                    case "Customer" -> {
                        idColumn = "cid";
                        tt = "customer";
                    }
                    case "Supplier" -> {
                        idColumn = "sid";
                        tt = "supplier";
                    }
                    case "Supply_Details" -> {
                        idColumn = "sid";
                        tt = "supply_details";
                    }
                    case "Bill" -> {
                        idColumn = "bid";
                        tt = "bill";
                    }
                    
                }
                try {

                    String sql = "DELETE FROM " + tables + " WHERE " + idColumn + "='" + id + "'";
                    pst = conn.prepareStatement(sql);
                    int rowsAffected = pst.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Record Deleted !!");
                        tableload(tt);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Record not found or not deleted.");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        }


    }//GEN-LAST:event_removeButtonActionPerformed

    private void close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close1ActionPerformed
        this.dispose();

    }//GEN-LAST:event_close1ActionPerformed

    private void close1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseEntered
        close1.setIcon(new ImageIcon(getClass().getResource("/Graphics/close 1.png")));
    }//GEN-LAST:event_close1MouseEntered

    private void close1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseExited
        close1.setIcon(new ImageIcon(getClass().getResource("/Graphics/close.png")));
    }//GEN-LAST:event_close1MouseExited

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        this.dispose();
    }//GEN-LAST:event_close1MouseClicked

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        AddingForm adf = new AddingForm();
        adf.modifyCustomize();
        adf.setVisible(true);
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void drop_down_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drop_down_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drop_down_menuActionPerformed

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
            java.util.logging.Logger.getLogger(logged_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logged_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logged_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logged_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new logged_admin().setVisible(true);
            }
        });
    }

    public String getSelectedValue() {
        return (String) drop_down_menu.getSelectedItem();
    }

    public JComboBox getDrop_down_menu() {
        return drop_down_menu;
    }
    
    public static JComboBox<String> getDropDownMenu() {
    return drop_down_menu;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton bill;
    private javax.swing.JButton close1;
    protected static frames.Combobox drop_down_menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton removeButton;
    protected static javax.swing.JTable table1;
    private javax.swing.JButton view_table;
    // End of variables declaration//GEN-END:variables
}
