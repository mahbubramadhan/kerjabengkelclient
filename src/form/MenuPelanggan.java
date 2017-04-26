package form;

import db.Parameter;
import db.ResultSetTableModel;
import db.db_connection;
import static form.Transaction.tbl_chart;
import static form.Transaction.txt_invoice;

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

public class MenuPelanggan extends javax.swing.JFrame {

    ResultSet rs;
    db_connection db;
    private String id_menu;
    private byte[] gambar;

    public MenuPelanggan(byte[] igmbr) {
        this.gambar = igmbr;
    }

    public byte[] getImg() {
        return gambar;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g.create();
        Image img = new ImageIcon(getClass().getResource("/Image/background user new.png")).getImage();
        graphics.drawImage(img, 0, 0, getWidth(), getHeight(), null);
        graphics.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new usu.widget.Panel();
        panelGlass3 = new usu.widget.glass.PanelGlass();
        label4 = new usu.widget.Label();
        panelGlass2 = new usu.widget.glass.PanelGlass();
        label3 = new usu.widget.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_chart = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lbl_tot = new usu.widget.Label();
        jLabel8 = new javax.swing.JLabel();
        txt_bayar = new usu.widget.TextBox();
        jLabel9 = new javax.swing.JLabel();
        lbl_kembali = new javax.swing.JLabel();
        buttonGlass4 = new usu.widget.ButtonGlass();
        buttonGlass3 = new usu.widget.ButtonGlass();
        panelGlass4 = new usu.widget.glass.PanelGlass();
        label5 = new usu.widget.Label();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_menu = new javax.swing.JTable();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        label1 = new usu.widget.Label();
        txt_search = new javax.swing.JTextField();
        btn_search = new usu.widget.ButtonGlass();
        jLabel6 = new javax.swing.JLabel();
        txt_faktur = new usu.widget.TextBox();
        jLabel2 = new javax.swing.JLabel();
        txt_nama = new usu.widget.TextBox();
        jLabel3 = new javax.swing.JLabel();
        txt_harga = new usu.widget.TextBox();
        txt_jumlah = new usu.widget.TextBox();
        jLabel4 = new javax.swing.JLabel();
        lbl_subtot = new usu.widget.Label();
        jLabel5 = new javax.swing.JLabel();
        lbl_image = new usu.widget.Label();
        buttonGlass2 = new usu.widget.ButtonGlass();
        cmb_categories = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesan Menu");

        panel1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/background pelanggan e.png"))); // NOI18N
        panel1.setToolTipText("");

        panelGlass3.setBackground(new java.awt.Color(0, 102, 102));
        panelGlass3.setWarna(new java.awt.Color(0, 102, 102));

        label4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        label3.setText("CHART");
        label3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelGlass2Layout = new javax.swing.GroupLayout(panelGlass2);
        panelGlass2.setLayout(panelGlass2Layout);
        panelGlass2Layout.setHorizontalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass2Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311))
        );
        panelGlass2Layout.setVerticalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        tbl_chart.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        tbl_chart.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tbl_chart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nofaktur", "Nama", "Harga", "Jumlah", "Total"
            }
        ));
        tbl_chart.setAlignmentX(1.0F);
        tbl_chart.setAlignmentY(1.0F);
        tbl_chart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_chart.setFocusable(false);
        tbl_chart.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_chart.setOpaque(false);
        tbl_chart.setPreferredSize(new java.awt.Dimension(600, 64));
        tbl_chart.setSelectionBackground(new java.awt.Color(255, 153, 0));
        tbl_chart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_chartMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_chart);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Total");

        lbl_tot.setText("0");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Bayar");

        txt_bayar.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N
        txt_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bayarActionPerformed(evt);
            }
        });
        txt_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bayarKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Kembali");

        lbl_kembali.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_kembali.setText("0");

        buttonGlass4.setText("Batal");
        buttonGlass4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGlass4ActionPerformed(evt);
            }
        });

        buttonGlass3.setText("Print");

        javax.swing.GroupLayout panelGlass3Layout = new javax.swing.GroupLayout(panelGlass3);
        panelGlass3.setLayout(panelGlass3Layout);
        panelGlass3Layout.setHorizontalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass3Layout.createSequentialGroup()
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(panelGlass3Layout.createSequentialGroup()
                                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelGlass3Layout.createSequentialGroup()
                                        .addGap(519, 519, 519)
                                        .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonGlass4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelGlass3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelGlass3Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(buttonGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(55, 55, 55)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGlass3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(panelGlass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGlass3Layout.setVerticalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass3Layout.createSequentialGroup()
                .addComponent(panelGlass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addGroup(panelGlass3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbl_tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lbl_kembali))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonGlass4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        panelGlass4.setBackground(new java.awt.Color(0, 102, 102));
        panelGlass4.setWarna(new java.awt.Color(0, 102, 102));

        label5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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
                "id_menu", "Nama", "Harga", "stok", "jenis"
            }
        ));
        tb_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_menuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_menu);

        label1.setText("DAFTAR MENU");
        label1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_search.png"))); // NOI18N
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("No Faktur");

        txt_faktur.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nama");

        txt_nama.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Harga");

        txt_harga.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N
        txt_harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_hargaKeyTyped(evt);
            }
        });

        txt_jumlah.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N
        txt_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahActionPerformed(evt);
            }
        });
        txt_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_jumlahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_jumlahKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Jumlah");

        lbl_subtot.setText("0");
        lbl_subtot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Total");

        lbl_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(73, 135, 130)));

        buttonGlass2.setText("Add to Chart");
        buttonGlass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGlass2ActionPerformed(evt);
            }
        });

        cmb_categories.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id_menu", "nama", "harga", "stok", "jenis" }));
        cmb_categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_categoriesActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Search :");

        javax.swing.GroupLayout panelGlass4Layout = new javax.swing.GroupLayout(panelGlass4);
        panelGlass4.setLayout(panelGlass4Layout);
        panelGlass4Layout.setHorizontalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass4Layout.createSequentialGroup()
                        .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass4Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_faktur, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelGlass4Layout.createSequentialGroup()
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelGlass4Layout.createSequentialGroup()
                                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(24, 24, 24)
                                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass4Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_subtot, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelGlass4Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonGlass2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlass4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cmb_categories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelGlass4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        panelGlass4Layout.setVerticalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
            .addGroup(panelGlass4Layout.createSequentialGroup()
                .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGlass4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cmb_categories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_faktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(lbl_subtot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonGlass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 174, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelGlass4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGlass4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGlass4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGlass4ActionPerformed
        String faktur = txt_faktur.getText();
        if (JOptionPane.showConfirmDialog(this, "Are you sure to delete this data", "Warning", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("chart", "Nofaktur=" + faktur);
        } else {
            return;
        }
        tablechart();
        total();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGlass4ActionPerformed

    private void txt_bayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bayarKeyReleased
        kembalian();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bayarKeyReleased

    private void txt_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bayarActionPerformed

    private void buttonGlass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGlass2ActionPerformed
        if (txt_nama.getText().equals("") || txt_harga.getText().equals("") || txt_jumlah.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please input your data compleatly");
        } else if (txt_faktur.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukkan Nomor Faktur");
        } else {
            String[] kolom = {"Nofaktur", "Nama", "Harga", "Jumlah", "Total", "id_menu"};
            String[] isi = {txt_faktur.getText(), txt_nama.getText(), txt_harga.getText(), txt_jumlah.getText(), lbl_subtot.getText(),x };
            System.out.println(db.queryInsert("chart", kolom, isi));

        }
        tablechart();
        subtotal();
        refresh();

        total();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGlass2ActionPerformed

    private void txt_jumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlahKeyTyped

    private void txt_jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahKeyReleased
        subtotal();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlahKeyReleased

    private void txt_hargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hargaKeyTyped
        char hrg = evt.getKeyChar();
        if (!(((hrg >= '0') && (hrg <= '9') || (hrg == KeyEvent.VK_BACK_SPACE) || (hrg == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaKeyTyped

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
         if (txt_search.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please input your keyword");
        } else {
            if (cmb_categories.getSelectedItem().equals("id_menu")) {
                String namaKolom[] = {"id_menu", "nama", "harga", "stok", "id_jenis"};
                rs = db.fcSelectCommand(namaKolom, "menu", "id_menu LIKE '" + txt_search.getText() + "' ");
                tb_menu.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("nama")){
                String namaKolom[] = {"id_menu", "nama", "harga","stok", "id_jenis"};
                rs = db.fcSelectCommand(namaKolom, "menu", "nama LIKE '%" + txt_search.getText() + "%' ");
                tb_menu.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("harga")){
                String namaKolom[] = {"id_menu", "nama", "harga", "stok", "id_jenis"};
                rs = db.fcSelectCommand(namaKolom, "menu", "harga LIKE '%" + txt_search.getText() + "%' ");
                tb_menu.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("stok")) {
                String namaKolom[] = {"id_menu", "nama", "harga", "stok", "id_jenis"};
                rs = db.fcSelectCommand(namaKolom, "menu", "stok LIKE '%" + txt_search.getText() + "%' ");
                tb_menu.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("id_jenis")) {
                String namaKolom[] = {"id_menu", "nama", "harga", "stok", "id_jenis"};
                rs = db.fcSelectCommand(namaKolom, "menu", "jenis LIKE '" + txt_search.getText() + "' ");
                tb_menu.setModel(new ResultSetTableModel(rs));
             
            } 
        }
        
    }//GEN-LAST:event_btn_searchActionPerformed
String x;
    private void tb_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_menuMouseClicked
        // TODO add your handling code here:
        txt_nama.setText(String.valueOf(tb_menu.getValueAt(tb_menu.getSelectedRow(), 1)));
        txt_harga.setText(String.valueOf(tb_menu.getValueAt(tb_menu.getSelectedRow(), 2)));
        x= String.valueOf(tb_menu.getValueAt(tb_menu.getSelectedRow(), 0));
        int index = tb_menu.getSelectedRow();
        ShowItem(index);

    }//GEN-LAST:event_tb_menuMouseClicked

    private void tbl_chartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_chartMouseClicked

    }//GEN-LAST:event_tbl_chartMouseClicked

    private void txt_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlahActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void cmb_categoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_categoriesActionPerformed

    }//GEN-LAST:event_cmb_categoriesActionPerformed
    public MenuPelanggan() {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB, new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        table();

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

    public void table() {
        String namaKolom[] = {"id_menu", "nama", "harga", "stok", "id_jenis"};
        rs = db.fcSelectCommand(namaKolom, "menu", "id_menu");
        //rs = db.querySelect(namaKolom, "menu");
        tb_menu.setModel(new ResultSetTableModel(rs));

    }

    public void tablechart() {
      String namaKolom[] = { "id_menu","Nama", "Harga", "Jumlah","Total"};
        rs = db.fcSelectCommand(namaKolom, "chart", "Nofaktur='" + txt_faktur.getText() + "'");
        tbl_chart.setModel(new ResultSetTableModel(rs));
    }

    public void subtotal() {
        double a = Double.parseDouble(txt_harga.getText());
        double b = Double.parseDouble(txt_jumlah.getText());
        double c = a * b;
        lbl_subtot.setText(String.valueOf(c));
    }

    public void total() {
        rs = db.eksekusiQuery("SELECT SUM(Total) as Total FROM chart WHERE Nofaktur = '" + txt_faktur.getText() + "'");
        try {
            rs.next();
            lbl_tot.setText(rs.getString("Total"));
        } catch (SQLException ex) {
            Logger.getLogger(MenuPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void kembalian() {
        int a = Integer.parseInt(lbl_tot.getText());
        int b = Integer.parseInt(txt_bayar.getText());
        int c = b - a;
        lbl_kembali.setText(Integer.toString(c));
    }

    void refresh() {
        txt_nama.setText("");
        txt_harga.setText("");
        txt_jumlah.setText("");
        lbl_subtot.setText("");
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

    // display
    public ArrayList<MenuPelanggan> getMenuList() {
        ArrayList<MenuPelanggan> menuList = new ArrayList<MenuPelanggan>();
        Connection con = getConnection();
        String query = "SELECT * FROM menu";
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            MenuPelanggan pelanggan;

            while (rs.next()) {
                pelanggan = new MenuPelanggan(rs.getBytes("gambar"));
                menuList.add(pelanggan);
            }
        } catch (Exception e) {
        }
        return menuList;
    }

    public void ShowItem(int index) {
        lbl_image.setIcon(ResizeImage(null, getMenuList().get(index).getImg()));
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_search;
    private usu.widget.ButtonGlass buttonGlass2;
    private usu.widget.ButtonGlass buttonGlass3;
    private usu.widget.ButtonGlass buttonGlass4;
    private javax.swing.JComboBox cmb_categories;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private usu.widget.Label label1;
    private usu.widget.Label label3;
    private usu.widget.Label label4;
    private usu.widget.Label label5;
    private usu.widget.Label lbl_image;
    private javax.swing.JLabel lbl_kembali;
    private usu.widget.Label lbl_subtot;
    private usu.widget.Label lbl_tot;
    private usu.widget.Panel panel1;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelGlass2;
    private usu.widget.glass.PanelGlass panelGlass3;
    private usu.widget.glass.PanelGlass panelGlass4;
    private javax.swing.JTable tb_menu;
    private javax.swing.JTable tbl_chart;
    private usu.widget.TextBox txt_bayar;
    private usu.widget.TextBox txt_faktur;
    private usu.widget.TextBox txt_harga;
    private usu.widget.TextBox txt_jumlah;
    private usu.widget.TextBox txt_nama;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

}
