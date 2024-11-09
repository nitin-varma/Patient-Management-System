/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import CLASS.Login;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author vaish
 */
public class PatientFeedback extends javax.swing.JPanel {

    /**
     * Creates new form PatientFeedback
     */
            private JPanel maincard;
    private Login l;
    
    public PatientFeedback(JPanel maicard, Login l) {
        initComponents();
        
        this.maincard=maincard;
        this.l=l;
    }

    String driver= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url= "jdbc:sqlserver://localhost:1433;databaseName=PATIENTMANAGEMENT;encrypt=true;trustServerCertificate=true;";
    String user="sa";
    String password="sa";
    
     Statement st;
    ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtdescription = new javax.swing.JTextField();
        txtfeedbacktime = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtphysician = new javax.swing.JTextField();
        txtformid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        txtrating = new javax.swing.JTextField();
        txtrecommendation = new javax.swing.JTextField();
        txtconatct = new javax.swing.JTextField();
        txttreatment = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jfeedbackdate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("PATIENT FEEDBACK FORM");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 12, 343, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("TREATMENT NAME");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 471, -1, 40));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("FORM ID");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 120, 40));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("FEEDBACK DATE");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 124, 139, 40));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("FEEDBACK TIME");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 170, -1, 40));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("DESCRIPTION");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 216, 149, 40));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("RATING");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 262, 96, 40));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("CONTACT NO");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 362, 110, 40));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("PATIENT ID");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 130, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("RECOMMENDATION");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 320, -1, -1));

        txtdescription.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        txtdescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescriptionActionPerformed(evt);
            }
        });
        add(txtdescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 221, 205, 30));

        txtfeedbacktime.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtfeedbacktime, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 175, 205, 30));

        txtid.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 24, 205, 30));

        txtphysician.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtphysician, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 418, 205, 30));

        txtformid.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtformid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 71, 205, 30));

        jTable1.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FORM ID", "DATE", "TIME", "DESCRIPTION", "RATING", "RECOMMENDATION", "CONTACT", "PHYSICIAN", "TREATMENT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 63, 870, 607));

        btninsert.setBackground(new java.awt.Color(153, 0, 255));
        btninsert.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btninsert.setForeground(new java.awt.Color(255, 255, 255));
        btninsert.setText("INSERT");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        add(btninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 137, 34));

        btnupdate.setBackground(new java.awt.Color(153, 0, 255));
        btnupdate.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 140, 34));

        btndelete.setBackground(new java.awt.Color(153, 0, 255));
        btndelete.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 137, 33));

        btnclear.setBackground(new java.awt.Color(153, 0, 255));
        btnclear.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("VIEW");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 140, 33));

        txtrating.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtrating, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 267, 205, 30));

        txtrecommendation.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtrecommendation, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 314, 205, 30));

        txtconatct.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtconatct, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 367, 205, 30));

        txttreatment.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txttreatment, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 476, 205, 30));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("PHYSICIAN NAME");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 413, 137, 40));
        add(jfeedbackdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 124, 200, 31));
    }// </editor-fold>//GEN-END:initComponents

    private void txtdescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescriptionActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,user,password);

            if(txtid.getText().isEmpty() || txtformid.getText().isEmpty() ||jfeedbackdate==null||txtfeedbacktime.getText().isEmpty() ||txtdescription.getText().isEmpty()||txtrating.getText().isEmpty() || txtrecommendation.getText().isEmpty()||txtconatct.getText().isEmpty() || txtphysician.getText().isEmpty()||txttreatment.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Empty fields encountered");
                return;
            }
            String formattedDate2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jfeedbackdate.getDate());

            String sql = "INSERT INTO PatientFeedback (PatientID, FeedbackFormID, FeedbackDate, FeedbackTime, Description, Rating,Recommendation,ContactNumber,PhysicianName,TreatmentName) VALUES " +
            "('" + txtid.getText() + "','" + txtformid.getText() + "','" + formattedDate2 + "','" +
            txtfeedbacktime.getText() + "','" + txtdescription.getText() + "','" + txtrating.getText() + "','" + txtrecommendation.getText() + "','" +
            txtconatct.getText() + "','" + txtphysician.getText() + "','" + txttreatment.getText() + "')";

            st=conn.createStatement();
            st.execute(sql);

            JOptionPane.showMessageDialog(this, "Inserted Successfully");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,user,password);

            int selectedRowIndex = jTable1.getSelectedRow();

            if (selectedRowIndex == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to update");
                return;
            }

            if(txtid.getText().isEmpty() || txtformid.getText().isEmpty() ||jfeedbackdate==null||txtfeedbacktime.getText().isEmpty() ||txtdescription.getText().isEmpty()||txtrating.getText().isEmpty() || txtrecommendation.getText().isEmpty()||txtconatct.getText().isEmpty() || txtphysician.getText().isEmpty()||txttreatment.getText().isEmpty())
            {    JOptionPane.showMessageDialog(this, "Empty fields encountered");
                return;
            }

            Object selectedValue = jTable1.getValueAt(selectedRowIndex, 0);
            String formattedDate2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jfeedbackdate.getDate());

            String sql = "UPDATE PatientFeedback SET " +
            "PatientID = '" + txtid.getText() + "', " +
            "FeedbackFormID = '" + txtformid.getText() + "', " +
            "FeedbackDate = '" + formattedDate2 + "', " +
            "FeedbackTime = '" + txtfeedbacktime.getText() + "', " +
            "Description = '" + txtdescription.getText() + "', " +
            "Rating = '" + txtrating.getText() + "', " +
            "Recommendation = '" + txtrecommendation.getText() + "', " +
            "ContactNumber = '" + txtconatct.getText() + "', " +
            "PhysicianName = '" + txtphysician.getText() + "' " +
            "TreatmentName = '" + txttreatment.getText() + "' " +
            "WHERE PatientID = " + selectedValue;

            st=conn.createStatement();

            int rowsUpdated = st.executeUpdate(sql);

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Update failed");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,user,password);

            int selectedRowIndex = jTable1.getSelectedRow();

            if (selectedRowIndex == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to delete");
                return;
            }

            Object selectedValue = jTable1.getValueAt(selectedRowIndex, 0);

            String sql = "DELETE FROM PatientFeedback WHERE PatientID = '" + selectedValue + "'";

            st = conn.createStatement();

            int rowsDeleted = st.executeUpdate(sql);

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Deleted Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Delete failed");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,user,password);

            String sql = "select * from PatientFeedback";

            st=conn.createStatement();
            rs=st.executeQuery(sql);

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnclearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jfeedbackdate;
    private javax.swing.JTextField txtconatct;
    private javax.swing.JTextField txtdescription;
    private javax.swing.JTextField txtfeedbacktime;
    private javax.swing.JTextField txtformid;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtphysician;
    private javax.swing.JTextField txtrating;
    private javax.swing.JTextField txtrecommendation;
    private javax.swing.JTextField txttreatment;
    // End of variables declaration//GEN-END:variables
}
