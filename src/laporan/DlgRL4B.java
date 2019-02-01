package laporan;
import keuangan.Jurnal;
import keuangan.*;
import fungsi.koneksiDB;
import fungsi.sekuel;
import fungsi.validasi;
import fungsi.var;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

public class DlgRL4B extends javax.swing.JDialog {
    private final sekuel Sequel=new sekuel();
    private final validasi Valid=new validasi();
    private final Jurnal jur=new Jurnal();
    private final Connection koneksi=koneksiDB.condb();
    private PreparedStatement ps,ps2,ps3;
    private ResultSet rs,rs2;
    private final String diagnosa="";
    private StringBuilder htmlContent;
    private int hr0s6l=0,hr0s6p=0,hr7s28l=0,hr7s28p=0,hr28s1thl=0,hr28s1thp=0,th1s4l=0,th1s4p=0,th5s14l=0,th5s14p=0,
                th15s24l=0,th15s24p=0,th25s44l=0,th25s44p=0,th45s64l=0,th45s64p=0,lbth65l=0,lbth65p=0,mati=0;
    
    /** Creates new form DlgProgramStudi
     * @param parent
     * @param modal */
    public DlgRL4B(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
        HTMLEditorKit kit = new HTMLEditorKit();
        LoadHTML.setEditable(true);
        LoadHTML.setEditorKit(kit);
        StyleSheet styleSheet = kit.getStyleSheet();
        styleSheet.addRule(
                ".isi td{border-right: 1px solid #e2e7dd;font: 8.5px tahoma;height:12px;border-bottom: 1px solid #e2e7dd;background: #ffffff;color:#464646;}"+
                ".isi2 td{font: 8.5px tahoma;height:12px;background: #ffffff;color:#464646;}"+
                ".isi3 td{border-right: 1px solid #e2e7dd;font: 8.5px tahoma;height:12px;border-top: 1px solid #e2e7dd;background: #ffffff;color:#464646;}"+
                ".isi4 td{font: 11px tahoma;height:12px;border-top: 1px solid #e2e7dd;background: #ffffff;color:#464646;}"
        );
        Document doc = kit.createDefaultDocument();
        LoadHTML.setDocument(doc);
    }
    private Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
    private int i=0;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kd2 = new widget.TextBox();
        internalFrame1 = new widget.InternalFrame();
        panelisi1 = new widget.panelisi();
        label11 = new widget.Label();
        Tgl1 = new widget.Tanggal();
        label18 = new widget.Label();
        Tgl2 = new widget.Tanggal();
        btnCari = new widget.Button();
        label9 = new widget.Label();
        BtnPrint = new widget.Button();
        BtnKeluar = new widget.Button();
        Scroll = new widget.ScrollPane();
        LoadHTML = new widget.editorpane();

