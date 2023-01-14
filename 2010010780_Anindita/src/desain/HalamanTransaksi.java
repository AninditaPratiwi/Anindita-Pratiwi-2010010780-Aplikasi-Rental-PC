package desain;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

public class HalamanTransaksi extends javax.swing.JInternalFrame {

    public HalamanTransaksi() {
        initComponents();
        tampil();
        penyewa();
        PC();
    }
    
    public final Connection conn = new koneksi().getKoneksi();
    Statement st;
    ResultSet rs;
    DefaultTableModel tabMode;
    
    public void tampil(){
        Object [] baris = {"NO", "ID Transaksi" , "ID Penyewa", "ID PC", "Tanggal Sewa","Durasi","Total Harga"};
        tabMode = new DefaultTableModel(null, baris);
        tblTransaksi.setModel(tabMode);
        try {
            String sql = "SELECT * FROM transaksi";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            int no = 0;
            while (rs.next()){
                no++;
                String id_transaksi = rs.getString("id_transaksi");
                String id_penyewa = rs.getString("id_penyewa");
                String id_pc = rs.getString("id_pc");
                String tgl = rs.getString("tanggal_sewa");
                String durasi = rs.getString("durasi");
                String total = rs.getString("total_harga");

                Object [] data = {no,id_transaksi, id_penyewa, id_pc, tgl, durasi, total};
                tabMode.addRow(data);
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
    
    public void penyewa(){
        try {
            String sql = "SELECT * FROM penyewa";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                cmbPenyewa.addItem(rs.getString("id_penyewa").toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void PC(){
        try {
            String sql = "SELECT * FROM pc";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                cmbPC.addItem(rs.getString("id_pc").toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void clear(){
        
        txtIDTransaksi.setText("");
        txtIDTransaksi.setEnabled(true);
        
        cmbPenyewa.setSelectedItem(null);
        txtNamaPenyewa.setText("");
        
        cmbPC.setSelectedItem(null);
        txtSpesifikasi.setText("");
        txtHarga.setText("");
        
        cmbTahun.setSelectedItem(null);
        cmbTanggal.setSelectedItem(null);
        cmbBulan.setSelectedItem(null);
        txtDurasi.setText("");
        txtTotalHarga.setText("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDTransaksi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNamaPenyewa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSpesifikasi = new javax.swing.JTextField();
        cmbPenyewa = new javax.swing.JComboBox<>();
        cmbPC = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbTanggal = new javax.swing.JComboBox<>();
        cmbBulan = new javax.swing.JComboBox<>();
        cmbTahun = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtDurasi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JTextField();
        bSimpan = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setText("ID TRANSAKSI");

        jLabel2.setText("ID Penyewa");

        jLabel3.setText("Nama Penyewa");

        txtNamaPenyewa.setEditable(false);

        jLabel4.setText("ID PC");

        jLabel5.setText("Spesifikasi");

        txtSpesifikasi.setEditable(false);

        cmbPenyewa.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbPenyewaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        cmbPC.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbPCPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel6.setText("Harga /jam");

        txtHarga.setEditable(false);

        jLabel7.setText("Tanggal");

        cmbTanggal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cmbTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        jLabel8.setText("Durasi");

        jButton1.setText("HITUNG");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Total Harga");

        txtTotalHarga.setEditable(false);

        bSimpan.setText("SIMPAN");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        bUbah.setText("UBAH");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        bHapus.setText("HAPUS");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bClear.setText("CLEAR");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPenyewa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDTransaksi)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSpesifikasi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbPC, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNamaPenyewa)
                            .addComponent(txtTotalHarga, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHarga, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDurasi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTahun, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(bSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bClear)
                                .addGap(16, 16, 16)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbPenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaPenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSpesifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSimpan)
                    .addComponent(bUbah)
                    .addComponent(bHapus)
                    .addComponent(bClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTransaksi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPenyewaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbPenyewaPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM penyewa WHERE id_penyewa = '"+cmbPenyewa.getSelectedItem()+"' ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()){
                txtNamaPenyewa.setText(rs.getString("nama"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_cmbPenyewaPopupMenuWillBecomeInvisible

    private void cmbPCPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbPCPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM pc WHERE id_pc = '"+cmbPC.getSelectedItem()+"' ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()){
                txtSpesifikasi.setText(rs.getString("spesifikasi"));
                txtHarga.setText(rs.getString("harga"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_cmbPCPopupMenuWillBecomeInvisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int harga_sewa = Integer.parseInt(txtHarga.getText());
        int durasi = Integer.parseInt(txtDurasi.getText());
        int total = harga_sewa * durasi;
        txtTotalHarga.setText(Integer.toString(total));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        // TODO add your handling code here:
        try {
            int simpan;
            
            String id_penyewa = cmbPenyewa.getSelectedItem().toString();
            String id_pc = cmbPC.getSelectedItem().toString();
            
            String tgl = cmbTanggal.getSelectedItem().toString();
            String bln = cmbBulan.getSelectedItem().toString();
            String thn = cmbTahun.getSelectedItem().toString();
            String masuk = thn+"-"+bln+"-"+tgl;
            
            String sql = "INSERT INTO transaksi VALUES ('"+txtIDTransaksi.getText()+"', '"+id_penyewa+"', '"+id_pc+"', '"+masuk+"' , '"+txtDurasi.getText()+"', '"+txtTotalHarga.getText()+"')";
            st = conn.createStatement();
            simpan = st.executeUpdate(sql);
            if (simpan == 1){
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                clear();
                tampil();
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_bSimpanActionPerformed

    private void tblTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTransaksiMouseClicked
        // TODO add your handling code here:
        try {
            int baris = tblTransaksi.getSelectedRow();
            txtIDTransaksi.setText(tblTransaksi.getValueAt(baris, 1).toString());
            cmbPenyewa.setSelectedItem(tblTransaksi.getValueAt(baris, 2).toString());
            cmbPC.setSelectedItem(tblTransaksi.getValueAt(baris, 3).toString());
            
            cmbTanggal.setSelectedItem(tblTransaksi.getValueAt(baris, 4).toString().substring(8, 10));
            cmbBulan.setSelectedItem(tblTransaksi.getValueAt(baris, 4).toString().substring(5, 7));
            cmbTahun.setSelectedItem(tblTransaksi.getValueAt(baris, 4).toString().substring(0, 4));
            
            txtDurasi.setText(tblTransaksi.getValueAt(baris, 5).toString());
            txtTotalHarga.setText(tblTransaksi.getValueAt(baris, 6).toString());
            
            txtIDTransaksi.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }//GEN-LAST:event_tblTransaksiMouseClicked

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        // TODO add your handling code here:
        try {
            int ubah;
            
            String id_penyewa = cmbPenyewa.getSelectedItem().toString();
            String id_pc = cmbPC.getSelectedItem().toString();
            
            String tgl = cmbTanggal.getSelectedItem().toString();
            String bln = cmbBulan.getSelectedItem().toString();
            String thn = cmbTahun.getSelectedItem().toString();
            String sewa = thn+"-"+bln+"-"+tgl;
            
            String sql = "UPDATE transaksi SET id_penyewa = '"+id_penyewa+"', id_pc = '"+id_pc+"', tanggal_sewa = '"+sewa+"' , durasi = '"+txtDurasi.getText()+"', total_harga = '"+txtTotalHarga.getText()+"' WHERE id_transaksi = '"+txtIDTransaksi.getText()+"' ";
            st = conn.createStatement();
            ubah = st.executeUpdate(sql);
            if (ubah == 1){
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
                clear();
                tampil();
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_bUbahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
        try {
            int hapus;
            
            String sql = "DELETE FROM transaksi WHERE id_transaksi = '"+txtIDTransaksi.getText()+"' ";
            st = conn.createStatement();
            hapus = st.executeUpdate(sql);
            if (hapus == 1){
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                clear();
                tampil();
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_bClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClear;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bSimpan;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cmbBulan;
    private javax.swing.JComboBox<String> cmbPC;
    private javax.swing.JComboBox<String> cmbPenyewa;
    private javax.swing.JComboBox<String> cmbTahun;
    private javax.swing.JComboBox<String> cmbTanggal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTransaksi;
    private javax.swing.JTextField txtDurasi;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIDTransaksi;
    private javax.swing.JTextField txtNamaPenyewa;
    private javax.swing.JTextField txtSpesifikasi;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
