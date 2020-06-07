
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class AddBook extends javax.swing.JInternalFrame {

   
    Connection conn=null;
     PreparedStatement pst=null;
     ResultSet rs=null;
    
    public AddBook() {
        initComponents();
        conn= DBConnect.connect();
        autoid();
        tablelord();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtbid = new javax.swing.JTextField();
        txtbname = new javax.swing.JTextField();
        txtbcode = new javax.swing.JTextField();
        cmbcategory = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpublisher = new javax.swing.JTextArea();
        txtprice = new javax.swing.JTextField();
        cmbbtype = new javax.swing.JComboBox<>();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Datechooser = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblbookdetail = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(990, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jLabel15.setText("Add Books");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 14, 300, 40));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("Book Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 70, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setText("Book Code");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setText("Category");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));
        getContentPane().add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 140, -1));
        getContentPane().add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 140, -1));
        getContentPane().add(txtbcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, -1));

        cmbcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Category>", "Programming", "Oprating System", "Machine Learning", "Others", " " }));
        cmbcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcategoryActionPerformed(evt);
            }
        });
        getContentPane().add(cmbcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 140, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setText("Publisher");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 80, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setText("Price");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 50, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setText("Book Type");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 80, -1));

        txtpublisher.setColumns(20);
        txtpublisher.setRows(5);
        jScrollPane1.setViewportView(txtpublisher);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 160, 70));

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 150, -1));

        cmbbtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Type>", "Issue", "Read-only", "Others" }));
        cmbbtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbtypeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 150, -1));

        btnadd.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 190, 30));

        btnupdate.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 190, 30));

        btndelete.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 190, 30));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 310, 200));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setText("Date");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 70, -1));
        getContentPane().add(Datechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 140, -1));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 940, 220));

        tblbookdetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblbookdetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbookdetailMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblbookdetail);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 310, 940, 190));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 960, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 520));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcategoryActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void cmbbtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbtypeActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        String bid=txtbid.getText();
        String bname=txtbname.getText();
        String bcode=txtbcode.getText();
        String bdate=((JTextField)Datechooser.getDateEditor().getUiComponent()).getText();
        String category=cmbcategory.getSelectedItem().toString();
        String publisher=txtpublisher.getText();
        String btype=cmbbtype.getSelectedItem().toString();
        String price=txtprice.getText();

        try{

            String sql="INSERT INTO `addbook`(`bid`, `bname`, `bcode`, `bdate`, `category`, `publisher`, `btype`, `price`,`mark`) VALUES ('"+bid+"','"+bname+"','"+bcode+"','"+bdate+"','"+category+"','"+publisher+"','"+btype+"','"+price+"','0')";
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

    
    
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:

        String bid=txtbid.getText();
        String bname=txtbname.getText();
        String bcode=txtbcode.getText();
        String bdate=((JTextField)Datechooser.getDateEditor().getUiComponent()).getText();
        String category=cmbcategory.getSelectedItem().toString();
        String publisher=txtpublisher.getText();
        String btype=cmbbtype.getSelectedItem().toString();
        String price=txtprice.getText();

        try{

            String sql="UPDATE `addbook` SET `bname`='"+bname+"',`bcode`='"+bcode+"',`bdate`='"+bdate+"',`category`='"+category+"',`publisher`='"+publisher+"',`btype`='"+btype+"',`price`='"+price+"' WHERE `bid`='"+bid+"'";
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

            String sql="DELETE FROM `addbook` WHERE bid='"+txtbid.getText()+"'";
            pst=(PreparedStatement)conn.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(rootPane, "Delete Successfully");
            tablelord();
            clearField();
            autoid();

        } catch(Exception e){

            JOptionPane.showMessageDialog(rootPane, e);

        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void tblbookdetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbookdetailMouseClicked
        // TODO add your handling code here:

        DefaultTableModel tmodel=(DefaultTableModel)tblbookdetail.getModel();
        int selectrowindex=tblbookdetail.getSelectedRow();

        txtbid.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        txtbname.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        txtbcode.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        ((JTextField)Datechooser.getDateEditor().getUiComponent()).setText(tmodel.getValueAt(selectrowindex, 3).toString());
        cmbcategory.setSelectedItem(tmodel.getValueAt(selectrowindex, 4).toString());
        txtpublisher.setText(tmodel.getValueAt(selectrowindex, 5).toString());
        cmbbtype.setSelectedItem(tmodel.getValueAt(selectrowindex, 6).toString());
        txtprice.setText(tmodel.getValueAt(selectrowindex, 7).toString());
        
    }//GEN-LAST:event_tblbookdetailMouseClicked

    
    
    
    
     private void autoid()
    {
        
        try{
            
            String sql="SELECT `bid` FROM `addbook` ORDER BY bid DESC LIMIT 1";
            
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                
                String rnno=rs.getString("bid");
                int co=rnno.length();
                String txt=rnno.substring(0, 2);
                String num= rnno.substring(2, co);
                int n=Integer.parseInt(num);
                n++;
                String snum=Integer.toString(n);
                String ftxt=txt+snum;
                txtbid.setText(ftxt);
            
            
            } else {
                
                txtbid.setText("BI1000");
            
            
            }
        
        
        
        } catch (Exception e){
            
            
        
        
        }
    
    
    }
    
     private void tablelord()
    {
        
        try{
            
            String sql=" SELECT `bid`, `bname`, `bcode`, `bdate`, `category`, `publisher`, `btype`, `price` FROM `addbook` ";
            pst= (PreparedStatement)conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblbookdetail.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        
        
        } catch (Exception e) {
            
           JOptionPane.showConfirmDialog(rootPane, e);
        
        
        }
    
    
    }
     
     
     
     private void clearField()
   {
       
       
       txtbname.setText("");
       txtbcode.setText("");
       ((JTextField)Datechooser.getDateEditor().getUiComponent()).setText("");
       cmbcategory.setSelectedIndex(0);
       txtpublisher.setText("");
       cmbbtype.setSelectedIndex(0);
       txtprice.setText("");
   
   
   }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Datechooser;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbbtype;
    private javax.swing.JComboBox<String> cmbcategory;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblbookdetail;
    private javax.swing.JTextField txtbcode;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextArea txtpublisher;
    // End of variables declaration//GEN-END:variables
}
