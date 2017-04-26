
package form;
import db.Parameter;
import db.ResultSetTableModel;
import db.db_connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transaction extends javax.swing.JFrame {

    ResultSet rs;
    db_connection db;
    int old, dec, now;
    String newstock;

    @SuppressWarnings("static-access")
    public Transaction() {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB, new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        table();
        jam();
    }

    public void table() {
        String namaKolom[] = {"id_menu", "nama", "harga", "stok", "id_jenis","gambar"};
        rs = db.querySelect(namaKolom, "menu");
        tbl_result.setModel(new ResultSetTableModel(rs));
    }

    public void tampil_chart() {
        String namaKolom[] = { "id_menu","Nama", "Harga", "Jumlah","Total"};
        rs = db.fcSelectCommand(namaKolom, "chart", "Nofaktur='" + txt_invoice.getText() + "'");
        tbl_chart.setModel(new ResultSetTableModel(rs));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new usu.widget.Panel();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        panelGlass2 = new usu.widget.glass.PanelGlass();
        txt_search = new usu.widget.TextBox();
        btn_search = new usu.widget.ButtonGlass();
        label1 = new usu.widget.Label();
        txt_idmenu = new usu.widget.TextBox();
        label2 = new usu.widget.Label();
        label3 = new usu.widget.Label();
        txt_nama = new usu.widget.TextBox();
        label4 = new usu.widget.Label();
        label5 = new usu.widget.Label();
        txt_harga = new usu.widget.TextBox();
        txt_stok = new usu.widget.TextBox();
        label7 = new usu.widget.Label();
        txt_jenis = new usu.widget.TextBox();
        label9 = new usu.widget.Label();
        txt_amount = new usu.widget.TextBox();
        panelGlass4 = new usu.widget.glass.PanelGlass();
        label10 = new usu.widget.Label();
        lbl_subtotal = new usu.widget.Label();
        label12 = new usu.widget.Label();
        btn_chart = new usu.widget.ButtonGlass();
        btn_cancel = new usu.widget.ButtonGlass();
        cmb_categories = new javax.swing.JComboBox();
        panelGlass3 = new usu.widget.glass.PanelGlass();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_result = new javax.swing.JTable();
        panelGlass7 = new usu.widget.glass.PanelGlass();
        label13 = new usu.widget.Label();
        panelGlass6 = new usu.widget.glass.PanelGlass();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_chart = new javax.swing.JTable();
        panelGlass10 = new usu.widget.glass.PanelGlass();
        lbl_total = new usu.widget.Label();
        panelGlass12 = new usu.widget.glass.PanelGlass();
        panelGlass13 = new usu.widget.glass.PanelGlass();
        txt_invoice = new usu.widget.TextBox();
        label15 = new usu.widget.Label();
        txt_cash = new usu.widget.TextBox();
        panelGlass14 = new usu.widget.glass.PanelGlass();
        panelGlass15 = new usu.widget.glass.PanelGlass();
        panelGlass16 = new usu.widget.glass.PanelGlass();
        panelGlass17 = new usu.widget.glass.PanelGlass();
        panelGlass18 = new usu.widget.glass.PanelGlass();
        txt_payback = new usu.widget.TextBox();
        txt_deinvoice = new usu.widget.ButtonGlass();
        btn_print = new usu.widget.ButtonGlass();
        btn_delete = new usu.widget.ButtonGlass();
        btn_delete1 = new usu.widget.ButtonGlass();
        label14 = new usu.widget.Label();
        lbl_time = new usu.widget.Label();
        lbl_date = new usu.widget.Label();
        btn_logout = new usu.widget.ButtonGlass();
        btn_refresh = new usu.widget.ButtonGlass();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cashier Restaurant Jogja Damai\n");
        setFocusable(false);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/background kasir fix client.png"))); // NOI18N
        panel1.setMaximumSize(new java.awt.Dimension(950, 699));
        panel1.setPreferredSize(new java.awt.Dimension(940, 669));

        panelGlass1.setBackground(new java.awt.Color(0, 0, 0));
        panelGlass1.setRound(false);
        panelGlass1.setWarna(new java.awt.Color(0, 0, 0));

        panelGlass2.setBackground(new java.awt.Color(0, 102, 204));
        panelGlass2.setRound(false);
        panelGlass2.setWarna(new java.awt.Color(0, 102, 102));

        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_search.png"))); // NOI18N
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Search Categories:");
        label1.setFont(new java.awt.Font("Ubahn", 1, 14)); // NOI18N

        txt_idmenu.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N
        txt_idmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idmenuActionPerformed(evt);
            }
        });

        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("id_menu");
        label2.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N

        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("nama");
        label3.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N

        txt_nama.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N

        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("stok");
        label4.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N

        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("harga");
        label5.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N

        txt_harga.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });

        txt_stok.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N

        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("jenis");
        label7.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N

        txt_jenis.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N
        txt_jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jenisActionPerformed(evt);
            }
        });

        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("Amount");
        label9.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N

        txt_amount.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N
        txt_amount.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_amountInputMethodTextChanged(evt);
            }
        });
        txt_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_amountKeyReleased(evt);
            }
        });

        panelGlass4.setRound(false);
        panelGlass4.setWarna(new java.awt.Color(255, 255, 0));

        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setText("Rp.");
        label10.setFont(new java.awt.Font("Ubahn", 1, 18)); // NOI18N

        lbl_subtotal.setForeground(new java.awt.Color(255, 255, 255));
        lbl_subtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_subtotal.setText("0");
        lbl_subtotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setText(",-");
        label12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout panelGlass4Layout = new javax.swing.GroupLayout(panelGlass4);
        panelGlass4.setLayout(panelGlass4Layout);
        panelGlass4Layout.setHorizontalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lbl_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelGlass4Layout.setVerticalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btn_chart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buy2.png"))); // NOI18N
        btn_chart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chartActionPerformed(evt);
            }
        });

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancel3.png"))); // NOI18N

        cmb_categories.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id_menu", "nama", "harga", "stok", "jenis" }));
        cmb_categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_categoriesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass2Layout = new javax.swing.GroupLayout(panelGlass2);
        panelGlass2.setLayout(panelGlass2Layout);
        panelGlass2Layout.setHorizontalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_idmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(panelGlass2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(panelGlass2Layout.createSequentialGroup()
                        .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelGlass4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelGlass2Layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(btn_chart, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_categories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelGlass2Layout.setVerticalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass2Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(cmb_categories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass2Layout.createSequentialGroup()
                        .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_jenis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(panelGlass4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass2Layout.createSequentialGroup()
                        .addComponent(btn_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(302, 302, 302))
                    .addGroup(panelGlass2Layout.createSequentialGroup()
                        .addComponent(btn_chart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        panelGlass3.setRound(false);
        panelGlass3.setWarna(new java.awt.Color(0, 153, 102));

        tbl_result.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id_menu", "nama", "harga", "stok", "jenis", "gambar"
            }
        ));
        tbl_result.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_result.setSelectionBackground(new java.awt.Color(0, 153, 51));
        tbl_result.setSelectionForeground(new java.awt.Color(204, 204, 204));
        tbl_result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_resultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_result);

        panelGlass7.setBackground(new java.awt.Color(0, 102, 102));
        panelGlass7.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/table_header_green.png"))); // NOI18N
        panelGlass7.setPreferredSize(new java.awt.Dimension(890, 36));
        panelGlass7.setWarna(new java.awt.Color(0, 153, 102));

        label13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        label13.setForeground(new java.awt.Color(255, 255, 255));
        label13.setText("Result");
        label13.setFont(new java.awt.Font("Ubahn", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelGlass7Layout = new javax.swing.GroupLayout(panelGlass7);
        panelGlass7.setLayout(panelGlass7Layout);
        panelGlass7Layout.setHorizontalGroup(
            panelGlass7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass7Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        panelGlass7Layout.setVerticalGroup(
            panelGlass7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass7Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGlass6.setRound(false);
        panelGlass6.setWarna(new java.awt.Color(0, 102, 102));

        tbl_chart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id_menu", "nama", "harga", "stok", "Subtotal"
            }
        ));
        jScrollPane2.setViewportView(tbl_chart);

        panelGlass10.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/total panjang new.png"))); // NOI18N
        panelGlass10.setRound(false);

        lbl_total.setForeground(new java.awt.Color(255, 255, 255));
        lbl_total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_total.setText("0");
        lbl_total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout panelGlass10Layout = new javax.swing.GroupLayout(panelGlass10);
        panelGlass10.setLayout(panelGlass10Layout);
        panelGlass10Layout.setHorizontalGroup(
            panelGlass10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass10Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelGlass10Layout.setVerticalGroup(
            panelGlass10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelGlass12.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/cash.png"))); // NOI18N
        panelGlass12.setPreferredSize(new java.awt.Dimension(60, 24));
        panelGlass12.setRound(false);

        javax.swing.GroupLayout panelGlass12Layout = new javax.swing.GroupLayout(panelGlass12);
        panelGlass12.setLayout(panelGlass12Layout);
        panelGlass12Layout.setHorizontalGroup(
            panelGlass12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        panelGlass12Layout.setVerticalGroup(
            panelGlass12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        panelGlass13.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/total.png"))); // NOI18N
        panelGlass13.setForeground(new java.awt.Color(0, 51, 51));
        panelGlass13.setRound(false);

        javax.swing.GroupLayout panelGlass13Layout = new javax.swing.GroupLayout(panelGlass13);
        panelGlass13.setLayout(panelGlass13Layout);
        panelGlass13Layout.setHorizontalGroup(
            panelGlass13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        panelGlass13Layout.setVerticalGroup(
            panelGlass13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        txt_invoice.setFont(new java.awt.Font("Ubahn", 0, 14)); // NOI18N
        txt_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_invoiceActionPerformed(evt);
            }
        });

        label15.setForeground(new java.awt.Color(255, 255, 255));
        label15.setText("Invoice Number :");
        label15.setFont(new java.awt.Font("Ubahn", 0, 14)); // NOI18N

        txt_cash.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_cash.setFont(new java.awt.Font("Ubahn", 0, 18)); // NOI18N
        txt_cash.setPreferredSize(new java.awt.Dimension(6, 24));
        txt_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cashActionPerformed(evt);
            }
        });
        txt_cash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cashKeyReleased(evt);
            }
        });

        panelGlass14.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/cash3.png"))); // NOI18N
        panelGlass14.setRound(false);

        javax.swing.GroupLayout panelGlass14Layout = new javax.swing.GroupLayout(panelGlass14);
        panelGlass14.setLayout(panelGlass14Layout);
        panelGlass14Layout.setHorizontalGroup(
            panelGlass14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGlass14Layout.setVerticalGroup(
            panelGlass14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelGlass15.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/cash2.png"))); // NOI18N
        panelGlass15.setRound(false);

        javax.swing.GroupLayout panelGlass15Layout = new javax.swing.GroupLayout(panelGlass15);
        panelGlass15.setLayout(panelGlass15Layout);
        panelGlass15Layout.setHorizontalGroup(
            panelGlass15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        panelGlass15Layout.setVerticalGroup(
            panelGlass15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelGlass16.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/payback (3).png"))); // NOI18N
        panelGlass16.setPreferredSize(new java.awt.Dimension(21, 24));
        panelGlass16.setRound(false);

        javax.swing.GroupLayout panelGlass16Layout = new javax.swing.GroupLayout(panelGlass16);
        panelGlass16.setLayout(panelGlass16Layout);
        panelGlass16Layout.setHorizontalGroup(
            panelGlass16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        panelGlass16Layout.setVerticalGroup(
            panelGlass16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelGlass17.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/payback (2).png"))); // NOI18N
        panelGlass17.setPreferredSize(new java.awt.Dimension(30, 24));
        panelGlass17.setRound(false);

        javax.swing.GroupLayout panelGlass17Layout = new javax.swing.GroupLayout(panelGlass17);
        panelGlass17.setLayout(panelGlass17Layout);
        panelGlass17Layout.setHorizontalGroup(
            panelGlass17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGlass17Layout.setVerticalGroup(
            panelGlass17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelGlass18.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/payback (1).png"))); // NOI18N
        panelGlass18.setRound(false);

        javax.swing.GroupLayout panelGlass18Layout = new javax.swing.GroupLayout(panelGlass18);
        panelGlass18.setLayout(panelGlass18Layout);
        panelGlass18Layout.setHorizontalGroup(
            panelGlass18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        panelGlass18Layout.setVerticalGroup(
            panelGlass18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txt_payback.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_payback.setFont(new java.awt.Font("Ubahn", 0, 18)); // NOI18N
        txt_payback.setPreferredSize(new java.awt.Dimension(6, 24));
        txt_payback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paybackActionPerformed(evt);
            }
        });

        txt_deinvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_cancel.png"))); // NOI18N
        txt_deinvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_deinvoiceActionPerformed(evt);
            }
        });

        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PRINT.png"))); // NOI18N
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_cancel_small.png"))); // NOI18N
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_delete1.setBackground(new java.awt.Color(255, 255, 255));
        btn_delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_search_small.png"))); // NOI18N
        btn_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete1ActionPerformed(evt);
            }
        });

        label14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        label14.setForeground(new java.awt.Color(255, 255, 255));
        label14.setText("Chart");
        label14.setFont(new java.awt.Font("Ubahn", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelGlass6Layout = new javax.swing.GroupLayout(panelGlass6);
        panelGlass6.setLayout(panelGlass6Layout);
        panelGlass6Layout.setHorizontalGroup(
            panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(panelGlass6Layout.createSequentialGroup()
                .addGroup(panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass6Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGlass6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelGlass6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass6Layout.createSequentialGroup()
                        .addComponent(panelGlass13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelGlass10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelGlass6Layout.createSequentialGroup()
                        .addGroup(panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelGlass6Layout.createSequentialGroup()
                                .addComponent(panelGlass12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelGlass15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelGlass6Layout.createSequentialGroup()
                                .addComponent(panelGlass18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelGlass17, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                        .addGap(9, 9, 9)
                        .addGroup(panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_cash, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txt_payback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelGlass16, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(panelGlass14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_deinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        panelGlass6Layout.setVerticalGroup(
            panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlass6Layout.createSequentialGroup()
                        .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelGlass10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelGlass13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_deinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlass6Layout.createSequentialGroup()
                        .addGroup(panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panelGlass14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelGlass12, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addComponent(panelGlass15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(15, 15, 15)
                        .addGroup(panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_payback, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(panelGlass16, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(panelGlass17, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(panelGlass18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        javax.swing.GroupLayout panelGlass3Layout = new javax.swing.GroupLayout(panelGlass3);
        panelGlass3.setLayout(panelGlass3Layout);
        panelGlass3Layout.setHorizontalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(panelGlass7, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelGlass3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelGlass6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelGlass3Layout.setVerticalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelGlass7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGlass6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelGlass2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(898, 898, 898))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(panelGlass2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(panelGlass3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(279, 279, 279))))
        );

        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_time.setFont(new java.awt.Font("GeosansLight", 0, 72)); // NOI18N

        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_date.setFont(new java.awt.Font("GeosansLight", 0, 18)); // NOI18N

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_logout.png"))); // NOI18N
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_refresh_small.png"))); // NOI18N
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, 952, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        if (txt_search.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please input your keyword");
        } else {
            if (cmb_categories.getSelectedItem().equals("id_menu")) {
                String namaKolom[] = {"id_menu", "nama", "harga", "stok", "id_jenis"};
                rs = db.fcSelectCommand(namaKolom, "menu", "id_menu LIKE '" + txt_search.getText() + "' ");
                tbl_result.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("nama")){
                String namaKolom[] = {"id_menu", "nama", "harga","stok", "id_jenis"};
                rs = db.fcSelectCommand(namaKolom, "menu", "nama LIKE '%" + txt_search.getText() + "%' ");
                tbl_result.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("harga")){
                String namaKolom[] = {"id_menu", "nama", "harga", "stok", "id_jenis"};
                rs = db.fcSelectCommand(namaKolom, "menu", "harga LIKE '%" + txt_search.getText() + "%' ");
                tbl_result.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("stok")) {
                String namaKolom[] = {"id_menu", "nama", "harga", "stok", "id_jenis"};
                rs = db.fcSelectCommand(namaKolom, "menu", "stok LIKE '%" + txt_search.getText() + "%' ");
                tbl_result.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("id_jenis")) {
                String namaKolom[] = {"id_menu", "nama", "harga", "stok", "id_jenis"};
                rs = db.fcSelectCommand(namaKolom, "menu", "jenis LIKE '" + txt_search.getText() + "' ");
                tbl_result.setModel(new ResultSetTableModel(rs));
             
            } 
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void txt_jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jenisActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void tbl_resultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_resultMouseClicked
        txt_idmenu.setText(String.valueOf(tbl_result.getValueAt(tbl_result.getSelectedRow(), 0)));
        txt_nama.setText(String.valueOf(tbl_result.getValueAt(tbl_result.getSelectedRow(), 1)));
        txt_harga.setText(String.valueOf(tbl_result.getValueAt(tbl_result.getSelectedRow(), 2)));
        txt_stok.setText(String.valueOf(tbl_result.getValueAt(tbl_result.getSelectedRow(), 3)));
        txt_jenis.setText(String.valueOf(tbl_result.getValueAt(tbl_result.getSelectedRow(), 4)));
       
       // cost();
    }//GEN-LAST:event_tbl_resultMouseClicked

    private void txt_amountInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_amountInputMethodTextChanged
    }//GEN-LAST:event_txt_amountInputMethodTextChanged

    private void btn_chartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chartActionPerformed
        if (txt_idmenu.getText().equals("") || txt_nama.getText().equals("") ||  txt_harga.getText().equals("")   || txt_stok.getText().equals("")
                  || txt_amount.getText().equals("") ) {
            JOptionPane.showMessageDialog(this, "Please input your data compleatly");
        } else if (txt_invoice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please input the Invoice Number");
        } else {
            String[] kolom = {"Nofaktur", "id_menu", "nama", "harga", "Jumlah","Total"};
            String[] isi = {txt_invoice.getText(), txt_idmenu.getText(), txt_nama.getText(), txt_harga.getText() , txt_amount.getText(), lbl_subtotal.getText()};
            System.out.println(db.queryInsert("chart", kolom, isi));
            try {
                if (!check_stock()) {
                    JOptionPane.showMessageDialog(this, "Stock is Limited");
                } else {
                    kurang();
                    table();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
            }
            subtotal();
            tampil_chart();
            total();
        }


    }//GEN-LAST:event_btn_chartActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        Nota n = new Nota();
        n.setVisible(true);
        payback();
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String id = String.valueOf(tbl_chart.getValueAt(tbl_chart.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "Are you sure to delete this data", "Warning", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("chart", "id_menu=" + id);
        } else {
            return;
        }
        tampil_chart();
        total();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void txt_deinvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_deinvoiceActionPerformed
        String invoice = txt_invoice.getText();
        if (JOptionPane.showConfirmDialog(this, "Are you sure to delete this data", "Warning", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("chart", "Nofaktur=" + invoice);
        } else {
            return;
        }
        tampil_chart();
        total();
    }//GEN-LAST:event_txt_deinvoiceActionPerformed

    private void btn_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
        tampil_chart();
        total();
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
}//GEN-LAST:event_btn_logoutActionPerformed

    private void txt_amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_amountKeyReleased
        subtotal();
    }//GEN-LAST:event_txt_amountKeyReleased

    private void txt_cashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cashKeyReleased
        payback();
    }//GEN-LAST:event_txt_cashKeyReleased

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        table();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void txt_idmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idmenuActionPerformed

    private void txt_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_invoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_invoiceActionPerformed

    private void txt_paybackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paybackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_paybackActionPerformed

    private void txt_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cashActionPerformed

    private void cmb_categoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_categoriesActionPerformed
        
    }//GEN-LAST:event_cmb_categoriesActionPerformed

   

    public void subtotal() {
       double a = Double.parseDouble(txt_harga.getText());
        double b = Double.parseDouble(txt_amount.getText());
       double c = a * b;
        lbl_subtotal.setText(String.valueOf(c));
    }

    public void total() {
        rs = db.eksekusiQuery("SELECT SUM(Total) as total FROM chart WHERE Nofaktur = '" + txt_invoice.getText() + "'");
        try {
            rs.next();
            lbl_total.setText(rs.getString("total")); 
        } catch (SQLException ex) {
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean check_stock() throws SQLException {
        boolean checkstock;
        rs = db.querySelectAll("menu", "id_menu='" + txt_idmenu.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("stok");
        }
        dec = Integer.parseInt(txt_amount.getText());
        if (old < dec) {
            checkstock = false;
        } else {
            checkstock = true;
        }
        return checkstock;
    }

    public void kurang() throws SQLException {
        rs = db.querySelectAll("menu", "id_menu='" + txt_idmenu.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("stok");
        }
        dec = Integer.parseInt(txt_amount.getText());
        now = old - dec;
        newstock = Integer.toString(now);

        String a = String.valueOf(newstock);
        String[] kolom = {"stok"};
        String[] isi = {a};
        System.out.println(db.queryUpdate("menu", kolom, isi, "id_menu='" + txt_idmenu.getText() + "'"));
    }

    public void payback() {
        int a = Integer.parseInt(lbl_total.getText());
        int b = Integer.parseInt(txt_cash.getText());
        int c = b - a;
        txt_payback.setText(Integer.toString(c));
    }

    public void jam() {
        Date skrg = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("EEEE-dd-MMM-yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("HH:mm");
        lbl_time.setText(jam.format(skrg));
        lbl_date.setText(tgl.format(skrg));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Transaction().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static usu.widget.ButtonGlass btn_cancel;
    public static usu.widget.ButtonGlass btn_chart;
    public static usu.widget.ButtonGlass btn_delete;
    public static usu.widget.ButtonGlass btn_delete1;
    public static usu.widget.ButtonGlass btn_logout;
    public static usu.widget.ButtonGlass btn_print;
    public static usu.widget.ButtonGlass btn_refresh;
    public static usu.widget.ButtonGlass btn_search;
    public static javax.swing.JComboBox cmb_categories;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static usu.widget.Label label1;
    public static usu.widget.Label label10;
    public static usu.widget.Label label12;
    public static usu.widget.Label label13;
    public static usu.widget.Label label14;
    public static usu.widget.Label label15;
    public static usu.widget.Label label2;
    public static usu.widget.Label label3;
    public static usu.widget.Label label4;
    public static usu.widget.Label label5;
    public static usu.widget.Label label7;
    public static usu.widget.Label label9;
    public static usu.widget.Label lbl_date;
    public static usu.widget.Label lbl_subtotal;
    public static usu.widget.Label lbl_time;
    public static usu.widget.Label lbl_total;
    public static usu.widget.Panel panel1;
    public static usu.widget.glass.PanelGlass panelGlass1;
    public static usu.widget.glass.PanelGlass panelGlass10;
    public static usu.widget.glass.PanelGlass panelGlass12;
    public static usu.widget.glass.PanelGlass panelGlass13;
    public static usu.widget.glass.PanelGlass panelGlass14;
    public static usu.widget.glass.PanelGlass panelGlass15;
    public static usu.widget.glass.PanelGlass panelGlass16;
    public static usu.widget.glass.PanelGlass panelGlass17;
    public static usu.widget.glass.PanelGlass panelGlass18;
    public static usu.widget.glass.PanelGlass panelGlass2;
    public static usu.widget.glass.PanelGlass panelGlass3;
    public static usu.widget.glass.PanelGlass panelGlass4;
    public static usu.widget.glass.PanelGlass panelGlass6;
    public static usu.widget.glass.PanelGlass panelGlass7;
    public static javax.swing.JTable tbl_chart;
    public static javax.swing.JTable tbl_result;
    public static usu.widget.TextBox txt_amount;
    public static usu.widget.TextBox txt_cash;
    public static usu.widget.ButtonGlass txt_deinvoice;
    public static usu.widget.TextBox txt_harga;
    public static usu.widget.TextBox txt_idmenu;
    public static usu.widget.TextBox txt_invoice;
    public static usu.widget.TextBox txt_jenis;
    public static usu.widget.TextBox txt_nama;
    public static usu.widget.TextBox txt_payback;
    public static usu.widget.TextBox txt_search;
    public static usu.widget.TextBox txt_stok;
    // End of variables declaration//GEN-END:variables
}