        Kd2.setName("Kd2"); // NOI18N
        Kd2.setPreferredSize(new java.awt.Dimension(207, 23));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        internalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), "::[ RL 4B Data Keadaan Morbiditas Pasien Rawat Jalan ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(70, 70, 70))); // NOI18N
        internalFrame1.setName("internalFrame1"); // NOI18N
        internalFrame1.setLayout(new java.awt.BorderLayout(1, 1));

        panelisi1.setName("panelisi1"); // NOI18N
        panelisi1.setPreferredSize(new java.awt.Dimension(100, 56));
        panelisi1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 9));

        label11.setText("Tanggal :");
        label11.setName("label11"); // NOI18N
        label11.setPreferredSize(new java.awt.Dimension(55, 23));
        panelisi1.add(label11);

        Tgl1.setEditable(false);
        Tgl1.setDisplayFormat("dd-MM-yyyy");
        Tgl1.setName("Tgl1"); // NOI18N
        Tgl1.setPreferredSize(new java.awt.Dimension(100, 23));
        panelisi1.add(Tgl1);

        label18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label18.setText("s.d.");
        label18.setName("label18"); // NOI18N
        label18.setPreferredSize(new java.awt.Dimension(30, 23));
        panelisi1.add(label18);

        Tgl2.setEditable(false);
        Tgl2.setDisplayFormat("dd-MM-yyyy");
        Tgl2.setName("Tgl2"); // NOI18N
        Tgl2.setPreferredSize(new java.awt.Dimension(100, 23));
        panelisi1.add(Tgl2);

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/accept.png"))); // NOI18N
        btnCari.setMnemonic('2');
        btnCari.setToolTipText("Alt+2");
        btnCari.setName("btnCari"); // NOI18N
        btnCari.setPreferredSize(new java.awt.Dimension(28, 23));
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        btnCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCariKeyPressed(evt);
            }
        });
        panelisi1.add(btnCari);

        label9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label9.setName("label9"); // NOI18N
        label9.setPreferredSize(new java.awt.Dimension(100, 30));
        panelisi1.add(label9);

        BtnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/b_print.png"))); // NOI18N
        BtnPrint.setMnemonic('T');
        BtnPrint.setText("Cetak");
        BtnPrint.setToolTipText("Alt+T");
        BtnPrint.setName("BtnPrint"); // NOI18N
        BtnPrint.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrintActionPerformed(evt);
            }
        });
        BtnPrint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnPrintKeyPressed(evt);
            }
        });
        panelisi1.add(BtnPrint);

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

        Scroll.setName("Scroll"); // NOI18N
        Scroll.setOpaque(true);

        LoadHTML.setBorder(null);
        LoadHTML.setName("LoadHTML"); // NOI18N
        Scroll.setViewportView(LoadHTML);

        internalFrame1.add(Scroll, java.awt.BorderLayout.CENTER);

        getContentPane().add(internalFrame1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
private void KdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TKdKeyPressed
    Valid.pindah(evt,BtnCari,Nm);
}//GEN-LAST:event_TKdKeyPressed
*/

    private void BtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrintActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            
            File g = new File("file2.css");            
            BufferedWriter bg = new BufferedWriter(new FileWriter(g));
            bg.write(
                    ".isi td{border-right: 1px solid #e2e7dd;font: 11px tahoma;height:12px;border-bottom: 1px solid #e2e7dd;background: #ffffff;color:#464646;}"+
                    ".isi2 td{font: 11px tahoma;height:12px;background: #ffffff;color:#464646;}"+                    
                    ".isi3 td{border-right: 1px solid #e2e7dd;font: 11px tahoma;height:12px;border-top: 1px solid #e2e7dd;background: #ffffff;color:#464646;}"+
                    ".isi4 td{font: 11px tahoma;height:12px;border-top: 1px solid #e2e7dd;background: #ffffff;color:#464646;}"
            );
            bg.close();
            
            File f = new File("rl4b.html");            
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));            
            bw.write(LoadHTML.getText().replaceAll(
                    "<head>","<head><link href=\"file2.css\" rel=\"stylesheet\" type=\"text/css\" />"+
                        "<table width='100%' border='0' align='center' cellpadding='3px' cellspacing='0' class='tbl_form'>"+
                            "<tr class='isi2'>"+
                                "<td valign='top' align='center'>"+
                                    "<font size='4' face='Tahoma'>"+var.getnamars()+"</font><br>"+
                                    var.getalamatrs()+", "+var.getkabupatenrs()+", "+var.getpropinsirs()+"<br>"+
                                    var.getkontakrs()+", E-mail : "+var.getemailrs()+"<br><br>"+
                                    "<font size='2' face='Tahoma'>DATA KEADAAN MORBIDITAS PASIEN RAWAT JALAN RUMAH SAKIT PENYEBAB KECELAKAN<br>PERIODE "+Tgl1.getSelectedItem()+" s.d. "+Tgl2.getSelectedItem()+"<br><br></font>"+        
                                "</td>"+
                           "</tr>"+
                        "</table>")
            );
            bw.close();                         
            Desktop.getDesktop().browse(f.toURI());
        } catch (Exception e) {
            System.out.println("Notifikasi : "+e);
        }     
        
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_BtnPrintActionPerformed

    private void BtnPrintKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnPrintKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnPrintActionPerformed(null);
        }else{
            Valid.pindah(evt,Tgl2,BtnKeluar);
        }
    }//GEN-LAST:event_BtnPrintKeyPressed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_BtnKeluarActionPerformed

    private void BtnKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnKeluarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            dispose();
        }else{Valid.pindah(evt,BtnPrint,Tgl1);}
    }//GEN-LAST:event_BtnKeluarKeyPressed

private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
    prosesCari();
}//GEN-LAST:event_btnCariActionPerformed

