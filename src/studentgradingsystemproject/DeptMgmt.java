/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentgradingsystemproject;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cipher
 */
public class DeptMgmt extends javax.swing.JFrame {

    /**
     * Creates new form StudentMGMT
     */
    public DeptMgmt() {
        initComponents();
        refresh_JTable();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dept_id = new javax.swing.JTextField();
        dept_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        newBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dept_table = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DEPARTMENT MANAGEMENT");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cipher\\Downloads\\17306852241586787822-128(1).png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Department ID");

        dept_id.setBackground(new java.awt.Color(102, 102, 102));
        dept_id.setForeground(new java.awt.Color(255, 255, 255));
        dept_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dept_idActionPerformed(evt);
            }
        });

        dept_name.setBackground(new java.awt.Color(102, 102, 102));
        dept_name.setForeground(new java.awt.Color(255, 255, 255));
        dept_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dept_nameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Department Name");

        newBtn.setBackground(new java.awt.Color(102, 102, 102));
        newBtn.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        newBtn.setForeground(new java.awt.Color(255, 255, 255));
        newBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cipher\\Downloads\\3443228331679654522-24.png")); // NOI18N
        newBtn.setText("New");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(102, 102, 102));
        saveBtn.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cipher\\Downloads\\191919650316276581303769-24.png")); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(102, 102, 102));
        deleteBtn.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cipher\\Downloads\\14974663671582988848-24.png")); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        dept_table.setBackground(new java.awt.Color(102, 102, 102));
        dept_table.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        dept_table.setForeground(new java.awt.Color(255, 255, 255));
        dept_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Department ID", "Department Name"
            }
        ));
        dept_table.setDoubleBuffered(true);
        dept_table.setGridColor(new java.awt.Color(102, 102, 102));
        dept_table.setSelectionBackground(new java.awt.Color(153, 153, 153));
        dept_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dept_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dept_table);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cipher\\Downloads\\18786029401541068758-32.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(337, 337, 337)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(dept_id, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(dept_name, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dept_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(dept_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newBtn)
                    .addComponent(saveBtn)
                    .addComponent(deleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dept_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dept_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dept_idActionPerformed

    private void dept_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dept_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dept_nameActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        if(
           !dept_id.getText().trim().isEmpty()) {
            int dept_id         = Integer.parseInt(this.dept_id.getText().trim());
            
           List departments =StudentGradingSystemProject.departments; 
           Department dept;
           Boolean found=false;
           Iterator <Department> itr = departments.iterator();
           while (itr.hasNext()) {
              dept = itr.next(); 
              if(dept_id==dept.getDept_id()) {
                found=true;
                break;
              }
            }
           if (found) {  
             StudentGradingSystemProject.delete_department(dept_id);
             JOptionPane.showMessageDialog(null, "Selected Department Record Successfully DELETED!");
           } 
    } else                                      
       {
            JOptionPane.showMessageDialog(null, "You have to fill Department id field before deleting the record!");
        }
        refresh_JTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        // TODO add your handling code here:
        dept_id.setText(null);
        dept_name.setText(null);
    }//GEN-LAST:event_newBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        
        if(
           !dept_id.getText().trim().isEmpty()&&
           !dept_name.getText().trim().isEmpty()) {
            int dept_id         = Integer.parseInt(this.dept_id.getText().trim());
            String dept_name    = this.dept_name.getText().trim();
            
            
            
           List departments =StudentGradingSystemProject.departments; 
           Department dept;
           Boolean found=false;
           Iterator <Department> itr = departments.iterator();
           while (itr.hasNext()) {
              dept = itr.next(); 
              if(dept_id==dept.getDept_id()) {
                found=true;
                break;
              }
            }
           if (!found) {  
             // New Student Record  
             StudentGradingSystemProject.add_department(dept_id, dept_name);
             JOptionPane.showMessageDialog(null, "NEW Department Record Successfully ADDED!");
           } else {
             // found is true! So existing student recort will be updated!!!  
             StudentGradingSystemProject.edit_department(dept_id, dept_name);
             JOptionPane.showMessageDialog(null, "Department Record Successfully EDITED!");

           }
    }                                        
        else {
            JOptionPane.showMessageDialog(null, "You have to fill all fields before saving!");
        }
        refresh_JTable();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void dept_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dept_tableMouseClicked
        // TODO add your handling code here:
        int sel_row= dept_table.getSelectedRow();
        List departments =StudentGradingSystemProject.departments;
        Department dept;
        dept = (Department) departments.get(sel_row);
        dept_id.setText(""+dept.getDept_id());
        dept_name.setText(dept.getDept_name());
    }//GEN-LAST:event_dept_tableMouseClicked
    
    public void refresh_JTable() {
        
           List departments = StudentGradingSystemProject.departments;
           DefaultTableModel model = (DefaultTableModel) dept_table.getModel();
           Object rowData[] = new Object[2]; 
           Iterator itr = departments.iterator();
           Department dept;          
           model.setNumRows(0); //Remove all existing rows of JTable
           //Add every element of the List Array as a new row into JTable
           while (itr.hasNext()) {
              dept = (Department) itr.next();
              rowData[0] = dept.getDept_id();
              rowData[1] = dept.getDept_name();
              
              
              model.addRow(rowData);
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
            java.util.logging.Logger.getLogger(DeptMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeptMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeptMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeptMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeptMgmt().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField dept_id;
    private javax.swing.JTextField dept_name;
    private javax.swing.JTable dept_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
