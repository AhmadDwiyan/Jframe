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
public class kalku extends javax.swing.JFrame {

    /**
     * Creates new form kalku
     */
    public kalku() {
        initComponents();
    }
    String angka="";
double jumlah,angka1,angka2;
int au;


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        ang1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        tujuh = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        lima = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        titik = new javax.swing.JButton();
        tiga = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        persen = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        nol = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        pangkat = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        sama = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        del = new javax.swing.JButton();
        akar = new javax.swing.JButton();
        hasil = new javax.swing.JTextField();
        as = new javax.swing.JButton();

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton4.setText("3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIMPLE IT KALKULATOR !!!");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(null);

        ang1.setFont(new java.awt.Font("Continuum Bold", 0, 24)); // NOI18N
        ang1.setText("SIMPLE IT ! CALCULATOR");
        getContentPane().add(ang1);
        ang1.setBounds(90, 20, 260, 50);

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jDesktopPane1.setAutoscrolls(true);

        tujuh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tujuh.setText("7");
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });
        jDesktopPane1.add(tujuh);
        tujuh.setBounds(70, 180, 60, 40);

        delapan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        delapan.setText("8");
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });
        jDesktopPane1.add(delapan);
        delapan.setBounds(150, 180, 60, 40);

        sembilan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sembilan.setText("9");
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });
        jDesktopPane1.add(sembilan);
        sembilan.setBounds(230, 180, 60, 40);

        hapus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hapus.setText("<-");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jDesktopPane1.add(hapus);
        hapus.setBounds(310, 180, 60, 40);

        enam.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        enam.setText("6");
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });
        jDesktopPane1.add(enam);
        enam.setBounds(70, 230, 60, 40);

        lima.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lima.setText("5");
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(lima);
        lima.setBounds(150, 230, 60, 40);

        empat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        empat.setText("4");
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });
        jDesktopPane1.add(empat);
        empat.setBounds(230, 230, 60, 40);

        titik.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titik.setText(".");
        titik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titikActionPerformed(evt);
            }
        });
        jDesktopPane1.add(titik);
        titik.setBounds(310, 230, 60, 40);

        tiga.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tiga.setText("3");
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(tiga);
        tiga.setBounds(70, 280, 60, 40);

        dua.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dua.setText("2");
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(dua);
        dua.setBounds(150, 280, 60, 40);

        satu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        satu.setText("1");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });
        jDesktopPane1.add(satu);
        satu.setBounds(230, 280, 60, 40);

        persen.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        persen.setText("%");
        persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenActionPerformed(evt);
            }
        });
        jDesktopPane1.add(persen);
        persen.setBounds(310, 280, 60, 40);

        bagi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bagi.setText(":");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });
        jDesktopPane1.add(bagi);
        bagi.setBounds(70, 330, 60, 40);

        nol.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nol.setText("0");
        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });
        jDesktopPane1.add(nol);
        nol.setBounds(150, 330, 60, 40);

        kali.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kali.setText("X");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });
        jDesktopPane1.add(kali);
        kali.setBounds(230, 330, 60, 40);

        pangkat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pangkat.setText("1/x");
        pangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pangkatActionPerformed(evt);
            }
        });
        jDesktopPane1.add(pangkat);
        pangkat.setBounds(300, 430, 80, 40);

        tambah.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jDesktopPane1.add(tambah);
        tambah.setBounds(70, 380, 60, 40);

        sama.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sama.setText("=");
        sama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(sama);
        sama.setBounds(70, 430, 120, 40);

        kurang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });
        jDesktopPane1.add(kurang);
        kurang.setBounds(150, 380, 60, 40);

        jButton23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton23.setText("CE");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton23);
        jButton23.setBounds(230, 380, 60, 40);

        del.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        del.setText("C");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        jDesktopPane1.add(del);
        del.setBounds(310, 380, 60, 40);

        akar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        akar.setText("√");
        akar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(akar);
        akar.setBounds(310, 330, 60, 40);

        hasil.setEditable(false);
        hasil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });
        jDesktopPane1.add(hasil);
        hasil.setBounds(60, 90, 330, 60);

        as.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        as.setText("MOD");
        as.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asActionPerformed(evt);
            }
        });
        jDesktopPane1.add(as);
        as.setBounds(210, 430, 80, 40);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(-10, -10, 460, 530);

        getAccessibleContext().setAccessibleDescription("");

        setBounds(0, 0, 458, 562);
    }// </editor-fold>//GEN-END:initComponents

    private void samaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samaActionPerformed
 switch(au){
    case 1:
        
        angka2=Double.parseDouble(angka);
        jumlah=angka1+angka2;
        angka=Double.toString(jumlah);
        hasil.setText(angka);
        ang1.setText(angka);
        break;
        
    case 2:
        angka2=Double.parseDouble(angka);
        jumlah=angka1+angka2;
       angka=Double.toString(jumlah);
       hasil.setText(angka);
       ang1.setText(angka);
       break;
    case 3:
        angka2=Double.parseDouble(angka);
        jumlah=angka1*angka2;
        angka=Double.toString(jumlah);
        hasil.setText(angka);
        ang1.setText(angka);
        break;
    case 4:
        angka2=Double.parseDouble(angka);
        jumlah=angka1/angka2;
        angka=Double.toString(jumlah);
        hasil.setText(angka);
        ang1.setText(angka);
        break;
    case 5:
        angka1=Double.parseDouble(angka);
        angka=Double.toString(angka1/100);
        hasil.setText(angka);
        break;
    case 6:
        angka2=Double.parseDouble(angka);
        jumlah=Math.sqrt(angka2);
        angka=Double.toString(jumlah);
        hasil.setText(angka);
        ang1.setText(angka);
    case 7:
        angka2=Double.parseDouble(angka);
        jumlah= Math.pow(angka1,angka2);
        angka=Double.toString(jumlah);
        hasil.setText(angka);
        ang1.setText(angka);
        break;
    case 8:
        angka2=Double.parseDouble(angka);
        jumlah=angka1%angka2;
        angka=Double.toString(jumlah);
        hasil.setText(angka);
        ang1.setText(angka);
        break;
       
}
    // TODO add your handling code here:
    }//GEN-LAST:event_samaActionPerformed

    private void nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolActionPerformed
