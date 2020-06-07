
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Return extends javax.swing.JInternalFrame {

    
    Connection conn=null;
     PreparedStatement pst=null;
     ResultSet rs=null;
    
    
    
    public Return() {
        initComponents();
         conn= DBConnect.connect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtbid = new javax.swing.JTextField();
        txtmid = new javax.swing.JTextField();
        txtdueday = new javax.swing.JTextField();
        txtfine = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(990, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel6.setText("Return Book");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 24, 260, 40));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 940, 50));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 180, 50));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Book Id");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 100, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Member Id");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 90, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Late Day");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Fine");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 70, -1));

        txtbid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbidActionPerformed(evt);
            }
        });
        txtbid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbidKeyReleased(evt);
            }
        });
        getContentPane().add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 150, 30));
        getContentPane().add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 150, 30));

        txtdueday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtduedayActionPerformed(evt);
            }
        });
        getContentPane().add(txtdueday, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 150, 30));
        getContentPane().add(txtfine, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 150, 30));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 340, 410));

        txtbill.setColumns(20);
        txtbill.setRows(5);
        jScrollPane1.setViewportView(txtbill);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 190, 290));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 90, 220, 310));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 160, 50));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 940, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setPreferredSize(new java.awt.Dimension(990, 510));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbidActionPerformed

    private void txtduedayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtduedayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtduedayActionPerformed

    private void txtbidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbidKeyReleased
        // TODO add your handling code here:
        try{
            
            String sql="SELECT `mid`, `r_date` FROM `issue_book` WHERE bid='"+txtbid.getText()+"' and mark='0' ";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                
                txtmid.setText(rs.getString("mid"));
                String r_date=rs.getString("r_date");
                LocalDate today=LocalDate.now();
                LocalDate rday=LocalDate.parse(r_date);
                
                Long day_gap=ChronoUnit.DAYS.between(rday, today);
                if(day_gap>0)
                {
                txtdueday.setText(day_gap.toString());
                
                long fine=20*day_gap;
                txtfine.setText(String.valueOf(fine));
                
                }
                else {
                    
                    txtdueday.setText("0");
                    txtfine.setText("0");
                
                
                }
            
            
            }
                    
        
        
        }catch(Exception e){
        
        
        }
    }//GEN-LAST:event_txtbidKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String bid=txtbid.getText();
        String mid=txtmid.getText();
        String ldate=txtdueday.getText();
        String fine=txtfine.getText();
        
        try{
                    
                    String sql="INSERT INTO `return_book`(`bid`, `mid`, `late_days`, `fine`) VALUES ('"+bid+"','"+mid+"','"+ldate+"','"+fine+"')";
                    PreparedStatement pst=(PreparedStatement) conn.prepareStatement(sql);
                    pst.execute();
                    update();
                    bill();
                    returnmark();
                    JOptionPane.showMessageDialog(rootPane, "Successfully insert");
                
                
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                    
                   
                
                
                }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            txtbill.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void bill()
    {
        
        txtbill.setText("==================="+"\n"
                                +"World Library"+"\n"
                                +"No. of Date\t"+txtdueday.getText()+"\n"
                                +"Amount\t"+txtfine.getText()+"\n"
                                +"===================");
    
    
    
    }
    
    
    
    private void update()
     {
         
         
         try{
             
             String sql="UPDATE `addbook` SET `mark`='0' WHERE bid='"+txtbid.getText()+"'";
             pst=(PreparedStatement) conn.prepareStatement(sql);
             pst.execute();
             //OptionPane.showMessageDialog(rootPane, "Update Successfully");
            
             
         
         
         
         } catch (Exception e){
             JOptionPane.showMessageDialog(rootPane, e);
         
         
         
         }
        
     
     
     
     }
    
    private void returnmark()
     {
         
         
         try{
             
             String sql="UPDATE `issue_book` SET `mark`='1' WHERE bid='"+txtbid.getText()+"'";
             pst=(PreparedStatement) conn.prepareStatement(sql);
             pst.execute();
             //OptionPane.showMessageDialog(rootPane, "Update Successfully");
            
             
         
         
         
         } catch (Exception e){
             JOptionPane.showMessageDialog(rootPane, e);
         
         
         
         }
        
     
     
     
     }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtdueday;
    private javax.swing.JTextField txtfine;
    private javax.swing.JTextField txtmid;
    // End of variables declaration//GEN-END:variables
}
