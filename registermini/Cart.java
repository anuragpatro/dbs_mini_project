/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registermini;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author SURYANSH
 */
public class Cart extends javax.swing.JFrame {

    /**
     * Creates new form Cart
     */
    public Cart() {
        initComponents();
        show_user();
       
    }

     public ArrayList<User11> userList(){
        ArrayList<User11> usersList = new ArrayList<>();
    try{  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","anurag","anurag");
        String q = "select prod_id,prod_name,price from product where prod_id in (select prod_id from cart)";
       
        Statement st = con.createStatement();  
        ResultSet rs = st.executeQuery(q);
        User11 user;
        while(rs.next()){
            user = new User11(rs.getInt("prod_id"),rs.getString("prod_name"),rs.getFloat("price"));
            usersList.add(user);
        }
}catch( ClassNotFoundException | SQLException e){ System.out.println(e);}  
        return usersList;
    }
    public void show_user(){
        ArrayList<User11> list = userList();
        DefaultTableModel model = (DefaultTableModel)CartTable.getModel();
        Object[] row = new Object[3];
        for(int i=0;i<list.size();i++){
            row[0] = list.get(i).getprod_id();
            row[1] = list.get(i).getname();
            row[2] = list.get(i).getprice();
            
            model.addRow(row);
        }
    }
                
