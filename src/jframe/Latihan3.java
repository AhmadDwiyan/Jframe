/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

/**
 *
 * @author GL62
 */
public class Latihan3 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan3
     */
    public Latihan3() {
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

        kelamin = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tftinggi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfberat = new javax.swing.JTextField();
        rblaki = new javax.swing.JRadioButton();
        rbpr = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btnkeluar = new javax.swing.JButton();
        btnhitung = new javax.swing.JButton();
        btnulang = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfanalisa2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfhasilberat = new javax.swing.JTextField();
        tfanalisa1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("BigNoodleTitling", 0, 36)); // NOI18N
        jLabel1.setText("CEK KESEHATAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 160, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("KG");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 310, 30, 30);

        tftinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftinggiActionPerformed(evt);
            }
        });
        getContentPane().add(tftinggi);
        tftinggi.setBounds(170, 180, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("NAMA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 110, 40, 20);

        tfnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnamaActionPerformed(evt);
            }
        });
        getContentPane().add(tfnama);
        tfnama.setBounds(170, 100, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Berat Badan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 140, 70, 40);

        tfberat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfberatActionPerformed(evt);
            }
        });
        getContentPane().add(tfberat);
        tfberat.setBounds(170, 140, 170, 30);

        kelamin.add(rblaki);
        rblaki.setText("Laki Laki");
        getContentPane().add(rblaki);
        rblaki.setBounds(160, 220, 77, 25);

        kelamin.add(rbpr);
        rbpr.setText("Perempuan");
        rbpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbprActionPerformed(evt);
            }
        });
        getContentPane().add(rbpr);
        rbpr.setBounds(260, 220, 107, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tinggi Badan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 180, 80, 30);

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnkeluar);
        btnkeluar.setBounds(290, 260, 69, 25);

        btnhitung.setText("Hitung");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnhitung);
        btnhitung.setBounds(110, 260, 69, 25);

        btnulang.setText("Ulangi");
        btnulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnulangActionPerformed(evt);
            }
        });
        getContentPane().add(btnulang);
        btnulang.setBounds(200, 260, 67, 25);

        jLabel6.setText("Hasil Analisa Kesehatan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 350, 190, 16);

        tfanalisa2.setText("Saran?");
        tfanalisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfanalisa2ActionPerformed(evt);
            }
        });
        getContentPane().add(tfanalisa2);
        tfanalisa2.setBounds(60, 420, 310, 30);

        jLabel7.setText("Berat Badan Ideal Anda Adalah :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 310, 190, 16);
        getContentPane().add(tfhasilberat);
        tfhasilberat.setBounds(260, 310, 69, 22);

        tfanalisa1.setText("?");
        getContentPane().add(tfanalisa1);
        tfanalisa1.setBounds(60, 380, 310, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Jenis Kelamin");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 220, 80, 30);

        setBounds(0, 0, 486, 571);
    }// </editor-fold>//GEN-END:initComponents

    private void tftinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftinggiActionPerformed

    private void tfnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnamaActionPerformed

    private void tfberatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfberatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfberatActionPerformed

    private void tfanalisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfanalisa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfanalisa2ActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
double t,b,h= 0;
t= Double.valueOf(tftinggi.getText());
b= Double.valueOf(tfberat.getText());
String nm=tfnama.getText();
// pilihan Jenis Kelamin
if(rblaki.isSelected()){
    h= (t-100);
} 
else if (rbpr.isSelected()){
        h=(t-104);
    }
 String temp=Double.toString(h);
 //logikanya :V 
 if(h<b){
     tfhasilberat.setText(temp);
     tfanalisa1.setText(" Maaf "+nm+" Anda Kelebihan Berat Badan ");
     tfanalisa2.setText("Makan Dikurangi Dan terus Makan Yang Bergizi ");
 } else if (h>b){
     tfhasilberat.setText(temp);
     tfanalisa1.setText(" Maaf "+nm+" Anda Kekurangan Badan ");
     tfanalisa2.setText("Makan Dilebihkan Dan tetap makan Yang Bergizi ");
 } else {
       tfhasilberat.setText(temp);
     tfanalisa1.setText(" Atas Nama "+ nm + " Sudah Ideal ");
     tfanalisa2.setText("Tetap jaga Kesehatannya IStiqomah :)  ");
 }
    }//GEN-LAST:event_btnhitungActionPerformed

    private void btnulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnulangActionPerformed
tfnama.setText("");    
tfberat.setText("");
tftinggi.setText("");
tfanalisa1.setText("");
tfanalisa2.setText("");
tfhasilberat.setText("");

kelamin.clearSelection();// TODO add your handling code here:
    }//GEN-LAST:event_btnulangActionPerformed

    private void rbprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbprActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnulang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.ButtonGroup kelamin;
    private javax.swing.JRadioButton rblaki;
    private javax.swing.JRadioButton rbpr;
    private javax.swing.JTextField tfanalisa1;
    private javax.swing.JTextField tfanalisa2;
    private javax.swing.JTextField tfberat;
    private javax.swing.JTextField tfhasilberat;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tftinggi;
    // End of variables declaration//GEN-END:variables
}
