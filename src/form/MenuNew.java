
package form;

import db.Parameter;
import db.ResultSetTableModel;
import db.db_connection;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class MenuNew extends javax.swing.JFrame {
    ResultSet rs;
    db_connection db;
    private byte[] gambar;
    
    private MenuNew(byte[] igmbr) {
        this.gambar = igmbr; //To change body of generated methods, choose Tools | Templates.
    }
    public byte[] getImg() {
        return gambar;
    }
     
    protected void paintComponent(Graphics g){
        Graphics2D graphics = (Graphics2D) g.create();
        Image img = new ImageIcon(getClass().getResource("/Image/background user new.png")).getImage();
        graphics.drawImage(img, 0, 0, getWidth(), getHeight(), null);
        graphics.dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGlass1 = new usu.widget.glass.PanelGlass();
        label7 = new usu.widget.Label();
        buttonGlass1 = new usu.widget.ButtonGlass();
        btn_edit = new usu.widget.ButtonGlass();
        bthapus = new usu.widget.ButtonGlass();
        panelGlass2 = new usu.widget.glass.PanelGlass();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_harga = new usu.widget.TextBox();
        txt_nama = new usu.widget.TextBox();
        txt_id = new usu.widget.TextBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_stok = new usu.widget.TextBox();
        cmb_jenis = new javax.swing.JComboBox();
        btn_pilih = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_menu = new javax.swing.JTable();
        btn_edit1 = new usu.widget.ButtonGlass();
        btn_edit2 = new usu.widget.ButtonGlass();
        jPanel1 = new javax.swing.JPanel();
        lbl_image = new javax.swing.JLabel();
        btn_edit3 = new usu.widget.ButtonGlass();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tambah Menu");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelGlass1.setAlpha(1.0F);
        panelGlass1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/background user new fix.png"))); // NOI18N
        panelGlass1.setMaximumSize(new java.awt.Dimension(950, 669));
        panelGlass1.setMinimumSize(new java.awt.Dimension(950, 669));
        panelGlass1.setPreferredSize(new java.awt.Dimension(950, 669));
        panelGlass1.setRound(false);

        label7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label7.setText("Tambah Menu");
        label7.setFont(new java.awt.Font("BN Dragon", 1, 24)); // NOI18N

        buttonGlass1.setText("Lihat Tabel Jenis");

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit2 - Copy.png"))); // NOI18N
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        bthapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/HAPUS2.png"))); // NOI18N
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Harga");

        txt_harga.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N
        txt_harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_hargaKeyTyped(evt);
            }
        });

        txt_nama.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N

        txt_id.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Stok");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Jenis");

        txt_stok.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N

        btn_pilih.setText("Pilih");
        btn_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pilihActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Gambar");

        javax.swing.GroupLayout panelGlass2Layout = new javax.swing.GroupLayout(panelGlass2);
        panelGlass2.setLayout(panelGlass2Layout);
        panelGlass2Layout.setHorizontalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_harga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pilih)
                    .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelGlass2Layout.setVerticalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass2Layout.createSequentialGroup()
                        .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(32, 32, 32))))
                    .addGroup(panelGlass2Layout.createSequentialGroup()
                        .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_pilih)
                            .addComponent(jLabel6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tb_menu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tb_menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama", "Harga", "Jumlah Barang", "Total", "Title 5"
            }
        ));
        tb_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_menuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_menu);

        btn_edit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh2.png"))); // NOI18N
        btn_edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit1ActionPerformed(evt);
            }
        });

        btn_edit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tambah-tambah menu.png"))); // NOI18N
        btn_edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbl_image.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_edit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/EXIT2.png"))); // NOI18N
        btn_edit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGlass1Layout.createSequentialGroup()
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edit3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelGlass2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addComponent(btn_edit2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bthapus, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(panelGlass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_edit2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bthapus, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_edit3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pilihActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {

            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lbl_image.setIcon(ResizeImage(path, null));

            imgPath = path;
        } else if (result == JFileChooser.APPROVE_OPTION) {
            System.out.println("No file selected");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pilihActionPerformed

    private void txt_hargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hargaKeyTyped
        char hrg = evt.getKeyChar();
        if(!(((hrg>='0')&& (hrg<='9') || (hrg == KeyEvent.VK_BACK_SPACE) || (hrg == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaKeyTyped

    private void tb_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_menuMouseClicked
        // TODO add your handling code here:
        txt_id.setText(String.valueOf(tb_menu.getValueAt(tb_menu.getSelectedRow(), 0)));
        txt_nama.setText(String.valueOf(tb_menu.getValueAt(tb_menu.getSelectedRow(), 1)));
        txt_harga.setText(String.valueOf(tb_menu.getValueAt(tb_menu.getSelectedRow(), 2)));
        txt_stok.setText(String.valueOf(tb_menu.getValueAt(tb_menu.getSelectedRow(), 3)));
        cmb_jenis.setSelectedItem(String.valueOf(tb_menu.getValueAt(tb_menu.getSelectedRow(), 4)));
        int index = tb_menu.getSelectedRow();
        ShowItem(index);
    }//GEN-LAST:event_tb_menuMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        String UpdateQuery = null;
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        if(imgPath ==null){
            try {
                UpdateQuery = "UPDATE menu SET  nama = ?, harga= ?"
                        + ", stok = ?, id_jenis = ? WHERE id_menu= ?";
                ps = con.prepareStatement(UpdateQuery);
                ps.setString(5, txt_id.getText());
            ps.setString(1, txt_nama.getText());
            ps.setString(2, txt_harga.getText());
            ps.setString(3, txt_stok.getText());
            
            ps.setString(4, cmb_jenis.getSelectedItem().toString());
            ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else{
            
        }
                
// TODO add your handling code here:
    }//GEN-LAST:event_btn_editActionPerformed

    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
        String id = String.valueOf(tb_menu.getValueAt(tb_menu.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "Are you sure want to delete this data", "Warning!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("menu", "id_menu=" + id);
        } else {
            return;
        }
        table();
        refresh();
//        
//        if(txt_id.getText().equals("")){
//            try {
//                Connection con = getConnection();
//                PreparedStatement ps = con.prepareStatement("DELETE FROM menu WHERE id = ?");
//                String id = txt_id.getText();
//                ps.setString(1, id);
//                ps.executeUpdate();
//                JOptionPane.showMessageDialog(null, "Menu terhapus");
//            } catch (SQLException ex) {
//                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
//                JOptionPane.showMessageDialog(null, "Hapus Menu Gagal");
//                
//            }   
            
//        } else {
//            JOptionPane.showMessageDialog(null, "Hapus Menu Gagal : Pilih menu yang akan dihapus");
//        }
// TODO add your handling code here:
    }//GEN-LAST:event_bthapusActionPerformed

    private void btn_edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit1ActionPerformed
        // TODO add your handling code here:
         refresh();
        table();
    }//GEN-LAST:event_btn_edit1ActionPerformed

    private void btn_edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit2ActionPerformed
         try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");

            PreparedStatement ps = con.prepareStatement("Insert INTO menu(id_menu,nama,harga,stok,id_jenis,gambar) VALUES(?,?,?,?,?,?)");
            InputStream img = new FileInputStream(new File(imgPath));
            ps.setString(1, txt_id.getText());
            ps.setString(2, txt_nama.getText());
            ps.setString(3, txt_harga.getText());
            ps.setString(4, txt_stok.getText());

            ps.setString(5, cmb_jenis.getSelectedItem().toString());
            ps.setBlob(6, img);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Success");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        refresh();
    }//GEN-LAST:event_btn_edit2ActionPerformed

    private void btn_edit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit3ActionPerformed
        // TODO add your handling code here:
        hide();
    }//GEN-LAST:event_btn_edit3ActionPerformed
public MenuNew() {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB, new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        table();
        jenismakanan();
    }
     

    public void table() {
        String namaKolom[] = {"id_menu", "nama", "harga", "stok", "id_jenis"};
        rs = db.querySelect(namaKolom, "menu");
        tb_menu.setModel(new ResultSetTableModel(rs));

    }
    public void jenismakanan() {

        try {
            String query = "SELECT * FROM jenis_makanan";
            Statement st = db.koneksiDatabase().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                cmb_jenis.addItem(rs.getString("id_jenis"));

            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
        } catch (SQLException e) {
        }
    }
    public ArrayList<MenuNew> getMenuList() {
        ArrayList<MenuNew> menuList = new ArrayList<MenuNew>();
        Connection con = getConnection();
        String query = "SELECT * FROM menu";
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            MenuNew pelanggan;

            while (rs.next()) {
                pelanggan = new MenuNew(rs.getBytes("gambar"));
                menuList.add(pelanggan);
            }
        } catch (Exception e) {
        }
        return menuList;
    }
     public void ShowItem(int index) {
        lbl_image.setIcon(ResizeImage(null, getMenuList().get(index).getImg()));
    }
    
    void refresh() {
        txt_id.setText("");
        txt_nama.setText("");
        txt_harga.setText("");
        txt_stok.setText("");
        cmb_jenis.setSelectedItem("Type");
    }
    String imgPath = null;

    public ImageIcon ResizeImage(String ImagePath, byte[] pic) {
        ImageIcon MyImage = null;
        if (ImagePath != null) {
            MyImage = new ImageIcon(ImagePath);
        } else {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");
            return con;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Not Success");
            return null;
        }
    }


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass bthapus;
    private usu.widget.ButtonGlass btn_edit;
    private usu.widget.ButtonGlass btn_edit1;
    private usu.widget.ButtonGlass btn_edit2;
    private usu.widget.ButtonGlass btn_edit3;
    private javax.swing.JButton btn_pilih;
    private usu.widget.ButtonGlass buttonGlass1;
    private javax.swing.JComboBox cmb_jenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private usu.widget.Label label7;
    private javax.swing.JLabel lbl_image;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelGlass2;
    private javax.swing.JTable tb_menu;
    private usu.widget.TextBox txt_harga;
    private usu.widget.TextBox txt_id;
    private usu.widget.TextBox txt_nama;
    private usu.widget.TextBox txt_stok;
    // End of variables declaration//GEN-END:variables

    
}
