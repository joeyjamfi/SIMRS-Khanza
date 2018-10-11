/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DlgAdmin.java
 *
 * Created on 21 Jun 10, 20:53:44
 */

package setting;

import fungsi.koneksiDB;
import fungsi.sekuel;
import fungsi.validasi;
import fungsi.WarnaTable;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author perpustakaan
 */
public class DlgSetTarif extends javax.swing.JDialog {
    private final DefaultTableModel tabMode;
    private Connection koneksi=koneksiDB.condb();
    private sekuel Sequel=new sekuel();
    private validasi Valid=new validasi();

    /** Creates new form DlgAdmin 
     *@param parent
     *@param modal*/
    public DlgSetTarif(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(10,10);
        setSize(457,249);

        Object[] row={"Per Poli Ralan","Per Jenis Bayar Ralan","Per Ruang Ranap",
                      "Per Jenis Bayar Ranap","Per Jenis Bayar Laborat",
                      "Per Jenis Bayar Radiologi","Per Jenis Bayar Operasi",
                      "Per Kelas Ranap","Per Kelas Laborat",
                      "Per Kelas Radiologi","Per Kelas Operasi"
        };
        tabMode=new DefaultTableModel(null,row){
              @Override public boolean isCellEditable(int rowIndex, int colIndex){return false;}
        };

        tbAdmin.setModel(tabMode);
        tbAdmin.setPreferredScrollableViewportSize(new Dimension(500,500));
        tbAdmin.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 11; i++) {
            TableColumn column = tbAdmin.getColumnModel().getColumn(i);
            column.setPreferredWidth(150);
        }

