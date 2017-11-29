/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TebakAngkaWindow extends javax.swing.JFrame {
    
    int angkaSoal;
    /**
     * Creates new form TebakAngkaWindow
     */
    public TebakAngkaWindow() {
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        petunjuk = new javax.swing.JLabel();
        inputAngkaTextField = new javax.swing.JTextField();
        cekAngkaButton = new javax.swing.JButton();
        keterangan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\gambar.PNG")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("TEBAK");

        jButton1.setText("Mulai");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("ANGKA");

        petunjuk.setText("Klik Tombol Mulai");

        inputAngkaTextField.setEditable(false);

        cekAngkaButton.setText("Anda yakin ?");
        cekAngkaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekAngkaButtonActionPerformed(evt);
            }
        });

        keterangan.setText("Keterangan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputAngkaTextField)
                    .addComponent(petunjuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addComponent(jButton1)
                            .addComponent(cekAngkaButton)
                            .addComponent(keterangan))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(petunjuk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputAngkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cekAngkaButton)
                .addGap(18, 18, 18)
                .addComponent(keterangan)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        angkaSoal = generateAngka();
        petunjuk.setText("Masukkan Angka 1 - 100");
        inputAngkaTextField.setText(null);
        inputAngkaTextField.setEditable(true);
        inputAngkaTextField.setEnabled(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cekAngkaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekAngkaButtonActionPerformed
        // TODO add your handling code here:
        
        try {
            int jumlah = 0;
        String pesanBaru;
        String tebakan = inputAngkaTextField.getText();
        int tebakAngka = Integer.parseInt(tebakan);
        if (tebakAngka == angkaSoal) {
            
            petunjuk.setText("Anda Berhasil !!!");
//            pesanBaru = "Anda Sudah Mencoba Sebanyak = "+jumlah;
            inputAngkaTextField.setEditable(false);
            inputAngkaTextField.setEnabled(false);
//            keterangan.setText(pesanBaru);
        }else {
            jumlah++;
            String pesan;
            inputAngkaTextField.setText(null);
            if (tebakAngka < angkaSoal) {
                pesan = "Angka yang anda masukkan terlalu kecil";
            }else {
                pesan = "Angka yang anda masukkan terlalu besar";                
            }
            petunjuk.setText(pesan);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Masukkan ANGKA BROOOOO");
            
        }
        
        
        
    }//GEN-LAST:event_cekAngkaButtonActionPerformed

    private int generateAngka () {
        double random = Math.random() * 100;
        double ceilValue = Math.cbrt(random);
        int generateAngkaSoal = (int) random;
        return generateAngkaSoal;
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
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TebakAngkaWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cekAngkaButton;
    private javax.swing.JTextField inputAngkaTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel keterangan;
    private javax.swing.JLabel petunjuk;
    // End of variables declaration//GEN-END:variables
}
