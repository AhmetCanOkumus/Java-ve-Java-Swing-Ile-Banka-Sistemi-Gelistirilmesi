/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prolab3;

/**
 *
 * @author ahmet
 */
public class TemsilciFrame extends javax.swing.JFrame {

    
      Temsilci temsilciislem= new Temsilci();
    
    
    
    public TemsilciFrame() {
        initComponents();
        
    }

   
   

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        temsilciidalani = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        musteritcnoalani = new javax.swing.JTextField();
        onaylabuton = new javax.swing.JButton();
        musterikontrolyazisi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        guncellenecekadresalani = new javax.swing.JTextField();
        guncellenecektelefonalani = new javax.swing.JTextField();
        guncellenecekepostalani = new javax.swing.JTextField();
        guncelleneceksifrealani = new javax.swing.JTextField();
        adresguncellebuton = new javax.swing.JButton();
        telefonguncellebuton = new javax.swing.JButton();
        epostaguncellebuton = new javax.swing.JButton();
        sifreguncellebuton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Temsilci Id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("İşlem Yapmak İstediğiniz Müşterinin Tc No'sunu Giriniz: ");

        onaylabuton.setBackground(new java.awt.Color(255, 102, 102));
        onaylabuton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        onaylabuton.setText("Onayla");
        onaylabuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onaylabutonActionPerformed(evt);
            }
        });

        musterikontrolyazisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Adres");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Telefon");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("E Posta");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Şifre");

        adresguncellebuton.setBackground(new java.awt.Color(255, 51, 51));
        adresguncellebuton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adresguncellebuton.setText("Güncelle");
        adresguncellebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresguncellebutonActionPerformed(evt);
            }
        });

        telefonguncellebuton.setBackground(new java.awt.Color(255, 102, 102));
        telefonguncellebuton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telefonguncellebuton.setText("Güncelle");
        telefonguncellebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonguncellebutonActionPerformed(evt);
            }
        });

        epostaguncellebuton.setBackground(new java.awt.Color(255, 0, 0));
        epostaguncellebuton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        epostaguncellebuton.setText("Güncelle");
        epostaguncellebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epostaguncellebutonActionPerformed(evt);
            }
        });

        sifreguncellebuton.setBackground(new java.awt.Color(255, 51, 51));
        sifreguncellebuton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sifreguncellebuton.setText("Güncelle");
        sifreguncellebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreguncellebutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temsilciidalani, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(musteritcnoalani, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(onaylabuton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(musterikontrolyazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(guncellenecekadresalani)
                                    .addComponent(guncellenecektelefonalani)
                                    .addComponent(guncellenecekepostalani, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(guncelleneceksifrealani))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adresguncellebuton)
                                    .addComponent(telefonguncellebuton)
                                    .addComponent(epostaguncellebuton)
                                    .addComponent(sifreguncellebuton))))))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(temsilciidalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(musteritcnoalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onaylabuton))
                .addGap(15, 15, 15)
                .addComponent(musterikontrolyazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(guncellenecekadresalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresguncellebuton))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(guncellenecektelefonalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonguncellebuton))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(guncellenecekepostalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(epostaguncellebuton))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(guncelleneceksifrealani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreguncellebuton))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onaylabutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onaylabutonActionPerformed
        
        String musteritemsilciidd= temsilciidalani.getText();
        
        int musteritemsilciid= Integer.parseInt(musteritemsilciidd);
        
        String islemyapilacakmusteritc= musteritcnoalani.getText();
        
        boolean musterikontrol = temsilciislem.musterikontrol(musteritemsilciid, islemyapilacakmusteritc);
        
        if(musterikontrol){
            
            musterikontrolyazisi.setText("Kayıttaki Müşterinin Temsilcisi Olduğunuz İçin İşlem Yapabilirsiniz");
            
            
        }
        else{
            musterikontrolyazisi.setText("İlgili Müşterinin Temsilci Değilsiniz");
            
        }
                
        
        
   
        
        
    }//GEN-LAST:event_onaylabutonActionPerformed

    private void adresguncellebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresguncellebutonActionPerformed
        
        String musteritcno= musteritcnoalani.getText();
        
        String guncellenecekadres= guncellenecekadresalani.getText();
        
        temsilciislem.adresguncelle(musteritcno, guncellenecekadres);
       
    }//GEN-LAST:event_adresguncellebutonActionPerformed

    private void telefonguncellebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonguncellebutonActionPerformed
        
         String musteritcno= musteritcnoalani.getText();
         String guncellenecektelefon=guncellenecektelefonalani.getText();
         
         temsilciislem.telefonguncelle(musteritcno, guncellenecektelefon);
         
        
        
        
        
        
    }//GEN-LAST:event_telefonguncellebutonActionPerformed

    private void epostaguncellebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epostaguncellebutonActionPerformed
         String musteritcno= musteritcnoalani.getText();
         String guncellenecekeposta= guncellenecekepostalani.getText();
        
         temsilciislem.epostaguncelle(musteritcno, guncellenecekeposta);
        
        
    }//GEN-LAST:event_epostaguncellebutonActionPerformed

    private void sifreguncellebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreguncellebutonActionPerformed
        
         String musteritcno= musteritcnoalani.getText();
         String guncelleneceksifree=guncelleneceksifrealani.getText();
         
         int guncelleneceksifre=Integer.parseInt(guncelleneceksifree);
         
         temsilciislem.sifreguncelle(musteritcno, guncelleneceksifre);
         
        
        
        
    }//GEN-LAST:event_sifreguncellebutonActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TemsilciFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemsilciFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemsilciFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemsilciFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemsilciFrame().setVisible(true);
            }
        });
        
       
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adresguncellebuton;
    private javax.swing.JButton epostaguncellebuton;
    private javax.swing.JTextField guncellenecekadresalani;
    private javax.swing.JTextField guncellenecekepostalani;
    private javax.swing.JTextField guncelleneceksifrealani;
    private javax.swing.JTextField guncellenecektelefonalani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel musterikontrolyazisi;
    private javax.swing.JTextField musteritcnoalani;
    private javax.swing.JButton onaylabuton;
    private javax.swing.JButton sifreguncellebuton;
    private javax.swing.JButton telefonguncellebuton;
    private javax.swing.JTextField temsilciidalani;
    // End of variables declaration//GEN-END:variables
}
