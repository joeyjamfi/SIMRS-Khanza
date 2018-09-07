/*
  Dilarang keras menggandakan/mengcopy/menyebarkan/membajak/mendecompile 
  Software ini dalam bentuk apapun tanpa seijin pembuat software
  (Khanza.Soft Media). Bagi yang sengaja membajak softaware ini ta
  npa ijin, kami sumpahi sial 1000 turunan, miskin sampai 500 turu
  nan. Selalu mendapat kecelakaan sampai 400 turunan. Anak pertama
  nya cacat tidak punya kaki sampai 300 turunan. Susah cari jodoh
  sampai umur 50 tahun sampai 200 turunan. Ya Alloh maafkan kami 
  karena telah berdoa buruk, semua ini kami lakukan karena kami ti
  dak pernah rela karya kami dibajak tanpa ijin.
 */

package setting;

import fungsi.batasInput;
import fungsi.koneksiDB;
import fungsi.sekuel;
import fungsi.validasi;
import fungsi.WarnaTable;
import inventory.DlgCariJenis;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author perpustakaan
 */
public class DlgSetHarga extends javax.swing.JDialog {
    private final DefaultTableModel tabMode,tabModePengaturanUmum;
    private Connection koneksi=koneksiDB.condb();
    private sekuel Sequel=new sekuel();
    private validasi Valid=new validasi();
    public DlgCariJenis jenis = new DlgCariJenis(null, false);
    private PreparedStatement ps;
    private ResultSet rs;

    /** Creates new form DlgAdmin 
     *@param parent
     *@param modal*/
    public DlgSetHarga(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tabMode=new DefaultTableModel(null,new Object[]{
              "Ralan(%)","Ranap K1(%)","Ranap K2(%)","Ranap K3(%)","Kelas Utama(%)",
              "Ranap VIP(%)","Ranap VVIP(%)","Beli Luar(%)","Jual Bebas(%)","Karyawan(%)",
              "Kode Jenis","Nama Jenis"
            }){
              @Override public boolean isCellEditable(int rowIndex, int colIndex){return false;}
        };

        tbAdmin.setModel(tabMode);
        tbAdmin.setPreferredScrollableViewportSize(new Dimension(500,500));
        tbAdmin.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 12; i++) {
            TableColumn column = tbAdmin.getColumnModel().getColumn(i);
            if(i==0){
                column.setPreferredWidth(70);
            }else{
                column.setPreferredWidth(90);
            }
        }

        tbAdmin.setDefaultRenderer(Object.class, new WarnaTable());

        tabModePengaturanUmum=new DefaultTableModel(null,new Object[]{
              "Pengaturan harga obat yang digunakan"
            }){
              @Override public boolean isCellEditable(int rowIndex, int colIndex){return false;}
        };