    public void sum(){
        int calc = 0;
         try{  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","anurag","anurag");
        String sum ="select sum(ptot_price) from cart";
        Statement st = con.createStatement(); 
        ResultSet rs = st.executeQuery(sum);
        while (rs.next()){
            
            
            calc = rs.getInt("sum(ptot_price)");
             String calcs= Integer.toString(calc);
        jTextField1.setText(calcs);
        }
        
         
  }
         catch( ClassNotFoundException | SQLException e){ System.out.println(e);} 
    }
    
    
    public void connect1(){
        
         try{  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","anurag","anurag");
         
        String q1= "INSERT INTO XOrder VALUES(?,?,?)";
        
        PreparedStatement psmt= con.prepareStatement(q1);
        psmt.setString(1,"18 APRIL 2019");
        String summer = jTextField1.getText();
        psmt.setInt(2,Integer.parseInt(summer));
        psmt.setString(3,Integer.toString(500));
        psmt.executeUpdate();
        System.out.println(q1);
        psmt.close();
        }
         
         catch( ClassNotFoundException | SQLException e){ System.out.println(e);}  
    }
    
    
     public void connect2(){
        
         try{  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","anurag","anurag");
         
        String q2= "INSERT INTO XOrder VALUES(?,?,?)";
        
        PreparedStatement psmt= con.prepareStatement(q2);
        psmt.setString(1,"17 APRIL 2019");
        String summer = jTextField1.getText();
        psmt.setFloat(2,Integer.parseInt(summer));
        psmt.setString(3,Integer.toString(502));
        psmt.executeUpdate();
        System.out.println(q2);
        psmt.close();
        }
         
         catch( ClassNotFoundException | SQLException e){ System.out.println(e);}  
    }
     
     
      public void connect3(){
        
         try{  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","anurag","anurag");
         
        String q3= "INSERT INTO XOrder VALUES(?,?,?)";
        
        PreparedStatement psmt= con.prepareStatement(q3);
        psmt.setString(1,"19 APRIL 2019");
        String summer = jTextField1.getText();
        psmt.setInt(2,Integer.parseInt(summer));
        psmt.setString(3,Integer.toString(503));
        psmt.executeUpdate();
        System.out.println(q3);
        psmt.close();
        }
         
         catch( ClassNotFoundException | SQLException e){ System.out.println(e);}  
    }
    
      
       public void connect4(){
        
         try{  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","anurag","anurag");
         
        String q4= "INSERT INTO XOrder VALUES(?,?,?)";
        
        PreparedStatement psmt= con.prepareStatement(q4);
        psmt.setString(1,"17 APRIL 2019");
        String summer = jTextField1.getText();
        psmt.setInt(2,Integer.parseInt(summer));
        psmt.setString(3,Integer.toString(504));
        psmt.executeUpdate();
        System.out.println(q4);
        psmt.close();
        }
         
         catch( ClassNotFoundException | SQLException e){ System.out.println(e);}  
    }
    
    
    
    
    /**   
 *      
 *    
 * 
 * 
 * 
 * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodypanel = new javax.swing.JPanel();
        GoToCat6 = new javax.swing.JButton();
        ProceedButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShipperTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        CartTable = new javax.swing.JTable();
        Shipper2 = new javax.swing.JButton();
        Shipper3 = new javax.swing.JButton();
        Shipper4 = new javax.swing.JButton();
        Shipper1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CART");

        bodypanel.setBackground(new java.awt.Color(44, 62, 80));

        GoToCat6.setText("GO TO CATEGORIES");
        GoToCat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToCat6ActionPerformed(evt);
            }
        });

        ProceedButton.setText("PROCEED FOR PAYMENT");
        ProceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("CHOOSE YOUR SHIPPER");

        ShipperTable.setBackground(new java.awt.Color(204, 255, 204));
        ShipperTable.setForeground(new java.awt.Color(0, 0, 0));
        ShipperTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Id", "500", "502", "503", "504"},
                {"Rating", "4", "4.5", "3", "5"},
                {"Delivery Date", "18 Apr 19", "17 April 19", "19 Apr19", "17 Apr 19"},
                {null, null, null, null, null}
            },
            new String [] {
                "Shippers ----", "Ever_Marine", "Blue-Whale", "Blue_Sea", "Ocean-Blue"
            }
        ));
        jScrollPane1.setViewportView(ShipperTable);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("YOUR CART");

        CartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Price (In Rupees)"
            }
        ));
        jScrollPane2.setViewportView(CartTable);

        Shipper2.setText("Blue-Whale");
        Shipper2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Shipper2ActionPerformed(evt);
            }
        });

        Shipper3.setText("Blue_Sea");
        Shipper3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Shipper3ActionPerformed(evt);
            }
        });

        Shipper4.setText("Ocean-Blue");
        Shipper4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Shipper4ActionPerformed(evt);
            }
        });

        Shipper1.setText("Ever_Marine");
        Shipper1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Shipper1ActionPerformed(evt);
            }
        });

        jButton1.setText("YOU NEED TO PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodypanelLayout = new javax.swing.GroupLayout(bodypanel);
        bodypanel.setLayout(bodypanelLayout);
        bodypanelLayout.setHorizontalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodypanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(GoToCat6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProceedButton)
                .addGap(41, 41, 41))
            .addGroup(bodypanelLayout.createSequentialGroup()
                .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(Shipper1)
                        .addGap(57, 57, 57)
                        .addComponent(Shipper2)
                        .addGap(46, 46, 46)
                        .addComponent(Shipper3)
                        .addGap(42, 42, 42)
                        .addComponent(Shipper4)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodypanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodypanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(322, 322, 322))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodypanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodypanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(287, 287, 287))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodypanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodypanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        bodypanelLayout.setVerticalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodypanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GoToCat6)
                            .addComponent(ProceedButton))
                        .addContainerGap())
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Shipper2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Shipper1)
                            .addComponent(Shipper3)
                            .addComponent(Shipper4))
                        .addContainerGap(85, Short.MAX_VALUE))))
        );

        header.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registermini/Shopify_logo_small.png"))); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(334, 334, 334))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bodypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedButtonActionPerformed
        // TODO add your handling code here:
        Payment pay = new Payment();
        pay.setVisible(true);
        pay.pack();
        pay.setLocationRelativeTo(null);
       //b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        //Timer pause = new Timer(15000, (ActionListener) this);
        //pay.dispose();
    }//GEN-LAST:event_ProceedButtonActionPerformed

    private void GoToCat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToCat6ActionPerformed
        // TODO add your handling code here:
         Shopping shop = new Shopping();
        shop.setVisible(true);
        shop.pack();
        shop.setLocationRelativeTo(null);
        //b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_GoToCat6ActionPerformed

    private void Shipper1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Shipper1ActionPerformed
        // TODO add your handling code here:
        this.connect1();
    }//GEN-LAST:event_Shipper1ActionPerformed

    private void Shipper2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Shipper2ActionPerformed
        // TODO add your handling code here:
        this.connect2();
    }//GEN-LAST:event_Shipper2ActionPerformed

    private void Shipper3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Shipper3ActionPerformed
        // TODO add your handling code here:
        this.connect3();
    }//GEN-LAST:event_Shipper3ActionPerformed

    private void Shipper4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Shipper4ActionPerformed
        // TODO add your handling code here:
        this.connect4();
    }//GEN-LAST:event_Shipper4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.sum();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        this.sum();
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CartTable;
    private javax.swing.JButton GoToCat6;
    private javax.swing.JButton ProceedButton;
    private javax.swing.JButton Shipper1;
    private javax.swing.JButton Shipper2;
    private javax.swing.JButton Shipper3;
    private javax.swing.JButton Shipper4;
    private javax.swing.JTable ShipperTable;
    private javax.swing.JPanel bodypanel;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    
}
