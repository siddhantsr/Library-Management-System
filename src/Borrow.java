
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Borrow extends javax.swing.JInternalFrame {

   
    
    Connection conn=null;
     PreparedStatement pst=null;
     ResultSet rs=null;
    public Borrow() {
        initComponents();
         conn= DBConnect.connect();
        autoid();
        
        
        
        LocalDate today=LocalDate.now();
        LocalDate reday=today.plus(10, ChronoUnit.DAYS);
        txtidate.setText(today.toString());
        txtrdate.setText(reday.toString());
        tablelord();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtmid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtmtype = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtbid = new javax.swing.JTextField();
        txtbname = new javax.swing.JTextField();
        txtbtype = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtrno = new javax.swing.JTextField();
        txtdel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtidate = new javax.swing.JTextField();
        txtrdate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblissue = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(990, 530));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setText("Member Id");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setText("Member Type");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, -1));

        txtmid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmidActionPerformed(evt);
            }
        });
        txtmid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmidKeyReleased(evt);
            }
        });
        getContentPane().add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 190, 30));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 190, 30));

        txtmtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmtypeActionPerformed(evt);
            }
        });
        getContentPane().add(txtmtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 190, 30));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 360, 190));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setText("Book Id");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 70, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setText("Book Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setText("Book Type");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        txtbid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbidKeyReleased(evt);
            }
        });
        getContentPane().add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 180, 30));
        getContentPane().add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 180, 30));

        txtbtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtypeActionPerformed(evt);
            }
        });
        getContentPane().add(txtbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 180, 30));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 360, 190));

        jLabel16.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel16.setText("Issue Book");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 14, 330, 40));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, 50));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 170, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Issue");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 170, 40));

        txtrno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtrno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtrno, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 170, 60));

        txtdel.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtdel.setText("Delete");
        txtdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdelActionPerformed(evt);
            }
        });
        getContentPane().add(txtdel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 170, 40));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 220, 250));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setText("Issue Date");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, 50));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel14.setText("Return Date");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, 50));

        txtidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidateActionPerformed(evt);
            }
        });
        getContentPane().add(txtidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 170, 30));

        txtrdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrdateActionPerformed(evt);
            }
        });
        getContentPane().add(txtrdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 170, 30));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 730, 50));

        tblissue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblissue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblissueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblissue);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 940, 160));

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 960, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void autoid()
    {
        
        try{
            
            String sql="SELECT `record_no` FROM `issue_book` ORDER BY record_no DESC LIMIT 1";
            
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                
                String rnno=rs.getString("record_no");
                int co=rnno.length();
                String txt=rnno.substring(0, 2);
                String num= rnno.substring(2, co);
                int n=Integer.parseInt(num);
                n++;
                String snum=Integer.toString(n);
                String ftxt=txt+snum;
                txtrno.setText(ftxt);
            
            
            } else {
                
                txtrno.setText("RN1000");
            
            
            }
        
        
        
        } catch (Exception e){
            
            
        
        
        }
    
    
    }
    
    
    
    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtbtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String rno=txtrno.getText();
        String mid=txtmid.getText();
        String bid=txtbid.getText();
        String idate=txtidate.getText();
        String rdate=txtrdate.getText();
        
        
        
        
        try{
                    
                    String sql="INSERT INTO `issue_book`(`record_no`, `mid`, `bid`, `i_date`, `r_date`,`mark`) VALUES ('"+rno+"','"+mid+"','"+bid+"','"+idate+"','"+rdate+"','0')";
                    PreparedStatement pst=(PreparedStatement) conn.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(rootPane, "Successfully insert");
                
                
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                    
                   
                
                
                }
         update();
         autoid();
        tablelord();
         clear();
         
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
     private void tablelord()
    {
        
        try{
            
            String sql="SELECT `record_no`, `mid`, `bid`, `i_date`, `r_date` FROM `issue_book` ";
            pst= (PreparedStatement)conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblissue.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        
        
        } catch (Exception e) {
            
           JOptionPane.showConfirmDialog(rootPane, e);
        
        
        }
    
    
    }
     
     
     private void clear()
     {
         
         
         txtbid.setText("");
         txtmid.setText("");
         txtbname.setText("");
         txtbtype.setText("");
         txtmtype.setText("");
         txtname.setText("");
         txtmtype.setText("");
     
     
     
     
     }
     
     private void update()
     {
         
         
         try{
             
             String sql="UPDATE `addbook` SET `mark`='1' WHERE bid='"+txtbid.getText()+"'";
             pst=(PreparedStatement) conn.prepareStatement(sql);
             pst.execute();
             JOptionPane.showMessageDialog(rootPane, "Update Successfully");
             tablelord();
             
         
         
         
         } catch (Exception e){
             JOptionPane.showMessageDialog(rootPane, e);
         
         
         
         }
        
     
     
     
     }
    
    
    
    
    
    private void txtrnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrnoActionPerformed

    private void txtmidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmidActionPerformed

    private void txtmtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmtypeActionPerformed

    private void txtidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         clear();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtmidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmidKeyReleased
        // TODO add your handling code here:
        
        try{
            
            String sql="SELECT  `name`,`mtype` FROM `addmember` WHERE   mid='"+txtmid.getText()+"'";
            
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                
               txtname.setText(rs.getString("name"));
               txtmtype.setText(rs.getString("mtype"));
            
            
            } 
            else{
                
                txtname.setText("");
                txtmtype.setText("");
            
            
            }
            
        } catch(Exception e) {
            
           JOptionPane.showMessageDialog(rootPane, e);
        
        }
    }//GEN-LAST:event_txtmidKeyReleased

    private void txtbidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbidKeyReleased
        // TODO add your handling code here:
        
        try{
            
            String sql="SELECT  `bname`,`btype` FROM `addbook` WHERE   bid='"+txtbid.getText()+"'";
            
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                
               txtbname.setText(rs.getString("bname"));
               txtbtype.setText(rs.getString("btype"));
            
            
            }
            else{
                
                txtbname.setText("");
                txtbtype.setText("");
            
            
            }
            
        } catch(Exception e) {
            
           JOptionPane.showMessageDialog(rootPane, e);
        
        }
    }//GEN-LAST:event_txtbidKeyReleased

    private void txtdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdelActionPerformed
        // TODO add your handling code here:
        
        try{
            
            String sql="DELETE FROM `issue_book` WHERE record_no='"+txtrno.getText()+"' ";
            pst=(PreparedStatement)conn.prepareStatement(sql);
            pst.execute();
            
           JOptionPane.showMessageDialog(rootPane, "Delete Successfully");
           tablelord();
           clear();
           autoid();
           
        
        
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(rootPane, e);
            
        
        
        }
        
                                    
    }//GEN-LAST:event_txtdelActionPerformed

    private void tblissueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblissueMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tmodel=(DefaultTableModel)tblissue.getModel();
        int selectrowindex=tblissue.getSelectedRow();

        txtrno.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        txtmid.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        txtbid.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        txtidate.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        txtrdate.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        
        
    }//GEN-LAST:event_tblissueMouseClicked

    private void txtrdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblissue;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtbtype;
    private javax.swing.JButton txtdel;
    private javax.swing.JTextField txtidate;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtmtype;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtrdate;
    private javax.swing.JTextField txtrno;
    // End of variables declaration//GEN-END:variables
}
