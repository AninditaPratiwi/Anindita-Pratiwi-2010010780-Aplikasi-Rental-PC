package desain;

import javax.swing.JOptionPane;

public class HalamanUtama extends javax.swing.JFrame {

    public HalamanUtama() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mnProfile = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnPC = new javax.swing.JMenuItem();
        mnPenyewa = new javax.swing.JMenuItem();
        mnTransaksi = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnKeluar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penyewaan PC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        jMenu3.setText("Profile");

        mnProfile.setText("About Me");
        mnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProfileActionPerformed(evt);
            }
        });
        jMenu3.add(mnProfile);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("File");

        mnPC.setText("Data PC");
        mnPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPCActionPerformed(evt);
            }
        });
        jMenu1.add(mnPC);

        mnPenyewa.setText("Data Penyewa");
        mnPenyewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPenyewaActionPerformed(evt);
            }
        });
        jMenu1.add(mnPenyewa);

        mnTransaksi.setText("Transaksi");
        mnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTransaksiActionPerformed(evt);
            }
        });
        jMenu1.add(mnTransaksi);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Keluar");

        mnKeluar.setText("Keluar");
        mnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKeluarActionPerformed(evt);
            }
        });
        jMenu2.add(mnKeluar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKeluarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Keluar Aplikasi");
        System.exit(0);
    }//GEN-LAST:event_mnKeluarActionPerformed

    private void mnPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPCActionPerformed
        // TODO add your handling code here:
        HalamanPC pc = new HalamanPC();
        jPanel1.add(pc);
        pc.setVisible(true);
    }//GEN-LAST:event_mnPCActionPerformed

    private void mnPenyewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPenyewaActionPerformed
        // TODO add your handling code here:
        HalamanPenyewa hp = new HalamanPenyewa();
        jPanel1.add(hp);
        hp.setVisible(true);
    }//GEN-LAST:event_mnPenyewaActionPerformed

    private void mnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTransaksiActionPerformed
        // TODO add your handling code here:
        HalamanTransaksi ht = new HalamanTransaksi();
        jPanel1.add(ht);
        ht.setVisible(true);
    }//GEN-LAST:event_mnTransaksiActionPerformed

    private void mnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProfileActionPerformed
        // TODO add your handling code here:
        HalamanProfile p = new HalamanProfile();
        jPanel1.add(p);
        p.setVisible(true);
    }//GEN-LAST:event_mnProfileActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnKeluar;
    private javax.swing.JMenuItem mnPC;
    private javax.swing.JMenuItem mnPenyewa;
    private javax.swing.JMenuItem mnProfile;
    private javax.swing.JMenuItem mnTransaksi;
    // End of variables declaration//GEN-END:variables
}
