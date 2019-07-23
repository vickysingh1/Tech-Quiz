/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import techquizpojo.pojo.userProfile;

/**
 *
 * @author Lenovo
 */
public class ViewScore extends javax.swing.JFrame {

    /**
     * Creates new form ViewScore
     */
    public ViewScore() {
        initComponents();
        super.setLocationRelativeTo(null);
        useName.setText("Hello "+userProfile.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrbScoreSingle = new javax.swing.JRadioButton();
        jrbScoreAll = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        useName = new javax.swing.JLabel();
        logoutclick = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("view Score panel");

        buttonGroup1.add(jrbScoreSingle);
        jrbScoreSingle.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jrbScoreSingle.setForeground(new java.awt.Color(255, 255, 255));
        jrbScoreSingle.setText("view score of Single Student");
        jrbScoreSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbScoreSingleActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbScoreAll);
        jrbScoreAll.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jrbScoreAll.setForeground(new java.awt.Color(255, 255, 255));
        jrbScoreAll.setText("view Score of All Student");

        btnDoTask.setBackground(new java.awt.Color(51, 0, 51));
        btnDoTask.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        logoutclick.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        logoutclick.setText("Logout");
        logoutclick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutclickMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutclickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutclickMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\TECH-QUIZ-APP\\TECH QUIZ APP\\onlineexam\\stud1.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutclick, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(useName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDoTask)
                        .addGap(158, 158, 158)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbScoreAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbScoreSingle))))
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutclick)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jrbScoreSingle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jrbScoreAll, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(useName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        // TODO add your handling code here:
        if(validateInput()==false)
        {
            JOptionPane.showMessageDialog(null,"plz choose any Option");
        }
        if(jrbScoreSingle.isSelected())
        {
            try
            {
            ViewSingleScoreFrame singleframe=new ViewSingleScoreFrame();
            singleframe.setVisible(true);
            this.dispose();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        if(jrbScoreAll.isSelected())
        {
            ViewAllStudentsScoreFrame view=new ViewAllStudentsScoreFrame();
            view.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        AdminOptionsFrame adminframe=new AdminOptionsFrame();
        adminframe.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void logoutclickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutclickMouseEntered
        // TODO add your handling code here:
        logoutclick.setForeground(Color.red);
       Font f=new Font("Arial Black",Font.BOLD,18);
       logoutclick.setFont(f);
    }//GEN-LAST:event_logoutclickMouseEntered

    private void logoutclickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutclickMouseExited
        // TODO add your handling code here:
        logoutclick.setForeground(Color.green);
       Font f=new Font("Arial Black",Font.BOLD,18);
       logoutclick.setFont(f);
    }//GEN-LAST:event_logoutclickMouseExited

    private void logoutclickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutclickMouseClicked
        // TODO add your handling code here:
        Loginframe loginFrame=new Loginframe();
        loginFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutclickMouseClicked

    private void jrbScoreSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbScoreSingleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jrbScoreSingleActionPerformed

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
            java.util.logging.Logger.getLogger(ViewScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewScore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbScoreAll;
    private javax.swing.JRadioButton jrbScoreSingle;
    private javax.swing.JLabel logoutclick;
    private javax.swing.JLabel useName;
    // End of variables declaration//GEN-END:variables

private boolean validateInput()
{
    if(jrbScoreSingle.isSelected()==false && jrbScoreAll.isSelected()==false)
        return false;
    else
        return true;
}
}