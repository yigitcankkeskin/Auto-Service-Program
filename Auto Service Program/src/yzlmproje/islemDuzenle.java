/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yzlmproje;

/**
 *
 * @author yc_ke
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.DropMode;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;

public class islemDuzenle extends javax.swing.JFrame {

    
    static String danisman_id,islem_id,plaka_no,islem_tarih,yikamaci_id,teknisyen_id,sikayet;
         /** Creates new form islemDüzenle */
    public islemDuzenle() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDanismanId = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBul = new javax.swing.JButton();
        txtPlakaNo = new javax.swing.JTextField();
        txtTarih = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnKayıt = new javax.swing.JButton();
        btnGeri2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtYıkamacıId = new javax.swing.JTextField();
        txtTeknisyenId = new javax.swing.JTextField();
        txtSikayet = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Danisman Id    :");

        jLabel4.setText("Plaka Numarası : ");

        jLabel5.setText("İslem Tarihi          :");

        txtDanismanId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDanismanIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Islem ID =");

        btnBul.setText("Bul");
        btnBul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBulActionPerformed(evt);
            }
        });

        txtPlakaNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlakaNoActionPerformed(evt);
            }
        });

        txtTarih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarihActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Servis İslemi Düzenleme Paneli");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnKayıt.setText("Kaydet");
        btnKayıt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayıtActionPerformed(evt);
            }
        });

        btnGeri2.setText("Geri Dön");
        btnGeri2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeri2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Yıkamacı Id       :");

        jLabel7.setText("Teknisyen Id     :");

        jLabel8.setText("Sikayet                 :");

        txtYıkamacıId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYıkamacıIdActionPerformed(evt);
            }
        });

        txtTeknisyenId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeknisyenIdActionPerformed(evt);
            }
        });

        txtSikayet.setColumns(5);
        txtSikayet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSikayetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnBul, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPlakaNo, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(txtTarih)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDanismanId, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTeknisyenId, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSikayet, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtYıkamacıId, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 149, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKayıt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGeri2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBul, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDanismanId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlakaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtYıkamacıId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeknisyenId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addComponent(txtSikayet))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKayıt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btnGeri2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDanismanIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDanismanIdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDanismanIdActionPerformed

    private void btnBulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBulActionPerformed
        // TODO add your handling code here:
        try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-ACBIUN1\\DESKTOP-ACBIUN1:1433;databaseName=Proje";
            String user = "admin";
            String password = "sifre123";
            Connection con = DriverManager.getConnection(url, user, password);
            String Id=txtId.getText();

            Statement stm = con.createStatement();
            String sql = "select *  from İslem where islem_id='"+Id+"' ";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                islem_id=Integer.toString(rs.getInt("islem_id"));
                danisman_id=Integer.toString(rs.getInt("danisman_id"));
                plaka_no=rs.getString("plaka_no");
                islem_tarih=rs.getString("islem_tarih");
                sikayet=rs.getString("sikayet");
                yikamaci_id=Integer.toString(rs.getInt("yikamaci_id"));
                teknisyen_id=Integer.toString(rs.getInt("teknisyen_id"));
            }
            txtDanismanId.setText(danisman_id);
            txtPlakaNo.setText(plaka_no);
            txtTarih.setText(islem_tarih);
            txtSikayet.setText(sikayet);
            txtTeknisyenId.setText(teknisyen_id);
            txtYıkamacıId.setText(yikamaci_id);
            con.close();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnBulActionPerformed

    private void txtPlakaNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlakaNoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPlakaNoActionPerformed

    private void txtTarihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarihActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTarihActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtId.setText("");
        txtDanismanId.setText("");
        txtPlakaNo.setText("");
        txtTarih.setText("");
        txtTeknisyenId.setText("");
        txtYıkamacıId.setText("");
        txtSikayet.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKayıtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayıtActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-ACBIUN1\\DESKTOP-ACBIUN1:1433;databaseName=Proje";
            String user = "admin";
            String password = "sifre123";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            danisman_id = txtDanismanId.getText();
            plaka_no = txtPlakaNo.getText();
            islem_tarih =  txtTarih.getText();
            yikamaci_id=txtYıkamacıId.getText();
            teknisyen_id=txtTeknisyenId.getText();
            sikayet=txtSikayet.getText();
            
            String q = "UPDATE İslem SET danisman_id='"+danisman_id+"',plaka_no='"+plaka_no+"',islem_tarih='"+islem_tarih+"',yikamaci_id='"+yikamaci_id+"',teknisyen_id='"+teknisyen_id+"' ,sikayet='"+sikayet+"' where islem_id='"+islem_id+"'";
            int sonuc = stm.executeUpdate(q);
            if(sonuc==1){
                JOptionPane.showMessageDialog(null,"Tebrikler Kayıt yaptiniz");
              txtId.setText("");
              txtDanismanId.setText("");
              txtPlakaNo.setText("");
              txtTarih.setText("");
              txtTeknisyenId.setText("");
              txtYıkamacıId.setText("");
              txtSikayet.setText("");
            }else{
                JOptionPane.showMessageDialog(null,"Kayıt oluşturulamadı Tekrar deneyiniz");
                txtId.setText("");
              txtDanismanId.setText("");
              txtPlakaNo.setText("");
              txtTarih.setText("");
              txtTeknisyenId.setText("");
              txtYıkamacıId.setText("");
              txtSikayet.setText("");
            }

            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnKayıtActionPerformed

    private void btnGeri2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeri2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        danisman hp = new danisman();
        hp.show();
    }//GEN-LAST:event_btnGeri2ActionPerformed

    private void txtYıkamacıIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYıkamacıIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYıkamacıIdActionPerformed

    private void txtTeknisyenIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeknisyenIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeknisyenIdActionPerformed

    private void txtSikayetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSikayetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSikayetActionPerformed

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
            java.util.logging.Logger.getLogger(islemDuzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(islemDuzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(islemDuzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(islemDuzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new islemDuzenle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBul;
    private javax.swing.JButton btnGeri2;
    private javax.swing.JButton btnKayıt;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtDanismanId;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPlakaNo;
    private javax.swing.JTextField txtSikayet;
    private javax.swing.JTextField txtTarih;
    private javax.swing.JTextField txtTeknisyenId;
    private javax.swing.JTextField txtYıkamacıId;
    // End of variables declaration//GEN-END:variables

}
