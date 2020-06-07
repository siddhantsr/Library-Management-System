
import java.sql.Connection;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;



public class AddMember extends javax.swing.JInternalFrame {

    
    
     Connection conn=null;
     PreparedStatement pst=null;
     ResultSet rs=null;
     
    
    public AddMember() {
        initComponents();
        conn=DBConnect.connect();
        autoid();
        tablelord();
        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtmid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtnic = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtmobile = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        cmbmtype = new javax.swing.JComboBox<>();
        cmbgender = new javax.swing.JComboBox<>();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mdate = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldetail = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(990, 530));
        setVisible(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jLabel15.setText("New Members");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 14, 300, 40));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("Member Id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 70, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setText("NIC");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel11.setText("Email");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel12.setText("Mobile");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel13.setText("Member Type");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));
        jPanel1.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 140, -1));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 140, -1));
        jPanel1.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, -1));
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 140, -1));

        txtmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobileActionPerformed(evt);
            }
        });
        jPanel1.add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 140, -1));

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 140, 60));

        cmbmtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Type>", "Student", "Others" }));
        cmbmtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmtypeActionPerformed(evt);
            }
        });
        jPanel1.add(cmbmtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 140, -1));

        cmbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Gender>", "Male", "Female", "Others" }));
        cmbgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbgenderActionPerformed(evt);
            }
        });
        jPanel1.add(cmbgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 140, -1));

        btnadd.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 190, 30));

        btnupdate.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 190, 30));

        btndelete.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 190, 30));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 310, 200));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setText("Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        jPanel1.add(mdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 140, -1));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 940, 220));

        tbldetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbldetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldetailMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbldetail);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 310, 940, 190));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 960, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 520));

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
    }// </editor-fold>//GEN-END:initComponents

    private void cmbgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbgenderActionPerformed

    private void cmbmtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmtypeActionPerformed

    private void txtmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobileActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        String mid=txtmid.getText();
        String name=txtname.getText();
        String nic=txtnic.getText();
        String date=((JTextField) mdate.getDateEditor().getUiComponent()).getText();
        String gender=cmbgender.getSelectedItem().toString();
        String address=txtaddress.getText();
        String email=txtemail.getText();
        String mobile=txtmobile.getText();
        String mtype=cmbmtype.getSelectedItem().toString();
        
        
                try{
                    
                    String sql="INSERT INTO `addmember`(`mid`, `name`, `nic`,`date` ,`gender`, `address`, `email`, `mobile`, `mtype`) VALUES ('"+mid+"','"+name+"','"+nic+"','"+date+"','"+gender+"','"+address+"','"+email+"','"+mobile+"','"+mtype+"')";
                    PreparedStatement pst=(PreparedStatement) conn.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(rootPane, "Successfully insert");
                
                
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                    
                   
                
                
                }
               autoid();
        clearField();
        tablelord();
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void tbldetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldetailMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel tmodel=(DefaultTableModel)tbldetail.getModel();
        int selectrowindex=tbldetail.getSelectedRow();
        
        txtmid.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        txtname.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        txtnic.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        ((JTextField)mdate.getDateEditor().getUiComponent()).setText(tmodel.getValueAt(selectrowindex, 3).toString());
        cmbgender.setSelectedItem(tmodel.getValueAt(selectrowindex, 4).toString());
        txtaddress.setText(tmodel.getValueAt(selectrowindex, 5).toString());
        txtemail.setText(tmodel.getValueAt(selectrowindex, 6).toString());
        txtmobile.setText(tmodel.getValueAt(selectrowindex, 7).toString());
        cmbmtype.setSelectedItem(tmodel.getValueAt(selectrowindex, 8).toString());
        
        
        
    }//GEN-LAST:event_tbldetailMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        
        
         String mid=txtmid.getText();
         String name=txtname.getText();
         String nic=txtnic.getText();
         String date=((JTextField) mdate.getDateEditor().getUiComponent()).getText();
         String gender=cmbgender.getSelectedItem().toString();
         String address=txtaddress.getText();
         String email=txtemail.getText();
         String mobile=txtmobile.getText();
         String mtype=cmbmtype.getSelectedItem().toString();
        
        try{
            
            String sql="UPDATE `addmember` SET   `name`='"+name+"',`nic`='"+nic+"',`date`='"+date+"',`gender`='"+gender+"',`address`='"+address+"',`email`='"+email+"',`mobile`='"+mobile+"',`mtype`='"+mtype+"' WHERE `mid`='"+mid+"' ";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
                JOptionPane.showMessageDialog(rootPane, "Update Successfully");
                tablelord();
                clearField();
                autoid();
        
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        
        
        }
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        
        try{
            
            String sql="DELETE FROM `addmember` WHERE mid='"+txtmid.getText()+"'";
            pst=(PreparedStatement)conn.prepareStatement(sql);
            pst.execute();
            
           JOptionPane.showMessageDialog(rootPane, "Delete Successfully");
           tablelord();
           clearField();
        
        
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(rootPane, e);
            
        
        
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed


      private void autoid()
    {
        
        try{
            
            String sql="SELECT `mid` FROM `addmember` ORDER BY mid DESC LIMIT 1";
            
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                
                String rnno=rs.getString("mid");
                int co=rnno.length();
                String txt=rnno.substring(0, 2);
                String num= rnno.substring(2, co);
                int n=Integer.parseInt(num);
                n++;
                String snum=Integer.toString(n);
                String ftxt=txt+snum;
                txtmid.setText(ftxt);
            
            
            } else {
                
                txtmid.setText("MI1000");
            
            
            }
        
        
        
        } catch (Exception e){
            
            
        
        
        }
    
    
    }





    private void tablelord()
    {
        
        try{
            
            String sql=" SELECT `mid`, `name`, `nic`,`date` ,`gender`, `address`, `email`, `mobile`, `mtype` FROM `addmember` ";
            pst= (PreparedStatement)conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tbldetail.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        
        
        } catch (Exception e) {
            
           JOptionPane.showConfirmDialog(rootPane, e);
        
        
        }
    
    
    }
    
    
    
    
    
    
   private void clearField()
   {
       
       
       txtname.setText("");
       txtnic.setText("");
       ((JTextField)mdate.getDateEditor().getUiComponent()).setText("");
       cmbgender.setSelectedIndex(0);
       txtaddress.setText("");
       txtemail.setText("");
       txtmobile.setText("");
       cmbmtype.setSelectedIndex(0);
   
   
   }
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbgender;
    private javax.swing.JComboBox<String> cmbmtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser mdate;
    private javax.swing.JTable tbldetail;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    // End of variables declaration//GEN-END:variables
}
