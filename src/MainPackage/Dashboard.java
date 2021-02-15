package MainPackage;

import com.mysql.jdbc.Connection;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import javax.swing.JFrame;
import java.sql.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame implements ActionListener {

    String email;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd:MM:yyyy HH:mm:ss");

    public Dashboard() {
        initComponents();
        setVisible(true);
        setSize(1160, 610);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtVol.setVisible(false);
        lblVol.setVisible(false);
        txtPrice.setVisible(false);
        lblP.setVisible(false);

    }

    public Dashboard(Component parent, String Uname) {
        initComponents();
        setVisible(true);
        setSize(1160, 610);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtVol.setVisible(false);
        lblVol.setVisible(false);
        txtPrice.setVisible(false);
        lblP.setVisible(false);
        //this.parent = parent;
        this.email = Uname;
        updateClock();
        new Timer(1000, (ActionListener) this).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        utilCalendarModel1 = new org.jdatepicker.impl.UtilCalendarModel();
        utilCalendarModel2 = new org.jdatepicker.impl.UtilCalendarModel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblthree = new javax.swing.JTable();
        cbReport = new javax.swing.JComboBox<>();
        btnReport = new javax.swing.JButton();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbltwo = new javax.swing.JTable();
        cbChoose = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtVol = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();
        lbln = new javax.swing.JLabel();
        lblVol = new javax.swing.JLabel();
        lblP = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jPanel5 = new javax.swing.JPanel();
        btnMaps = new javax.swing.JButton();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblfour = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtprodId = new javax.swing.JTextField();
        txtprodname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprodqtty = new javax.swing.JTextField();
        txtprodvol = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        txtSaleA = new javax.swing.JTextField();
        dtpSaleDate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtpharID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtpharN = new javax.swing.JTextField();
        txtdocID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtdocN = new javax.swing.JTextField();
        btnPhar = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jPanel6 = new javax.swing.JPanel();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        btnLogout = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel7 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUName = new javax.swing.JLabel();
        txtUregion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Clock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1160, 610));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(jTabbedPane8);
        jTabbedPane8.setBounds(40, 70, 2, 4);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 102, 204));
        kGradientPanel1.setLayout(null);

        jTabbedPane9.setBackground(new java.awt.Color(153, 0, 255));
        jTabbedPane9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N

        jPanel4.setLayout(null);

        tblthree.setBackground(new java.awt.Color(204, 0, 255));
        tblthree.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 102)));
        tblthree.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        tblthree.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblthree);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(36, 96, 560, 270);

        cbReport.setBackground(new java.awt.Color(204, 0, 204));
        cbReport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Pharmacy Sales", "Doctor Sales" }));
        cbReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbReportActionPerformed(evt);
            }
        });
        jPanel4.add(cbReport);
        cbReport.setBounds(40, 40, 150, 26);

        btnReport.setBackground(new java.awt.Color(204, 0, 204));
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPackage/printer_1.png"))); // NOI18N
        btnReport.setText("Print Records");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        jPanel4.add(btnReport);
        btnReport.setBounds(630, 60, 240, 110);

        kGradientPanel3.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(255, 102, 255));

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel4.add(kGradientPanel3);
        kGradientPanel3.setBounds(0, -10, 920, 470);

        jTabbedPane9.addTab("Reports", jPanel4);

        jPanel3.setLayout(null);

        tbltwo.setBackground(new java.awt.Color(204, 0, 255));
        tbltwo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));
        tbltwo.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        tbltwo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbltwo);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(40, 90, 360, 290);

        cbChoose.setBackground(new java.awt.Color(204, 0, 204));
        cbChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Doctors", "Pharmacy", "Products" }));
        cbChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChooseActionPerformed(evt);
            }
        });
        jPanel3.add(cbChoose);
        cbChoose.setBounds(40, 30, 140, 26);
        jPanel3.add(txtId);
        txtId.setBounds(490, 40, 100, 24);
        jPanel3.add(txtName);
        txtName.setBounds(650, 40, 110, 24);
        jPanel3.add(txtVol);
        txtVol.setBounds(650, 110, 110, 24);
        jPanel3.add(txtPrice);
        txtPrice.setBounds(650, 190, 110, 24);

        btnEnter.setBackground(new java.awt.Color(204, 0, 204));
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPackage/enter (1).png"))); // NOI18N
        btnEnter.setText("Enter");
        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnterMouseClicked(evt);
            }
        });
        jPanel3.add(btnEnter);
        btnEnter.setBounds(510, 260, 250, 90);

        lblid.setText("Enter ID");
        jPanel3.add(lblid);
        lblid.setBounds(490, 20, 80, 16);

        lbln.setText("Enter Name");
        jPanel3.add(lbln);
        lbln.setBounds(650, 20, 80, 16);

        lblVol.setText("Enter Volume");
        jPanel3.add(lblVol);
        lblVol.setBounds(650, 90, 80, 16);

        lblP.setText("Enter Price");
        jPanel3.add(lblP);
        lblP.setBounds(650, 170, 80, 16);

        kGradientPanel5.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel5.setkStartColor(new java.awt.Color(255, 102, 255));

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel3.add(kGradientPanel5);
        kGradientPanel5.setBounds(0, -10, 920, 470);

        jTabbedPane9.addTab("Clients & Stock", jPanel3);

        jPanel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel5ComponentShown(evt);
            }
        });
        jPanel5.setLayout(null);

        btnMaps.setBackground(new java.awt.Color(153, 0, 255));
        btnMaps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPackage/enter (1).png"))); // NOI18N
        btnMaps.setText("Open Maps");
        btnMaps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMapsMouseClicked(evt);
            }
        });
        jPanel5.add(btnMaps);
        btnMaps.setBounds(540, 90, 250, 92);

        kGradientPanel6.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel6.setkStartColor(new java.awt.Color(255, 102, 255));

        tblfour.setBackground(new java.awt.Color(204, 0, 255));
        tblfour.setBorder(new javax.swing.border.MatteBorder(null));
        tblfour.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        tblfour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblfour);

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel5.add(kGradientPanel6);
        kGradientPanel6.setBounds(-10, 0, 930, 470);

        jTabbedPane9.addTab("Sellers", jPanel5);

        jPanel1.setLayout(null);

        jLabel3.setText("Product ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 50, 110, 16);
        jPanel1.add(txtprodId);
        txtprodId.setBounds(110, 50, 135, 24);

        txtprodname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtprodnameMouseClicked(evt);
            }
        });
        jPanel1.add(txtprodname);
        txtprodname.setBounds(370, 50, 152, 24);

        jLabel4.setText("Product Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 50, 81, 16);

        jLabel5.setText("Volume");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 90, 43, 16);
        jPanel1.add(txtprodqtty);
        txtprodqtty.setBounds(330, 90, 74, 24);
        jPanel1.add(txtprodvol);
        txtprodvol.setBounds(110, 90, 130, 24);

        jLabel6.setText("Qty");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 90, 19, 16);

        jLabel7.setText("Price");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(470, 90, 30, 16);

        jLabel8.setText("Total Amount");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(660, 90, 75, 16);
        jPanel1.add(txtprice);
        txtprice.setBounds(510, 90, 121, 24);

        txtSaleA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSaleAMouseClicked(evt);
            }
        });
        jPanel1.add(txtSaleA);
        txtSaleA.setBounds(750, 90, 135, 24);

        dtpSaleDate.setDateFormatString("MM/d/YYYY");
        jPanel1.add(dtpSaleDate);
        dtpSaleDate.setBounds(660, 50, 127, 24);

        jLabel9.setText("Date");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(610, 50, 26, 16);
        jPanel1.add(txtpharID);
        txtpharID.setBounds(130, 210, 100, 24);

        jLabel10.setText("Pharmacy ID");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 210, 82, 16);

        jLabel11.setText("Pharmacy Name");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(240, 210, 94, 16);

        jLabel12.setText("Doctor ID");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(472, 210, 80, 16);

        txtpharN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpharNMouseClicked(evt);
            }
        });
        jPanel1.add(txtpharN);
        txtpharN.setBounds(340, 210, 120, 24);
        jPanel1.add(txtdocID);
        txtdocID.setBounds(540, 210, 100, 24);

        jLabel13.setText("Doctor Name");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(650, 210, 89, 16);

        txtdocN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdocNMouseClicked(evt);
            }
        });
        jPanel1.add(txtdocN);
        txtdocN.setBounds(740, 210, 150, 24);

        btnPhar.setBackground(new java.awt.Color(153, 0, 153));
        btnPhar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPackage/enter (1).png"))); // NOI18N
        btnPhar.setText("Enter Pharmacy Sales");
        btnPhar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPharMouseClicked(evt);
            }
        });
        jPanel1.add(btnPhar);
        btnPhar.setBounds(53, 247, 210, 70);

        btnDoc.setBackground(new java.awt.Color(153, 0, 153));
        btnDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPackage/enter (1).png"))); // NOI18N
        btnDoc.setText("Enter Doctor Sales");
        btnDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDocMouseClicked(evt);
            }
        });
        jPanel1.add(btnDoc);
        btnDoc.setBounds(510, 250, 200, 70);

        kGradientPanel7.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel7.setkStartColor(new java.awt.Color(255, 102, 255));

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel1.add(kGradientPanel7);
        kGradientPanel7.setBounds(0, -10, 920, 470);

        jTabbedPane9.addTab("Sales", jPanel1);

        kGradientPanel8.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel8.setkStartColor(new java.awt.Color(255, 102, 255));

        btnLogout.setBackground(new java.awt.Color(204, 0, 204));
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("About us");

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        jLabel15.setText("Powered by Softgenix Technologies");

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        jLabel16.setText("2021");

        jLabel17.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPackage/icons8-facebook-24.png"))); // NOI18N
        jLabel17.setText("Like us on facebook");

        jLabel18.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPackage/icons8-instagram-24.png"))); // NOI18N
        jLabel18.setText("Follow us on Instagram");

        jLabel19.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        jLabel19.setText("+94  76 569 42 48");

        jLabel20.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        jLabel20.setText("Contact Us :");

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel8Layout.createSequentialGroup()
                .addContainerGap(563, Short.MAX_VALUE)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(148, 148, 148))
                        .addGroup(kGradientPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18))
                            .addContainerGap()))
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))))
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(20, 20, 20)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addContainerGap(263, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane9.addTab("Settings", jPanel6);

        jPanel2.setLayout(null);

        cbType.setBackground(new java.awt.Color(204, 0, 204));
        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Pharmacy Sales", "Doctor Sales" }));
        cbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypeActionPerformed(evt);
            }
        });
        jPanel2.add(cbType);
        cbType.setBounds(40, 30, 140, 26);

        table1.setBackground(new java.awt.Color(204, 0, 255));
        table1.setBorder(new javax.swing.border.MatteBorder(null));
        table1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        table1.setModel(table1.getModel());
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setHeaderValue("Pharmacy Id");
            table1.getColumnModel().getColumn(1).setHeaderValue("Pharmacy Name");
            table1.getColumnModel().getColumn(2).setHeaderValue("Product ID");
            table1.getColumnModel().getColumn(3).setHeaderValue("Product Name");
            table1.getColumnModel().getColumn(4).setHeaderValue("Product Volume");
            table1.getColumnModel().getColumn(5).setHeaderValue("Product Qty");
            table1.getColumnModel().getColumn(6).setHeaderValue("Sales Amount");
            table1.getColumnModel().getColumn(7).setHeaderValue("Sale Date");
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(23, 70, 860, 310);

        kGradientPanel9.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel9.setkStartColor(new java.awt.Color(255, 102, 255));

        javax.swing.GroupLayout kGradientPanel9Layout = new javax.swing.GroupLayout(kGradientPanel9);
        kGradientPanel9.setLayout(kGradientPanel9Layout);
        kGradientPanel9Layout.setHorizontalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        kGradientPanel9Layout.setVerticalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel2.add(kGradientPanel9);
        kGradientPanel9.setBounds(0, -10, 920, 470);

        jTabbedPane9.addTab("Sales Check", jPanel2);

        kGradientPanel1.add(jTabbedPane9);
        jTabbedPane9.setBounds(210, 100, 920, 480);

        jPanel7.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPackage/profile.png"))); // NOI18N

        txtUName.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        txtUName.setForeground(new java.awt.Color(0, 0, 102));
        txtUName.setText("jLabel14");

        txtUregion.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        txtUregion.setForeground(new java.awt.Color(0, 0, 102));
        txtUregion.setText("jLabel14");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUregion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUregion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(396, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(kGradientPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        kGradientPanel1.add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 170, 610);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Dashboard");
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(840, 10, 310, 150);

        Clock.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        Clock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPackage/placeholder.png"))); // NOI18N
        Clock.setText("jLabel14");
        kGradientPanel1.add(Clock);
        Clock.setBounds(220, 40, 160, 20);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 1160, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeActionPerformed
        if (cbType.getSelectedIndex() == 1) {

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Pharmacy_ID");
            model.addColumn("Pharmacy_Name");
            model.addColumn("Product_ID");
            model.addColumn("Product_Name");
            model.addColumn("Product_Volume");
            model.addColumn("Product_Qty");
            model.addColumn("Sales_Amount");
            model.addColumn("Sale_Date");

            try {
                Connection con = getConnection();
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM `pharmacy_records`");
                ResultSet Rs = pstm.executeQuery();
                while (Rs.next()) {
                    model.addRow(new Object[]{Rs.getString(1), Rs.getString(2), Rs.getString(3), Rs.getString(4), Rs.getDouble(5), Rs.getDouble(6), Rs.getDouble(7), Rs.getString(8)});
                    table1.setModel(model);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        if (cbType.getSelectedIndex() == 2) {

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Doctor_Name");
            model.addColumn("Product_ID");
            model.addColumn("Product_Name");
            model.addColumn("Product_Volume");
            model.addColumn("Product_Qty");
            model.addColumn("Sales_Amount");
            model.addColumn("Sale_Date");

            try {

                Connection con = getConnection();
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM `doctor_records`");
                ResultSet Rs = pstm.executeQuery();
                while (Rs.next()) {
                    model.addRow(new Object[]{Rs.getString(1), Rs.getString(2), Rs.getString(3), Rs.getDouble(4), Rs.getDouble(5), Rs.getDouble(6), Rs.getString(7)});
                    table1.setModel(model);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }//GEN-LAST:event_cbTypeActionPerformed

    private void txtpharNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpharNMouseClicked
        try {
            Connection con = getConnection();
            PreparedStatement pstm = con.prepareStatement("SELECT pharmacy_name FROM `pharmacy_list` WHERE pharmacy_ID = '" + txtpharID.getText() + "'");
            ResultSet Rs = pstm.executeQuery();
            while (Rs.next()) {
                txtpharN.setText(Rs.getString("pharmacy_name"));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_txtpharNMouseClicked

    private void txtdocNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdocNMouseClicked
        try {
            Connection con = getConnection();
            PreparedStatement pstm = con.prepareStatement("SELECT doctor_name FROM `doctor_list` WHERE doctor_ID = '" + txtdocID.getText() + "'");
            ResultSet Rs = pstm.executeQuery();
            while (Rs.next()) {
                txtdocN.setText(Rs.getString("doctor_name"));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_txtdocNMouseClicked

    private void btnPharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPharMouseClicked
        String pId, pn, dt, phid, phn;
        double vol, qty, salA;
        phid = txtpharID.getText();
        phn = txtpharN.getText();
        pId = txtprodId.getText();
        pn = txtprodname.getText();
        vol = Double.parseDouble(txtprodvol.getText());
        qty = Double.parseDouble(txtprodqtty.getText());
        salA = Double.parseDouble(txtSaleA.getText());
        SimpleDateFormat sdft = new SimpleDateFormat("MM/d/YYYY");

        dt = sdft.format(dtpSaleDate.getDate());

        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            String sqlQ = "INSERT INTO `pharmacy_records` VALUES ('" + phid + "', '" + phn + "', '" + pId + "', '" + pn + "', '" + vol + "', '" + qty + "', '" + salA + "', '" + dt + "')";
            stmt.executeUpdate(sqlQ);
            JOptionPane.showMessageDialog(null, "Data Saved.");
            txtpharID.setText(null);
            txtpharN.setText(null);
            txtprodId.setText(null);
            txtprodname.setText(null);
            txtprodvol.setText(null);
            txtprodqtty.setText(null);
            txtprice.setText(null);
            txtSaleA.setText(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database not Connected.");
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnPharMouseClicked

    private void txtSaleAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSaleAMouseClicked
        double price = Double.parseDouble(txtprice.getText());

        double qty = Double.parseDouble(txtprodqtty.getText());
        double total = price * qty;
        txtSaleA.setText(Double.toString(total));
    }//GEN-LAST:event_txtSaleAMouseClicked

    private void txtprodnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtprodnameMouseClicked
        try {
            Connection con = getConnection();
            PreparedStatement pstm = con.prepareStatement("SELECT product_name FROM `products`  WHERE product_ID = '" + txtprodId.getText() + "'");
            ResultSet Rs = pstm.executeQuery();
            while (Rs.next()) {
                txtprodname.setText(Rs.getString("product_name"));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_txtprodnameMouseClicked

    private void btnDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDocMouseClicked
        String pId, pn, dt, dn;
        double vol, qty, salA;

        dn = txtdocN.getText();
        pId = txtprodId.getText();
        pn = txtprodname.getText();
        vol = Double.parseDouble(txtprodvol.getText());
        qty = Double.parseDouble(txtprodqtty.getText());
        salA = Double.parseDouble(txtSaleA.getText());
        SimpleDateFormat sdft = new SimpleDateFormat("MM/d/YYYY");

        dt = sdft.format(dtpSaleDate.getDate());

        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            String sqlQ = "INSERT INTO `doctor_records` VALUES ( '" + dn + "', '" + pId + "', '" + pn + "', '" + vol + "', '" + qty + "', '" + salA + "', '" + dt + "')";
            stmt.executeUpdate(sqlQ);
            JOptionPane.showMessageDialog(null, "Data Saved.");
            txtdocID.setText(null);
            txtdocN.setText(null);
            txtprodId.setText(null);
            txtprodname.setText(null);
            txtprodvol.setText(null);
            txtprodqtty.setText(null);
            txtprice.setText(null);
            txtSaleA.setText(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database not Connected.");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDocMouseClicked

    private void cbChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseActionPerformed
        if (cbChoose.getSelectedIndex() == 1) {
            txtVol.setVisible(false);
            lblVol.setVisible(false);
            txtPrice.setVisible(false);
            lblP.setVisible(false);

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Doctor ID");
            model.addColumn("Doctor Name");

            try {
                Connection con = getConnection();
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM `doctor_list`");
                ResultSet Rs = pstm.executeQuery();
                while (Rs.next()) {
                    model.addRow(new Object[]{Rs.getString(1), Rs.getString(2)});
                    tbltwo.setModel(model);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (cbChoose.getSelectedIndex() == 2) {
            txtVol.setVisible(false);
            lblVol.setVisible(false);
            txtPrice.setVisible(false);
            lblP.setVisible(false);

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Pharmacy ID");
            model.addColumn("Pharmacy Name");

            try {
                Connection con = getConnection();
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM `pharmacy_list`");
                ResultSet Rs = pstm.executeQuery();
                while (Rs.next()) {
                    model.addRow(new Object[]{Rs.getString(1), Rs.getString(2)});
                    tbltwo.setModel(model);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (cbChoose.getSelectedIndex() == 3) {
            txtVol.setVisible(true);
            lblVol.setVisible(true);
            txtPrice.setVisible(true);
            lblP.setVisible(true);

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Product ID");
            model.addColumn("Product Name");
            model.addColumn("Product Volume");
            model.addColumn("Product Price");

            try {
                Connection con = getConnection();
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM `products`");
                ResultSet Rs = pstm.executeQuery();
                while (Rs.next()) {
                    model.addRow(new Object[]{Rs.getString(1), Rs.getString(2), Rs.getDouble(3), Rs.getDouble(4)});
                    tbltwo.setModel(model);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_cbChooseActionPerformed

    private void btnEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseClicked
        if (cbChoose.getSelectedIndex() == 1) {
            try {
                Connection con = getConnection();
                Statement stmt = con.createStatement();
                String sqlQ = " INSERT INTO `doctor_list`  VALUES ('" + txtId.getText() + "', '" + txtName.getText() + "')";
                stmt.executeUpdate(sqlQ);
                JOptionPane.showMessageDialog(null, "Data Saved.");
                txtId.setText(null);
                txtName.setText(null);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Database not Connected.");
                System.out.println(e.getMessage());

            }

        } else if (cbChoose.getSelectedIndex() == 2) {
            try {
                Connection con = getConnection();
                Statement stmt = con.createStatement();
                String sqlQ = " INSERT INTO `pharmacy_list`  VALUES ('" + txtId.getText() + "', '" + txtName.getText() + "')";
                stmt.executeUpdate(sqlQ);
                JOptionPane.showMessageDialog(null, "Data Saved.");
                txtId.setText(null);
                txtName.setText(null);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Database not Connected.");
                System.out.println(e.getMessage());
            }
        } else if (cbChoose.getSelectedIndex() == 3) {
            try {
                Connection con = getConnection();
                Statement stmt = con.createStatement();
                String sqlQ = " INSERT INTO `products` VALUES ('" + txtId.getText() + "', '" + txtName.getText() + "', '" + txtVol.getText().toString() + "', '" + txtPrice.getText().toString() + "')";
                stmt.executeUpdate(sqlQ);
                JOptionPane.showMessageDialog(null, "Data Saved.");
                txtId.setText(null);
                txtName.setText(null);
                txtVol.setText(null);
                txtPrice.setText(null);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Database not Connected.");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEnterMouseClicked

    private void cbReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbReportActionPerformed
        if (cbReport.getSelectedIndex() == 1) {

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Pharmacy ID");
            model.addColumn("Pharmacy Name");
            model.addColumn("Product ID");
            model.addColumn("Product Name");
            model.addColumn("Product Volume");
            model.addColumn("Product Qty");
            model.addColumn("Sales Amount");
            model.addColumn("Sale Date");

            try {
                Connection con = getConnection();
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM `pharmacy_records`");
                ResultSet Rs = pstm.executeQuery();
                while (Rs.next()) {
                    model.addRow(new Object[]{Rs.getString(1), Rs.getString(2), Rs.getString(3), Rs.getString(4), Rs.getDouble(5), Rs.getDouble(6), Rs.getDouble(7), Rs.getString(8)});
                    tblthree.setModel(model);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        if (cbReport.getSelectedIndex() == 2) {

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Doctor Name");
            model.addColumn("Product ID");
            model.addColumn("Product Name");
            model.addColumn("Product Volume");
            model.addColumn("Product Qty");
            model.addColumn("Sales Amount");
            model.addColumn("Sale Date");

            try {

                Connection con = getConnection();
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM `doctor_records`");
                ResultSet Rs = pstm.executeQuery();
                while (Rs.next()) {
                    model.addRow(new Object[]{Rs.getString(1), Rs.getString(2), Rs.getString(3), Rs.getDouble(4), Rs.getDouble(5), Rs.getDouble(6), Rs.getString(7)});
                    tblthree.setModel(model);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }//GEN-LAST:event_cbReportActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed

        if (cbReport.getSelectedIndex() == 1) {
            MessageFormat header = new MessageFormat("Pharmacy Sales Report");
            MessageFormat footer = new MessageFormat("Powered by Softgenix tech");
            try {
                tblthree.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(null, "Cannot Print " + e.getMessage());
            }
        } else if (cbReport.getSelectedIndex() == 2) {
            MessageFormat header = new MessageFormat("Doctor Sales Report");
            MessageFormat footer = new MessageFormat("Powered by Softgenix tech");
            try {
                tblthree.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(null, "Cannot Print " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnMapsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMapsMouseClicked
        GoogleMapsSample newMap = new GoogleMapsSample();
        newMap.createAndShowWindow();
    }//GEN-LAST:event_btnMapsMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        try {

            Connection con = getConnection();
            PreparedStatement pstm = con.prepareStatement("SELECT fname,lname,region FROM `login`  WHERE email = '" + email + "'");

            ResultSet Rs = pstm.executeQuery();
            while (Rs.next()) {
                txtUName.setText(Rs.getString("fname") + " " + Rs.getString("lname"));
                txtUregion.setText(Rs.getString("region"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void jPanel5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel5ComponentShown
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Distributor ID");
        model.addColumn("Distributor Name");
        model.addColumn("Distributor City");

        try {
            Connection con = getConnection();
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM `distributor`");
            ResultSet Rs = pstm.executeQuery();
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString(1), Rs.getString(2), Rs.getString(3)});
                tblfour.setModel(model);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jPanel5ComponentShown

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.hide();
        LoginScreen Ls = new LoginScreen();
        Ls.show();

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void updateClock() {

        Clock.setText(dateFormat.format(Calendar.getInstance().getTime()));
    }

    public Connection getConnection() {
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/medical_sales", "root", "");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clock;
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMaps;
    private javax.swing.JButton btnPhar;
    private javax.swing.JButton btnReport;
    private javax.swing.JComboBox<String> cbChoose;
    private javax.swing.JComboBox<String> cbReport;
    private javax.swing.JComboBox<String> cbType;
    private com.toedter.calendar.JDateChooser dtpSaleDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    private javax.swing.JLabel lblP;
    private javax.swing.JLabel lblVol;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lbln;
    private javax.swing.JTable table1;
    private javax.swing.JTable tblfour;
    private javax.swing.JTable tblthree;
    private javax.swing.JTable tbltwo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSaleA;
    private javax.swing.JLabel txtUName;
    private javax.swing.JLabel txtUregion;
    private javax.swing.JTextField txtVol;
    private javax.swing.JTextField txtdocID;
    private javax.swing.JTextField txtdocN;
    private javax.swing.JTextField txtpharID;
    private javax.swing.JTextField txtpharN;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtprodId;
    private javax.swing.JTextField txtprodname;
    private javax.swing.JTextField txtprodqtty;
    private javax.swing.JTextField txtprodvol;
    private org.jdatepicker.impl.UtilCalendarModel utilCalendarModel1;
    private org.jdatepicker.impl.UtilCalendarModel utilCalendarModel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        updateClock();
    }
}
