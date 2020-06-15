/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arackiralamaotomasyonu;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class AracKayit extends javax.swing.JFrame {

    /**
     * Creates new form AracKayit
     */
    public AracKayit() {
        initComponents();
        this.setResizable(false);
        cerceveResmiYukle();
    }
    private void cerceveResmiYukle()
    {
       
            
        ClassLoader cl = this.getClass().getClassLoader();

        
        Image picture  = new ImageIcon(cl.getResource("arackiralamaotomasyonu/cerceve.png")).getImage();
        Image scaledPic = picture.getScaledInstance(resimPaneli.getWidth(), resimPaneli.getHeight(),
            Image.SCALE_SMOOTH);
         ImageIcon ii = new ImageIcon(scaledPic);
        
        resimPaneli.setIcon(ii);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arac_renk = new java.awt.TextField();
        arac_km = new java.awt.TextField();
        plaka = new java.awt.Label();
        seri = new java.awt.Label();
        renk = new java.awt.Label();
        km = new java.awt.Label();
        marka = new java.awt.Label();
        arac_plaka = new java.awt.TextField();
        arac_marka = new java.awt.TextField();
        arac_seri = new java.awt.TextField();
        yakt = new java.awt.Label();
        kiraucreti = new java.awt.Label();
        arac_kira_ucreti = new java.awt.TextField();
        model = new java.awt.Label();
        aracEkle_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        arac_iptal = new javax.swing.JButton();
        resimPaneli = new javax.swing.JLabel();
        yakitTuru_combox = new javax.swing.JComboBox<>();
        arac_yill = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        plaka.setText("Plaka");

        seri.setText("Seri");

        renk.setText("Renk");

        km.setText("Km");

        marka.setText("Marka");

        arac_plaka.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        yakt.setText("Yakıt Türü");

        kiraucreti.setText("Kira Ücreti");

        model.setText("Model(Yıl)");

        aracEkle_btn.setText("Ekle");
        aracEkle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracEkle_btnActionPerformed(evt);
            }
        });

        jButton3.setText("Resim Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        arac_iptal.setText("Geri");
        arac_iptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arac_iptalActionPerformed(evt);
            }
        });

        yakitTuru_combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dizel", "Benzin", "Hibrit", "LPG" }));
        yakitTuru_combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yakitTuru_comboxActionPerformed(evt);
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
                            .addComponent(plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yakitTuru_combox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arac_renk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arac_seri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arac_km, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(arac_marka, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(arac_plaka, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(arac_yill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(kiraucreti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(arac_kira_ucreti, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(arac_iptal)
                            .addGap(96, 96, 96)
                            .addComponent(aracEkle_btn))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(resimPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(114, 114, 114))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resimPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(arac_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addComponent(arac_marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arac_seri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arac_yill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arac_renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(arac_km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(yakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(yakitTuru_combox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arac_kira_ucreti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kiraucreti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arac_iptal)
                            .addComponent(aracEkle_btn))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        plaka.getAccessibleContext().setAccessibleName("");
        seri.getAccessibleContext().setAccessibleName("");
        km.getAccessibleContext().setAccessibleName("");
        marka.getAccessibleContext().setAccessibleName("");
        yakt.getAccessibleContext().setAccessibleName("");
        kiraucreti.getAccessibleContext().setAccessibleName("");
        model.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arac_iptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arac_iptalActionPerformed
        this.dispose();
    }//GEN-LAST:event_arac_iptalActionPerformed
    File selectedFile;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ResimSectirici resimSectirici = new ResimSectirici();
        selectedFile = resimSectirici.sec(resimPaneli);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void aracEkle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracEkle_btnActionPerformed

       if(selectedFile == null){
           JOptionPane.showMessageDialog(this,"Resimsiz araba yüklenemez","Resim Hatası",JOptionPane.ERROR_MESSAGE);
           return;
      }
               
       try{
         
       Connection  con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
                                   
        Statement myStmt = con.createStatement();
        ResimYukleyici ryukleyici = new ResimYukleyici();
        ryukleyici.resimYukle(selectedFile);
          
        String str = "insert into arac (plaka,marka,seri,yil,renk,km,yakit,kiraucreti,durum,resimID)"
                + " values('" + arac_plaka.getText() +"',"
                + "'"+ arac_marka.getText()+ "'," 
                +"'"+ arac_seri.getText() +"',"
                +"'"+ arac_yill.getText() +"',"
                +"'"+ arac_renk.getText()+ "',"
                +"'"+ arac_km.getText()+ "',"
                +"'"+ yakitTuru_combox.getSelectedItem().toString() + "',"
                +"'"+ arac_kira_ucreti.getText()+ "',"                         
                +"'"+ "Musait" + "',"
                +"'"+ ryukleyici.getSycId() +"')";
       
        
        myStmt.executeUpdate(str); 
          
      
        myStmt.close();
        con.close();
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
                       
        
      
    }//GEN-LAST:event_aracEkle_btnActionPerformed

    private void yakitTuru_comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yakitTuru_comboxActionPerformed
       
      
    }//GEN-LAST:event_yakitTuru_comboxActionPerformed

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
            java.util.logging.Logger.getLogger(AracKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AracKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AracKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AracKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AracKayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aracEkle_btn;
    private javax.swing.JButton arac_iptal;
    private java.awt.TextField arac_kira_ucreti;
    private java.awt.TextField arac_km;
    private java.awt.TextField arac_marka;
    private java.awt.TextField arac_plaka;
    private java.awt.TextField arac_renk;
    private java.awt.TextField arac_seri;
    private java.awt.TextField arac_yill;
    private javax.swing.JButton jButton3;
    private java.awt.Label kiraucreti;
    private java.awt.Label km;
    private java.awt.Label marka;
    private java.awt.Label model;
    private java.awt.Label plaka;
    private java.awt.Label renk;
    private javax.swing.JLabel resimPaneli;
    private java.awt.Label seri;
    private javax.swing.JComboBox<String> yakitTuru_combox;
    private java.awt.Label yakt;
    // End of variables declaration//GEN-END:variables
}
