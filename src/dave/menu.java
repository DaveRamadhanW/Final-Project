/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dave;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class menu extends javax.swing.JFrame {
    
    private void kosongkan_form(){
        txtkode.setEditable(true);
        txtkode.setText(null);
        txtnama.setText(null);
        txtharga.setText(null);
        txtjumlah.setText(null);
     
        
    }
    
    private void tampilkan_data(){
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Kode");
        model.addColumn("Nama");
        model.addColumn("Harga");
        model.addColumn("Stok");
        
        
        try{
            int no = 1;
            String sql = "SELECT * FROM datapemesanan";
            java.sql.Connection conn = (Connection)koneksiDB.getkoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4)});
                
            }
            tabelMenu.setModel(model);
            
        }catch (SQLException e) {
            System.out.println("Eror : " + e.getMessage());
        }
    }
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        tampilkan_data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hapus = new javax.swing.JButton();
        txtnama = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelMenu = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Jumlah Barang");

        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });

        txtjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama Baju");

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        tabelMenu.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMenuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelMenu);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setText("INPUT SUPPLIER");

        jLabel4.setText("Harga Barang");

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Kode Baju");

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(496, Short.MAX_VALUE)
                .addComponent(jButton5))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel6)
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel5))
                            .addGap(80, 80, 80)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtkode)
                                .addComponent(txtnama)
                                .addComponent(txtharga)
                                .addComponent(txtjumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(56, 56, 56)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 442, Short.MAX_VALUE)
                .addComponent(jButton5))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(54, 54, 54)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(simpan)
                        .addComponent(Edit))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)
                        .addComponent(hapus))
                    .addGap(32, 32, 32)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeActionPerformed

    private void txtjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlahActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        try{
           String sql = "INSERT INTO datapemesanan (kode, nama, harga, stok) VALUES ('"+txtkode.getText()+"','"+txtnama.getText()+"','"+txtharga.getText()+"','"+txtjumlah.getText()+"');";
            
            java.sql.Connection conn = (Connection)koneksiDB.getkoneksi();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
             JOptionPane.showMessageDialog(null, "Proses Simpan Data Berhasil...");
             tampilkan_data();
             kosongkan_form();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_simpanActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE datapemesanan SET kode = '"+txtkode.getText()+"',nama='"+txtnama.getText()+"',harga='"+txtharga.getText()+"',stok='"+txtjumlah.getText()+"' WHERE kode =  '"+txtkode.getText()+"';";
            java.sql.Connection conn = (Connection)koneksiDB.getkoneksi();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            int row = pstm.executeUpdate();
            if(row==1){
                JOptionPane.showMessageDialog(null, "Edit Data Berhasil...");
            }
             
             tampilkan_data();
             kosongkan_form();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        tampilkan_data();
             kosongkan_form();
    }//GEN-LAST:event_EditActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new pembelian().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tabelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMenuMouseClicked
        // TODO add your handling code here:
        int baris = tabelMenu.rowAtPoint(evt.getPoint());
        String kode = tabelMenu.getValueAt(baris, 1).toString();
        txtkode.setText(kode);
        
        String nama = tabelMenu.getValueAt(baris, 2).toString();
        txtnama.setText(nama);
        

        
        String harga = tabelMenu.getValueAt(baris, 3).toString();
        txtharga.setText(harga);
        
        String jumlah = tabelMenu.getValueAt(baris, 4).toString();
        txtjumlah.setText(jumlah);
    }//GEN-LAST:event_tabelMenuMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
     try{
            String sql = "DELETE FROM datapemesanan WHERE kode =  '"+txtkode.getText()+"';";
            java.sql.Connection conn = (Connection)koneksiDB.getkoneksi();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            int row = pstm.executeUpdate();
            if(row==1){
                JOptionPane.showMessageDialog(null, "Hapus Data Berhasil...");
            }
             
             tampilkan_data();
             kosongkan_form();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        tampilkan_data();
             kosongkan_form();
        
    }//GEN-LAST:event_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabelMenu;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