        tbPengaturanUmum.setModel(tabModePengaturanUmum);
        tbPengaturanUmum.setPreferredScrollableViewportSize(new Dimension(500,500));
        tbPengaturanUmum.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 1; i++) {
            TableColumn column = tbPengaturanUmum.getColumnModel().getColumn(i);
            if(i==0){
                column.setPreferredWidth(400);
            }
        }

        tbPengaturanUmum.setDefaultRenderer(Object.class, new WarnaTable());
        
        ralan.setDocument(new batasInput((byte)10).getKata(ralan));
        ranapk1.setDocument(new batasInput((byte)10).getKata(ranapk1));
        ranapk2.setDocument(new batasInput((byte)10).getKata(ranapk2));
        ranapk3.setDocument(new batasInput((byte)10).getKata(ranapk3));
        ranaputama.setDocument(new batasInput((byte)10).getKata(ranaputama));
        ranapvip.setDocument(new batasInput((byte)10).getKata(ranapvip));
        ranapvvip.setDocument(new batasInput((byte)10).getKata(ranapvvip));
        beliluar.setDocument(new batasInput((byte)10).getKata(beliluar));
        jualbebas.setDocument(new batasInput((byte)10).getKata(jualbebas));
        karyawan.setDocument(new batasInput((byte)10).getKata(karyawan));
        kdjns.setDocument(new batasInput((byte)4).getKata(kdjns));
        
        jenis.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}
            @Override
            public void windowClosing(WindowEvent e) {}

            @Override
            public void windowClosed(WindowEvent e) {
                if (jenis.getTable().getSelectedRow() != -1) {
                    kdjns.setText(jenis.getTable().getValueAt(jenis.getTable().getSelectedRow(), 0).toString());
                    nmjns.setText(jenis.getTable().getValueAt(jenis.getTable().getSelectedRow(), 1).toString());
                }
                kdjns.requestFocus();
            }

            @Override
            public void windowIconified(WindowEvent e) {}
            @Override
            public void windowDeiconified(WindowEvent e) {}
            @Override
            public void windowActivated(WindowEvent e) {}
            @Override
            public void windowDeactivated(WindowEvent e) {}
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Popup = new javax.swing.JPopupMenu();
        ppUPdate = new javax.swing.JMenuItem();
        internalFrame1 = new widget.InternalFrame();
        panelisi1 = new widget.panelisi();
        BtnSimpan = new widget.Button();
        BtnBatal = new widget.Button();
        BtnHapus = new widget.Button();
        BtnEdit = new widget.Button();
        BtnKeluar = new widget.Button();
        TabSetting = new javax.swing.JTabbedPane();
        internalFrame3 = new widget.InternalFrame();
        Scroll2 = new widget.ScrollPane();
        tbPengaturanUmum = new widget.Table();
        panelGlass8 = new widget.panelisi();
        jLabel5 = new widget.Label();
        cmbPengaturan = new widget.ComboBox();
        internalFrame4 = new widget.InternalFrame();
        internalFrame2 = new widget.InternalFrame();
        panelisi2 = new widget.panelisi();
        label35 = new widget.Label();
        ranapvip = new widget.TextBox();
        label34 = new widget.Label();
        ranapvvip = new widget.TextBox();
        label36 = new widget.Label();
        beliluar = new widget.TextBox();
        label38 = new widget.Label();
        jualbebas = new widget.TextBox();
        karyawan = new widget.TextBox();
        label39 = new widget.Label();
        label37 = new widget.Label();
        ralan = new widget.TextBox();
        ranapk1 = new widget.TextBox();
        label40 = new widget.Label();
        label41 = new widget.Label();
        ranapk2 = new widget.TextBox();
        ranapk3 = new widget.TextBox();
        label42 = new widget.Label();
        label43 = new widget.Label();
        ranaputama = new widget.TextBox();
        label20 = new widget.Label();
        kdjns = new widget.TextBox();
        nmjns = new widget.TextBox();
        BtnJenis = new widget.Button();
        Scroll = new widget.ScrollPane();
        tbAdmin = new widget.Table();
        internalFrame5 = new widget.InternalFrame();

        Popup.setName("Popup"); // NOI18N

        ppUPdate.setBackground(new java.awt.Color(255, 255, 255));
        ppUPdate.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppUPdate.setForeground(new java.awt.Color(130, 100, 100));
        ppUPdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/category.png"))); // NOI18N
        ppUPdate.setText("Update Seluruh Harga Data Obat/Barang/Alkes");
        ppUPdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppUPdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppUPdate.setIconTextGap(8);
        ppUPdate.setName("ppUPdate"); // NOI18N
        ppUPdate.setPreferredSize(new java.awt.Dimension(300, 25));
        ppUPdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppUPdateActionPerformed(evt);
            }
        });
        Popup.add(ppUPdate);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        internalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), "::[ Setup Harga Obat/Barang/Alkes ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(130, 100, 100))); // NOI18N
        internalFrame1.setName("internalFrame1"); // NOI18N
        internalFrame1.setLayout(new java.awt.BorderLayout(1, 1));

        panelisi1.setName("panelisi1"); // NOI18N
        panelisi1.setPreferredSize(new java.awt.Dimension(100, 54));
        panelisi1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 9));

        BtnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/save-16x16.png"))); // NOI18N
        BtnSimpan.setMnemonic('S');
        BtnSimpan.setText("Simpan");
        BtnSimpan.setToolTipText("Alt+S");
        BtnSimpan.setName("BtnSimpan"); // NOI18N
        BtnSimpan.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        BtnSimpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnSimpanKeyPressed(evt);
            }
        });
        panelisi1.add(BtnSimpan);

        BtnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Cancel-2-16x16.png"))); // NOI18N
        BtnBatal.setMnemonic('B');
        BtnBatal.setText("Baru");
        BtnBatal.setToolTipText("Alt+B");
        BtnBatal.setName("BtnBatal"); // NOI18N
        BtnBatal.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatalActionPerformed(evt);
            }
        });
        BtnBatal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnBatalKeyPressed(evt);
            }
        });
        panelisi1.add(BtnBatal);

        BtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/stop_f2.png"))); // NOI18N
        BtnHapus.setMnemonic('H');
        BtnHapus.setText("Hapus");
        BtnHapus.setToolTipText("Alt+H");
        BtnHapus.setName("BtnHapus"); // NOI18N
        BtnHapus.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        BtnHapus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnHapusKeyPressed(evt);
            }
        });
        panelisi1.add(BtnHapus);

        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/inventaris.png"))); // NOI18N
        BtnEdit.setMnemonic('G');
        BtnEdit.setText("Ganti");
        BtnEdit.setToolTipText("Alt+G");
        BtnEdit.setIconTextGap(3);
        BtnEdit.setName("BtnEdit"); // NOI18N
        BtnEdit.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        BtnEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnEditKeyPressed(evt);
            }
        });
        panelisi1.add(BtnEdit);

        BtnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/exit.png"))); // NOI18N
        BtnKeluar.setMnemonic('K');
        BtnKeluar.setText("Keluar");
        BtnKeluar.setToolTipText("Alt+K");
        BtnKeluar.setName("BtnKeluar"); // NOI18N
        BtnKeluar.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        BtnKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnKeluarKeyPressed(evt);
            }
        });
        panelisi1.add(BtnKeluar);

        internalFrame1.add(panelisi1, java.awt.BorderLayout.PAGE_END);

        TabSetting.setBackground(new java.awt.Color(255, 255, 253));
        TabSetting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 246, 236)));
        TabSetting.setForeground(new java.awt.Color(130, 100, 100));
        TabSetting.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        TabSetting.setName("TabSetting"); // NOI18N
        TabSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabSettingMouseClicked(evt);
            }
        });

        internalFrame3.setBackground(new java.awt.Color(235, 255, 235));
        internalFrame3.setBorder(null);
        internalFrame3.setName("internalFrame3"); // NOI18N
        internalFrame3.setLayout(new java.awt.BorderLayout(1, 1));

        Scroll2.setName("Scroll2"); // NOI18N
        Scroll2.setOpaque(true);

        tbPengaturanUmum.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
        tbPengaturanUmum.setName("tbPengaturanUmum"); // NOI18N
        tbPengaturanUmum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPengaturanUmumMouseClicked(evt);
            }
        });
        tbPengaturanUmum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbPengaturanUmumKeyPressed(evt);
            }
        });
        Scroll2.setViewportView(tbPengaturanUmum);

        internalFrame3.add(Scroll2, java.awt.BorderLayout.CENTER);

        panelGlass8.setName("panelGlass8"); // NOI18N
        panelGlass8.setPreferredSize(new java.awt.Dimension(44, 47));
        panelGlass8.setLayout(null);

        jLabel5.setText("Pengaturan harga obat yang digunakan :");
        jLabel5.setName("jLabel5"); // NOI18N
        panelGlass8.add(jLabel5);
        jLabel5.setBounds(0, 12, 230, 23);

        cmbPengaturan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Umum", "Per Jenis", "Per Barang" }));
        cmbPengaturan.setName("cmbPengaturan"); // NOI18N
        cmbPengaturan.setOpaque(false);
        cmbPengaturan.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbPengaturan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbPengaturanKeyPressed(evt);
            }
        });
        panelGlass8.add(cmbPengaturan);
        cmbPengaturan.setBounds(233, 12, 220, 23);

        internalFrame3.add(panelGlass8, java.awt.BorderLayout.PAGE_START);

        TabSetting.addTab("Pegaturan Harga", internalFrame3);

        internalFrame4.setBackground(new java.awt.Color(235, 255, 235));
        internalFrame4.setBorder(null);
        internalFrame4.setName("internalFrame4"); // NOI18N
        internalFrame4.setLayout(new java.awt.BorderLayout(1, 1));
        TabSetting.addTab("Pegaturan Harga Umum", internalFrame4);

        internalFrame2.setBackground(new java.awt.Color(235, 255, 235));
        internalFrame2.setBorder(null);
        internalFrame2.setName("internalFrame2"); // NOI18N
        internalFrame2.setLayout(new java.awt.BorderLayout(1, 1));

        panelisi2.setName("panelisi2"); // NOI18N
        panelisi2.setPreferredSize(new java.awt.Dimension(100, 194));
        panelisi2.setLayout(null);

        label35.setText("Keuntungan di Rawat Inap Kelas VIP(%) :");
        label35.setName("label35"); // NOI18N
        label35.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi2.add(label35);
        label35.setBounds(320, 10, 229, 23);

        ranapvip.setHighlighter(null);
        ranapvip.setName("ranapvip"); // NOI18N
        ranapvip.setPreferredSize(new java.awt.Dimension(50, 23));
        ranapvip.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ranapvipMouseMoved(evt);
            }
        });
        ranapvip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ranapvipMouseExited(evt);
            }
        });
        ranapvip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ranapvipKeyPressed(evt);
            }
        });
        panelisi2.add(ranapvip);
        ranapvip.setBounds(550, 10, 50, 23);

        label34.setText("Keuntungan di Rawat Inap Kelas VVIP(%) :");
        label34.setName("label34"); // NOI18N
        label34.setPreferredSize(new java.awt.Dimension(80, 23));
        panelisi2.add(label34);
        label34.setBounds(320, 40, 229, 23);

        ranapvvip.setName("ranapvvip"); // NOI18N
        ranapvvip.setPreferredSize(new java.awt.Dimension(50, 23));
        ranapvvip.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ranapvvipMouseMoved(evt);
            }
        });
        ranapvvip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ranapvvipMouseExited(evt);
            }
        });
        ranapvvip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ranapvvipKeyPressed(evt);
            }
        });
        panelisi2.add(ranapvvip);
        ranapvvip.setBounds(550, 40, 50, 23);

        label36.setText("Keuntungan Jika Beli dari Apotek Lain(%) :");
        label36.setName("label36"); // NOI18N
        label36.setPreferredSize(new java.awt.Dimension(80, 23));
        panelisi2.add(label36);
        label36.setBounds(289, 70, 260, 23);

        beliluar.setName("beliluar"); // NOI18N
        beliluar.setPreferredSize(new java.awt.Dimension(50, 23));
        beliluar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                beliluarMouseMoved(evt);
            }
        });
        beliluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                beliluarMouseExited(evt);
            }
        });
        beliluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                beliluarKeyPressed(evt);
            }
        });
        panelisi2.add(beliluar);
        beliluar.setBounds(550, 70, 50, 23);

        label38.setText("Keuntungan di Penjualan Bebas(%) :");
        label38.setName("label38"); // NOI18N
        label38.setPreferredSize(new java.awt.Dimension(80, 23));
        panelisi2.add(label38);
        label38.setBounds(320, 100, 229, 23);

        jualbebas.setName("jualbebas"); // NOI18N
        jualbebas.setPreferredSize(new java.awt.Dimension(50, 23));
        jualbebas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jualbebasMouseMoved(evt);
            }
        });
        jualbebas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jualbebasMouseExited(evt);
            }
        });
        jualbebas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jualbebasKeyPressed(evt);
            }
        });
        panelisi2.add(jualbebas);
        jualbebas.setBounds(550, 100, 50, 23);

        karyawan.setName("karyawan"); // NOI18N
        karyawan.setPreferredSize(new java.awt.Dimension(50, 23));
        karyawan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                karyawanMouseMoved(evt);
            }
        });
        karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                karyawanMouseExited(evt);
            }
        });
        karyawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                karyawanKeyPressed(evt);
            }
        });
        panelisi2.add(karyawan);
        karyawan.setBounds(550, 130, 50, 23);

        label39.setText("Keuntungan Jika Pasien/Pembeli Karyawan(%) :");
        label39.setName("label39"); // NOI18N
        label39.setPreferredSize(new java.awt.Dimension(80, 23));
        panelisi2.add(label39);
        label39.setBounds(299, 130, 250, 23);

        label37.setText("Keuntungan di Rawat Jalan(%) :");
        label37.setName("label37"); // NOI18N
        label37.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi2.add(label37);
        label37.setBounds(0, 10, 229, 23);

        ralan.setHighlighter(null);
        ralan.setName("ralan"); // NOI18N
        ralan.setPreferredSize(new java.awt.Dimension(50, 23));
        ralan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ralanMouseMoved(evt);
            }
        });
        ralan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ralanMouseExited(evt);
            }
        });
        ralan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ralanKeyPressed(evt);
            }
        });
        panelisi2.add(ralan);
        ralan.setBounds(231, 10, 50, 23);

        ranapk1.setName("ranapk1"); // NOI18N
        ranapk1.setPreferredSize(new java.awt.Dimension(50, 23));
        ranapk1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ranapk1MouseMoved(evt);
            }
        });
        ranapk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ranapk1MouseExited(evt);
            }
        });
        ranapk1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ranapk1KeyPressed(evt);
            }
        });
        panelisi2.add(ranapk1);
        ranapk1.setBounds(231, 40, 50, 23);

        label40.setText("Keuntungan di Rawat Inap Kelas 1(%) :");
        label40.setName("label40"); // NOI18N
        label40.setPreferredSize(new java.awt.Dimension(80, 23));
        panelisi2.add(label40);
        label40.setBounds(0, 40, 229, 23);

        label41.setText("Keuntungan di Rawat Inap Kelas 2(%) :");
        label41.setName("label41"); // NOI18N
        label41.setPreferredSize(new java.awt.Dimension(80, 23));
        panelisi2.add(label41);
        label41.setBounds(0, 70, 229, 23);

        ranapk2.setName("ranapk2"); // NOI18N
        ranapk2.setPreferredSize(new java.awt.Dimension(50, 23));
        ranapk2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ranapk2MouseMoved(evt);
            }
        });
        ranapk2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ranapk2MouseExited(evt);
            }
        });
        ranapk2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ranapk2KeyPressed(evt);
            }
        });
        panelisi2.add(ranapk2);
        ranapk2.setBounds(231, 70, 50, 23);

        ranapk3.setName("ranapk3"); // NOI18N
        ranapk3.setPreferredSize(new java.awt.Dimension(50, 23));
        ranapk3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ranapk3MouseMoved(evt);
            }
        });
        ranapk3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ranapk3MouseExited(evt);
            }
        });
        ranapk3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ranapk3KeyPressed(evt);
            }
        });
        panelisi2.add(ranapk3);
        ranapk3.setBounds(231, 100, 50, 23);

        label42.setText("Keuntungan di Rawat Inap Kelas 3(%) :");
        label42.setName("label42"); // NOI18N
        label42.setPreferredSize(new java.awt.Dimension(80, 23));
        panelisi2.add(label42);
        label42.setBounds(0, 100, 229, 23);

        label43.setText("Keuntungan di Rawat Inap Kelas Utama(%) :");
        label43.setName("label43"); // NOI18N
        label43.setPreferredSize(new java.awt.Dimension(80, 23));
        panelisi2.add(label43);
        label43.setBounds(0, 130, 229, 23);

        ranaputama.setName("ranaputama"); // NOI18N
        ranaputama.setPreferredSize(new java.awt.Dimension(50, 23));
        ranaputama.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ranaputamaMouseMoved(evt);
            }
        });
        ranaputama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ranaputamaMouseExited(evt);
            }
        });
        ranaputama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ranaputamaKeyPressed(evt);
            }
        });
        panelisi2.add(ranaputama);
        ranaputama.setBounds(231, 130, 50, 23);

        label20.setText("Jenis Barang :");
        label20.setName("label20"); // NOI18N
        label20.setPreferredSize(new java.awt.Dimension(65, 23));
        panelisi2.add(label20);
        label20.setBounds(0, 162, 229, 23);

        kdjns.setName("kdjns"); // NOI18N
        kdjns.setPreferredSize(new java.awt.Dimension(207, 23));
        kdjns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kdjnsKeyPressed(evt);
            }
        });
        panelisi2.add(kdjns);
        kdjns.setBounds(231, 162, 50, 23);

        nmjns.setEditable(false);
        nmjns.setName("nmjns"); // NOI18N
        nmjns.setPreferredSize(new java.awt.Dimension(207, 23));
        panelisi2.add(nmjns);
        nmjns.setBounds(284, 162, 288, 23);

        BtnJenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/190.png"))); // NOI18N
        BtnJenis.setMnemonic('2');
        BtnJenis.setToolTipText("Alt+2");
        BtnJenis.setName("BtnJenis"); // NOI18N
        BtnJenis.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJenisActionPerformed(evt);
            }
        });
        panelisi2.add(BtnJenis);
        BtnJenis.setBounds(575, 162, 25, 23);

        internalFrame2.add(panelisi2, java.awt.BorderLayout.PAGE_START);

        Scroll.setComponentPopupMenu(Popup);
        Scroll.setDoubleBuffered(true);
        Scroll.setName("Scroll"); // NOI18N
        Scroll.setOpaque(true);

        tbAdmin.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
        tbAdmin.setComponentPopupMenu(Popup);
        tbAdmin.setName("tbAdmin"); // NOI18N
        tbAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAdminMouseClicked(evt);
            }
        });
        tbAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbAdminKeyPressed(evt);
            }
        });
        Scroll.setViewportView(tbAdmin);

        internalFrame2.add(Scroll, java.awt.BorderLayout.CENTER);

        TabSetting.addTab("Pegaturan Harga Per Jenis Barang", internalFrame2);

        internalFrame5.setBackground(new java.awt.Color(235, 255, 235));
        internalFrame5.setBorder(null);
        internalFrame5.setName("internalFrame5"); // NOI18N
        internalFrame5.setLayout(new java.awt.BorderLayout(1, 1));
        TabSetting.addTab("Pegaturan Harga Per Barang", internalFrame5);

        internalFrame1.add(TabSetting, java.awt.BorderLayout.CENTER);

        getContentPane().add(internalFrame1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ranapvipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ranapvipKeyPressed
        Valid.pindah(evt,ranaputama,ranapvvip);
}//GEN-LAST:event_ranapvipKeyPressed

    private void ranapvvipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ranapvvipKeyPressed
        Valid.pindah(evt,ranapvip,beliluar);
}//GEN-LAST:event_ranapvvipKeyPressed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        if(TabSetting.getSelectedIndex()==0){
            if(tabModePengaturanUmum.getRowCount()>0){
                JOptionPane.showMessageDialog(null,"Maaf, Hanya diijinkan satu pengaturan ...!!!!");
                cmbPengaturan.requestFocus();
            }else{
                Sequel.menyimpan("set_harga_obat","?",1,new String[]{
                    cmbPengaturan.getSelectedItem().toString()
                });
                tampilpengaturanumum();
                emptTeks();
            }
        }else if(TabSetting.getSelectedIndex()==2){
            if(ralan.getText().trim().equals("")){
                Valid.textKosong(ralan,"Keuntungan di Rawat Jalan");
            }else if(ranapk1.getText().trim().equals("")){
                Valid.textKosong(ranapk1,"Keuntungan di Ranap Kelas 1");
            }else if(ranapk2.getText().trim().equals("")){
                Valid.textKosong(ranapk2,"Keuntungan di Ranap Kelas 2");
            }else if(ranapk3.getText().trim().equals("")){
                Valid.textKosong(ranapk3,"Keuntungan di Ranap Kelas 3");
            }else if(ranaputama.getText().trim().equals("")){
                Valid.textKosong(ranaputama,"Keuntungan di Ranap Kelas Utama");
            }else if(ranapvip.getText().trim().equals("")){
                Valid.textKosong(ranapvip,"Keuntungan di Ranap Kelas VIP");
            }else if(ranapvvip.getText().trim().equals("")){
                Valid.textKosong(ranapvvip,"Keuntungan di Ranap Kelas VVIP");
            }else if(beliluar.getText().trim().equals("")){
                Valid.textKosong(beliluar,"Keuntungan Jika Beli dari Apotek Lain");
            }else if(jualbebas.getText().trim().equals("")){
                Valid.textKosong(jualbebas,"Keuntungan di Penjualan Bebas");
            }else if(karyawan.getText().trim().equals("")){
                Valid.textKosong(karyawan,"Keuntungan Jika Pasien/Pembeli Karyawan");
            }else if(kdjns.getText().trim().equals("")||nmjns.getText().trim().equals("")){
                Valid.textKosong(kdjns,"Jenis Barang");
            }else{            
                Sequel.menyimpan("setpenjualan","'"+ralan.getText()+"','"+ranapk1.getText()+"','"+
                        ranapk2.getText()+"','"+ranapk3.getText()+"','"+ranaputama.getText()+"','"+
                        ranapvip.getText()+"','"+ranapvvip.getText()+"','"+beliluar.getText()+"','"+
                        jualbebas.getText()+"','"+karyawan.getText()+"','"+kdjns.getText()+"'","Set Harga");
                tampil();
                emptTeks();
            }
        }
            
}//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnSimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnSimpanKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnSimpanActionPerformed(null);
        }else{
            Valid.pindah(evt,karyawan,BtnBatal);
        }
}//GEN-LAST:event_BtnSimpanKeyPressed

    private void BtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalActionPerformed
        emptTeks();
}//GEN-LAST:event_BtnBatalActionPerformed

    private void BtnBatalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnBatalKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            emptTeks();
        }else{Valid.pindah(evt, BtnSimpan, BtnHapus);}
}//GEN-LAST:event_BtnBatalKeyPressed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        if(TabSetting.getSelectedIndex()==0){
            Sequel.queryu("delete from set_harga_obat");
        }else if(TabSetting.getSelectedIndex()==2){
            if(tabMode.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"Maaf, data sudah habis...!!!!");
                ranapvip.requestFocus();
            }else if(ranapvvip.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null,"Maaf, Gagal menghapus. Pilih dulu data yang mau dihapus.\nKlik data pada table untuk memilih...!!!!");
            }else if(! ranapvvip.getText().trim().equals("")){
                Sequel.queryu("delete from setpenjualan where kdjns='"+kdjns.getText()+"'");
                tampil();
                emptTeks();
            }
        }            
}//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnHapusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnHapusKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnHapusActionPerformed(null);
        }else{
            Valid.pindah(evt, BtnBatal, BtnHapus);
        }
}//GEN-LAST:event_BtnHapusKeyPressed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        if(tabMode.getRowCount()==0){
            JOptionPane.showMessageDialog(null,"Maaf, data Set Harga tidak boleh kosong ...!!!!");
            ranapvip.requestFocus();
        }else if(! (tabMode.getRowCount()==0)) {
            dispose();
        }
}//GEN-LAST:event_BtnKeluarActionPerformed

    private void BtnKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnKeluarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            dispose();
        }else{Valid.pindah(evt,BtnHapus,BtnKeluar);}
}//GEN-LAST:event_BtnKeluarKeyPressed

    private void tbAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAdminMouseClicked
        if(tabMode.getRowCount()!=0){
            try {
                getData();
            } catch (java.lang.NullPointerException e) {
            }
        }
}//GEN-LAST:event_tbAdminMouseClicked

    private void tbAdminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbAdminKeyPressed
        if(tabMode.getRowCount()!=0){
            if((evt.getKeyCode()==KeyEvent.VK_ENTER)||(evt.getKeyCode()==KeyEvent.VK_UP)||(evt.getKeyCode()==KeyEvent.VK_DOWN)){
                try {
                    getData();
                } catch (java.lang.NullPointerException e) {
                }
            }
        }
}//GEN-LAST:event_tbAdminKeyPressed

    private void beliluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_beliluarKeyPressed
        Valid.pindah(evt,ranapvvip,jualbebas);
    }//GEN-LAST:event_beliluarKeyPressed

    private void ranapvipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ranapvipMouseExited
        if(ranapvip.getText().equals("")){
            ranapvip.setText("0");
        }
    }//GEN-LAST:event_ranapvipMouseExited

    private void ranapvvipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ranapvvipMouseExited
        if(ranapvvip.getText().equals("")){
            ranapvvip.setText("0");
        }
    }//GEN-LAST:event_ranapvvipMouseExited

    private void beliluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beliluarMouseExited
        if(beliluar.getText().equals("")){
            beliluar.setText("0");
        }
    }//GEN-LAST:event_beliluarMouseExited

    private void ranapvipMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ranapvipMouseMoved
        if(ranapvip.getText().equals("0")||ranapvip.getText().equals("0.0")){
            ranapvip.setText("");
        }
    }//GEN-LAST:event_ranapvipMouseMoved

    private void ranapvvipMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ranapvvipMouseMoved
        if(ranapvvip.getText().equals("0")||ranapvvip.getText().equals("0.0")){
            ranapvvip.setText("");
        }
    }//GEN-LAST:event_ranapvvipMouseMoved

    private void beliluarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beliluarMouseMoved
        if(beliluar.getText().equals("0")||beliluar.getText().equals("0.0")){
            beliluar.setText("");
        }
    }//GEN-LAST:event_beliluarMouseMoved

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TabSettingMouseClicked(null);
    }//GEN-LAST:event_formWindowOpened

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        if(TabSetting.getSelectedIndex()==0){
            Sequel.queryu("delete from set_harga_obat");
            Sequel.menyimpan("set_harga_obat","?",1,new String[]{
                cmbPengaturan.getSelectedItem().toString()
            });
            tampilpengaturanumum();
            emptTeks();
        }else if(TabSetting.getSelectedIndex()==2){
            if(ralan.getText().trim().equals("")){
                Valid.textKosong(ralan,"Keuntungan di Rawat Jalan");
            }else if(ranapk1.getText().trim().equals("")){
                Valid.textKosong(ranapk1,"Keuntungan di Ranap Kelas 1");
            }else if(ranapk2.getText().trim().equals("")){
                Valid.textKosong(ranapk2,"Keuntungan di Ranap Kelas 2");
            }else if(ranapk3.getText().trim().equals("")){
                Valid.textKosong(ranapk3,"Keuntungan di Ranap Kelas 3");
            }else if(ranaputama.getText().trim().equals("")){
                Valid.textKosong(ranaputama,"Keuntungan di Ranap Kelas Utama");
            }else if(ranapvip.getText().trim().equals("")){
                Valid.textKosong(ranapvip,"Keuntungan di Ranap Kelas VIP");
            }else if(ranapvvip.getText().trim().equals("")){
                Valid.textKosong(ranapvvip,"Keuntungan di Ranap Kelas VVIP");
            }else if(beliluar.getText().trim().equals("")){
                Valid.textKosong(beliluar,"Keuntungan Jika Beli dari Apotek Lain");
            }else if(jualbebas.getText().trim().equals("")){
                Valid.textKosong(jualbebas,"Keuntungan di Penjualan Bebas");
            }else if(karyawan.getText().trim().equals("")){
                Valid.textKosong(karyawan,"Keuntungan Jika Pasien/Pembeli Karyawan");
            }else if(kdjns.getText().trim().equals("")||nmjns.getText().trim().equals("")){
                Valid.textKosong(kdjns,"Jenis Barang");
            }else{
                Sequel.queryu("delete from setpenjualan where kdjns='"+kdjns.getText()+"'");
                Sequel.menyimpan("setpenjualan","'"+ralan.getText()+"','"+ranapk1.getText()+"','"+
                        ranapk2.getText()+"','"+ranapk3.getText()+"','"+ranaputama.getText()+"','"+
                        ranapvip.getText()+"','"+ranapvvip.getText()+"','"+beliluar.getText()+"','"+
                        jualbebas.getText()+"','"+karyawan.getText()+"','"+kdjns.getText()+"'","Set Harga");
                tampil();
                emptTeks();
            }
        }            
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnEditKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnEditActionPerformed(null);
        }else{
            Valid.pindah(evt, BtnHapus, BtnKeluar);
        }
    }//GEN-LAST:event_BtnEditKeyPressed

    private void jualbebasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jualbebasMouseMoved
        if(jualbebas.getText().equals("0")||jualbebas.getText().equals("0.0")){
            jualbebas.setText("");
        }
    }//GEN-LAST:event_jualbebasMouseMoved

    private void jualbebasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jualbebasMouseExited
        if(jualbebas.getText().equals("")){
            jualbebas.setText("0");
        }
    }//GEN-LAST:event_jualbebasMouseExited

    private void jualbebasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jualbebasKeyPressed
        Valid.pindah(evt,beliluar,karyawan);
    }//GEN-LAST:event_jualbebasKeyPressed

    private void karyawanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karyawanMouseMoved
        if(karyawan.getText().equals("0")||karyawan.getText().equals("0.0")){
            karyawan.setText("");
        }
    }//GEN-LAST:event_karyawanMouseMoved

    private void karyawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karyawanMouseExited
        if(karyawan.getText().equals("")){
            karyawan.setText("0");
        }
    }//GEN-LAST:event_karyawanMouseExited

    private void karyawanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_karyawanKeyPressed
        Valid.pindah(evt,jualbebas,kdjns);
    }//GEN-LAST:event_karyawanKeyPressed

    private void ralanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ralanMouseMoved
        if(ralan.getText().equals("0")||ralan.getText().equals("0.0")){
            ralan.setText("");
        }
    }//GEN-LAST:event_ralanMouseMoved

    private void ralanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ralanMouseExited
        if(ralan.getText().equals("")){
            ralan.setText("0");
        }
    }//GEN-LAST:event_ralanMouseExited

    private void ralanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ralanKeyPressed
        Valid.pindah(evt,BtnSimpan,ranapk1);
    }//GEN-LAST:event_ralanKeyPressed

    private void ranapk1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ranapk1MouseMoved
        if(ranapk1.getText().equals("0")||ranapk1.getText().equals("0.0")){
            ranapk1.setText("");
        }
    }//GEN-LAST:event_ranapk1MouseMoved

    private void ranapk1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ranapk1MouseExited
        if(ranapk1.getText().equals("")){
            ranapk1.setText("0");
        }
    }//GEN-LAST:event_ranapk1MouseExited

    private void ranapk1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ranapk1KeyPressed
        Valid.pindah(evt,ralan,ranapk2);
    }//GEN-LAST:event_ranapk1KeyPressed

    private void ranapk2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ranapk2MouseMoved
        if(ranapk2.getText().equals("0")||ranapk2.getText().equals("0.0")){
            ranapk2.setText("");
        }
    }//GEN-LAST:event_ranapk2MouseMoved

    private void ranapk2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ranapk2MouseExited
        if(ranapk2.getText().equals("")){
            ranapk2.setText("0");
        }
    }//GEN-LAST:event_ranapk2MouseExited

    private void ranapk2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ranapk2KeyPressed
        Valid.pindah(evt,ranapk1,ranapk3);
    }//GEN-LAST:event_ranapk2KeyPressed

    private void ranapk3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ranapk3MouseMoved
        if(ranapk3.getText().equals("0")||ranapk3.getText().equals("0.0")){
            ranapk3.setText("");
        }
    }//GEN-LAST:event_ranapk3MouseMoved

    private void ranapk3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ranapk3MouseExited
        if(ranapk3.getText().equals("")){
            ranapk3.setText("0");
        }
    }//GEN-LAST:event_ranapk3MouseExited

    private void ranapk3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ranapk3KeyPressed
        Valid.pindah(evt,ranapk2,ranaputama);
    }//GEN-LAST:event_ranapk3KeyPressed

    private void ranaputamaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ranaputamaMouseMoved
        if(ranaputama.getText().equals("0")||ranaputama.getText().equals("0.0")){
            ranaputama.setText("");
        }
    }//GEN-LAST:event_ranaputamaMouseMoved

    private void ranaputamaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ranaputamaMouseExited
        if(ranaputama.getText().equals("")){
            ranaputama.setText("0");
        }
    }//GEN-LAST:event_ranaputamaMouseExited

    private void ranaputamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ranaputamaKeyPressed
        Valid.pindah(evt,ranapk3,ranapvip);
    }//GEN-LAST:event_ranaputamaKeyPressed

    private void ppUPdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppUPdateActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        for (int i = 0; i < tbAdmin.getRowCount(); i++) { 
            if(tbAdmin.getValueAt(i,10).toString().equals("-")){
                Sequel.queryu2("update databarang set ralan=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,0).toString()+"/100))),"+
                    "kelas1=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,1).toString()+"/100))),"+
                    "kelas2=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,2).toString()+"/100))),"+
                    "kelas3=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,3).toString()+"/100))),"+
                    "utama=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,4).toString()+"/100))),"+
                    "vip=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,5).toString()+"/100))),"+
                    "vvip=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,6).toString()+"/100))),"+
                    "beliluar=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,7).toString()+"/100))),"+
                    "jualbebas=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,8).toString()+"/100))),"+
                    "karyawan=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,9).toString()+"/100)))");
            }else{
                Sequel.queryu2("update databarang set ralan=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,0).toString()+"/100))),"+
                    "kelas1=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,1).toString()+"/100))),"+
                    "kelas2=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,2).toString()+"/100))),"+
                    "kelas3=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,3).toString()+"/100))),"+
                    "utama=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,4).toString()+"/100))),"+
                    "vip=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,5).toString()+"/100))),"+
                    "vvip=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,6).toString()+"/100))),"+
                    "beliluar=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,7).toString()+"/100))),"+
                    "jualbebas=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,8).toString()+"/100))),"+
                    "karyawan=round(h_beli+(h_beli*("+tbAdmin.getValueAt(i,9).toString()+"/100))) where "+
                    "kdjns='"+tbAdmin.getValueAt(i,10).toString()+"'");
            }                
        }            
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_ppUPdateActionPerformed

    private void kdjnsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kdjnsKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_PAGE_DOWN) {
            Sequel.cariIsi("select nama from jenis where kdjns=?", nmjns, kdjns.getText());
        } else if (evt.getKeyCode() == KeyEvent.VK_PAGE_UP) {
            Sequel.cariIsi("select nama from jenis where kdjns=?", nmjns, kdjns.getText());
            karyawan.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Sequel.cariIsi("select nama from jenis where kdjns=?", nmjns, kdjns.getText());
            BtnSimpan.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            BtnJenisActionPerformed(null);
        }
    }//GEN-LAST:event_kdjnsKeyPressed

    private void BtnJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJenisActionPerformed
        jenis.isCek();
        jenis.setSize(internalFrame1.getWidth() - 40, internalFrame1.getHeight() - 40);
        jenis.setLocationRelativeTo(internalFrame1);
        jenis.setAlwaysOnTop(false);
        jenis.setVisible(true);
    }//GEN-LAST:event_BtnJenisActionPerformed

    private void TabSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabSettingMouseClicked
        if(TabSetting.getSelectedIndex()==0){
            tampil();
        }
    }//GEN-LAST:event_TabSettingMouseClicked

    private void tbPengaturanUmumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPengaturanUmumMouseClicked
        if(tabModePengaturanUmum.getRowCount()!=0){
            try {
                getDataPengaturanUmum();
            } catch (java.lang.NullPointerException e) {
            }
        }
    }//GEN-LAST:event_tbPengaturanUmumMouseClicked

    private void tbPengaturanUmumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPengaturanUmumKeyPressed
        if(tabModePengaturanUmum.getRowCount()!=0){
            if((evt.getKeyCode()==KeyEvent.VK_ENTER)||(evt.getKeyCode()==KeyEvent.VK_UP)||(evt.getKeyCode()==KeyEvent.VK_DOWN)){
                try {
                    getDataPengaturanUmum();
                } catch (java.lang.NullPointerException e) {
                }
            }
        }
    }//GEN-LAST:event_tbPengaturanUmumKeyPressed

    private void cmbPengaturanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbPengaturanKeyPressed
        
    }//GEN-LAST:event_cmbPengaturanKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            DlgSetHarga dialog = new DlgSetHarga(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widget.Button BtnBatal;
    private widget.Button BtnEdit;
    private widget.Button BtnHapus;
    private widget.Button BtnJenis;
    private widget.Button BtnKeluar;
    private widget.Button BtnSimpan;
    private javax.swing.JPopupMenu Popup;
    private widget.ScrollPane Scroll;
    private widget.ScrollPane Scroll2;
    private javax.swing.JTabbedPane TabSetting;
    private widget.TextBox beliluar;
    private widget.ComboBox cmbPengaturan;
    private widget.InternalFrame internalFrame1;
    private widget.InternalFrame internalFrame2;
    private widget.InternalFrame internalFrame3;
    private widget.InternalFrame internalFrame4;
    private widget.InternalFrame internalFrame5;
    private widget.Label jLabel5;
    private widget.TextBox jualbebas;
    private widget.TextBox karyawan;
    private widget.TextBox kdjns;
    private widget.Label label20;
    private widget.Label label34;
    private widget.Label label35;
    private widget.Label label36;
    private widget.Label label37;
    private widget.Label label38;
    private widget.Label label39;
    private widget.Label label40;
    private widget.Label label41;
    private widget.Label label42;
    private widget.Label label43;
    private widget.TextBox nmjns;
    private widget.panelisi panelGlass8;
    private widget.panelisi panelisi1;
    private widget.panelisi panelisi2;
    private javax.swing.JMenuItem ppUPdate;
    private widget.TextBox ralan;
    private widget.TextBox ranapk1;
    private widget.TextBox ranapk2;
    private widget.TextBox ranapk3;
    private widget.TextBox ranaputama;
    private widget.TextBox ranapvip;
    private widget.TextBox ranapvvip;
    private widget.Table tbAdmin;
    private widget.Table tbPengaturanUmum;
    // End of variables declaration//GEN-END:variables

    private void tampil() {
        Valid.tabelKosong(tabMode);
        try{
            ps=koneksi.prepareStatement(
                   "select setpenjualan.ralan, setpenjualan.kelas1, setpenjualan.kelas2, "+
                   "setpenjualan.kelas3, setpenjualan.utama, setpenjualan.vip, setpenjualan.vvip, "+
                   "setpenjualan.beliluar, setpenjualan.jualbebas, setpenjualan.karyawan, "+
                   "setpenjualan.kdjns,jenis.nama from setpenjualan inner join jenis on "+
                   "setpenjualan.kdjns=jenis.kdjns order by jenis.nama");
            try {
                rs=ps.executeQuery();
                while(rs.next()){
                    tabMode.addRow(new Object[]{
                        rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
                        rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),
                        rs.getString(11),rs.getString(12)
                    });
                }
            } catch (Exception e) {
                System.out.println("Notifikasi : "+e);
            } finally{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
            }
        }catch(Exception e){
            System.out.println("Notifikasi : "+e);
        }
    }
    
    private void tampilpengaturanumum() {
        Valid.tabelKosong(tabModePengaturanUmum);
        try{
            ps=koneksi.prepareStatement(
                   "select * from set_harga_obat");
            try {
                rs=ps.executeQuery();
                while(rs.next()){
                    tabModePengaturanUmum.addRow(new Object[]{
                        rs.getString(1)
                    });
                }
            } catch (Exception e) {
                System.out.println("Notifikasi : "+e);
            } finally{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
            }
        }catch(Exception e){
            System.out.println("Notifikasi : "+e);
        }
    }

    private void getData() {
        int row=tbAdmin.getSelectedRow();
        if(row!= -1){
            ralan.setText(tabMode.getValueAt(row,0).toString());
            ranapk1.setText(tabMode.getValueAt(row,1).toString());
            ranapk2.setText(tabMode.getValueAt(row,2).toString());
            ranapk3.setText(tabMode.getValueAt(row,3).toString());
            ranaputama.setText(tabMode.getValueAt(row,4).toString());
            ranapvip.setText(tabMode.getValueAt(row,5).toString());
            ranapvvip.setText(tabMode.getValueAt(row,6).toString());
            beliluar.setText(tabMode.getValueAt(row,7).toString());
            jualbebas.setText(tabMode.getValueAt(row,8).toString());
            karyawan.setText(tabMode.getValueAt(row,9).toString());
            kdjns.setText(tabMode.getValueAt(row,10).toString());
            nmjns.setText(tabMode.getValueAt(row,11).toString());
        }
    }
    
    private void getDataPengaturanUmum() {
        int row=tbPengaturanUmum.getSelectedRow();
        if(row!= -1){
            cmbPengaturan.setSelectedItem(tabModePengaturanUmum.getValueAt(row,0).toString());
        }
    }

    public void emptTeks() {
        if(TabSetting.getSelectedIndex()==0){
            cmbPengaturan.requestFocus();
        }else if(TabSetting.getSelectedIndex()==2){
            ralan.setText("0");
            ranapk1.setText("0");
            ranapk2.setText("0");
            ranapk3.setText("0");
            ranaputama.setText("0");
            ranapvip.setText("0");
            ranapvvip.setText("0");
            beliluar.setText("0");
            jualbebas.setText("0");
            karyawan.setText("0");
            kdjns.setText("");
            nmjns.setText("");
            ralan.requestFocus();
        }            
    }
}
