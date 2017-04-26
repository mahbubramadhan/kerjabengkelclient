
package form;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Pelanggan extends javax.swing.JFrame {

    
    
    Connection c;
    ResultSet r;
    Statement s;
    
    private Object[][] table_data = null;
    private String[] label = {"ID","Nama", "Harga", "Jumlah Barang", "Total"};
    
    public Pelanggan() {
        initComponents();
            OpenConnection();
            SetTable();
            ClearField();
    }
    private void SetTable(){
          try {
            s = c.createStatement();
            String sql = "select * from transaksi ";
            r = s.executeQuery(sql);
            ResultSetMetaData m = r.getMetaData();
            int column = m.getColumnCount();
            int row = 0;
            while(r.next()){
            row = r.getRow();
            }
            table_data = new Object[row][column];
            int x = 0;
            r.beforeFirst();
            while(r.next()){
            table_data[x][0] = r.getString("id");
            table_data[x][1] = r.getString("namabrg");
            table_data[x][2] = r.getString("hargabrg");
            table_data[x][3] = r.getString("jumlahbrg");
            table_data[x][4] = r.getString("total");
            x++;
            }
            table.setModel(new DefaultTableModel(table_data, label));
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
}
}
    private void ReadData(){
    int row = table.getSelectedRow();
    id.setText((String)table.getValueAt(row, 0));
    nama.setText((String)table.getValueAt(row, 1));
    harga.setText((String)table.getValueAt(row, 2));
    jumlah.setText((String)table.getValueAt(row, 3));

}
    private void ClearField(){
    nama.setText("");
    harga.setText("");
    jumlah.setText("1");
    id.setText("");
    kembali.setText("0");
    bayar.setText("0");
    total_harga.setText("0");
    hitung.setEnabled(false);
    update.setEnabled(false);
    delete.setEnabled(false);
}

    private void OpenConnection(){
    try {
    Class.forName("com.mysql.jdbc.Driver");
    c = DriverManager.getConnection("jdbc:mysql://localhost/database_kerjabengkel", "root", "");
    System.out.println("Connected");
    } catch (Exception e) {
    System.out.println(e);
    }
    }
    
    private void SaveData(){
try {

    int a = Integer.parseInt(harga.getText());
    int b = Integer.parseInt(jumlah.getText());

String sql = "insert into transaksi set namabrg='"+nama.getText()+"', "
+ "hargabrg='"+harga.getText()+"', jumlahbrg='"+jumlah.getText()+"', "
+ "total='"+a*b+"'";
s.executeUpdate(sql);
s.close();

ClearField();
SetTable();
} catch (SQLException e) {

}
}
    
    private void UpdateData(){
try {
    int a = Integer.parseInt(harga.getText());
    int b = Integer.parseInt(jumlah.getText());

String sql = "update transaksi set namabrg='"+nama.getText()+"', "
+ "hargabrg='"+harga.getText()+"', jumlahbrg='"+jumlah.getText()+"', "
+ "total='"+a*b+"' where id='"+id.getText()+"'";
s.executeUpdate(sql);
s.close();

ClearField();
SetTable();
} catch (SQLException e) {

}
}
    
    private void DeleteData(){
try {
String sql = "delete from transaksi where id='"+id.getText()+"'";
s.executeUpdate(sql);
s.close();

ClearField();
SetTable();
} catch (SQLException e) {

}
}
    public String conversion(int value)
{

String [] bilangan ={"","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
String temp=" ";
if (value<12){
temp = " " + bilangan[value];
}
else if(value<20){
temp = conversion(value-10) + " belas";
}
else if(value<100){
temp = conversion(value/10) + " puluh" + conversion(value%10);
}
else if(value<200){
temp = " seratus" + conversion(value-100);
}
else if(value<1000){
temp = conversion(value/100) + " ratus" + conversion(value%100);
}
else if(value<2000){
temp = "seribu"+ conversion(value-1000);
}
else if(value<1000000){
temp = conversion(value/1000) + " ribu" + conversion (value%1000);
}
return temp;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label3 = new usu.widget.Label();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        label4 = new usu.widget.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_add = new usu.widget.ButtonGlass();
        nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_add1 = new usu.widget.ButtonGlass();
        btn_add2 = new usu.widget.ButtonGlass();
        btn_add3 = new usu.widget.ButtonGlass();
        jLabel7 = new javax.swing.JLabel();
        jumlah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        btn_add4 = new usu.widget.ButtonGlass();
        btn_add5 = new usu.widget.ButtonGlass();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        total_harga = new javax.swing.JTextField();
        bayar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        hitung = new usu.widget.ButtonGlass();
        kembali = new javax.swing.JTextField();
        delete = new usu.widget.ButtonGlass();
        update = new usu.widget.ButtonGlass();
        print = new usu.widget.ButtonGlass();

        label3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("Login");
        label3.setFont(new java.awt.Font("BN Dragon", 1, 24)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGlass1.setAlpha(1.0F);
        panelGlass1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/background pelanggan.png"))); // NOI18N
        panelGlass1.setRound(false);

        label4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("Daftar Menu");
        label4.setFont(new java.awt.Font("BN Dragon", 1, 36)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/es campur.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/es cendol.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/gudeg telur.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ice Cream banana split.png"))); // NOI18N

        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buy.png"))); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed1(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Harga");

        btn_add1.setForeground(new java.awt.Color(255, 0, 0));
        btn_add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buy.png"))); // NOI18N
        btn_add1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add1.setGlassColor(new java.awt.Color(0, 102, 102));
        btn_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add1ActionPerformed(evt);
            }
        });

        btn_add2.setForeground(new java.awt.Color(255, 0, 0));
        btn_add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buy.png"))); // NOI18N
        btn_add2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add2.setGlassColor(new java.awt.Color(0, 102, 102));
        btn_add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add2ActionPerformed(evt);
            }
        });

        btn_add3.setForeground(new java.awt.Color(255, 0, 0));
        btn_add3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buy.png"))); // NOI18N
        btn_add3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add3.setGlassColor(new java.awt.Color(0, 102, 102));
        btn_add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jumlah");

        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID");

        btn_add4.setForeground(new java.awt.Color(255, 255, 255));
        btn_add4.setText("Tambahkan");
        btn_add4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add4ActionPerformed1(evt);
            }
        });

        btn_add5.setForeground(new java.awt.Color(255, 255, 255));
        btn_add5.setText("Proses Transaksi");
        btn_add5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_add5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add5ActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Harga", "Jumlah Barang", "Total"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total harga");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bayar");

        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        hitung.setForeground(new java.awt.Color(255, 255, 255));
        hitung.setText("Hitung");
        hitung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung(evt);
            }
        });

        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed1(evt);
            }
        });

        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed1(evt);
            }
        });

        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Cetak");
        print.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed1(evt);
            }
        });

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(58, 58, 58)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(total_harga, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bayar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(kembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed1
        nama.setText("Es Campur");
        harga.setText("10000");
    }//GEN-LAST:event_btn_addActionPerformed1

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
         nama.setText("Es Cendol");
        harga.setText("7500");
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void btn_add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add2ActionPerformed
        nama.setText("Gudeg Telor");
        harga.setText("18000");
    }//GEN-LAST:event_btn_add2ActionPerformed

    private void btn_add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add3ActionPerformed
        nama.setText("Ice Cream Banana Split");
        harga.setText("27000");
    }//GEN-LAST:event_btn_add3ActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

    private void btn_add4ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add4ActionPerformed1
         SaveData();
    }//GEN-LAST:event_btn_add4ActionPerformed1

    private void btn_add5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add5ActionPerformed
          hitung.setEnabled(true);
        int rows = table.getRowCount();
        int sum=0;
        for(int x=0;x<rows;x++){

            String nilai = table.getValueAt(x, 4).toString();
            int nilai1 = Integer.parseInt(nilai);
            sum = sum + nilai1;
        }
            String sum1 = Integer.toString(sum);
            total_harga.setText(sum1);
    }//GEN-LAST:event_btn_add5ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        ReadData();
        update.setEnabled(true);
        delete.setEnabled(true);
    }//GEN-LAST:event_tableMouseClicked

    private void hitung(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitung
          String tot_cost = total_harga.getText();
        String pay1 = bayar.getText();
        int tot_cost1 = Integer.parseInt(tot_cost);
        int pay2 = Integer.parseInt(pay1);
        if ((pay2 - tot_cost1)<0 || pay2==0){
            JOptionPane.showMessageDialog(null,"Maaf, Anda butuh uang lebih untuk membayar !");
        }
 else {
            int change = pay2 - tot_cost1;
            Pelanggan jk = new Pelanggan();
        String info1 = ""+jk.conversion(change)+" rupiah";
            String change1 = Integer.toString(change);
            kembali.setText(change1);
          //  info.setText(info1);
    }//GEN-LAST:event_hitung
    }
    private void deleteActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed1
        // TODO add your handling code here:
        DeleteData();
    }//GEN-LAST:event_deleteActionPerformed1

    private void updateActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed1
        // TODO add your handling code here:
        UpdateData();
    }//GEN-LAST:event_updateActionPerformed1

    private void printActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed1
        // TODO add your handling code here:
        Nota n = new Nota();
        n.setVisible(true);
     //   payback();
    }//GEN-LAST:event_printActionPerformed1

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
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bayar;
    private usu.widget.ButtonGlass btn_add;
    private usu.widget.ButtonGlass btn_add1;
    private usu.widget.ButtonGlass btn_add2;
    private usu.widget.ButtonGlass btn_add3;
    private usu.widget.ButtonGlass btn_add4;
    private usu.widget.ButtonGlass btn_add5;
    private usu.widget.ButtonGlass delete;
    private javax.swing.JTextField harga;
    private usu.widget.ButtonGlass hitung;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField kembali;
    private usu.widget.Label label3;
    private usu.widget.Label label4;
    private javax.swing.JTextField nama;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.ButtonGlass print;
    private javax.swing.JTable table;
    private javax.swing.JTextField total_harga;
    private usu.widget.ButtonGlass update;
    // End of variables declaration//GEN-END:variables
}
