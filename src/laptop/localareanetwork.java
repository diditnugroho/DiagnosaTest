/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptop;

/**
 *
 * @author Mochamad Riza Syarif
 */
public class localareanetwork extends javax.swing.JFrame {

    /**
     * Creates new form deteksimonitor1
     */
    public localareanetwork() {
        initComponents();
    }
    
    public static String jeniskerusakan ="";
    public static String penyebabkerusakan ="";
    public static String saranusul ="";
    public static String judul ="Local Area Network";

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
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("DETEKSI KERUSAKAN PADA LAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Apakah LAN Laptop Anda Mengalami :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setText("DETEKSI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 115, 40));

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton2.setText("KEMBALI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 115, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kabel LAN sudah dikoneksikan ke laptop tetapi status jaringan tidak tersambung. Begitupula jika dicoba dikoneksikan ke laptop lain, jaringan tetap tidak tersambung", "Kabel LAN sudah dikoneksikan ke laptop tetapi status jaringan tidak tersambung. Namun jika dicoba dikoneksikan ke laptop lain jaringan tersambung", "Jaringan tersambung namun indikator jaringan pada layar (biasanya pojok kanan bawah) terdapat tanda seru berwarna kuning", " ", " ", " ", " " }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 1110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/blue.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               judul ="Local Area Network";
      
if ( jComboBox1.getSelectedItem() == "Kabel LAN sudah dikoneksikan ke laptop tetapi status jaringan tidak tersambung. Begitupula jika dicoba dikoneksikan ke laptop lain, jaringan tetap tidak tersambung"){ jeniskerusakan ="Kabel+Konektor LAN (UTP/STP) atau Driver Card LAN"; penyebabkerusakan ="(1) Driver LAN rusak (error) atau belum diinstall\n(2) Konektor pada kabel LAN rusak\n(3) kabel LAN putus"; saranusul = "(1) Uninstall-Install Driver LAN\n(2) Ganti kabel UTP / STP + konektor RJ45"; }
if ( jComboBox1.getSelectedItem() == "Kabel LAN sudah dikoneksikan ke laptop tetapi status jaringan tidak tersambung. Namun jika dicoba dikoneksikan ke laptop lain jaringan tersambung"){ jeniskerusakan ="Modul Card LAN atau Driver Port Interface LAN"; penyebabkerusakan ="(1) Driver LAN laptop rusak (error) atau belum diinstall\n(2) konektor atau port interface LAN laptop rusak\n(3) module LAN Card laptop rusak"; saranusul = "(1) Uninstall-Install Driver LAN\n(2) Ganti modul LAN Card"; }
if ( jComboBox1.getSelectedItem() == "Jaringan tersambung namun indikator jaringan pada layar (biasanya pojok kanan bawah) terdapat tanda seru berwarna kuning"){ jeniskerusakan ="Proxy"; penyebabkerusakan ="Settingan proxy jaringan pada laptop belum sesuai atau belum disetting. Hal ini biasanya pada area perkantoran yang memiliki protokol jaringan tersendiri"; saranusul = "Pastikan settingan proxy jaringan sudah sesuai dengan proxy jaringan gedung / kantor"; }


        
        
        
        new kerusakanlan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new menuutama().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(localareanetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(localareanetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(localareanetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(localareanetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new localareanetwork().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