private void btnCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCariKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            btnCariActionPerformed(null);
        }else{
            Valid.pindah(evt, Tgl2, BtnPrint);
        }
}//GEN-LAST:event_btnCariKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        prosesCari();
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            DlgRL4B dialog = new DlgRL4B(new javax.swing.JFrame(), true);
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
    private widget.Button BtnKeluar;
    private widget.Button BtnPrint;
    private widget.TextBox Kd2;
    private widget.editorpane LoadHTML;
    private widget.ScrollPane Scroll;
    private widget.Tanggal Tgl1;
    private widget.Tanggal Tgl2;
    private widget.Button btnCari;
    private widget.InternalFrame internalFrame1;
    private widget.Label label11;
    private widget.Label label18;
    private widget.Label label9;
    private widget.panelisi panelisi1;
    // End of variables declaration//GEN-END:variables

    private void prosesCari() {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            htmlContent = new StringBuilder();
            htmlContent.append(                             
                "<tr class='isi'>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' width='2%' rowspan='3'>No.Urut</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' width='5%' rowspan='3'>No.Daftar Terperinci</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' width='18%' rowspan='3'>Golongan Sebab Penyakit</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' width='55%' colspan='18'>Jumlah Pasien Hidup dan Mati menurut Golongan Umur & Jenis Kelamin</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' width='10%' colspan='2'>Pasien Keluar (Hidup & Mati) Menurut Jenis Kelamin</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' width='5%' rowspan='3'>Jumlah Pasien Keluar Hidup (23+24)</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' width='5%' rowspan='3'>Jumlah Pasien Keluar Mati</td>"+
                "</tr>"+
                "<tr class='isi'>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' colspan='2'>0-6 hr</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' colspan='2'>7-28hr</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' colspan='2'>28hr-<1th</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' colspan='2'>1-4th</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' colspan='2'>5-14th</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' colspan='2'>15-24th</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' colspan='2'>25-44th</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' colspan='2'>45-64th</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' colspan='2'>> 65</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' rowspan='2'>LK</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center' rowspan='2'>PR</td>"+
                "</tr>"+
                "<tr class='isi'>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>L</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>P</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>L</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>P</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>L</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>P</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>L</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>P</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>L</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>P</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>L</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>P</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>L</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>P</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>L</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>P</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>L</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>P</td>"+
                "</tr>"+
                "<tr class='isi'>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>1</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>2</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>3</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>4</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>5</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>6</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>7</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>8</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>9</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>10</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>11</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>12</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>13</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>14</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>15</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>16</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>17</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>18</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>19</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>20</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>21</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>22</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>23</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>24</td>"+
                    "<td valign='middle' bgcolor='#fafff5' align='center'>25</td>"+
                "</tr>"
            );            
            ps=koneksi.prepareStatement("select diagnosa_pasien.kd_penyakit,SUBSTRING(penyakit.nm_penyakit,1,80) as nm_penyakit from diagnosa_pasien inner join penyakit "+
                    "inner join reg_periksa on diagnosa_pasien.kd_penyakit=penyakit.kd_penyakit and reg_periksa.no_rawat=diagnosa_pasien.no_rawat "+
                    "where diagnosa_pasien.status='Ralan' and reg_periksa.tgl_registrasi between ? and ? and left(diagnosa_pasien.kd_penyakit,1)<>'V' or "+
                    " diagnosa_pasien.status='Ralan' and reg_periksa.tgl_registrasi between ? and ? and left(diagnosa_pasien.kd_penyakit,1)<>'W' or "+
                    " diagnosa_pasien.status='Ralan' and reg_periksa.tgl_registrasi between ? and ? and left(diagnosa_pasien.kd_penyakit,1)<>'X' or "+
                    " diagnosa_pasien.status='Ralan' and reg_periksa.tgl_registrasi between ? and ? and left(diagnosa_pasien.kd_penyakit,1)<>'Y' "+
                    " group by diagnosa_pasien.kd_penyakit order by diagnosa_pasien.kd_penyakit");
            try {
                ps.setString(1,Valid.SetTgl(Tgl1.getSelectedItem()+""));
                ps.setString(2,Valid.SetTgl(Tgl2.getSelectedItem()+""));
                ps.setString(3,Valid.SetTgl(Tgl1.getSelectedItem()+""));
                ps.setString(4,Valid.SetTgl(Tgl2.getSelectedItem()+""));
                ps.setString(5,Valid.SetTgl(Tgl1.getSelectedItem()+""));
                ps.setString(6,Valid.SetTgl(Tgl2.getSelectedItem()+""));
                ps.setString(7,Valid.SetTgl(Tgl1.getSelectedItem()+""));
                ps.setString(8,Valid.SetTgl(Tgl2.getSelectedItem()+""));
                rs=ps.executeQuery();
                i=1;
                while(rs.next()){
                    hr0s6l=0;hr0s6p=0;hr7s28l=0;hr7s28p=0;hr28s1thl=0;hr28s1thp=0;th1s4l=0;th1s4p=0;th5s14l=0;th5s14p=0;
                    th15s24l=0;th15s24p=0;th25s44l=0;th25s44p=0;th45s64l=0;th45s64p=0;lbth65l=0;lbth65p=0;mati=0;
                    ps2=koneksi.prepareStatement(
                            "select diagnosa_pasien.kd_penyakit,reg_periksa.umurdaftar,reg_periksa.sttsumur,pasien.jk "+
                            "from diagnosa_pasien inner join reg_periksa inner join pasien "+
                            "on reg_periksa.no_rawat=diagnosa_pasien.no_rawat and reg_periksa.no_rkm_medis=pasien.no_rkm_medis "+
                            "where diagnosa_pasien.status='Ralan' "+
                            "and reg_periksa.tgl_registrasi between ? and ? and diagnosa_pasien.kd_penyakit=?");
                    try {
                        ps2.setString(1,Valid.SetTgl(Tgl1.getSelectedItem()+""));
                        ps2.setString(2,Valid.SetTgl(Tgl2.getSelectedItem()+""));
                        ps2.setString(3,rs.getString("kd_penyakit"));
                        rs2=ps2.executeQuery();
                        while(rs2.next()){
                            if(rs2.getString("sttsumur").equals("Hr")){
                                if((rs2.getInt("umurdaftar")>=0)&&(rs2.getInt("umurdaftar")<=6)){
                                    if(rs2.getString("jk").equals("L")){
                                        hr0s6l++;
                                    }else if(rs2.getString("jk").equals("P")){
                                        hr0s6p++;
                                    }
                                }else if((rs2.getInt("umurdaftar")>=7)&&(rs2.getInt("umurdaftar")<=28)){
                                    if(rs2.getString("jk").equals("L")){
                                        hr7s28l++;
                                    }else if(rs2.getString("jk").equals("P")){
                                        hr7s28p++;
                                    }
                                }else if(rs2.getInt("umurdaftar")>28){
                                    if(rs2.getString("jk").equals("L")){
                                        hr28s1thl++;
                                    }else if(rs2.getString("jk").equals("P")){
                                        hr28s1thp++;
                                    }
                                }
                            }else if(rs2.getString("sttsumur").equals("Bl")){
                                if(rs2.getString("jk").equals("L")){
                                    hr28s1thl++;
                                }else if(rs2.getString("jk").equals("P")){
                                    hr28s1thp++;
                                }
                            }else if(rs2.getString("sttsumur").equals("Th")){
                                if((rs2.getInt("umurdaftar")>=0)&&(rs2.getInt("umurdaftar")<=4)){
                                    if(rs2.getString("jk").equals("L")){
                                        th1s4l++;
                                    }else if(rs2.getString("jk").equals("P")){
                                        th1s4p++;
                                    }
                                }else if((rs2.getInt("umurdaftar")>=5)&&(rs2.getInt("umurdaftar")<=14)){
                                    if(rs2.getString("jk").equals("L")){
                                        th5s14l++;
                                    }else if(rs2.getString("jk").equals("P")){
                                        th5s14p++;
                                    }
                                }else if((rs2.getInt("umurdaftar")>=15)&&(rs2.getInt("umurdaftar")<=24)){
                                    if(rs2.getString("jk").equals("L")){
                                        th15s24l++;
                                    }else if(rs2.getString("jk").equals("P")){
                                        th15s24p++;
                                    }
                                }else if((rs2.getInt("umurdaftar")>=25)&&(rs2.getInt("umurdaftar")<=44)){
                                    if(rs2.getString("jk").equals("L")){
                                        th25s44l++;
                                    }else if(rs2.getString("jk").equals("P")){
                                        th25s44p++;
                                    }
                                }else if((rs2.getInt("umurdaftar")>=45)&&(rs2.getInt("umurdaftar")<=64)){
                                    if(rs2.getString("jk").equals("L")){
                                        th45s64l++;
                                    }else if(rs2.getString("jk").equals("P")){
                                        th45s64p++;
                                    }
                                }else if(rs2.getInt("umurdaftar")>=65){
                                    if(rs2.getString("jk").equals("L")){
                                        lbth65l++;
                                    }else if(rs2.getString("jk").equals("P")){
                                        lbth65p++;
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("laporan.DlgRL4B.prosesCari() 1 : "+e);
                    } finally{
                        if(rs2!=null){
                            rs2.close();
                        }
                        if(ps2!=null){
                            ps2.close();
                        }
                    }
                    
                    ps3=koneksi.prepareStatement(
                            "select count(pasien_mati.no_rkm_medis) "+
                            "from diagnosa_pasien inner join reg_periksa inner join pasien inner join pasien_mati "+
                            "on reg_periksa.no_rawat=diagnosa_pasien.no_rawat and reg_periksa.no_rkm_medis=pasien.no_rkm_medis "+
                            "and pasien_mati.no_rkm_medis=pasien.no_rkm_medis where diagnosa_pasien.status='Ralan' "+
                            "and reg_periksa.tgl_registrasi between ? and ? and diagnosa_pasien.kd_penyakit=? "+
                            "group by diagnosa_pasien.kd_penyakit");
                    try {
                        ps3.setString(1,Valid.SetTgl(Tgl1.getSelectedItem()+""));
                        ps3.setString(2,Valid.SetTgl(Tgl2.getSelectedItem()+""));
                        ps3.setString(3,rs.getString("kd_penyakit"));
                        rs2=ps3.executeQuery();
                        while(rs2.next()){
                            mati=rs2.getInt(1);
                        }
                    } catch (Exception e) {
                        System.out.println("laporan.DlgRL4A.prosesCari() 2 : "+e);
                    } finally{
                        if(rs2!=null){
                            rs2.close();
                        }
                        if(ps2!=null){
                            ps2.close();
                        }
                    }
                    htmlContent.append(
                        "<tr class='isi'>"+
                            "<td valign='middle' align='center'>"+i+"</td>"+
                            "<td valign='middle' align='center'>"+rs.getString("kd_penyakit")+"</td>"+
                            "<td valign='middle' align='center'>"+rs.getString("nm_penyakit")+"</td>"+
                            "<td valign='middle' align='center'>"+hr0s6l+"</td>"+
                            "<td valign='middle' align='center'>"+hr0s6p+"</td>"+
                            "<td valign='middle' align='center'>"+hr7s28l+"</td>"+
                            "<td valign='middle' align='center'>"+hr7s28p+"</td>"+
                            "<td valign='middle' align='center'>"+hr28s1thl+"</td>"+
                            "<td valign='middle' align='center'>"+hr28s1thp+"</td>"+
                            "<td valign='middle' align='center'>"+th1s4l+"</td>"+
                            "<td valign='middle' align='center'>"+th1s4p+"</td>"+
                            "<td valign='middle' align='center'>"+th5s14l+"</td>"+
                            "<td valign='middle' align='center'>"+th5s14p+"</td>"+
                            "<td valign='middle' align='center'>"+th15s24l+"</td>"+
                            "<td valign='middle' align='center'>"+th15s24p+"</td>"+
                            "<td valign='middle' align='center'>"+th25s44l+"</td>"+
                            "<td valign='middle' align='center'>"+th25s44p+"</td>"+
                            "<td valign='middle' align='center'>"+th45s64l+"</td>"+
                            "<td valign='middle' align='center'>"+th45s64p+"</td>"+
                            "<td valign='middle' align='center'>"+lbth65l+"</td>"+
                            "<td valign='middle' align='center'>"+lbth65p+"</td>"+
                            "<td valign='middle' align='center'>"+(hr0s6l+hr7s28l+hr28s1thl+th1s4l+th5s14l+th15s24l+th25s44l+th45s64l+lbth65l)+"</td>"+
                            "<td valign='middle' align='center'>"+(hr0s6p+hr7s28p+hr28s1thp+th1s4p+th5s14p+th15s24p+th25s44p+th45s64p+lbth65p)+"</td>"+
                            "<td valign='middle' align='center'>"+(hr0s6l+hr7s28l+hr28s1thl+th1s4l+th5s14l+th15s24l+th25s44l+th45s64l+lbth65l+hr0s6p+hr7s28p+hr28s1thp+th1s4p+th5s14p+th15s24p+th25s44p+th45s64p+lbth65p-mati)+"</td>"+
                            "<td valign='middle' align='center'>"+mati+"</td>"+
                        "</tr>"
                    );
                    i++;
                }
            } catch (Exception e) {
                System.out.println("laporan.DlgRL4A.prosesCari() 3 : "+e);
            } finally{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
            }
            LoadHTML.setText(
                    "<html>"+
                      "<table width='100%' border='0' align='center' cellpadding='3px' cellspacing='0' class='tbl_form'>"+
                       htmlContent.toString()+
                      "</table>"+
                    "</html>");
        } catch (Exception e) {
            System.out.println("laporan.DlgRL4A.prosesCari() 5 : "+e);
        } 
        this.setCursor(Cursor.getDefaultCursor());
        
    }
    
    public void isCek(){
        BtnPrint.setEnabled(var.getrl4bsebab());
    }
    
}
