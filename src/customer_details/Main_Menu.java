/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer_details;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SaKu
 */
public class Main_Menu extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    int lastcusid;
    String lastid;
    int i=001;
    
    public Main_Menu() {
        initComponents();
        con=connection.connect();
        ViewCus_Table();
        ViewCus_Table2();
        ViewCus_Table3();
    }

public void ViewCus_Table(){
    
    String sql= "select * from customer";
    try{
        pst = con.prepareStatement(sql);     
    }
    catch(Exception e){
    }
    
    try{
        rs = pst.executeQuery();
    }
    catch(Exception e){}
            
    CusView_Table.setModel(DbUtils.resultSetToTableModel(rs));
}

public void ViewCus_Table2(){
    
    String sql= "select * from customer";
    try{
        pst = con.prepareStatement(sql);     
    }
    catch(Exception e){
    }
    
    try{
        rs = pst.executeQuery();
    }
    catch(Exception e){}
            
    CusView_Table2.setModel(DbUtils.resultSetToTableModel(rs));
}

public void ViewCus_Table3(){
    
    String sql= "select * from customer";
    try{
        pst = con.prepareStatement(sql);     
    }
    catch(Exception e){
    }
    
    try{
        rs = pst.executeQuery();
    }
    catch(Exception e){}
            
    CusView_Table3.setModel(DbUtils.resultSetToTableModel(rs));
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        Display_Panel = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        add_cus = new javax.swing.JPanel();
        cusID = new javax.swing.JLabel();
        cusname = new javax.swing.JLabel();
        cusNIC = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        contactNo = new javax.swing.JLabel();
        cusname_txt = new javax.swing.JTextField();
        nic_txt = new javax.swing.JTextField();
        address_txt = new javax.swing.JTextField();
        gen_combo = new javax.swing.JComboBox<>();
        contact_txt = new javax.swing.JTextField();
        AddCus_Button = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        cusid = new javax.swing.JLabel();
        addcusimage = new javax.swing.JLabel();
        view_cus = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CusView_Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        update_cus = new javax.swing.JPanel();
        cusid_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        cusnic_txt = new javax.swing.JTextField();
        add_txt = new javax.swing.JTextField();
        gender_combo = new javax.swing.JComboBox<>();
        contct_txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        CusView_Table2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        delete_cus = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cusid_text = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        CusView_Table3 = new javax.swing.JTable();
        image3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Button_Panel.setForeground(new java.awt.Color(51, 51, 51));
        Button_Panel.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Addcus.png"))); // NOI18N
        jButton1.setText("Add Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Button_Panel.add(jButton1);
        jButton1.setBounds(10, 120, 140, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewcus.png"))); // NOI18N
        jButton2.setText("View Customer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Button_Panel.add(jButton2);
        jButton2.setBounds(10, 210, 140, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download (1)hj.png"))); // NOI18N
        jButton3.setText("Update Customer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Button_Panel.add(jButton3);
        jButton3.setBounds(10, 300, 140, 50);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete cus.png"))); // NOI18N
        jButton4.setText("Delete Customer");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Button_Panel.add(jButton4);
        jButton4.setBounds(10, 390, 140, 50);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jButton9.setText(" Home");
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Button_Panel.add(jButton9);
        jButton9.setBounds(10, 30, 140, 50);

        image.setBackground(new java.awt.Color(51, 51, 51));
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_panel_1.jpg"))); // NOI18N
        Button_Panel.add(image);
        image.setBounds(0, 0, 180, 480);

        Display_Panel.setLayout(new java.awt.CardLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background1.jpg"))); // NOI18N

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Display_Panel.add(home, "card6");

        add_cus.setLayout(null);

        cusID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cusID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cusID.setText("Customer ID");
        cusID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_cus.add(cusID);
        cusID.setBounds(40, 30, 120, 30);

        cusname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cusname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cusname.setText("Customer Name");
        cusname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_cus.add(cusname);
        cusname.setBounds(40, 80, 120, 30);

        cusNIC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cusNIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cusNIC.setText("Customer NIC");
        cusNIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_cus.add(cusNIC);
        cusNIC.setBounds(40, 130, 120, 30);

        address.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address.setText("Address");
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_cus.add(address);
        address.setBounds(40, 180, 120, 30);

        gender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gender.setText("Gender");
        gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_cus.add(gender);
        gender.setBounds(40, 230, 120, 30);

        contactNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contactNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactNo.setText("Contact Number");
        contactNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_cus.add(contactNo);
        contactNo.setBounds(40, 280, 120, 30);

        cusname_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cusname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusname_txtActionPerformed(evt);
            }
        });
        add_cus.add(cusname_txt);
        cusname_txt.setBounds(180, 80, 230, 30);

        nic_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nic_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nic_txtActionPerformed(evt);
            }
        });
        add_cus.add(nic_txt);
        nic_txt.setBounds(180, 130, 230, 30);

        address_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add_cus.add(address_txt);
        address_txt.setBounds(180, 180, 230, 30);

        gen_combo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gen_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        gen_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_comboActionPerformed(evt);
            }
        });
        add_cus.add(gen_combo);
        gen_combo.setBounds(180, 230, 230, 30);

        contact_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add_cus.add(contact_txt);
        contact_txt.setBounds(180, 280, 230, 30);

        AddCus_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AddCus_Button.setText("Add Customer");
        AddCus_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCus_ButtonActionPerformed(evt);
            }
        });
        add_cus.add(AddCus_Button);
        AddCus_Button.setBounds(40, 350, 140, 40);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add_cus.add(jButton6);
        jButton6.setBounds(220, 350, 140, 40);

        cusid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cusid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_cus.add(cusid);
        cusid.setBounds(180, 30, 160, 30);

        addcusimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/displaypanel.jpg"))); // NOI18N
        add_cus.add(addcusimage);
        addcusimage.setBounds(0, 0, 1074, 481);

        Display_Panel.add(add_cus, "card2");

        view_cus.setLayout(null);

        CusView_Table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(CusView_Table);

        view_cus.add(jScrollPane1);
        jScrollPane1.setBounds(30, 40, 880, 402);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/displaypanel.jpg"))); // NOI18N
        view_cus.add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 480);

        Display_Panel.add(view_cus, "card3");

        update_cus.setLayout(null);

        cusid_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_cus.add(cusid_txt);
        cusid_txt.setBounds(150, 30, 90, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Customer ID");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update_cus.add(jLabel6);
        jLabel6.setBounds(10, 30, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Name");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update_cus.add(jLabel7);
        jLabel7.setBounds(10, 90, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("NIC");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update_cus.add(jLabel8);
        jLabel8.setBounds(10, 130, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Address");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update_cus.add(jLabel9);
        jLabel9.setBounds(10, 170, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Gender");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update_cus.add(jLabel10);
        jLabel10.setBounds(10, 210, 130, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Contact No");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update_cus.add(jLabel11);
        jLabel11.setBounds(10, 250, 130, 30);

        name_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_cus.add(name_txt);
        name_txt.setBounds(150, 90, 180, 30);

        cusnic_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_cus.add(cusnic_txt);
        cusnic_txt.setBounds(150, 130, 180, 30);

        add_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_cus.add(add_txt);
        add_txt.setBounds(150, 170, 180, 30);

        gender_combo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gender_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        update_cus.add(gender_combo);
        gender_combo.setBounds(150, 210, 180, 30);

        contct_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_cus.add(contct_txt);
        contct_txt.setBounds(150, 250, 180, 30);

        CusView_Table2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CusView_Table2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(CusView_Table2);

        update_cus.add(jScrollPane2);
        jScrollPane2.setBounds(340, 90, 590, 350);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        update_cus.add(jButton5);
        jButton5.setBounds(30, 320, 130, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        update_cus.add(jButton7);
        jButton7.setBounds(180, 320, 110, 40);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setText("Search");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        update_cus.add(jButton8);
        jButton8.setBounds(250, 30, 80, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/displaypanel.jpg"))); // NOI18N
        update_cus.add(jLabel5);
        jLabel5.setBounds(0, 0, 940, 480);

        Display_Panel.add(update_cus, "card4");

        delete_cus.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Enter Customer ID");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete_cus.add(jLabel2);
        jLabel2.setBounds(60, 30, 150, 30);

        cusid_text.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        delete_cus.add(cusid_text);
        cusid_text.setBounds(230, 30, 120, 30);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton10.setText("Delete");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        delete_cus.add(jButton10);
        jButton10.setBounds(410, 30, 100, 30);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton11.setText("Clear");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        delete_cus.add(jButton11);
        jButton11.setBounds(530, 30, 100, 30);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setText("Refresh");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        delete_cus.add(jButton12);
        jButton12.setBounds(650, 30, 90, 30);

        CusView_Table3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(CusView_Table3);

        delete_cus.add(jScrollPane3);
        jScrollPane3.setBounds(60, 80, 780, 380);

        image3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/displaypanel.jpg"))); // NOI18N
        delete_cus.add(image3);
        image3.setBounds(0, 0, 1074, 481);

        Display_Panel.add(delete_cus, "card5");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Button_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Display_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Display_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Display_Panel.removeAll();
        Display_Panel.add(add_cus);
        Display_Panel.repaint();
        Display_Panel.revalidate();
        try{
            pst=con.prepareStatement("select Cus_ID from customer");
            ResultSet rs=pst.executeQuery();
            rs.last();
            lastcusid=(Integer)rs.getInt("Cus_ID");
            lastid=String.valueOf(lastcusid+i);
            cusid.setText("00"+lastid);
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Display_Panel.removeAll();
        Display_Panel.add(delete_cus);
        Display_Panel.repaint();
        Display_Panel.revalidate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cusname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusname_txtActionPerformed

    private void nic_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nic_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nic_txtActionPerformed

    private void AddCus_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCus_ButtonActionPerformed
        
            if(cusname_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please Complete The Application");
        }
        try{
            String sql="insert into customer(Cus_ID,Cus_Name,NIC,Gender,Address,Contact_No)values(?,?,?,?,?,?)";
            pst=con.prepareStatement(sql);
            pst.setString(1,cusid.getText());
            pst.setString(2,cusname_txt.getText());
            pst.setString(3,nic_txt.getText());
            pst.setString(5,address_txt.getText());
            String gen=gen_combo.getSelectedItem().toString();
            pst.setString(4,gen);
            pst.setString(6,contact_txt.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"New Customer Added Successfully");
            cusid.setText("");
            cusname_txt.setText("");
            nic_txt.setText("");
            address_txt.setText("");
            gen_combo.setSelectedIndex(0);
            contact_txt.setText("");
            try{
               pst=con.prepareStatement("select Cus_ID from customer");
               ResultSet rs=pst.executeQuery();
               rs.last();
               lastcusid=(Integer)rs.getInt("Cus_ID");
               lastid=String.valueOf(lastcusid+i);
               cusid.setText("00"+lastid);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_AddCus_ButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Display_Panel.removeAll();
        Display_Panel.add(view_cus);
        Display_Panel.repaint();
        Display_Panel.revalidate();
        ViewCus_Table();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            try{
                String value1=cusid_txt.getText();
                String value2=name_txt.getText();
                String value3=cusnic_txt.getText();
                String value4=gender_combo.getSelectedItem().toString();
                String value5=add_txt.getText();
                String value6=contct_txt.getText();
                String sql="update customer set Cus_Name='"+value2+"',NIC='"+value3+"',Gender='"+value4+"',Address='"+value5+"',Contact_No='"+value6+"' where Cus_ID='"+value1+"' " ;
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Customer Record Update Succesfully");
                cusid_txt.setText("");
                name_txt.setText("");
                cusnic_txt.setText("");
                add_txt.setText("");
                gender_combo.setSelectedIndex(0);
                contct_txt.setText("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            ViewCus_Table2();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Display_Panel.removeAll();
        Display_Panel.add(update_cus);
        Display_Panel.repaint();
        Display_Panel.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String sql="select * from customer where Cus_ID=?";
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,cusid_txt.getText());
            rs=pst.executeQuery();
            if(rs.next()){
             String add1=rs.getString("Cus_Name");
             name_txt.setText(add1);
             String add2=rs.getString("NIC");
             cusnic_txt.setText(add2);
             String add3 = rs.getString("Gender");
             gender_combo.addItem(add3);
             String add4=rs.getString("Address");
             add_txt.setText(add4);
             String add5=rs.getString("Contact_No");
             contct_txt.setText(add5);
            }
            else{
                JOptionPane.showMessageDialog(null,"No Records Found");
                cusid_txt.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
                cusid_txt.setText("");
                name_txt.setText("");
                cusnic_txt.setText("");
                add_txt.setText("");
                gender_combo.setSelectedIndex(0);
                contct_txt.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
            try{
                String sql="delete from customer where Cus_ID=?";
                pst=con.prepareStatement(sql);
                pst.setString(1,cusid_text.getText());
                pst.execute();
                cusid_text.setText("");
                JOptionPane.showMessageDialog(null,"Customer Record Deleted Successfully");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
            cusid_text.setText("");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        ViewCus_Table3();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Display_Panel.removeAll();
        Display_Panel.add(home);
        Display_Panel.repaint();
        Display_Panel.revalidate();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            cusid.setText("");
            cusname_txt.setText("");
            nic_txt.setText("");
            address_txt.setText("");
            gen_combo.setSelectedIndex(0);
            contact_txt.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void gen_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gen_comboActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void displayMain() {
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
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu().setVisible(true);
            }
        });
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCus_Button;
    private javax.swing.JPanel Button_Panel;
    private javax.swing.JTable CusView_Table;
    private javax.swing.JTable CusView_Table2;
    private javax.swing.JTable CusView_Table3;
    private javax.swing.JPanel Display_Panel;
    private javax.swing.JPanel add_cus;
    private javax.swing.JTextField add_txt;
    private javax.swing.JLabel addcusimage;
    private javax.swing.JLabel address;
    private javax.swing.JTextField address_txt;
    private javax.swing.JLabel contactNo;
    private javax.swing.JTextField contact_txt;
    private javax.swing.JTextField contct_txt;
    private javax.swing.JLabel cusID;
    private javax.swing.JLabel cusNIC;
    private javax.swing.JLabel cusid;
    private javax.swing.JTextField cusid_text;
    private javax.swing.JTextField cusid_txt;
    private javax.swing.JLabel cusname;
    private javax.swing.JTextField cusname_txt;
    private javax.swing.JTextField cusnic_txt;
    private javax.swing.JPanel delete_cus;
    private javax.swing.JComboBox<String> gen_combo;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> gender_combo;
    private javax.swing.JPanel home;
    private javax.swing.JLabel image;
    private javax.swing.JLabel image3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField nic_txt;
    private javax.swing.JPanel update_cus;
    private javax.swing.JPanel view_cus;
    // End of variables declaration//GEN-END:variables
}
