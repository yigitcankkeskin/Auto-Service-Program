/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yzlmproje;

import java.awt.EventQueue;

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
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author yc_ke
 */
public class danismanIslem extends javax.swing.JFrame {
  DefaultTableModel dtm =new DefaultTableModel();
    /**
     * Creates new form Danismanisl
     */
    static String danisman_id,ad_soyad,maas,mesai_saati,kullanici_adi,kullanici_sifre,is_durumu;
    public danismanIslem() {
        initComponents();
        dtm.setColumnIdentifiers(new String[]{"danisman_id","ad_soyad","maas","mesai_saati","kullanici_adi","kullanici_sifre","is_durumu"});
        jTable1.setModel(dtm);
        setDanismanTablosu();
    }
public void setDanismanTablosu(){
      try{	
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	String url = "jdbc:sqlserver://DESKTOP-ACBIUN1\\DESKTOP-ACBIUN1:1433;databaseName=Proje";
	String user = "admin";
	String password = "sifre123";
	Connection con = DriverManager.getConnection(url, user, password);
        Statement stm = con.createStatement();
        String sql = "SELECT * from Danisman";
        ResultSet rs = stm.executeQuery(sql);
        ((DefaultTableModel)jTable1.getModel()).setNumRows(0);
        while(rs.next()){
         dtm.addRow(new String[]{Integer.toString(rs.getInt("danisman_id")),rs.getString("ad_soyad"),Integer.toString(rs.getInt("maas"))
                 ,Integer.toString(rs.getInt("mesai_saati")),rs.getString("kullanici_adi"),rs.getString("kullanici_sifre"),Integer.toString(rs.getInt("is_durumu"))});
                 }
        con.close();
      }catch(ClassNotFoundException | SQLException e){
         JOptionPane.showMessageDialog(null, e);
      }
      
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtdanismanıd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtadsoyad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmaas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmesaisaati = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtkullaniciadi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtsifre = new javax.swing.JTextField();
        btnguncelle = new javax.swing.JButton();
        btnsil = new javax.swing.JButton();
        btnolustur = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btngeri = new javax.swing.JButton();
        btnbul = new javax.swing.JButton();
        txtisdurumu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btntblo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danışman Düzenleme İşlemleri");

        jLabel2.setText("Danışman ID  : ");

        jLabel3.setText("Ad Soyad      : ");

        jLabel4.setText("Maaş              :");

        jLabel5.setText("Mesai Saati     :");

        jLabel6.setText("Kullanıcı Adı  : ");

        jLabel7.setText("Kullanıcı Şifresi  :");

        btnguncelle.setText("Güncelle");
        btnguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguncelleActionPerformed(evt);
            }
        });

        btnsil.setText("Sil");
        btnsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsilActionPerformed(evt);
            }
        });

        btnolustur.setText("Oluştur");
        btnolustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnolusturActionPerformed(evt);
            }
        });

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btngeri.setText("Ana menüye Dön");
        btngeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngeriActionPerformed(evt);
            }
        });

        btnbul.setText("Bul");
        btnbul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbulActionPerformed(evt);
            }
        });

        jLabel8.setText("İş durumu : ");

        btntblo.setText("Tablo Güncelle");
        btntblo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntbloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(218, 218, 218)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtisdurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtkullaniciadi, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtmesaisaati, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtmaas, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtadsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtdanismanıd, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnbul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnolustur, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnsil, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntblo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btngeri)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnguncelle, btnolustur, btnreset, btnsil});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbul, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdanismanıd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtadsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmaas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmesaisaati, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkullaniciadi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtisdurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnolustur, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(btngeri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btntblo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnguncelle, btnolustur, btnreset, btnsil});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, txtadsoyad, txtdanismanıd, txtkullaniciadi, txtmaas, txtmesaisaati, txtsifre});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnolusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnolusturActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    String url = "jdbc:sqlserver://DESKTOP-ACBIUN1\\DESKTOP-ACBIUN1:1433;databaseName=Proje";
	    String user = "admin";
	    String password = "sifre123";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
             danisman_id = txtdanismanıd.getText();
             ad_soyad = txtadsoyad.getText();
             maas = txtmaas.getText();
             mesai_saati =  txtmesaisaati.getText();
             kullanici_adi =  txtkullaniciadi.getText();
             kullanici_sifre =  txtsifre.getText();
             is_durumu =  txtisdurumu.getText();
            String q = "INSERT INTO Danisman (ad_soyad,maas,mesai_saati,kullanici_adi,kullanici_sifre,is_durumu) VALUES ('"+ad_soyad+"','"+maas+"','"+mesai_saati+"','"+kullanici_adi+"','"+kullanici_sifre+"','"+is_durumu+"')";
            int sonuc = stm.executeUpdate(q);
            if(sonuc==1){
                JOptionPane.showMessageDialog(null,"Tebrikler Kayıt yaptiniz");
                txtadsoyad.setText("");
                txtdanismanıd.setText("");
                txtkullaniciadi.setText("");
                txtmaas.setText("");
                txtsifre.setText("");
                txtmesaisaati.setText("");
                txtisdurumu.setText("");
                
            }else{
               JOptionPane.showMessageDialog(null,"Kayıt oluşturulamadı Tekrar deneyiniz");
               txtadsoyad.setText("");
                txtdanismanıd.setText("");
                txtkullaniciadi.setText("");
                txtmaas.setText("");
                txtsifre.setText("");
                txtmesaisaati.setText("");
                txtisdurumu.setText("");
                
            }
            
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnolusturActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
                txtadsoyad.setText("");
                txtdanismanıd.setText("");
                txtkullaniciadi.setText("");
                txtmaas.setText("");
                txtsifre.setText("");
                txtmesaisaati.setText("");
                txtisdurumu.setText("");
                
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguncelleActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-ACBIUN1\\DESKTOP-ACBIUN1:1433;databaseName=Proje";
            String user = "admin";
            String password = "sifre123";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            danisman_id = txtdanismanıd.getText();
             ad_soyad = txtadsoyad.getText();
             maas = txtmaas.getText();
             mesai_saati =  txtmesaisaati.getText();
             kullanici_adi =  txtkullaniciadi.getText();
             kullanici_sifre =  txtsifre.getText();
             is_durumu =  txtisdurumu.getText();
            //static String danisman_id,ad_soyad,maas,mesai_saati,kullanici_adi,kullanici_sifre;
            String q = "UPDATE Danisman SET ad_soyad='"+ad_soyad+"',maas='"+maas+"',mesai_saati='"+mesai_saati+"'" + ",kullanici_adi='"+kullanici_adi+"',kullanici_sifre='"+kullanici_sifre+"',is_durumu='"+is_durumu+"' where danisman_id='"+danisman_id+"'";
            int sonuc = stm.executeUpdate(q);
            if(sonuc==1){
                JOptionPane.showMessageDialog(null,"Tebrikler Kayıt yaptiniz");
              txtadsoyad.setText("");
                txtdanismanıd.setText("");
                txtkullaniciadi.setText("");
                txtmaas.setText("");
                txtsifre.setText("");
                txtmesaisaati.setText("");
                txtisdurumu.setText("");
            }else{
                JOptionPane.showMessageDialog(null,"Kayıt oluşturulamadı Tekrar deneyiniz");
                txtadsoyad.setText("");
                txtdanismanıd.setText("");
                txtkullaniciadi.setText("");
                txtmaas.setText("");
                txtsifre.setText("");
                txtmesaisaati.setText("");
                txtisdurumu.setText("");
            }

            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnguncelleActionPerformed

    private void btnbulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbulActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-ACBIUN1\\DESKTOP-ACBIUN1:1433;databaseName=Proje";
            String user = "admin";
            String password = "sifre123";
            Connection con = DriverManager.getConnection(url, user, password);
            String Id=txtdanismanıd.getText();

            Statement stm = con.createStatement();
            String sql = "select *  from Danisman where danisman_id='"+Id+"' ";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                danisman_id=Integer.toString(rs.getInt("danisman_id"));
                ad_soyad=rs.getString("ad_soyad");
                maas=Integer.toString(rs.getInt("maas"));
                mesai_saati=Integer.toString(rs.getInt("mesai_saati"));
                kullanici_adi=rs.getString("kullanici_adi");
                kullanici_sifre=rs.getString("kullanici_sifre");
                is_durumu=Integer.toString(rs.getInt("is_durumu"));
            }
               btnreset.doClick();
                txtadsoyad.setText(ad_soyad);
                txtdanismanıd.setText(danisman_id);
                txtkullaniciadi.setText(kullanici_adi);
                txtmaas.setText(maas);
                txtsifre.setText(kullanici_sifre);
                txtmesaisaati.setText(mesai_saati);
                txtisdurumu.setText(is_durumu);
            con.close();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnbulActionPerformed

    private void btnsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsilActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-ACBIUN1\\DESKTOP-ACBIUN1:1433;databaseName=Proje";
            String user = "admin";
            String password = "sifre123";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            danisman_id = txtdanismanıd.getText();
             ad_soyad = txtadsoyad.getText();
             maas = txtmaas.getText();
             mesai_saati =  txtmesaisaati.getText();
             kullanici_adi =  txtkullaniciadi.getText();
             kullanici_sifre =  txtsifre.getText();
             is_durumu =  txtisdurumu.getText();
             String a =null;
            //static String danisman_id,ad_soyad,maas,mesai_saati,kullanici_adi,kullanici_sifre;
            String q = "UPDATE Danisman SET kullanici_adi=NULL,kullanici_sifre=NULL,is_durumu='0' where danisman_id='"+danisman_id+"'";
            int sonuc = stm.executeUpdate(q);
            if(sonuc==1){
                JOptionPane.showMessageDialog(null,"Kişi başarıyla işten Çıkarıldı");
              txtadsoyad.setText("");
                txtdanismanıd.setText("");
                txtkullaniciadi.setText("");
                txtmaas.setText("");
                txtsifre.setText("");
                txtmesaisaati.setText("");
                txtisdurumu.setText("");
            }else{
                JOptionPane.showMessageDialog(null,"Kayıt silinemedi Tekrar deneyiniz");
                txtadsoyad.setText("");
                txtdanismanıd.setText("");
                txtkullaniciadi.setText("");
                txtmaas.setText("");
                txtsifre.setText("");
                txtmesaisaati.setText("");
                txtisdurumu.setText("");
            }

            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       /* 
         try{
				
			
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				String url = "jdbc:sqlserver://DESKTOP-ACBIUN1\\DESKTOP-ACBIUN1:1433;databaseName=Proje";
				String user = "admin";
				String password = "sifre123";
				Connection con = DriverManager.getConnection(url, user, password);
				String Id=txtdanismanıd.getText();
                                String sql = "DELETE  from Danisman where danisman_id=? ";
				PreparedStatement stm = con.prepareStatement(sql);	
                                stm.setString(1,Id);
				int rows = stm.executeUpdate();
                                 btnreset.doClick();
                                if(rows>0){
                                 JOptionPane.showMessageDialog(null,"Başarıyla Silindi..");   
                                }else{
                                   JOptionPane.showMessageDialog(null,"Danışman bulunamadı tekrar Deneyiniz..");    
                                }				
				con.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
*/
    }//GEN-LAST:event_btnsilActionPerformed

    private void btngeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeriActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        admin a = new admin();
        a.show();
    }//GEN-LAST:event_btngeriActionPerformed

    private void btntbloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntbloActionPerformed
        // TODO add your handling code here:
        
        setDanismanTablosu();
    }//GEN-LAST:event_btntbloActionPerformed

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
            java.util.logging.Logger.getLogger(danismanIslem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(danismanIslem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(danismanIslem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(danismanIslem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new danismanIslem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbul;
    private javax.swing.JButton btngeri;
    private javax.swing.JButton btnguncelle;
    private javax.swing.JButton btnolustur;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsil;
    private javax.swing.JButton btntblo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtadsoyad;
    private javax.swing.JTextField txtdanismanıd;
    private javax.swing.JTextField txtisdurumu;
    private javax.swing.JTextField txtkullaniciadi;
    private javax.swing.JTextField txtmaas;
    private javax.swing.JTextField txtmesaisaati;
    private javax.swing.JTextField txtsifre;
    // End of variables declaration//GEN-END:variables
}
