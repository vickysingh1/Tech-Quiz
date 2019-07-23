/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techquizapp.dao.examDao;
import techquizpojo.pojo.Exampojo;
import techquizpojo.pojo.userProfile;

/**
 *
 * @author Lenovo
 */
public class PaperSelectionFrame extends javax.swing.JFrame {

    /**
     * Creates new form PaperSelectionFrame
     */
    private String subjectName;
    public PaperSelectionFrame() {
        initComponents();
        setLocationRelativeTo(null);
        usename.setText("Hello "+userProfile.getUsername());
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
        jLabel1 = new javax.swing.JLabel();
        logoutclick = new javax.swing.JLabel();
        usename = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcsubject = new javax.swing.JComboBox<>();
        jcexamid = new javax.swing.JComboBox<>();
        btntaketest = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Paper Selection Panel");

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

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fill Paper Detail:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose the Subject");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Choose ExamID");

        jcsubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "java", "c", "c++", "python" }));
        jcsubject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcsubjectItemStateChanged(evt);
            }
        });
        jcsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcsubjectActionPerformed(evt);
            }
        });

        btntaketest.setText("Take this Test");
        btntaketest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntaketestActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\TECH-QUIZ-APP\\TECH QUIZ APP\\onlineexam\\examicon.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutclick)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcsubject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcexamid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usename, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btntaketest, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutclick)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcexamid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btntaketest, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(usename, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutclickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutclickMouseClicked
        // TODO add your handling code here:
        Loginframe obj=new Loginframe();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutclickMouseClicked

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

    private void jcsubjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcsubjectItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.DESELECTED)
        {
            return;
        }
        boolean result=validateInput();
        if(result==false)
        {
            JOptionPane.showMessageDialog(null, "plz select subject!");
            return;
        }
        jcexamid.removeAllItems();
        try
        {
            if(examDao.isPaperSet(subjectName)==false)
            {
                JOptionPane.showMessageDialog(null, "sorry no exam set for this subject!");
                  return;          
            }
            ArrayList<String>examlist=examDao.getExamidbySubject(userProfile.getUsername(),subjectName);
            if(examlist.isEmpty()){
                JOptionPane.showMessageDialog(null, "you have given all exams for"+subjectName,"subject not found!",JOptionPane.ERROR_MESSAGE);
               return;
            }
            for(String examid:examlist)
            {
                jcexamid.addItem(examid);
            }
        }
        catch(Exception exz)
        {
            exz.printStackTrace();
            JOptionPane.showMessageDialog(null, "Exception is"+exz);
        }
                    
    }//GEN-LAST:event_jcsubjectItemStateChanged

    private void btntaketestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntaketestActionPerformed
        // TODO add your handling code here:
        int count=jcsubject.getSelectedIndex();
        if(count==0)
        {
            JOptionPane.showMessageDialog(null, "plz choose thr subject","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        count=jcexamid.getItemCount();
        if(count==0)
        {
            JOptionPane.showMessageDialog(null, "plz select an exam!","Error!",JOptionPane.ERROR_MESSAGE); 
            return;
        }
        String subject=jcsubject.getSelectedItem().toString();
        String examid=jcexamid.getSelectedItem().toString();
        int ans = 0;
        JOptionPane.showMessageDialog(null,"you have choose"+subject+"\" and\""+examid+"paper!\nls this ok?","Confirmation!",JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            try
            {
                int totalquestion=examDao.getQuestionCountByExam(examid.trim());
                Exampojo exam=new Exampojo(examid,subject,totalquestion);
                TakeTestFrame obj=new TakeTestFrame(exam);
                obj.setVisible(true);
                this.dispose();
                
                
            }
            catch(Exception exz)
            {
                exz.printStackTrace();
                JOptionPane.showMessageDialog(null,"Eception exz:"+exz);
            }
                        
        }
    }//GEN-LAST:event_btntaketestActionPerformed

    private void jcsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcsubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcsubjectActionPerformed

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
            java.util.logging.Logger.getLogger(PaperSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaperSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaperSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaperSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaperSelectionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntaketest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcexamid;
    private javax.swing.JComboBox<String> jcsubject;
    private javax.swing.JLabel logoutclick;
    private javax.swing.JLabel usename;
    // End of variables declaration//GEN-END:variables

public boolean validateInput()
{
    int selectedindex=jcsubject.getSelectedIndex();
    if(selectedindex==0)
    {
        return false;
    }
    subjectName=jcsubject.getSelectedItem().toString();
    return true;
}















}