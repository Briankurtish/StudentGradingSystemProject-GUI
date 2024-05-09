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
public class GradesMgmt extends javax.swing.JFrame {

    /**
     * Creates new form StudentMGMT
     */
    public GradesMgmt() {
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
        grade_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        crs_id = new javax.swing.JTextField();
        std_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mid_grade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        final_grade = new javax.swing.JTextField();
        newBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gradeTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        hw_grade = new javax.swing.JTextField();
        letter_grade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GRADES MANAGEMENT");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cipher\\Downloads\\17306852241586787822-128(1).png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Grade ID");

        grade_id.setBackground(new java.awt.Color(102, 102, 102));
        grade_id.setForeground(new java.awt.Color(255, 255, 255));
        grade_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_idActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course ID");

        crs_id.setBackground(new java.awt.Color(102, 102, 102));
        crs_id.setForeground(new java.awt.Color(255, 255, 255));
        crs_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crs_idActionPerformed(evt);
            }
        });

        std_id.setBackground(new java.awt.Color(102, 102, 102));
        std_id.setForeground(new java.awt.Color(255, 255, 255));
        std_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_idActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student ID");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mid-Term Grade");

        mid_grade.setBackground(new java.awt.Color(102, 102, 102));
        mid_grade.setForeground(new java.awt.Color(255, 255, 255));
        mid_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mid_gradeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HomeWork Grade");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Letter Grade");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Final Grade");

        final_grade.setBackground(new java.awt.Color(102, 102, 102));
        final_grade.setForeground(new java.awt.Color(255, 255, 255));
        final_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_gradeActionPerformed(evt);
            }
        });

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

        gradeTable.setBackground(new java.awt.Color(102, 102, 102));
        gradeTable.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        gradeTable.setForeground(new java.awt.Color(255, 255, 255));
        gradeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                " Grade ID", "Student ID", "Course ID", "MidTerm Grade", "HomeWork Grade", "Final Grade", "Letter Grade"
            }
        ));
        gradeTable.setDoubleBuffered(true);
        gradeTable.setGridColor(new java.awt.Color(102, 102, 102));
        gradeTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        gradeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gradeTable);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cipher\\Downloads\\18786029401541068758-32.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        hw_grade.setBackground(new java.awt.Color(102, 102, 102));
        hw_grade.setForeground(new java.awt.Color(255, 255, 255));
        hw_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hw_gradeActionPerformed(evt);
            }
        });

        letter_grade.setBackground(new java.awt.Color(102, 102, 102));
        letter_grade.setForeground(new java.awt.Color(255, 255, 255));
        letter_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter_gradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(375, 375, 375)
                .addComponent(jLabel10)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(crs_id, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(grade_id)
                            .addComponent(hw_grade, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mid_grade, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(std_id))
                            .addComponent(final_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(letter_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(grade_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(crs_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(std_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(letter_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(mid_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(hw_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(final_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newBtn)
                            .addComponent(saveBtn)
                            .addComponent(deleteBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
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

    private void grade_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_idActionPerformed

    private void crs_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crs_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crs_idActionPerformed

    private void std_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_std_idActionPerformed

    private void mid_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mid_gradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mid_gradeActionPerformed

    private void final_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_final_gradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_final_gradeActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        
        if(
           !grade_id.getText().trim().isEmpty()) {
            int grade_id         = Integer.parseInt(this.grade_id.getText().trim());
            
           List grades =StudentGradingSystemProject.grades; 
           Grades grd;
           Boolean found=false;
           Iterator <Grades> itr = grades.iterator();
           while (itr.hasNext()) {
              grd = itr.next(); 
              if(grade_id==grd.getGrd_id()) {
                found=true;
                break;
              }
            }
           if (found) {  
             StudentGradingSystemProject.delete_grade(grade_id);
             JOptionPane.showMessageDialog(null, "Selected Grade Record Successfully DELETED!");
           } 
    } else                                      
       {
            JOptionPane.showMessageDialog(null, "You have to fill Grade id field before deleting the record!");
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

    private void hw_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hw_gradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hw_gradeActionPerformed

    private void letter_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter_gradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letter_gradeActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        // TODO add your handling code here:
        grade_id.setText(null);
        crs_id.setText(null);
        std_id.setText(null);
        hw_grade.setText(null);
        mid_grade.setText(null);
        final_grade.setText(null);
        letter_grade.setText(null);
        
        grade_id.requestFocus();
        
    }//GEN-LAST:event_newBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        
        if(
           !grade_id.getText().trim().isEmpty()&&
           !std_id.getText().trim().isEmpty()&&
           !crs_id.getText().trim().isEmpty()&&
           !mid_grade.getText().trim().isEmpty() && 
           !hw_grade.getText().trim().isEmpty()&&
           !final_grade.getText().trim().isEmpty()&&
           !letter_grade.getText().trim().isEmpty()) {
            int grade_id         = Integer.parseInt(this.grade_id.getText().trim());
            int std_id      = Integer.parseInt(this.std_id.getText().trim());
            int crs_id      = Integer.parseInt(this.crs_id.getText().trim());
            float hw_grade    = Float.parseFloat(this.hw_grade.getText().trim());
            float mid_grade = Float.parseFloat(this.mid_grade.getText().trim());
            float final_grade = Float.parseFloat(this.final_grade.getText().trim());
            String letter_grade = this.letter_grade.getText().trim();
            
            
           List grades =StudentGradingSystemProject.grades; 
           Grades grd;
           Boolean found=false;
           Iterator <Grades> itr = grades.iterator();
           while (itr.hasNext()) {
              grd = itr.next(); 
              if(grade_id==grd.getGrd_id()) {
                found=true;
                break;
              }
            }
           if (!found) {  
             // New Student Record  
             StudentGradingSystemProject.add_grade(grade_id, std_id, crs_id, mid_grade, hw_grade, final_grade, letter_grade);
             JOptionPane.showMessageDialog(null, "NEW Grade Record Successfully ADDED!");
           } else {
             // found is true! So existing student recort will be updated!!!  
             StudentGradingSystemProject.edit_grade(grade_id, std_id, crs_id, mid_grade, hw_grade, final_grade, letter_grade);
             JOptionPane.showMessageDialog(null, "Grade Record Successfully EDITED!");

           }
    }                                        
        else {
            JOptionPane.showMessageDialog(null, "You have to fill all fields before saving!");
        }
        refresh_JTable();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void gradeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeTableMouseClicked
        // TODO add your handling code here:
        int sel_row= gradeTable.getSelectedRow();
        List grades =StudentGradingSystemProject.grades;
        Grades grd;
        grd = (Grades) grades.get(sel_row);
        grade_id.setText(""+grd.getGrd_id());
        crs_id.setText(""+grd.getCrs_id());
        std_id.setText(""+grd.getStd_id());
        hw_grade.setText(""+grd.getGrd_hw());
        mid_grade.setText(""+grd.getGrd_mt());
        final_grade.setText(""+grd.getGrd_final());
        letter_grade.setText(grd.getGrd_Igrade());
    }//GEN-LAST:event_gradeTableMouseClicked
    
    public void refresh_JTable() {
        
           List grades = StudentGradingSystemProject.grades;
           DefaultTableModel model = (DefaultTableModel) gradeTable.getModel();
           Object rowData[] = new Object[7]; 
           Iterator itr = grades.iterator();
           Grades grd;          
           model.setNumRows(0); //Remove all existing rows of JTable
           //Add every element of the List Array as a new row into JTable
           while (itr.hasNext()) {
              grd = (Grades) itr.next();
              rowData[0] = grd.getGrd_id();
              rowData[1] = grd.getStd_id();
              rowData[2] = grd.getCrs_id();
              rowData[3] = grd.getGrd_mt();
              rowData[4] = grd.getGrd_hw();
              rowData[5] = grd.getGrd_final();
              rowData[6] = grd.getGrd_Igrade();
              
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
            java.util.logging.Logger.getLogger(GradesMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradesMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradesMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradesMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradesMgmt().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField crs_id;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField final_grade;
    private javax.swing.JTable gradeTable;
    private javax.swing.JTextField grade_id;
    private javax.swing.JTextField hw_grade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField letter_grade;
    private javax.swing.JTextField mid_grade;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField std_id;
    // End of variables declaration//GEN-END:variables
}
