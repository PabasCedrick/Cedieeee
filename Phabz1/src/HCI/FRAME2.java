/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HCI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Reymond L. Pabas
 */
public class FRAME2 extends javax.swing.JFrame {

    /**
     * Creates new form FRAME2
     */
    public FRAME2() {
        initComponents();
    }
public void ItemCost(){
       double sum = 0;
       for (int i = 0; i < jTable1.getRowCount();i++){
           sum = sum + Double.parseDouble(jTable1.getValueAt(i,2).toString());
            }
       jstotal.setText(Double.toString(sum));
       double ctotal = Double.parseDouble(jstotal.getText());
       
       double cTax =(ctotal *0.)/100;
       String iTaxtotal = String.format("Php %.2f",cTax);
       jtax.setText(iTaxtotal);
       
       String iSubtotal = String.format("Php %.2f",ctotal);
       jstotal.setText(iSubtotal);
       
       String iTotal = String.format("Php %.2f",ctotal + cTax);
       jtotal.setText(iTotal);
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnReset = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jstotal = new javax.swing.JTextField();
        jtax = new javax.swing.JTextField();
        jtotal = new javax.swing.JTextField();
        BUY = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COFFEE MENU");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton1.setText("BUY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 100, 40));

        jButton2.setBackground(new java.awt.Color(0, 204, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton2.setText("BUY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 100, 40));

        jLabel7.setBackground(new java.awt.Color(90, 90, 90));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HCI/Clipboard (2).jpg"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(90, 90));
        jLabel7.setMinimumSize(new java.awt.Dimension(90, 90));
        jLabel7.setPreferredSize(new java.awt.Dimension(90, 90));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 130, 160));

        jButton3.setBackground(new java.awt.Color(0, 204, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton3.setText("BUY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 100, 40));

        jButton4.setBackground(new java.awt.Color(0, 153, 102));
        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 12)); // NOI18N
        jButton4.setText("LOG OUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 80, 40));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(0, 204, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "QUANTITY", "AMOUNT"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setDragEnabled(true);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 300, 310));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("SUB TOTAL:");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 110, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("TAX:");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 110, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("TOTAL:");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 110, 40));

        jbtnReset.setBackground(new java.awt.Color(0, 204, 102));
        jbtnReset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnReset.setText("RESET");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, 110, 40));

        jButton6.setBackground(new java.awt.Color(0, 204, 102));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setText("REMOVE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 120, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HCI/c1.jpg"))); // NOI18N
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 320));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HCI/c2.jpg"))); // NOI18N
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 140, 320));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HCI/c3.jpg"))); // NOI18N
        jButton8.setBorder(new javax.swing.border.MatteBorder(null));
        jButton8.setMargin(new java.awt.Insets(2, 25, 2, 25));
        jButton8.setPreferredSize(new java.awt.Dimension(105, 301));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 170, 320));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel5.setText("CLICK THE PHOTO OF THE COFFEE TO SEE DESCRIPTION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 430, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HCI/M1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jstotal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jstotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jstotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstotalActionPerformed(evt);
            }
        });
        jPanel1.add(jstotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 180, 40));

        jtax.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jtax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtaxActionPerformed(evt);
            }
        });
        jPanel1.add(jtax, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 180, 40));

        jtotal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtotalActionPerformed(evt);
            }
        });
        jPanel1.add(jtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 180, 40));

        BUY.setBackground(new java.awt.Color(0, 153, 102));
        BUY.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        BUY.setText("BUY");
        BUY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUYActionPerformed(evt);
            }
        });
        jPanel1.add(BUY, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 605, 260, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("walang iba ako lang talaga. "); // NOI18N
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 220, 30));
        jLabel6.getAccessibleContext().setAccessibleName("Gusto ko sa kape, yung walang labis \nwalang iba ako lang talaga. ");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Gusto ko sa kape, yung walang labis "); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 40;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object []{"Black White Coffee", "1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 60;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object []{"Coffee Cocoa", "1",PriceOfItem});
        ItemCost();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(this,"are you sure?","LOGOUT",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(res==JOptionPane.YES_OPTION) {
            Main main = new Main();
            main.show();
            this.dispose();
        } else {
            // Nothing
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
   double PriceOfItem = 65;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object []{"Cappuccino", "1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jtaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtaxActionPerformed

    private void jtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtotalActionPerformed

    private void jstotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstotalActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
       jstotal.setText("" );
       jtax.setText("");
       jtotal.setText("");

    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        int RemoveItem = jTable1.getSelectedRow();
        if(RemoveItem >=0){
            JOptionPane.showMessageDialog(this,"YOU REMOVE THIS ITEM","REMOVE",JOptionPane.PLAIN_MESSAGE);
            model.removeRow(RemoveItem); 
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void BUYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUYActionPerformed
        // TODO add your handling code here:
            JOptionPane.showMessageDialog(null,"YOUR PURCHASE HAS BEEN SUCCESSFUL","PURCHASED",JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

             jstotal.setText("" );
             jtax.setText("");
             jtotal.setText("");
              
    }//GEN-LAST:event_BUYActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"KAPENG MATAPANG KAYA KANG IPAGLABAN.","DESCRIPTION",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"KAPENG MATAMIS, BIGLA KA NIYANG MAMIMISS.","DESCRIPTION",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
            JOptionPane.showMessageDialog(null,"KAPENG SAKTO, WALANG IBA IKAW LANG ANG GUSTO.","DESCRIPTION",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(FRAME2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRAME2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRAME2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRAME2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRAME2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUY;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JTextField jstotal;
    private javax.swing.JTextField jtax;
    private javax.swing.JTextField jtotal;
    // End of variables declaration//GEN-END:variables
}
