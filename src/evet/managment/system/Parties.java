/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evet.managment.system;

/**
 *
 * @author Dewanganii
 */
public class Parties extends javax.swing.JFrame {

    /**
     * Creates new form Parties
     */
    public Parties() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        label1.setFont(new java.awt.Font("Californian FB", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(153, 0, 0));
        label1.setText("Parties");
        getContentPane().add(label1);
        label1.setBounds(70, 70, 140, 46);

        label2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        label2.setText("Types");
        getContentPane().add(label2);
        label2.setBounds(80, 180, 80, 25);

        label3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        label3.setText("Hall No");
        getContentPane().add(label3);
        label3.setBounds(80, 330, 80, 25);

        label4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        label4.setText("Amount");
        getContentPane().add(label4);
        label4.setBounds(80, 380, 90, 25);

        label5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        label5.setText("Phone Number");
        getContentPane().add(label5);
        label5.setBounds(80, 430, 150, 25);

        label6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        label6.setText("Menu");
        getContentPane().add(label6);
        label6.setBounds(80, 480, 70, 25);

        label7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        label7.setText("Decoration types");
        getContentPane().add(label7);
        label7.setBounds(80, 530, 160, 25);

        label8.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        label8.setText("Description");
        getContentPane().add(label8);
        label8.setBounds(80, 580, 120, 25);

        label9.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        label9.setText("Date");
        getContentPane().add(label9);
        label9.setBounds(80, 230, 47, 25);

        label10.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        label10.setText("Time");
        getContentPane().add(label10);
        label10.setBounds(80, 280, 60, 25);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose....", "Birthday parties", "Welcome parties", "After-partyies", "Surprise parties" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(300, 180, 210, 30);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(300, 230, 210, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 280, 210, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 330, 210, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(300, 380, 210, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(300, 430, 210, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 580, 210, 96);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose....", "Flowers", "Lights", "Candles", " " }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(300, 530, 210, 30);

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("Yes");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(300, 490, 49, 25);

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("No");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(370, 490, 45, 25);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Search");
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 490, 73, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Types ", "Date", "Time", "Hall No", "Amount", "Phone Number", "Menu", "Decoration type", "Hall No"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(540, 180, 820, 90);

        jButton2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton2.setText("Insert");
        getContentPane().add(jButton2);
        jButton2.setBounds(600, 330, 120, 40);

        jButton3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton3.setText("Update");
        getContentPane().add(jButton3);
        jButton3.setBounds(770, 330, 110, 40);

        jButton4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton4.setText("Delete");
        getContentPane().add(jButton4);
        jButton4.setBounds(920, 330, 120, 40);

        jButton5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jButton5.setText("Go to the home page");
        getContentPane().add(jButton5);
        jButton5.setBounds(1080, 330, 190, 40);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, -6, 1470, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Parties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parties().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    // End of variables declaration//GEN-END:variables
}
