/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import java.sql.Connection;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.Document;
import javax.swing.text.Element;


public class Bill extends javax.swing.JFrame {

    /**
     * Creates new form Bill
     */
    private double total ;
    
    private void setTotal(double total){
        this.total =total;
    
    }
    
    private double  getTotal(){
        return total;
    
    
    }
    public Bill() {
        initComponents();

        
        
        billIDset();
        BillArea1.setEditable(false);
        //this.setResizable(false);

    }

    
  

    private void updateDrugTable(java.sql.Connection con) {

        try {

            String query1 = "SET SQL_SAFE_UPDATES =0";
            String query2 = "update drug set quantity = quantity - ? where dname = ?";
            String query3 = "SET SQL_SAFE_UPDATES =1";

            PreparedStatement ps1 = con.prepareStatement(query1);
            PreparedStatement ps2 = con.prepareStatement(query2);
            PreparedStatement ps3 = con.prepareStatement(query3);

            ps2.setString(1, qty.getText());
            ps2.setString(2, select.getText());

            ps1.executeUpdate();
            ps2.executeUpdate();
            ps3.executeUpdate();

            con.close();
            ps1.close();
            ps2.close();
            ps3.close();

        } catch (Exception e) {
        }

    }

    public void clearDrugInfo() {

        select.setText("");
        qty.setText("");
        unitPrice.setText("");

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BillID = new javax.swing.JLabel();
        unitPrice = new javax.swing.JLabel();
        select = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        customerName = new javax.swing.JTextField();
        TelNo = new javax.swing.JTextField();
        SearchTF = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        clear_search = new javax.swing.JButton();
        remove_item = new javax.swing.JButton();
        bill_table = new javax.swing.JScrollPane();
        tablebill = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ResultTable = new javax.swing.JTable();
        billID = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        BillArea1 = new javax.swing.JTextArea();
        totall = new javax.swing.JLabel();
        Too = new javax.swing.JLabel();
        cashh = new javax.swing.JLabel();
        Cash = new javax.swing.JTextField();
        balance = new javax.swing.JLabel();
        Bal = new javax.swing.JLabel();
        pay = new javax.swing.JButton();
        billclose = new javax.swing.JButton();
        pbill = new javax.swing.JButton();
        cbill = new javax.swing.JButton();
        test = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1766, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 153), 2));
        jPanel2.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setPreferredSize(new java.awt.Dimension(1393, 692));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BillID.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BillID.setToolTipText("");
        jPanel2.add(BillID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 80, 30));

        unitPrice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel2.add(unitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 130, 30));

        select.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel2.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 390, 30));

        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });
        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qtyKeyPressed(evt);
            }
        });
        jPanel2.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 120, -1));

        customerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerNameKeyPressed(evt);
            }
        });
        jPanel2.add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 340, -1));

        TelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelNoActionPerformed(evt);
            }
        });
        TelNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TelNoKeyPressed(evt);
            }
        });
        jPanel2.add(TelNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 340, -1));
        jPanel2.add(SearchTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 250, -1));

        b1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/clear.png"))); // NOI18N
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel2.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);

        b2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/addbill.png"))); // NOI18N
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2MouseExited(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel2.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);

        b3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/clear.png"))); // NOI18N
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3MouseExited(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel2.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, -1, -1));
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);

        b4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/add_1.png"))); // NOI18N
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4MouseExited(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel2.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 690, -1, -1));
        b4.setOpaque(false);
        b4.setContentAreaFilled(false);
        b4.setBorderPainted(false);

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 60, 90, -1));

        clear_search.setText("Clear Search");
        clear_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_searchActionPerformed(evt);
            }
        });
        jPanel2.add(clear_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 60, -1, -1));

        remove_item.setText("Remove Item");
        remove_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_itemActionPerformed(evt);
            }
        });
        jPanel2.add(remove_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 710, -1, -1));

        tablebill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine", "Quantity", "Unit Price", "Sub Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bill_table.setViewportView(tablebill);
        if (tablebill.getColumnModel().getColumnCount() > 0) {
            tablebill.getColumnModel().getColumn(0).setResizable(false);
            tablebill.getColumnModel().getColumn(1).setResizable(false);
            tablebill.getColumnModel().getColumn(2).setResizable(false);
            tablebill.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(bill_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 460, 260));

        ResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ResultTable.getTableHeader().setReorderingAllowed(false);
        ResultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ResultTable);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 460, 270));

        billID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/bill window.jpg"))); // NOI18N
        billID.setMaximumSize(new java.awt.Dimension(1366, 768));
        billID.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.add(billID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        BillArea1.setColumns(20);
        BillArea1.setRows(5);
        jScrollPane5.setViewportView(BillArea1);

        totall.setText("Total : ");

        Too.setText("0.00");

        cashh.setText("Cash");

        balance.setText("Balance");

        Bal.setText("0.00");

        pay.setText("Pay");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        billclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/close.png"))); // NOI18N
        billclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                billcloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                billcloseMouseExited(evt);
            }
        });
        billclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billcloseActionPerformed(evt);
            }
        });

        pbill.setText("Print Bill");
        pbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbillActionPerformed(evt);
            }
        });

        cbill.setText("Clear Bill");
        cbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbillActionPerformed(evt);
            }
        });

        test.setText("test");
        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(billclose)
                                .addGap(16, 16, 16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totall)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(balance)
                                            .addComponent(cashh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(pay))
                                            .addComponent(Bal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Too, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(142, 142, 142)
                                        .addComponent(test)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(pbill)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbill)
                        .addGap(82, 82, 82))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billclose)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totall, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Too, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashh)
                    .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pay))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pbill)
                    .addComponent(cbill))
                .addGap(18, 18, 18)
                .addComponent(test)
                .addGap(63, 63, 63))
        );

        billclose.setOpaque(false);
        billclose.setContentAreaFilled(false);
        billclose.setBorderPainted(false);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1770, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed

        
        if (ButtonClicked) {
           String cname = customerName.getText();
        String tel = TelNo.getText();

                    if (tel.isEmpty() == false && cname.isEmpty() == false) {

                        if (tel.length() == 10) {

                            BillArea1.setText(BillArea1.getText() + "\n" + "Customer Name:" + "  " + customerName.getText() + "\t");
                            BillArea1.setText(BillArea1.getText() + "       Tel no:" + "  " + TelNo.getText() + "\n\n");
                                try {
                                    writeCustomerToDB();
                                } catch (SQLException ex) {
                                    Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            customerName.setText("");
                            TelNo.setText("");

                        } else {

                            JOptionPane.showMessageDialog(this, "Invalid telephone number");

                        }
                    } else {
                        if (cname.isEmpty() == true && tel.isEmpty() == false) {
                            if (tel.length() != 10) {
                                JOptionPane.showMessageDialog(this, "Invalid telephone number");
                            }

                        }
                    }
   
        }else{
        
        JOptionPane.showMessageDialog(null, "The Bill is empty !! \nGenereate the bill first to add customer details !!");
        
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        customerName.setText("");
        TelNo.setText("");
    }//GEN-LAST:event_b3ActionPerformed

    private void TelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelNoActionPerformed
    private void addtotable(){
        String value1 = null;
        String value2 = null;
        String value3 = null;
   
        value1 = select.getText();
        value2 = qty.getText();
        value3 = unitPrice.getText();
        
        String column1Value = select.getText();
        String column2Value = qty.getText();
        String column3Value = unitPrice.getText();
        
        double num1 = Double.parseDouble(column2Value);
        double num2 = Double.parseDouble(column3Value);
        double result = num1*num2;

        double column4Value = result;

        addRowToTable(column1Value, column2Value, column3Value, column4Value);
    }
    
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        
        //addtotable();
        
        //cart_cal();
        
         //BillArea.setText(BillArea.getText()+"\t"+select.getText()+"\t"+qty.getText()+"\t"+unitPrice.getText()+"\n");
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
           
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PHARMASSIST", "root", "");

            String quantity = qty.getText();
            String med = select.getText();

            String cquery = "select quantity from drug where dname =?";

            PreparedStatement cps = con.prepareStatement(cquery);
            cps.setString(1, med);

            ResultSet rs = cps.executeQuery();

            if (rs.next()) {

                String cqty = rs.getString(1);

                int limit = Integer.parseInt(cqty);
                int iqty = Integer.parseInt(quantity);

                if (iqty <= limit && iqty != 0) {

                    String expquery = "SELECT DATEDIFF(  EXP_DATE,  CAST(CURRENT_TIMESTAMP  AS Date )  ) from drug where dname =?";
                    PreparedStatement eps = con.prepareStatement(expquery);
                    eps.setString(1, med);
                    ResultSet rs2 = eps.executeQuery();

                    if (rs2.next()) {
                        if (Integer.parseInt(rs2.getString(1)) > 0) {
                            if (Integer.parseInt(rs2.getString(1)) > 180) {
                                addtotable();
                                cart_cal();
                                //printTextArea();
                            //    updateTotal(total); 
                               updateDrugTable(con);
                                clearDrugInfo();

                            } //if expiration within 180 days
                            else {

                                int resp = JOptionPane.showConfirmDialog(this, "Only " + rs2.getString(1) + " days left till  expiration.Do you wish to proceed?", "Warning!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                                if (resp == JOptionPane.OK_OPTION) {
                                    addtotable();
                                    cart_cal();
                                    //printTextArea();
                                  //   updateTotal(total);
                                    updateDrugTable(con);
                                    clearDrugInfo();

                                } else {
                                    clearDrugInfo();

                                }
                            }

                        } else {
                            //if result is less than 0

                            int msg = JOptionPane.showConfirmDialog(null, "Drug Expired!", "Warning!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
                            if (msg == JOptionPane.OK_OPTION) {
                                clearDrugInfo();
                            } else {
                                clearDrugInfo();
                            }

                        }

                    } //end of rs2.next for exp date
                } //end of stock check if /second if
                else if (iqty > limit) {

                    JOptionPane.showMessageDialog(this, "Only " + rs.getString(1) + " units are available!");

                } else if (iqty == 0) {

                    int msg = JOptionPane.showConfirmDialog(null, " 0 is not a valid quantity", "Message", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if (msg == JOptionPane.OK_OPTION) {

                        qty.setText("");

                    } else {

                        qty.setText("");

                    }

                } //end of stock check else

            }

            //end of if (rs.next()) / first if
            rs.close();
            con.close();

        } //end of try
        //copy catch
        catch (Exception e) {
        }//end of catch


        
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        billID.setText("");
        clearDrugInfo();
    }//GEN-LAST:event_b1ActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        ResultTable.setModel(new DefaultTableModel());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //establishes connection
            //Change usernames etc.
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PHARMASSIST", "root", "");
            String query = "select did,dname,quantity,price,mfd,exp_date,d.gid,gname from drug d inner join generic g on g.gid =d.gid where dname like concat( ?,'%') or gname like concat ( ?,'%')";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, SearchTF.getText());
            pst.setString(2, SearchTF.getText());

            if (SearchTF.getText().isEmpty() == false) {
                ResultSet rs = pst.executeQuery();

                if (rs.isBeforeFirst()) {

                    ResultSetMetaData rsmd = rs.getMetaData();

                    DefaultTableModel model = (DefaultTableModel) ResultTable.getModel();

                    int cols = rsmd.getColumnCount();
                    String[] colName = new String[cols];
                    for (int i = 0; i < cols; i++) {
                        colName[i] = rsmd.getColumnName(i + 1);
                    }
                    model.setColumnIdentifiers(colName);

                    String a, b, c, d, e, f, g, h;
                    while (rs.next()) {
                        a = rs.getString(1);
                        b = rs.getString(2);
                        c = rs.getString(3);
                        d = rs.getString(4);
                        e = rs.getString(5);
                        f = rs.getString(6);
                        g = rs.getString(7);
                        h = rs.getString(8);
                        String[] row = {a, b, c, d, e, f, g, h};
                        model.addRow(row);

                    }

                    rs.close();
                    con.close();
                } else {
                    JOptionPane.showMessageDialog(this, "No results found!");

                }

            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);

        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void ResultTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultTableMouseClicked
        // TODO add your handling code here:
        int i = ResultTable.getSelectedRow();
        TableModel model = ResultTable.getModel();
        select.setText(model.getValueAt(i, 1).toString());
        unitPrice.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_ResultTableMouseClicked

    private void qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyPressed
        // TODO add your handling code here:
        String q = qty.getText();
        char c = evt.getKeyChar();

        if (c >= '0' && c <= '9') {

            qty.setEditable(true);

        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {

                qty.setEditable(true);
            } else {

                qty.setEditable(false);
            }

        }
    }//GEN-LAST:event_qtyKeyPressed

    private void TelNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelNoKeyPressed
        // TODO add your handling code here:
        String no = TelNo.getText();
        int len = no.length();
        char c = evt.getKeyChar();

        if (c >= '0' && c <= '9') {

            if (len < 10) {
                TelNo.setEditable(true);
            } else {
                TelNo.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {

                TelNo.setEditable(true);
            } else {

                TelNo.setEditable(false);
            }

        }


    }//GEN-LAST:event_TelNoKeyPressed

    private void customerNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c) || c == '\'') {

            customerName.setEditable(true);

        } else {

            customerName.setEditable(false);

        }
    }//GEN-LAST:event_customerNameKeyPressed

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyActionPerformed

    private void billcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billcloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_billcloseActionPerformed

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        b1.setIcon(new ImageIcon(getClass().getResource("/Graphics/clear1.png")));
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        b1.setIcon(new ImageIcon(getClass().getResource("/Graphics/clear.png")));
    }//GEN-LAST:event_b1MouseExited

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
        b2.setIcon(new ImageIcon(getClass().getResource("/Graphics/addbill1.png")));
    }//GEN-LAST:event_b2MouseEntered

    private void b2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseExited
        b2.setIcon(new ImageIcon(getClass().getResource("/Graphics/addbill.png")));
    }//GEN-LAST:event_b2MouseExited

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
        b3.setIcon(new ImageIcon(getClass().getResource("/Graphics/clear1.png")));
    }//GEN-LAST:event_b3MouseEntered

    private void b3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseExited
        b3.setIcon(new ImageIcon(getClass().getResource("/Graphics/clear.png")));
    }//GEN-LAST:event_b3MouseExited

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
        b4.setIcon(new ImageIcon(getClass().getResource("/Graphics/add1_1.png")));
    }//GEN-LAST:event_b4MouseEntered

    private void b4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseExited
        b4.setIcon(new ImageIcon(getClass().getResource("/Graphics/add_1.png")));
    }//GEN-LAST:event_b4MouseExited

    private void billcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billcloseMouseEntered
        billclose.setIcon(new ImageIcon(getClass().getResource("/Graphics/close 1.png")));
    }//GEN-LAST:event_billcloseMouseEntered

    private void billcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billcloseMouseExited
        billclose.setIcon(new ImageIcon(getClass().getResource("/Graphics/close.png")));
    }//GEN-LAST:event_billcloseMouseExited
    
    boolean ButtonClicked = false;
    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        
        if(Cash.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter the Cash Amount !");
        }else {
            Double tot = Double.valueOf(Too.getText());
            Double chs = Double.valueOf(Cash.getText());
            Double bal = chs - tot ;
            
            DecimalFormat df = new DecimalFormat("00.00");
            Bal.setText(String.valueOf(df.format(bal)));
            
 
               Connection conn = DbmsConn.connect();

                        try {
                            String sql = "INSERT INTO bill (PAYMENT_METHOD, TOTAL, CASH_GIVEN, BALANCE) VALUES ('CASH', ?, ?, ?)";
                            PreparedStatement pst = conn.prepareStatement(sql);
                            pst.setString(1, Too.getText());
                            pst.setString(2, Cash.getText());
                            pst.setString(3, Bal.getText());
                            pst.executeUpdate();
                            System.out.println("Bill sent to the Database succefully !!");
                        } catch (SQLException ex) {
                            Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
                        }
            
            
        TableModel model = tablebill.getModel();
        if (model.getRowCount() == 0) {
           
            JOptionPane.showMessageDialog(null, "The Bill is empty !!!");
        }else{
           ButtonClicked = true;
           bill_print();
       }
        Cash.setText("");
            
        }
        
        
    }//GEN-LAST:event_payActionPerformed

    private void clear_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_searchActionPerformed
        ResultTable.setModel(new DefaultTableModel());
        SearchTF.setText("");
    }//GEN-LAST:event_clear_searchActionPerformed

    private void remove_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_itemActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) tablebill.getModel();
        int[] selectedRows = tablebill.getSelectedRows();

                // Remove the selected rows from the table model
                for (int i = selectedRows.length - 1; i >= 0; i--) {
                    tableModel.removeRow(selectedRows[i]);
                }
                cart_cal();
    }//GEN-LAST:event_remove_itemActionPerformed

    private void pbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbillActionPerformed
        try {
            BillArea1.print();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_pbillActionPerformed

    private void cbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbillActionPerformed
        int check = JOptionPane.showConfirmDialog(rootPane, "Do you really want to Clear the Bill ?");
        DefaultTableModel model = (DefaultTableModel) tablebill.getModel();
        if(check==0){
          BillArea1.setText("");  
          model.setRowCount(0);
        }
        
    }//GEN-LAST:event_cbillActionPerformed
    printBill printt=null;
    private void testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testActionPerformed
        printt = new printBill();
        printt.setVisible(true);
    }//GEN-LAST:event_testActionPerformed

    private void writeCustomerToDB() throws SQLException {
        
        Connection conn = DbmsConn.connect();

                        try {
                            String sql = "INSERT INTO customer (CNAME, PHONE) VALUES (?, ?)";
                            PreparedStatement pst = conn.prepareStatement(sql);
                            pst.setString(1, customerName.getText());
                            pst.setString(2, TelNo.getText());
                            pst.executeUpdate();
                            System.out.println("Customer details sent to the Database succefully !!");
                        } catch (SQLException ex) {
                            Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
                        }

    }
    