angka +="0";
hasil.setText(angka);// TODO add your handling code here:
    }//GEN-LAST:event_nolActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
angka +="7";
hasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_tujuhActionPerformed

    private void titikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titikActionPerformed
angka +=".";
hasil.setText(angka);// TODO add your handling code here:
    }//GEN-LAST:event_titikActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
hasil.setText(hasil.getText().substring(0, hasil.getText().length() - 1)); 
    }//GEN-LAST:event_hapusActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
angka +="1";
hasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_satuActionPerformed

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
angka +="2";
hasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_duaActionPerformed

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaActionPerformed
angka +="3";
hasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_tigaActionPerformed

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
angka +="4";
hasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_empatActionPerformed

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
angka +="5";
hasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_limaActionPerformed

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamActionPerformed
angka +="6";
hasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_enamActionPerformed

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanActionPerformed
angka +="8";
hasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_delapanActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
angka +="9";
hasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_sembilanActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
hasil.setText("");
angka1=0.0;
angka2=0.0;
jumlah=0.0;
angka="";
// TODO add your handling code here:
    }//GEN-LAST:event_delActionPerformed

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
angka1=Double.parseDouble(angka);
hasil.setText("+");
angka="";
ang1.setText(angka1+"+");
au=1;
// TODO add your handling code here:
    }//GEN-LAST:event_tambahActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed

        angka1=Double.parseDouble(angka); 
       
hasil.setText("-");
angka="";
 ang1.setText(angka1+"-");
au=2;        // TODO add your handling code here:
    }//GEN-LAST:event_kurangActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
angka1=Double.parseDouble(angka); 
hasil.setText("X");
angka="";
au=3;        // TODO add your handling code here:
    }//GEN-LAST:event_kaliActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
angka1=Double.parseDouble(angka); 
hasil.setText(":");
angka="";
ang1.setText(angka1+":");
au=4;        // TODO add your handling code here:
    }//GEN-LAST:event_bagiActionPerformed

    private void persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenActionPerformed
angka1=Double.parseDouble(angka);
        jumlah=angka1*1/100;
        angka=Double.toString(jumlah);
        hasil.setText(angka);
        ang1.setText(angka);// TODO add your handling code here:
    }//GEN-LAST:event_persenActionPerformed

    private void akarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akarActionPerformed
 angka1=Double.parseDouble(angka);
        jumlah=Math.sqrt(angka1);
        angka=Double.toString(jumlah);
        hasil.setText(angka);
        ang1.setText(angka);
// TODO add your handling code here:
    }//GEN-LAST:event_akarActionPerformed

    private void pangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pangkatActionPerformed
    angka1 +=Double.parseDouble(angka);
hasil.setText(angka);
angka="";
ang1.setText(angka1+"1/x");
au=7;   // TODO add your handling code here:
    }//GEN-LAST:event_pangkatActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
hasil.setText("0");
  // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void asActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asActionPerformed
  angka1=Double.parseDouble(angka);
hasil.setText("%");
angka="";
ang1.setText(angka1+"%");
au=8; // TODO add your handling code here:
    }//GEN-LAST:event_asActionPerformed

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
            java.util.logging.Logger.getLogger(kalku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akar;
    private javax.swing.JLabel ang1;
    private javax.swing.JButton as;
    private javax.swing.JButton bagi;
    private javax.swing.JButton del;
    private javax.swing.JButton delapan;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JButton lima;
    private javax.swing.JButton nol;
    private javax.swing.JButton pangkat;
    private javax.swing.JButton persen;
    private javax.swing.JButton sama;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tiga;
    private javax.swing.JButton titik;
    private javax.swing.JButton tujuh;
    // End of variables declaration//GEN-END:variables
}
