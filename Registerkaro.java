
package registermini;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author SURYANSH
 */
public class Registerkaro extends javax.swing.JFrame {

    /**
     * Creates new form Registerkaro
     */
    public Registerkaro() {
    	setTitle("RegisterFrame");
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        regpanel1 = new javax.swing.JPanel();
        reglabel2 = new javax.swing.JLabel();
        reglabel2.setBounds(82, 0, 0, 100);
        regpanel2 = new javax.swing.JPanel();
        reglabel3 = new javax.swing.JLabel();
        reglabel3.setBounds(84, 12, 200, 43);
        reglabel4 = new javax.swing.JLabel();
        reglabel4.setBounds(54, 75, 92, 17);
        regtxtfld1 = new javax.swing.JTextField();
        regtxtfld1.setBounds(185, 73, 161, 19);
        reglabel5 = new javax.swing.JLabel();
        reglabel5.setBounds(54, 112, 106, 17);
        reglabel6 = new javax.swing.JLabel();
        reglabel6.setBounds(54, 149, 89, 17);
        regtxtfld2 = new javax.swing.JTextField();
        regtxtfld2.setBounds(184, 110, 162, 19);
        regtxtfld4 = new javax.swing.JTextField();
        regtxtfld4.setBounds(184, 147, 162, 19);
        reglabel7 = new javax.swing.JLabel();
        reglabel7.setBounds(54, 186, 66, 17);
        regtxtfld5 = new javax.swing.JTextField();
        regtxtfld5.setBounds(184, 184, 162, 19);
        reglabel8 = new javax.swing.JLabel();
        reglabel8.setBounds(54, 223, 85, 17);
        regtxtfld6 = new javax.swing.JTextField();
        regtxtfld6.setBounds(184, 221, 162, 19);
        reglabel9 = new javax.swing.JLabel();
        reglabel9.setBounds(54, 260, 35, 17);
        regtxtfld7 = new javax.swing.JTextField();
        regtxtfld7.setBounds(184, 258, 162, 19);
        reglabel10 = new javax.swing.JLabel();
        reglabel10.setBounds(54, 332, 118, 17);
        regtxtfld8 = new javax.swing.JTextField();
        regtxtfld8.setBounds(184, 295, 162, 19);
        reglabel11 = new javax.swing.JLabel();
        reglabel11.setBounds(49, 373, 123, 17);
        regtxtfld9 = new javax.swing.JTextField();
        regtxtfld9.setBounds(184, 332, 162, 19);
        reglabel12 = new javax.swing.JLabel();
        reglabel12.setBounds(54, 297, 68, 17);
        regbutton1 = new javax.swing.JButton();
        regbutton1.setBounds(141, 413, 99, 25);
        regpasswd = new javax.swing.JPasswordField();
        regpasswd.setBounds(184, 372, 162, 19);
        regbutton2 = new javax.swing.JButton();
        regbutton2.setBounds(271, 413, 116, 25);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 589));
        setPreferredSize(new java.awt.Dimension(400, 5));
        getContentPane().setLayout(null);

        regpanel1.setBackground(new java.awt.Color(248, 148, 6));

        getContentPane().add(regpanel1);
        regpanel1.setBounds(0, 0, 400, 100);
        regpanel1.setLayout(null);
        regpanel1.add(reglabel2);

        regpanel2.setBackground(new java.awt.Color(44, 62, 80));
        regpanel2.setMinimumSize(new java.awt.Dimension(418, 450));

        reglabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        reglabel3.setForeground(new java.awt.Color(240, 240, 240));
        reglabel3.setText("REGISTER");

        reglabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reglabel4.setForeground(new java.awt.Color(240, 240, 240));
        reglabel4.setText("FIRST NAME");

        reglabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reglabel5.setForeground(new java.awt.Color(240, 240, 240));
        reglabel5.setText("MIDDLE NAME");

        reglabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reglabel6.setForeground(new java.awt.Color(240, 240, 240));
        reglabel6.setText("LAST NAME");

        regtxtfld4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        reglabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reglabel7.setForeground(new java.awt.Color(240, 240, 240));
        reglabel7.setText("EMAIL ID");

        reglabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reglabel8.setForeground(new java.awt.Color(240, 240, 240));
        reglabel8.setText("MOBILE NO");

        regtxtfld6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        reglabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reglabel9.setForeground(new java.awt.Color(240, 240, 240));
        reglabel9.setText("CITY");

        regtxtfld7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        reglabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reglabel10.setForeground(new java.awt.Color(240, 240, 240));
        reglabel10.setText("SET USERNAME");

        reglabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reglabel11.setForeground(new java.awt.Color(240, 240, 240));
        reglabel11.setText("SET PASSWORD");

        reglabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reglabel12.setForeground(new java.awt.Color(240, 240, 240));
        reglabel12.setText("PINCODE");

        regbutton1.setText("REGISTER");

        regbutton2.setText("LOGIN NOW");
        regbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        getContentPane().add(regpanel2);
        regpanel2.setBounds(0, 100, 400, 450);
        regpanel2.setLayout(null);
        regpanel2.add(reglabel3);
        regpanel2.add(reglabel11);
        regpanel2.add(reglabel10);
        regpanel2.add(reglabel7);
        regpanel2.add(reglabel4);
        regpanel2.add(reglabel5);
        regpanel2.add(reglabel6);
        regpanel2.add(reglabel8);
        regpanel2.add(reglabel9);
        regpanel2.add(reglabel12);
        regpanel2.add(regpasswd);
        regpanel2.add(regtxtfld9);
        regpanel2.add(regtxtfld5);
        regpanel2.add(regtxtfld4);
        regpanel2.add(regtxtfld6);
        regpanel2.add(regtxtfld7);
        regpanel2.add(regtxtfld8);
        regpanel2.add(regtxtfld1);
        regpanel2.add(regtxtfld2);
        regpanel2.add(regbutton1);
        regpanel2.add(regbutton2);

        pack();
    }// </editor-fold>                        

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        LoginKaro lkf = new LoginKaro();
        lkf.setVisible(true);
        lkf.pack();
        lkf.setLocationRelativeTo(null);
        //lkf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Registerkaro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registerkaro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registerkaro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registerkaro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registerkaro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton regbutton1;
    private javax.swing.JButton regbutton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel reglabel10;
    private javax.swing.JLabel reglabel11;
    private javax.swing.JLabel reglabel12;
    private javax.swing.JLabel reglabel2;
    private javax.swing.JLabel reglabel3;
    private javax.swing.JLabel reglabel4;
    private javax.swing.JLabel reglabel5;
    private javax.swing.JLabel reglabel6;
    private javax.swing.JLabel reglabel7;
    private javax.swing.JLabel reglabel8;
    private javax.swing.JLabel reglabel9;
    private javax.swing.JPanel regpanel1;
    private javax.swing.JPanel regpanel2;
    private javax.swing.JPasswordField regpasswd;
    private javax.swing.JTextField regtxtfld1;
    private javax.swing.JTextField regtxtfld2;
    private javax.swing.JTextField regtxtfld4;
    private javax.swing.JTextField regtxtfld5;
    private javax.swing.JTextField regtxtfld6;
    private javax.swing.JTextField regtxtfld7;
    private javax.swing.JTextField regtxtfld8;
    private javax.swing.JTextField regtxtfld9;
}