public void addRowToTable(String column1Value, String column2Value, String column3Value, double column4Value) {
    DefaultTableModel model = (DefaultTableModel) tablebill.getModel();
    model.addRow(new Object[]{column1Value, column2Value, column3Value, column4Value});
}


public void bill_print(){
    
    
    
    
     BillArea1.setText("                         Life Care Pharmacy \n");
     BillArea1.setText(BillArea1.getText() + "\tNo 6/ Uyanwatta, \n");
     BillArea1.setText(BillArea1.getText() + "\tMatara, Sri lanka, \n");
     BillArea1.setText(BillArea1.getText() + "\t+94 412273696, \n");
     BillArea1.setText(BillArea1.getText() + "------------------------------------------------------------------------------\n");
     BillArea1.setText(BillArea1.getText() + " Iteam \t\tQty \tPrice \n");
     BillArea1.setText(BillArea1.getText() + "------------------------------------------------------------------------------\n");
     DefaultTableModel df = (DefaultTableModel) tablebill.getModel();
     for (int i = 0; i < tablebill.getRowCount(); i++) {
         
         String name = df.getValueAt(i, 0).toString();
         String qt = df.getValueAt(i, 1).toString();
         String prc = df.getValueAt(i, 2).toString();
         
         BillArea1.setText(BillArea1.getText() + name+"\t"+qt+"\t"+prc+" \n");
         
     }
     BillArea1.setText(BillArea1.getText() + "------------------------------------------------------------------------------\n");
     BillArea1.setText(BillArea1.getText() + "Total :\t"+Too.getText()+"\n");
     BillArea1.setText(BillArea1.getText() + "Cash :\t"+Cash.getText()+"\n");
     BillArea1.setText(BillArea1.getText() + "Ballance :\t"+Bal.getText()+"\n");
     BillArea1.setText(BillArea1.getText() + "=============================================\n");
     BillArea1.setText(BillArea1.getText() +"                     Thanks You For Shopping...!"+"\n"+"                               Come Again...!"+"\n");
     BillArea1.setText(BillArea1.getText() + "------------------------------------------------------------------------------\n");
     BillArea1.setText(BillArea1.getText() +"                     Software by PharmAssist"+"\n");
     
 
 }


 public void cart_cal(){
 
  int numofrow = tablebill.getRowCount();
  double total = 0 ;
     for (int i = 0; i < numofrow; i++) {
         double value = Double.valueOf(tablebill.getValueAt(i, 3).toString());
         total+= value;
         
     }
  
     DecimalFormat df = new DecimalFormat("00.00");
     String d1 = df.format(total);
     Too.setText(d1);
     
  
 }

 
 public void billIDset(){
     Connection conn = DbmsConn.connect();
try {
    // Retrieve the current maximum bill ID
    String maxIdQuery = "SELECT MAX(bid) FROM bill";
    PreparedStatement maxIdStmt = conn.prepareStatement(maxIdQuery);
    ResultSet maxIdResult = maxIdStmt.executeQuery();
    
    int currentMaxId = 0;
    if (maxIdResult.next()) {
        currentMaxId = maxIdResult.getInt(1);
    }
    
    // Calculate the next bill ID
    int nextBillId = currentMaxId + 1;
    
    // Display the next bill ID on a JLabel
    BillID.setText("  " + nextBillId);
} catch (SQLException ex) {
    Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
}

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    public String passToo(){
        String aaa = Too.getText();
        return aaa;
    }
    public String passCash(){
        String bbb = Cash.getText();
        return bbb;
    }
    public String passBal(){
        String ccc = Bal.getText();
        return ccc;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bal;
    private javax.swing.JTextArea BillArea1;
    private javax.swing.JLabel BillID;
    private javax.swing.JTextField Cash;
    private javax.swing.JTable ResultTable;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchTF;
    private javax.swing.JTextField TelNo;
    private javax.swing.JLabel Too;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JLabel balance;
    private javax.swing.JLabel billID;
    private javax.swing.JScrollPane bill_table;
    private javax.swing.JButton billclose;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cashh;
    private javax.swing.JButton cbill;
    private javax.swing.JButton clear_search;
    private javax.swing.JTextField customerName;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton pay;
    private javax.swing.JButton pbill;
    private javax.swing.JTextField qty;
    private javax.swing.JButton remove_item;
    private javax.swing.JLabel select;
    private javax.swing.JTable tablebill;
    private javax.swing.JButton test;
    private javax.swing.JLabel totall;
    private javax.swing.JLabel unitPrice;
    // End of variables declaration//GEN-END:variables

}