        tbAdmin.setDefaultRenderer(Object.class, new WarnaTable());

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalFrame1 = new widget.InternalFrame();
        Scroll = new widget.ScrollPane();
        tbAdmin = new widget.Table();
        panelisi2 = new widget.panelisi();
        label35 = new widget.Label();
        YesNo5 = new widget.ComboBox();
        label36 = new widget.Label();
        label37 = new widget.Label();
        label38 = new widget.Label();
        label39 = new widget.Label();
        YesNo1 = new widget.ComboBox();
        YesNo2 = new widget.ComboBox();
        YesNo3 = new widget.ComboBox();
        YesNo4 = new widget.ComboBox();
        label40 = new widget.Label();
        YesNo6 = new widget.ComboBox();
        label41 = new widget.Label();
        YesNo7 = new widget.ComboBox();
        YesNo8 = new widget.ComboBox();
        label42 = new widget.Label();
        YesNo9 = new widget.ComboBox();
        label43 = new widget.Label();
        YesNo10 = new widget.ComboBox();
        label44 = new widget.Label();
        YesNo11 = new widget.ComboBox();
        label45 = new widget.Label();
        panelisi1 = new widget.panelisi();
        BtnSimpan = new widget.Button();
        BtnBatal = new widget.Button();
        BtnEdit = new widget.Button();
        BtnHapus = new widget.Button();
        BtnKeluar = new widget.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        internalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), "::[ Setup Penggunaan Tarif Ranap, Ralan & Operasi ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(130, 100, 100))); // NOI18N
        internalFrame1.setName("internalFrame1"); // NOI18N
        internalFrame1.setLayout(new java.awt.BorderLayout(1, 1));

        Scroll.setName("Scroll"); // NOI18N
        Scroll.setOpaque(true);

        tbAdmin.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
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

        internalFrame1.add(Scroll, java.awt.BorderLayout.CENTER);

        panelisi2.setName("panelisi2"); // NOI18N
        panelisi2.setPreferredSize(new java.awt.Dimension(100, 224));
        panelisi2.setLayout(null);

        label35.setText("Aktifkan Tarif Per Cara Bayar di Laborat : ");
        label35.setName("label35"); // NOI18N
        label35.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi2.add(label35);
        label35.setBounds(0, 130, 220, 23);

        YesNo5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        YesNo5.setName("YesNo5"); // NOI18N
        YesNo5.setPreferredSize(new java.awt.Dimension(50, 23));
        YesNo5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YesNo5KeyPressed(evt);
            }
        });
        panelisi2.add(YesNo5);
        YesNo5.setBounds(220, 130, 100, 23);

        label36.setText("Aktifkan Tarif Per Poli di Ralan : ");
        label36.setName("label36"); // NOI18N
        label36.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi2.add(label36);
        label36.setBounds(0, 10, 220, 23);

        label37.setText("Aktifkan Tarif Per Cara Bayar di Ralan : ");
        label37.setName("label37"); // NOI18N
        label37.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi2.add(label37);
        label37.setBounds(0, 40, 220, 23);

        label38.setText("Aktifkan Tarif Per Ruang di Ranap : ");
        label38.setName("label38"); // NOI18N
        label38.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi2.add(label38);
        label38.setBounds(0, 70, 220, 23);

        label39.setText("Aktifkan Tarif Per Cara Bayar di Ranap : ");
        label39.setName("label39"); // NOI18N
        label39.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi2.add(label39);
        label39.setBounds(0, 100, 220, 23);

        YesNo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        YesNo1.setName("YesNo1"); // NOI18N
        YesNo1.setPreferredSize(new java.awt.Dimension(50, 23));
        YesNo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YesNo1KeyPressed(evt);
            }
        });
        panelisi2.add(YesNo1);
        YesNo1.setBounds(220, 10, 100, 23);

        YesNo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        YesNo2.setName("YesNo2"); // NOI18N
        YesNo2.setPreferredSize(new java.awt.Dimension(50, 23));
        YesNo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YesNo2KeyPressed(evt);
            }
        });
        panelisi2.add(YesNo2);
        YesNo2.setBounds(220, 40, 100, 23);

        YesNo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        YesNo3.setName("YesNo3"); // NOI18N
        YesNo3.setPreferredSize(new java.awt.Dimension(50, 23));
        YesNo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YesNo3KeyPressed(evt);
            }
        });
        panelisi2.add(YesNo3);
        YesNo3.setBounds(220, 70, 100, 23);

        YesNo4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        YesNo4.setName("YesNo4"); // NOI18N
        YesNo4.setPreferredSize(new java.awt.Dimension(50, 23));
        YesNo4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YesNo4KeyPressed(evt);
            }
        });
        panelisi2.add(YesNo4);
        YesNo4.setBounds(220, 100, 100, 23);

        label40.setText("Aktifkan Tarif Per Cara Bayar di Radiologi : ");
        label40.setName("label40"); // NOI18N
        label40.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi2.add(label40);
        label40.setBounds(0, 160, 220, 23);

        YesNo6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        YesNo6.setName("YesNo6"); // NOI18N
        YesNo6.setPreferredSize(new java.awt.Dimension(50, 23));
        YesNo6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YesNo6KeyPressed(evt);
            }
        });
        panelisi2.add(YesNo6);
        YesNo6.setBounds(220, 160, 100, 23);

        label41.setText("Aktifkan Tarif Per Cara Bayar di Operasi : ");
        label41.setName("label41"); // NOI18N
        label41.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi2.add(label41);
        label41.setBounds(0, 190, 220, 23);

        YesNo7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        YesNo7.setName("YesNo7"); // NOI18N
        YesNo7.setPreferredSize(new java.awt.Dimension(50, 23));
        YesNo7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YesNo7KeyPressed(evt);
            }
        });
        panelisi2.add(YesNo7);
        YesNo7.setBounds(220, 190, 100, 23);

        YesNo8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        YesNo8.setName("YesNo8"); // NOI18N
        YesNo8.setPreferredSize(new java.awt.Dimension(50, 23));
        YesNo8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YesNo8KeyPressed(evt);
            }
        });
        panelisi2.add(YesNo8);
        YesNo8.setBounds(530, 10, 100, 23);

        label42.setText("Aktifkan Tarif Per Kelas di Operasi : ");
        label42.setName("label42"); // NOI18N
        label42.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi2.add(label42);
        label42.setBounds(330, 100, 200, 23);

        YesNo9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        YesNo9.setName("YesNo9"); // NOI18N
        YesNo9.setPreferredSize(new java.awt.Dimension(50, 23));
        YesNo9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YesNo9KeyPressed(evt);
            }
        });
        panelisi2.add(YesNo9);
        YesNo9.setBounds(530, 40, 100, 23);

        label43.setText("Aktifkan Tarif Per Kelas di Radiologi : ");
        label43.setName("label43"); // NOI18N
        label43.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi2.add(label43);
        label43.setBounds(330, 70, 200, 23);

        YesNo10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        YesNo10.setName("YesNo10"); // NOI18N
        YesNo10.setPreferredSize(new java.awt.Dimension(50, 23));
        YesNo10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YesNo10KeyPressed(evt);
            }
        });
        panelisi2.add(YesNo10);
        YesNo10.setBounds(530, 70, 100, 23);

        label44.setText("Aktifkan Tarif Per Kelas di Laborat : ");
        label44.setName("label44"); // NOI18N
        label44.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi2.add(label44);
        label44.setBounds(330, 40, 200, 23);

        YesNo11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        YesNo11.setName("YesNo11"); // NOI18N
        YesNo11.setPreferredSize(new java.awt.Dimension(50, 23));
        YesNo11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YesNo11KeyPressed(evt);
            }
        });
        panelisi2.add(YesNo11);
        YesNo11.setBounds(530, 100, 100, 23);

        label45.setText("Aktifkan Tarif Per Kelas di Ranap : ");
        label45.setName("label45"); // NOI18N
        label45.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi2.add(label45);
        label45.setBounds(330, 10, 200, 23);

        internalFrame1.add(panelisi2, java.awt.BorderLayout.PAGE_START);

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

        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/inventaris.png"))); // NOI18N
        BtnEdit.setMnemonic('G');
        BtnEdit.setText("Ganti");
        BtnEdit.setToolTipText("Alt+G");
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

        getContentPane().add(internalFrame1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        if(tabMode.getRowCount()==0){
            Sequel.menyimpan("set_tarif","?,?,?,?,?,?,?,?,?,?,?","Set Tarif",11,new String[]{
                YesNo1.getSelectedItem().toString(),YesNo2.getSelectedItem().toString(),YesNo3.getSelectedItem().toString(),
                YesNo4.getSelectedItem().toString(),YesNo5.getSelectedItem().toString(),YesNo6.getSelectedItem().toString(),
                YesNo7.getSelectedItem().toString(),YesNo8.getSelectedItem().toString(),YesNo9.getSelectedItem().toString(),
                YesNo10.getSelectedItem().toString(),YesNo11.getSelectedItem().toString()
            });
            tampil();
            emptTeks();
        }else if(tabMode.getRowCount()>0){
            JOptionPane.showMessageDialog(null,"Maaf, Hanya diijinkan satu record ...!!!!");
            
        }
}//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnSimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnSimpanKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnSimpanActionPerformed(null);
        }else{
            Valid.pindah(evt,YesNo7,BtnBatal);
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
            Sequel.queryu("delete from set_tarif");
            tampil();
            emptTeks();
}//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnHapusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnHapusKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnHapusActionPerformed(null);
        }else{
            Valid.pindah(evt, BtnBatal, BtnEdit);
        }
}//GEN-LAST:event_BtnHapusKeyPressed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        Sequel.queryu("delete from set_tarif");
        Sequel.menyimpan("set_tarif","?,?,?,?,?,?,?,?,?,?,?","Set Tarif",11,new String[]{
                YesNo1.getSelectedItem().toString(),YesNo2.getSelectedItem().toString(),YesNo3.getSelectedItem().toString(),
                YesNo4.getSelectedItem().toString(),YesNo5.getSelectedItem().toString(),YesNo6.getSelectedItem().toString(),
                YesNo7.getSelectedItem().toString(),YesNo8.getSelectedItem().toString(),YesNo9.getSelectedItem().toString(),
                YesNo10.getSelectedItem().toString(),YesNo11.getSelectedItem().toString()
        });
        tampil();
        emptTeks();
}//GEN-LAST:event_BtnEditActionPerformed

    private void BtnEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnEditKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnEditActionPerformed(null);
        }else{
            Valid.pindah(evt, BtnHapus, BtnKeluar);
        }
}//GEN-LAST:event_BtnEditKeyPressed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        if(tabMode.getRowCount()==0){
            JOptionPane.showMessageDialog(null,"Maaf, data Set Tarif tidak boleh kosong ...!!!!");
            YesNo1.requestFocus();
        }else if(! (tabMode.getRowCount()==0)) {
            dispose();
        }
}//GEN-LAST:event_BtnKeluarActionPerformed

    private void BtnKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnKeluarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            dispose();
        }else{Valid.pindah(evt,BtnEdit,BtnKeluar);}
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

    private void YesNo5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YesNo5KeyPressed
        Valid.pindah(evt,YesNo4,YesNo6);
    }//GEN-LAST:event_YesNo5KeyPressed

    private void YesNo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YesNo1KeyPressed
        Valid.pindah(evt, BtnKeluar,YesNo2);
    }//GEN-LAST:event_YesNo1KeyPressed

    private void YesNo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YesNo2KeyPressed
        Valid.pindah(evt, YesNo1,YesNo3);
    }//GEN-LAST:event_YesNo2KeyPressed

    private void YesNo3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YesNo3KeyPressed
        Valid.pindah(evt, YesNo2,YesNo4);
    }//GEN-LAST:event_YesNo3KeyPressed

    private void YesNo4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YesNo4KeyPressed
        Valid.pindah(evt, YesNo3,YesNo5);
    }//GEN-LAST:event_YesNo4KeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tampil();
    }//GEN-LAST:event_formWindowOpened

    private void YesNo6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YesNo6KeyPressed
        Valid.pindah(evt, YesNo5,YesNo7);
    }//GEN-LAST:event_YesNo6KeyPressed

    private void YesNo7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YesNo7KeyPressed
        Valid.pindah(evt, YesNo6,BtnSimpan);
    }//GEN-LAST:event_YesNo7KeyPressed

    private void YesNo8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YesNo8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_YesNo8KeyPressed

    private void YesNo9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YesNo9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_YesNo9KeyPressed

    private void YesNo10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YesNo10KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_YesNo10KeyPressed

    private void YesNo11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YesNo11KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_YesNo11KeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            DlgSetTarif dialog = new DlgSetTarif(new javax.swing.JFrame(), true);
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
    private widget.Button BtnKeluar;
    private widget.Button BtnSimpan;
    private widget.ScrollPane Scroll;
    private widget.ComboBox YesNo1;
    private widget.ComboBox YesNo10;
    private widget.ComboBox YesNo11;
    private widget.ComboBox YesNo2;
    private widget.ComboBox YesNo3;
    private widget.ComboBox YesNo4;
    private widget.ComboBox YesNo5;
    private widget.ComboBox YesNo6;
    private widget.ComboBox YesNo7;
    private widget.ComboBox YesNo8;
    private widget.ComboBox YesNo9;
    private widget.InternalFrame internalFrame1;
    private widget.Label label35;
    private widget.Label label36;
    private widget.Label label37;
    private widget.Label label38;
    private widget.Label label39;
    private widget.Label label40;
    private widget.Label label41;
    private widget.Label label42;
    private widget.Label label43;
    private widget.Label label44;
    private widget.Label label45;
    private widget.panelisi panelisi1;
    private widget.panelisi panelisi2;
    private widget.Table tbAdmin;
    // End of variables declaration//GEN-END:variables

    public void tampil() {
        String sql="select * from set_tarif";
        prosesCari(sql);
    }

    private void prosesCari(String sql) {
        Valid.tabelKosong(tabMode);
        try{
            PreparedStatement stat=koneksi.prepareStatement(sql);
            ResultSet rs=stat.executeQuery();
            while(rs.next()){
                tabMode.addRow(new Object[]{
                    rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6),
                    rs.getString(7),rs.getString(8),rs.getString(9),
                    rs.getString(10),rs.getString(11)});
            }
        }catch(SQLException e){
            System.out.println("Notifikasi : "+e);
        }
    }

    private void getData() {
        int row=tbAdmin.getSelectedRow();
        if(row!= -1){
            YesNo1.setSelectedItem(tbAdmin.getValueAt(row,0).toString());
            YesNo2.setSelectedItem(tbAdmin.getValueAt(row,1).toString());
            YesNo3.setSelectedItem(tbAdmin.getValueAt(row,2).toString());
            YesNo4.setSelectedItem(tbAdmin.getValueAt(row,3).toString());
            YesNo5.setSelectedItem(tbAdmin.getValueAt(row,4).toString());
            YesNo6.setSelectedItem(tbAdmin.getValueAt(row,5).toString());
            YesNo7.setSelectedItem(tbAdmin.getValueAt(row,6).toString());
            YesNo8.setSelectedItem(tbAdmin.getValueAt(row,7).toString());
            YesNo9.setSelectedItem(tbAdmin.getValueAt(row,8).toString());
            YesNo10.setSelectedItem(tbAdmin.getValueAt(row,9).toString());
            YesNo11.setSelectedItem(tbAdmin.getValueAt(row,10).toString());
        }
    }

    public void emptTeks() {
        YesNo1.setSelectedIndex(0);
        YesNo2.setSelectedIndex(0);
        YesNo3.setSelectedIndex(0);
        YesNo4.setSelectedIndex(0);
        YesNo5.setSelectedIndex(0);
        YesNo6.setSelectedIndex(0);
        YesNo7.setSelectedIndex(0);
        YesNo8.setSelectedIndex(0);
        YesNo9.setSelectedIndex(0);
        YesNo10.setSelectedIndex(0);
        YesNo11.setSelectedIndex(0);
    }
}
