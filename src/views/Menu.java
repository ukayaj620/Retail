package views;

import controllers.*;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import models.*;
import retail.Koneksi;

public class Menu extends javax.swing.JFrame {

    Color gray = new Color(255, 240, 178);
    Color yellow_tran = new Color(255, 250, 229, 230);
    Color normal_btn = new Color(255, 250, 229);
    Boolean hasLogin = false;

    BarangController barangController = new BarangController();
    BonController bonController = new BonController();
    CabangController cabangController = new CabangController();
    KatagoriController katagoriController = new KatagoriController();
    KotaController kotaController = new KotaController();
    PetugasController petugasController = new PetugasController();
    SupplierController supplierController = new SupplierController();
    TransaksiController transaksiController = new TransaksiController();
    StorageController storageController = new StorageController();

    public Menu() {
        initComponents();

        BarangLogo.setEnabled(false);
        TransaksiLogo.setEnabled(false);
        StafLogo.setEnabled(false);
        SupplyLogo.setEnabled(false);
        PembelianLogo.setEnabled(false);
        StokLogo.setEnabled(false);

        DefaultTableCellRenderer rendererStok = (DefaultTableCellRenderer) TabelStok.getTableHeader().getDefaultRenderer();
        rendererStok.setHorizontalAlignment(0);

        DefaultTableCellRenderer rendererStaf = (DefaultTableCellRenderer) TabelStaf.getTableHeader().getDefaultRenderer();
        rendererStaf.setHorizontalAlignment(0);

        DefaultTableCellRenderer rendererBarang = (DefaultTableCellRenderer) TabelBarang.getTableHeader().getDefaultRenderer();
        rendererBarang.setHorizontalAlignment(0);

        DefaultTableCellRenderer rendererSupplier = (DefaultTableCellRenderer) TabelSupplier.getTableHeader().getDefaultRenderer();
        rendererSupplier.setHorizontalAlignment(0);

        DefaultTableCellRenderer rendererPembelian = (DefaultTableCellRenderer) TabelPembelian.getTableHeader().getDefaultRenderer();
        rendererPembelian.setHorizontalAlignment(0);

        DefaultTableCellRenderer rendererTransaksi = (DefaultTableCellRenderer) TabelTransaksi.getTableHeader().getDefaultRenderer();
        rendererTransaksi.setHorizontalAlignment(0);

        //Login
        LoginPanel.setBackground(yellow_tran);

        //Barang
        BarangPanel.setVisible(false);
        BarangPanel.setBackground(yellow_tran);

        AddBarangMenu.setVisible(false);
        AddBarangMenu.setBackground(yellow_tran);

        ListBarangMenu.setVisible(false);
        ListBarangMenu.setBackground(yellow_tran);

        UpdateBarangMenu.setVisible(false);
        UpdateBarangMenu.setBackground(yellow_tran);

        HapusBarangMenu.setVisible(false);
        HapusBarangMenu.setBackground(yellow_tran);

        //Staf
        StafPanel.setVisible(false);
        StafPanel.setBackground(yellow_tran);

        AddStafMenu.setVisible(false);
        AddStafMenu.setBackground(yellow_tran);

        ListStafMenu.setVisible(false);
        ListStafMenu.setBackground(yellow_tran);

        UpdateStafMenu.setVisible(false);
        UpdateStafMenu.setBackground(yellow_tran);

        HapusStafMenu.setVisible(false);
        HapusStafMenu.setBackground(yellow_tran);

        //Supplier
        SupplierPanel.setVisible(false);
        SupplierPanel.setBackground(yellow_tran);

        AddSupplierMenu.setVisible(false);
        AddSupplierMenu.setBackground(yellow_tran);

        ListSupplierMenu.setVisible(false);
        ListSupplierMenu.setBackground(yellow_tran);

        UpdateSupplierMenu.setVisible(false);
        UpdateSupplierMenu.setBackground(yellow_tran);

        HapusSupplierMenu.setVisible(false);
        HapusSupplierMenu.setBackground(yellow_tran);

        //Stok
        StokPanel.setVisible(false);
        StokPanel.setBackground(yellow_tran);

        //Pembelian
        PembelianPanel.setVisible(false);
        PembelianPanel.setBackground(yellow_tran);

        //Transaksi
        TransaksiPanel.setVisible(false);
        TransaksiPanel.setBackground(yellow_tran);

        TransaksiSearchByIDBon.setEnabled(false);
        TransaksiSearchByDate.setEnabled(false);
        
        // TextField Limits
        IDBarangField.setDocument(new JTextFieldLimit(10));
        NamaBarangField.setDocument(new JTextFieldLimit(50));
    }

    java.sql.Date DatetoSQL(Date d) {
        return new java.sql.Date(d.getYear(), d.getMonth(), d.getDate());
    }

    public class JTextFieldLimit extends javax.swing.text.PlainDocument {
        private final int limit;

        JTextFieldLimit(int limit) {
            super();
            this.limit = limit;
        }
        
        @Override
        public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
            if (str == null) {
                return;
            }

            if ((getLength() + str.length()) <= limit) {
                super.insertString(offset, str, attr);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup_Staf_Add = new javax.swing.ButtonGroup();
        btnGroup_Staf_Update = new javax.swing.ButtonGroup();
        btnGroup_Staf_Hapus = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        TextPane = new javax.swing.JScrollPane();
        TeamData = new javax.swing.JTextArea();
        TitlePanel = new javax.swing.JPanel();
        UBMLogo = new javax.swing.JLabel();
        TitleBar = new javax.swing.JLabel();
        MenuBar = new javax.swing.JPanel();
        Barang = new javax.swing.JPanel();
        BarangLogo = new javax.swing.JLabel();
        Staf = new javax.swing.JPanel();
        StafLogo = new javax.swing.JLabel();
        Supply = new javax.swing.JPanel();
        SupplyLogo = new javax.swing.JLabel();
        Stok = new javax.swing.JPanel();
        StokLogo = new javax.swing.JLabel();
        Pembelian = new javax.swing.JPanel();
        PembelianLogo = new javax.swing.JLabel();
        Transaksi = new javax.swing.JPanel();
        TransaksiLogo = new javax.swing.JLabel();
        BarangPanel = new javax.swing.JPanel();
        BarangBar = new javax.swing.JPanel();
        AddBarang = new javax.swing.JPanel();
        AddBarangLogo = new javax.swing.JLabel();
        ListBarang = new javax.swing.JPanel();
        ListBarangLogo = new javax.swing.JLabel();
        UpdateBarang = new javax.swing.JPanel();
        UpdataBarangLogo = new javax.swing.JLabel();
        HapusBarang = new javax.swing.JPanel();
        DeleteBarangLogo = new javax.swing.JLabel();
        AddBarangMenu = new javax.swing.JPanel();
        AddBarangTitle = new javax.swing.JLabel();
        AddBarangIDB = new javax.swing.JLabel();
        AddBarangHarga = new javax.swing.JLabel();
        AddBarangIDK = new javax.swing.JLabel();
        AddBarang_TglExp = new javax.swing.JLabel();
        AddBarang_CancelButton = new javax.swing.JButton();
        AddBarang_SaveButton = new javax.swing.JButton();
        IDKCbx = new javax.swing.JComboBox();
        HargaBarangField = new javax.swing.JTextField();
        IDBarangField = new javax.swing.JTextField();
        BarangTglExp = new com.toedter.calendar.JDateChooser();
        AddBarangNama = new javax.swing.JLabel();
        NamaBarangField = new javax.swing.JTextField();
        AddBarang_TglMasuk = new javax.swing.JLabel();
        BarangTglMasuk = new com.toedter.calendar.JDateChooser();
        ListBarangMenu = new javax.swing.JPanel();
        BarangTable = new javax.swing.JScrollPane();
        TabelBarang = new javax.swing.JTable();
        ListBarangTitle = new javax.swing.JLabel();
        UpdateBarangMenu = new javax.swing.JPanel();
        UpdateBarangTitle = new javax.swing.JLabel();
        UpdateBarangID = new javax.swing.JLabel();
        UpdateBarangNama = new javax.swing.JLabel();
        UpdateBarangIDK = new javax.swing.JLabel();
        UpdateBarangHarga = new javax.swing.JLabel();
        UpdateBarangTglMasuk = new javax.swing.JLabel();
        UpdateBarangTglExp = new javax.swing.JLabel();
        UpdateBarangCancel = new javax.swing.JButton();
        UpdateBarangConfirm = new javax.swing.JButton();
        UpdateBarang_IDKCbx = new javax.swing.JComboBox();
        UpdateBarang_HargaField = new javax.swing.JTextField();
        UpdateBarang_IDBarangField = new javax.swing.JTextField();
        SearchUpdateBarang = new javax.swing.JButton();
        UpdateBarang_NamaBarangField = new javax.swing.JTextField();
        UpdateBarang_TglMasuk = new com.toedter.calendar.JDateChooser();
        UpdateBarang_TglExp = new com.toedter.calendar.JDateChooser();
        HapusBarangMenu = new javax.swing.JPanel();
        HapusBarangTitle = new javax.swing.JLabel();
        HapusBarangID = new javax.swing.JLabel();
        HapusBarangNama = new javax.swing.JLabel();
        HapusBarangIDK = new javax.swing.JLabel();
        HapusBarangHarga = new javax.swing.JLabel();
        HapusBarangTglMasuk = new javax.swing.JLabel();
        HapusBarangTglExp = new javax.swing.JLabel();
        HapusBarangCancel = new javax.swing.JButton();
        HapusBarangConfirm = new javax.swing.JButton();
        HapusBarang_IDKCbx = new javax.swing.JComboBox();
        HapusBarang_HargaField = new javax.swing.JTextField();
        HapusBarang_IDBarangField = new javax.swing.JTextField();
        SearchHapusBarang = new javax.swing.JButton();
        HapusBarang_NamaBarangField = new javax.swing.JTextField();
        HapusBarang_TglMasuk = new com.toedter.calendar.JDateChooser();
        HapusBarang_TglExp = new com.toedter.calendar.JDateChooser();
        StafPanel = new javax.swing.JPanel();
        StafBar = new javax.swing.JPanel();
        AddStaf = new javax.swing.JPanel();
        AddStafLogo = new javax.swing.JLabel();
        ListStaf = new javax.swing.JPanel();
        ListStafLogo = new javax.swing.JLabel();
        UpdateStaf = new javax.swing.JPanel();
        UpdateStafLogo = new javax.swing.JLabel();
        DeleteStaf = new javax.swing.JPanel();
        HapusStafLogo = new javax.swing.JLabel();
        AddStafMenu = new javax.swing.JPanel();
        AddStafTitle = new javax.swing.JLabel();
        AddStafID = new javax.swing.JLabel();
        AddStafNama = new javax.swing.JLabel();
        AddStafCabang = new javax.swing.JLabel();
        AddStafShift = new javax.swing.JLabel();
        AddStaf_TglMasuk = new javax.swing.JLabel();
        AddStaf_CancelButton = new javax.swing.JButton();
        AddStaf_SaveButton = new javax.swing.JButton();
        ShiftPagi = new javax.swing.JRadioButton();
        ShiftMalam = new javax.swing.JRadioButton();
        CabangCbx = new javax.swing.JComboBox();
        AddStaf_NamaField = new javax.swing.JTextField();
        AddStaf_IDField = new javax.swing.JTextField();
        StafTglMasuk = new com.toedter.calendar.JDateChooser();
        ListStafMenu = new javax.swing.JPanel();
        StafTable = new javax.swing.JScrollPane();
        TabelStaf = new javax.swing.JTable();
        ListStafTitle = new javax.swing.JLabel();
        UpdateStafMenu = new javax.swing.JPanel();
        UpdateStafTitle = new javax.swing.JLabel();
        UpdateStafID = new javax.swing.JLabel();
        UpdateStafNama = new javax.swing.JLabel();
        UpdateStafCabang = new javax.swing.JLabel();
        UpdateStafShift = new javax.swing.JLabel();
        UpdateStafTglMasuk = new javax.swing.JLabel();
        UpdateCancel = new javax.swing.JButton();
        UpdateSave = new javax.swing.JButton();
        UpdateShiftPagi = new javax.swing.JRadioButton();
        UpdateShiftMalam = new javax.swing.JRadioButton();
        UpdateCabangCbx = new javax.swing.JComboBox();
        UpdateStaf_NamaField = new javax.swing.JTextField();
        UpdateStaf_IDField = new javax.swing.JTextField();
        UpdateTglMasuk = new com.toedter.calendar.JDateChooser();
        SearchUpdate = new javax.swing.JButton();
        HapusStafMenu = new javax.swing.JPanel();
        HapusStafTitle = new javax.swing.JLabel();
        HapusStafID = new javax.swing.JLabel();
        HapusStafNama = new javax.swing.JLabel();
        HapusStafCabang = new javax.swing.JLabel();
        HapusStafShift = new javax.swing.JLabel();
        HapusStafTglMasuk = new javax.swing.JLabel();
        HapusStaf_CancelButton = new javax.swing.JButton();
        HapusStaf_ConfirmButton = new javax.swing.JButton();
        HapusShiftPagi = new javax.swing.JRadioButton();
        HapusShiftMalam = new javax.swing.JRadioButton();
        HapusCabangCbx = new javax.swing.JComboBox();
        HapusStaf_NamaField = new javax.swing.JTextField();
        HapusStaf_IDField = new javax.swing.JTextField();
        HapusTglMasuk = new com.toedter.calendar.JDateChooser();
        HapusStaf_SearchButton = new javax.swing.JButton();
        SupplierPanel = new javax.swing.JPanel();
        StafBar1 = new javax.swing.JPanel();
        AddSupplier = new javax.swing.JPanel();
        AddSupplierLogo = new javax.swing.JLabel();
        ListSupplier = new javax.swing.JPanel();
        ListSupplierLogo = new javax.swing.JLabel();
        UpdateSupplier = new javax.swing.JPanel();
        UpdateSupplierLogo = new javax.swing.JLabel();
        HapusSupplier = new javax.swing.JPanel();
        HapusSupplierLogo = new javax.swing.JLabel();
        AddSupplierMenu = new javax.swing.JPanel();
        AddSupplierTitle = new javax.swing.JLabel();
        AddSupplierID = new javax.swing.JLabel();
        AddSupplierNama = new javax.swing.JLabel();
        AddSupplierKotaID = new javax.swing.JLabel();
        AddSupplier_CancelButton = new javax.swing.JButton();
        AddSupplier_SaveButton = new javax.swing.JButton();
        KotaCbx = new javax.swing.JComboBox<>();
        AddSupplier_NamaField = new javax.swing.JTextField();
        AddSupplier_IDField = new javax.swing.JTextField();
        ListSupplierMenu = new javax.swing.JPanel();
        SupplierTable = new javax.swing.JScrollPane();
        TabelSupplier = new javax.swing.JTable();
        ListSupplierTitle = new javax.swing.JLabel();
        UpdateSupplierMenu = new javax.swing.JPanel();
        UpdateSupplierTitle = new javax.swing.JLabel();
        UpdateSupplierID = new javax.swing.JLabel();
        UpdateSupplierNama = new javax.swing.JLabel();
        UpdateSupplierKotaID = new javax.swing.JLabel();
        UpdateSupplier_CancelButton = new javax.swing.JButton();
        UpdateSupplier_SaveButton = new javax.swing.JButton();
        UpdateKotaCbx = new javax.swing.JComboBox<>();
        UpdateSupplier_NamaField = new javax.swing.JTextField();
        UpdateSupplier_IDField = new javax.swing.JTextField();
        UpdateSupplier_SearchButton = new javax.swing.JButton();
        HapusSupplierMenu = new javax.swing.JPanel();
        HapusSupplierTitle = new javax.swing.JLabel();
        HapusSupplierID = new javax.swing.JLabel();
        HapusSupplierNama = new javax.swing.JLabel();
        HapusSupplierKotaID = new javax.swing.JLabel();
        HapusSupplier_CancelButton = new javax.swing.JButton();
        HapusSupplier_ConfirmButton = new javax.swing.JButton();
        HapusKotaCbx = new javax.swing.JComboBox<>();
        HapusSupplier_NamaField = new javax.swing.JTextField();
        HapusSupplier_IDField = new javax.swing.JTextField();
        HapusSupplier_SearchButton = new javax.swing.JButton();
        StokPanel = new javax.swing.JPanel();
        SearchCbx = new javax.swing.JComboBox<>();
        SearchBar = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        StockTable = new javax.swing.JScrollPane();
        TabelStok = new javax.swing.JTable();
        StokTitle = new javax.swing.JLabel();
        PembelianPanel = new javax.swing.JPanel();
        PembelianTable = new javax.swing.JScrollPane();
        TabelPembelian = new javax.swing.JTable();
        PembelianTotalField = new javax.swing.JTextField();
        PembelianBayar = new javax.swing.JButton();
        PembelianReset = new javax.swing.JButton();
        PembelianTitle = new javax.swing.JLabel();
        JumlahCounter = new javax.swing.JSpinner();
        PembelianSubtotal = new javax.swing.JLabel();
        PembelianIDBon = new javax.swing.JLabel();
        PembelianNamaBarang = new javax.swing.JLabel();
        PembelianJumlah = new javax.swing.JLabel();
        PembelianTotal = new javax.swing.JLabel();
        PembelianSubtotalField = new javax.swing.JTextField();
        PembelianIDBonField = new javax.swing.JTextField();
        BarangSelectCbx = new javax.swing.JComboBox();
        PembelianAddtoCart = new javax.swing.JButton();
        TransaksiPanel = new javax.swing.JPanel();
        TransaksiSearchCbx = new javax.swing.JComboBox<>();
        TransaksiSearchByIDBon = new javax.swing.JTextField();
        TransaksiSearchByDate = new com.toedter.calendar.JDateChooser();
        Transaksi_SearchButton = new javax.swing.JButton();
        TransaksiTable = new javax.swing.JScrollPane();
        TabelTransaksi = new javax.swing.JTable();
        TransaksiTitle = new javax.swing.JLabel();
        Subtotal = new javax.swing.JLabel();
        SubtotalField = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        MainPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
        MainPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginPanel.setBackground(new java.awt.Color(255, 250, 229));
        LoginPanel.setMaximumSize(new java.awt.Dimension(1280, 600));
        LoginPanel.setMinimumSize(new java.awt.Dimension(1280, 600));
        LoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        Username.setText("Username:");
        LoginPanel.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        Password.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        Password.setText("Password:");
        LoginPanel.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        UsernameField.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        LoginPanel.add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 380, 50));

        PasswordField.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        LoginPanel.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 380, 50));

        LoginButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        LoginPanel.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 170, 60));

        TeamData.setEditable(false);
        TeamData.setBackground(new java.awt.Color(255, 250, 229));
        TeamData.setColumns(20);
        TeamData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TeamData.setRows(5);
        TeamData.setText("3PTI1 / SIE04 - Sistem Basis Data\nFerdy Nicolas\t\t32180018\nJason Alexander\t32180082\nDerry Leo NardI\t32180086\nJayaku Briliantio\t32180088");
        TeamData.setBorder(null);
        TextPane.setViewportView(TeamData);

        LoginPanel.add(TextPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 290, 110));

        MainPanel.add(LoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 1110, 580));

        TitlePanel.setBackground(new java.awt.Color(255, 227, 128));
        TitlePanel.setMinimumSize(new java.awt.Dimension(1280, 120));
        TitlePanel.setPreferredSize(new java.awt.Dimension(1280, 120));
        TitlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UBMLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UBMLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo UBM A.png"))); // NOI18N
        UBMLogo.setPreferredSize(new java.awt.Dimension(150, 100));
        TitlePanel.add(UBMLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 120));

        TitleBar.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        TitleBar.setForeground(new java.awt.Color(7, 71, 166));
        TitleBar.setText("APLIKASI RETAIL BERBASIS DATABASE");
        TitlePanel.add(TitleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, 50));

        MainPanel.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 120));

        MenuBar.setBackground(new java.awt.Color(255, 227, 128));
        MenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barang.setBackground(new java.awt.Color(255, 250, 229));
        Barang.setPreferredSize(new java.awt.Dimension(150, 100));

        BarangLogo.setBackground(new java.awt.Color(255, 227, 128));
        BarangLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BarangLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Add.png"))); // NOI18N
        BarangLogo.setEnabled(false);
        BarangLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BarangLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BarangLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BarangLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BarangLayout = new javax.swing.GroupLayout(Barang);
        Barang.setLayout(BarangLayout);
        BarangLayout.setHorizontalGroup(
            BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BarangLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        BarangLayout.setVerticalGroup(
            BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarangLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MenuBar.add(Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Staf.setBackground(new java.awt.Color(255, 250, 229));
        Staf.setPreferredSize(new java.awt.Dimension(150, 100));

        StafLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StafLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Staf.png"))); // NOI18N
        StafLogo.setEnabled(false);
        StafLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StafLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StafLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StafLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout StafLayout = new javax.swing.GroupLayout(Staf);
        Staf.setLayout(StafLayout);
        StafLayout.setHorizontalGroup(
            StafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StafLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StafLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        StafLayout.setVerticalGroup(
            StafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StafLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MenuBar.add(Staf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        Supply.setBackground(new java.awt.Color(255, 250, 229));
        Supply.setPreferredSize(new java.awt.Dimension(150, 100));

        SupplyLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SupplyLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Supply.png"))); // NOI18N
        SupplyLogo.setEnabled(false);
        SupplyLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplyLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SupplyLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SupplyLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SupplyLayout = new javax.swing.GroupLayout(Supply);
        Supply.setLayout(SupplyLayout);
        SupplyLayout.setHorizontalGroup(
            SupplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SupplyLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(SupplyLogo)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        SupplyLayout.setVerticalGroup(
            SupplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SupplyLayout.createSequentialGroup()
                .addComponent(SupplyLogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MenuBar.add(Supply, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        Stok.setBackground(new java.awt.Color(255, 250, 229));
        Stok.setPreferredSize(new java.awt.Dimension(150, 100));

        StokLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StokLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Stok.png"))); // NOI18N
        StokLogo.setEnabled(false);
        StokLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StokLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StokLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StokLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout StokLayout = new javax.swing.GroupLayout(Stok);
        Stok.setLayout(StokLayout);
        StokLayout.setHorizontalGroup(
            StokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StokLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(StokLogo)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        StokLayout.setVerticalGroup(
            StokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StokLayout.createSequentialGroup()
                .addComponent(StokLogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MenuBar.add(Stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        Pembelian.setBackground(new java.awt.Color(255, 250, 229));
        Pembelian.setPreferredSize(new java.awt.Dimension(150, 100));

        PembelianLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PembelianLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Pembelian.png"))); // NOI18N
        PembelianLogo.setEnabled(false);
        PembelianLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembelianLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PembelianLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PembelianLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PembelianLayout = new javax.swing.GroupLayout(Pembelian);
        Pembelian.setLayout(PembelianLayout);
        PembelianLayout.setHorizontalGroup(
            PembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PembelianLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(PembelianLogo)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        PembelianLayout.setVerticalGroup(
            PembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PembelianLayout.createSequentialGroup()
                .addComponent(PembelianLogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MenuBar.add(Pembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        Transaksi.setBackground(new java.awt.Color(255, 250, 229));
        Transaksi.setPreferredSize(new java.awt.Dimension(150, 100));

        TransaksiLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TransaksiLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Transaksi.png"))); // NOI18N
        TransaksiLogo.setEnabled(false);
        TransaksiLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TransaksiLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TransaksiLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout TransaksiLayout = new javax.swing.GroupLayout(Transaksi);
        Transaksi.setLayout(TransaksiLayout);
        TransaksiLayout.setHorizontalGroup(
            TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransaksiLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(TransaksiLogo)
                .addGap(20, 20, 20))
        );
        TransaksiLayout.setVerticalGroup(
            TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiLayout.createSequentialGroup()
                .addComponent(TransaksiLogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MenuBar.add(Transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, -1));

        MainPanel.add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, 600));

        BarangPanel.setBackground(new java.awt.Color(255, 250, 229));
        BarangPanel.setMaximumSize(new java.awt.Dimension(1280, 600));
        BarangPanel.setMinimumSize(new java.awt.Dimension(1280, 600));
        BarangPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarangBar.setBackground(new java.awt.Color(255, 227, 128));
        BarangBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddBarang.setBackground(new java.awt.Color(255, 250, 229));
        AddBarang.setPreferredSize(new java.awt.Dimension(150, 150));

        AddBarangLogo.setBackground(new java.awt.Color(255, 227, 128));
        AddBarangLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddBarangLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Add Barang.png"))); // NOI18N
        AddBarangLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBarangLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddBarangLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddBarangLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AddBarangLayout = new javax.swing.GroupLayout(AddBarang);
        AddBarang.setLayout(AddBarangLayout);
        AddBarangLayout.setHorizontalGroup(
            AddBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddBarangLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddBarangLayout.setVerticalGroup(
            AddBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBarangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(AddBarangLogo)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        BarangBar.add(AddBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ListBarang.setBackground(new java.awt.Color(255, 250, 229));
        ListBarang.setPreferredSize(new java.awt.Dimension(150, 150));

        ListBarangLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListBarangLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo List Barang.png"))); // NOI18N
        ListBarangLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListBarangLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListBarangLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListBarangLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ListBarangLayout = new javax.swing.GroupLayout(ListBarang);
        ListBarang.setLayout(ListBarangLayout);
        ListBarangLayout.setHorizontalGroup(
            ListBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListBarangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ListBarangLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListBarangLayout.setVerticalGroup(
            ListBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListBarangLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ListBarangLogo)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        BarangBar.add(ListBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        UpdateBarang.setBackground(new java.awt.Color(255, 250, 229));
        UpdateBarang.setPreferredSize(new java.awt.Dimension(150, 150));

        UpdataBarangLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdataBarangLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Update Barang.png"))); // NOI18N
        UpdataBarangLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdataBarangLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdataBarangLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdataBarangLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout UpdateBarangLayout = new javax.swing.GroupLayout(UpdateBarang);
        UpdateBarang.setLayout(UpdateBarangLayout);
        UpdateBarangLayout.setHorizontalGroup(
            UpdateBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpdataBarangLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UpdateBarangLayout.setVerticalGroup(
            UpdateBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateBarangLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(UpdataBarangLogo)
                .addGap(22, 22, 22))
        );

        BarangBar.add(UpdateBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        HapusBarang.setBackground(new java.awt.Color(255, 250, 229));
        HapusBarang.setPreferredSize(new java.awt.Dimension(150, 150));

        DeleteBarangLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteBarangLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Hapus Barang.png"))); // NOI18N
        DeleteBarangLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBarangLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteBarangLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteBarangLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HapusBarangLayout = new javax.swing.GroupLayout(HapusBarang);
        HapusBarang.setLayout(HapusBarangLayout);
        HapusBarangLayout.setHorizontalGroup(
            HapusBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HapusBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteBarangLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HapusBarangLayout.setVerticalGroup(
            HapusBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HapusBarangLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(DeleteBarangLogo)
                .addGap(22, 22, 22))
        );

        BarangBar.add(HapusBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

        BarangPanel.add(BarangBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 150, 580));

        AddBarangMenu.setBackground(new java.awt.Color(255, 250, 229));
        AddBarangMenu.setMaximumSize(new java.awt.Dimension(1280, 600));
        AddBarangMenu.setMinimumSize(new java.awt.Dimension(1280, 600));
        AddBarangMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                AddBarangMenuComponentShown(evt);
            }
        });
        AddBarangMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddBarangTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        AddBarangTitle.setText("Data Barang Baru");
        AddBarangMenu.add(AddBarangTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        AddBarangIDB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddBarangIDB.setText("ID Barang");
        AddBarangMenu.add(AddBarangIDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        AddBarangHarga.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddBarangHarga.setText("Harga Barang");
        AddBarangMenu.add(AddBarangHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        AddBarangIDK.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddBarangIDK.setText("ID Kategori");
        AddBarangMenu.add(AddBarangIDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        AddBarang_TglExp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddBarang_TglExp.setText("Tanggal Kadaluarsa");
        AddBarangMenu.add(AddBarang_TglExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        AddBarang_CancelButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddBarang_CancelButton.setText("Batal");
        AddBarang_CancelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddBarang_CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBarang_CancelButtonActionPerformed(evt);
            }
        });
        AddBarangMenu.add(AddBarang_CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 120, -1));

        AddBarang_SaveButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddBarang_SaveButton.setText("Simpan ");
        AddBarang_SaveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddBarang_SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBarang_SaveButtonActionPerformed(evt);
            }
        });
        AddBarangMenu.add(AddBarang_SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        IDKCbx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDKCbxMouseClicked(evt);
            }
        });
        AddBarangMenu.add(IDKCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 140, 40));
        AddBarangMenu.add(HargaBarangField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 180, 30));
        AddBarangMenu.add(IDBarangField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 180, 30));
        AddBarangMenu.add(BarangTglExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 180, 30));

        AddBarangNama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddBarangNama.setText("Nama Barang");
        AddBarangMenu.add(AddBarangNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));
        AddBarangMenu.add(NamaBarangField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 180, 30));

        AddBarang_TglMasuk.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddBarang_TglMasuk.setText("Tanggal Masuk");
        AddBarangMenu.add(AddBarang_TglMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));
        AddBarangMenu.add(BarangTglMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 180, 30));

        BarangPanel.add(AddBarangMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));

        ListBarangMenu.setBackground(new java.awt.Color(255, 250, 229));
        ListBarangMenu.setMaximumSize(new java.awt.Dimension(1280, 600));
        ListBarangMenu.setMinimumSize(new java.awt.Dimension(1280, 600));
        ListBarangMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ListBarangMenuComponentShown(evt);
            }
        });
        ListBarangMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Barang", "Nama Barang", "ID Kategori", "Harga Barang", "Tanggal Masuk", "Tanggal Kadaluarsa"
            }
        ));
        BarangTable.setViewportView(TabelBarang);

        ListBarangMenu.add(BarangTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 940, 350));

        ListBarangTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ListBarangTitle.setText("Daftar Barang");
        ListBarangMenu.add(ListBarangTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        BarangPanel.add(ListBarangMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));

        UpdateBarangMenu.setBackground(new java.awt.Color(255, 250, 229));
        UpdateBarangMenu.setMaximumSize(new java.awt.Dimension(1280, 600));
        UpdateBarangMenu.setMinimumSize(new java.awt.Dimension(1280, 600));
        UpdateBarangMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                UpdateBarangMenuComponentShown(evt);
            }
        });
        UpdateBarangMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpdateBarangTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        UpdateBarangTitle.setText("Update Data Barang");
        UpdateBarangMenu.add(UpdateBarangTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        UpdateBarangID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateBarangID.setText("ID Barang");
        UpdateBarangMenu.add(UpdateBarangID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        UpdateBarangNama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateBarangNama.setText("Nama Barang");
        UpdateBarangMenu.add(UpdateBarangNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        UpdateBarangIDK.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateBarangIDK.setText("ID Kategori");
        UpdateBarangMenu.add(UpdateBarangIDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        UpdateBarangHarga.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateBarangHarga.setText("Harga");
        UpdateBarangMenu.add(UpdateBarangHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        UpdateBarangTglMasuk.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateBarangTglMasuk.setText("Tanggal Masuk");
        UpdateBarangMenu.add(UpdateBarangTglMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        UpdateBarangTglExp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateBarangTglExp.setText("Tanggal Kadaluarsa");
        UpdateBarangMenu.add(UpdateBarangTglExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        UpdateBarangCancel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateBarangCancel.setText("Batal");
        UpdateBarangCancel.setEnabled(false);
        UpdateBarangCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UpdateBarangCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBarangCancelActionPerformed(evt);
            }
        });
        UpdateBarangMenu.add(UpdateBarangCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 120, -1));

        UpdateBarangConfirm.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateBarangConfirm.setText("Simpan ");
        UpdateBarangConfirm.setEnabled(false);
        UpdateBarangConfirm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UpdateBarangConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBarangConfirmActionPerformed(evt);
            }
        });
        UpdateBarangMenu.add(UpdateBarangConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        UpdateBarang_IDKCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Organik", "Anorganik", "B3" }));
        UpdateBarang_IDKCbx.setEnabled(false);
        UpdateBarangMenu.add(UpdateBarang_IDKCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 140, 40));

        UpdateBarang_HargaField.setEnabled(false);
        UpdateBarangMenu.add(UpdateBarang_HargaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 180, 30));
        UpdateBarangMenu.add(UpdateBarang_IDBarangField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 180, 30));

        SearchUpdateBarang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchUpdateBarang.setText("Cari");
        SearchUpdateBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchUpdateBarangActionPerformed(evt);
            }
        });
        UpdateBarangMenu.add(SearchUpdateBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 90, 30));

        UpdateBarang_NamaBarangField.setEnabled(false);
        UpdateBarangMenu.add(UpdateBarang_NamaBarangField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 180, 30));

        UpdateBarang_TglMasuk.setEnabled(false);
        UpdateBarangMenu.add(UpdateBarang_TglMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 180, 30));

        UpdateBarang_TglExp.setEnabled(false);
        UpdateBarangMenu.add(UpdateBarang_TglExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 180, 30));

        BarangPanel.add(UpdateBarangMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));

        HapusBarangMenu.setBackground(new java.awt.Color(255, 250, 229));
        HapusBarangMenu.setMaximumSize(new java.awt.Dimension(1280, 600));
        HapusBarangMenu.setMinimumSize(new java.awt.Dimension(1280, 600));
        HapusBarangMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                HapusBarangMenuComponentShown(evt);
            }
        });
        HapusBarangMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HapusBarangTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        HapusBarangTitle.setText("Hapus Barang");
        HapusBarangMenu.add(HapusBarangTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        HapusBarangID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusBarangID.setText("ID Barang");
        HapusBarangMenu.add(HapusBarangID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        HapusBarangNama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusBarangNama.setText("Nama Barang");
        HapusBarangMenu.add(HapusBarangNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        HapusBarangIDK.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusBarangIDK.setText("ID Kategori");
        HapusBarangMenu.add(HapusBarangIDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        HapusBarangHarga.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusBarangHarga.setText("Harga");
        HapusBarangMenu.add(HapusBarangHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        HapusBarangTglMasuk.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusBarangTglMasuk.setText("Tanggal Masuk");
        HapusBarangMenu.add(HapusBarangTglMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        HapusBarangTglExp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusBarangTglExp.setText("Tanggal Kadaluarsa");
        HapusBarangMenu.add(HapusBarangTglExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        HapusBarangCancel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusBarangCancel.setText("Batal");
        HapusBarangCancel.setEnabled(false);
        HapusBarangCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HapusBarangCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusBarangCancelActionPerformed(evt);
            }
        });
        HapusBarangMenu.add(HapusBarangCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 120, -1));

        HapusBarangConfirm.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusBarangConfirm.setText("Hapus");
        HapusBarangConfirm.setEnabled(false);
        HapusBarangConfirm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HapusBarangConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusBarangConfirmActionPerformed(evt);
            }
        });
        HapusBarangMenu.add(HapusBarangConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        HapusBarang_IDKCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Organik", "Anorganik", "B3" }));
        HapusBarang_IDKCbx.setEnabled(false);
        HapusBarangMenu.add(HapusBarang_IDKCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 140, 40));

        HapusBarang_HargaField.setEnabled(false);
        HapusBarangMenu.add(HapusBarang_HargaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 180, 30));
        HapusBarangMenu.add(HapusBarang_IDBarangField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 180, 30));

        SearchHapusBarang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchHapusBarang.setText("Cari");
        SearchHapusBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchHapusBarangActionPerformed(evt);
            }
        });
        HapusBarangMenu.add(SearchHapusBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 90, 30));

        HapusBarang_NamaBarangField.setEnabled(false);
        HapusBarangMenu.add(HapusBarang_NamaBarangField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 180, 30));

        HapusBarang_TglMasuk.setEnabled(false);
        HapusBarangMenu.add(HapusBarang_TglMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 180, 30));

        HapusBarang_TglExp.setEnabled(false);
        HapusBarangMenu.add(HapusBarang_TglExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 180, 30));

        BarangPanel.add(HapusBarangMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));

        MainPanel.add(BarangPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 1110, 580));

        StafPanel.setBackground(new java.awt.Color(255, 250, 229));
        StafPanel.setMaximumSize(new java.awt.Dimension(1280, 600));
        StafPanel.setMinimumSize(new java.awt.Dimension(1280, 600));
        StafPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StafBar.setBackground(new java.awt.Color(255, 227, 128));
        StafBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddStaf.setBackground(new java.awt.Color(255, 250, 229));
        AddStaf.setPreferredSize(new java.awt.Dimension(150, 150));

        AddStafLogo.setBackground(new java.awt.Color(255, 227, 128));
        AddStafLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddStafLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Add Staf.png"))); // NOI18N
        AddStafLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStafLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddStafLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddStafLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AddStafLayout = new javax.swing.GroupLayout(AddStaf);
        AddStaf.setLayout(AddStafLayout);
        AddStafLayout.setHorizontalGroup(
            AddStafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddStafLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddStafLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddStafLayout.setVerticalGroup(
            AddStafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddStafLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(AddStafLogo)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        StafBar.add(AddStaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ListStaf.setBackground(new java.awt.Color(255, 250, 229));
        ListStaf.setPreferredSize(new java.awt.Dimension(150, 150));

        ListStafLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListStafLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo List Staf.png"))); // NOI18N
        ListStafLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListStafLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListStafLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListStafLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ListStafLayout = new javax.swing.GroupLayout(ListStaf);
        ListStaf.setLayout(ListStafLayout);
        ListStafLayout.setHorizontalGroup(
            ListStafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListStafLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ListStafLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListStafLayout.setVerticalGroup(
            ListStafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListStafLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ListStafLogo)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        StafBar.add(ListStaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        UpdateStaf.setBackground(new java.awt.Color(255, 250, 229));
        UpdateStaf.setPreferredSize(new java.awt.Dimension(150, 150));

        UpdateStafLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateStafLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Update Staf.png"))); // NOI18N
        UpdateStafLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateStafLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateStafLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateStafLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout UpdateStafLayout = new javax.swing.GroupLayout(UpdateStaf);
        UpdateStaf.setLayout(UpdateStafLayout);
        UpdateStafLayout.setHorizontalGroup(
            UpdateStafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateStafLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpdateStafLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UpdateStafLayout.setVerticalGroup(
            UpdateStafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateStafLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(UpdateStafLogo)
                .addGap(22, 22, 22))
        );

        StafBar.add(UpdateStaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        DeleteStaf.setBackground(new java.awt.Color(255, 250, 229));
        DeleteStaf.setPreferredSize(new java.awt.Dimension(150, 150));

        HapusStafLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HapusStafLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Hapus Staf.png"))); // NOI18N
        HapusStafLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HapusStafLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HapusStafLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HapusStafLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout DeleteStafLayout = new javax.swing.GroupLayout(DeleteStaf);
        DeleteStaf.setLayout(DeleteStafLayout);
        DeleteStafLayout.setHorizontalGroup(
            DeleteStafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteStafLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HapusStafLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DeleteStafLayout.setVerticalGroup(
            DeleteStafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeleteStafLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(HapusStafLogo)
                .addGap(22, 22, 22))
        );

        StafBar.add(DeleteStaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

        StafPanel.add(StafBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 150, 580));

        AddStafMenu.setBackground(new java.awt.Color(255, 250, 229));
        AddStafMenu.setMaximumSize(new java.awt.Dimension(1280, 600));
        AddStafMenu.setMinimumSize(new java.awt.Dimension(1280, 600));
        AddStafMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                AddStafMenuComponentShown(evt);
            }
        });
        AddStafMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddStafTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        AddStafTitle.setText("Data Pegawai Baru");
        AddStafMenu.add(AddStafTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        AddStafID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddStafID.setText("ID Staf");
        AddStafMenu.add(AddStafID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        AddStafNama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddStafNama.setText("Nama Lengkap");
        AddStafMenu.add(AddStafNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        AddStafCabang.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddStafCabang.setText("ID Cabang");
        AddStafMenu.add(AddStafCabang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        AddStafShift.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddStafShift.setText("Shift");
        AddStafMenu.add(AddStafShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        AddStaf_TglMasuk.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddStaf_TglMasuk.setText("Tanggal Masuk");
        AddStafMenu.add(AddStaf_TglMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        AddStaf_CancelButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddStaf_CancelButton.setText("Batal");
        AddStaf_CancelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddStaf_CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStaf_CancelButtonActionPerformed(evt);
            }
        });
        AddStafMenu.add(AddStaf_CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 120, -1));

        AddStaf_SaveButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddStaf_SaveButton.setText("Simpan ");
        AddStaf_SaveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddStaf_SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStaf_SaveButtonActionPerformed(evt);
            }
        });
        AddStafMenu.add(AddStaf_SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        ShiftPagi.setBackground(new java.awt.Color(255, 250, 229));
        btnGroup_Staf_Add.add(ShiftPagi);
        ShiftPagi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ShiftPagi.setSelected(true);
        ShiftPagi.setText("Pagi");
        AddStafMenu.add(ShiftPagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        ShiftMalam.setBackground(new java.awt.Color(255, 250, 229));
        btnGroup_Staf_Add.add(ShiftMalam);
        ShiftMalam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ShiftMalam.setText("Malam");
        AddStafMenu.add(ShiftMalam, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        CabangCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UBM-A", "UBM-S" }));
        AddStafMenu.add(CabangCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 140, 40));
        AddStafMenu.add(AddStaf_NamaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 180, 30));
        AddStafMenu.add(AddStaf_IDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 180, 30));
        AddStafMenu.add(StafTglMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 180, 30));

        StafPanel.add(AddStafMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));

        ListStafMenu.setBackground(new java.awt.Color(255, 250, 229));
        ListStafMenu.setMaximumSize(new java.awt.Dimension(1280, 600));
        ListStafMenu.setMinimumSize(new java.awt.Dimension(1280, 600));
        ListStafMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ListStafMenuComponentShown(evt);
            }
        });
        ListStafMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelStaf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Petugas", "Nama Petugas", "ID Cabang", "Shift", "Tanggal Masuk"
            }
        ));
        StafTable.setViewportView(TabelStaf);

        ListStafMenu.add(StafTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 940, 350));

        ListStafTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ListStafTitle.setText("Daftar Staf");
        ListStafMenu.add(ListStafTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        StafPanel.add(ListStafMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));

        UpdateStafMenu.setBackground(new java.awt.Color(255, 250, 229));
        UpdateStafMenu.setMaximumSize(new java.awt.Dimension(1280, 600));
        UpdateStafMenu.setMinimumSize(new java.awt.Dimension(1280, 600));
        UpdateStafMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                UpdateStafMenuComponentShown(evt);
            }
        });
        UpdateStafMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpdateStafTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        UpdateStafTitle.setText("Update Data Pegawai");
        UpdateStafMenu.add(UpdateStafTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        UpdateStafID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateStafID.setText("ID Staf");
        UpdateStafMenu.add(UpdateStafID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        UpdateStafNama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateStafNama.setText("Nama Lengkap");
        UpdateStafMenu.add(UpdateStafNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        UpdateStafCabang.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateStafCabang.setText("ID Cabang");
        UpdateStafMenu.add(UpdateStafCabang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        UpdateStafShift.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateStafShift.setText("Shift");
        UpdateStafMenu.add(UpdateStafShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        UpdateStafTglMasuk.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateStafTglMasuk.setText("Tanggal Masuk");
        UpdateStafMenu.add(UpdateStafTglMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        UpdateCancel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateCancel.setText("Batal");
        UpdateCancel.setEnabled(false);
        UpdateCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UpdateCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCancelActionPerformed(evt);
            }
        });
        UpdateStafMenu.add(UpdateCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 120, -1));

        UpdateSave.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateSave.setText("Simpan ");
        UpdateSave.setEnabled(false);
        UpdateSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UpdateSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateSaveActionPerformed(evt);
            }
        });
        UpdateStafMenu.add(UpdateSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        UpdateShiftPagi.setBackground(new java.awt.Color(255, 250, 229));
        btnGroup_Staf_Update.add(UpdateShiftPagi);
        UpdateShiftPagi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UpdateShiftPagi.setSelected(true);
        UpdateShiftPagi.setText("Pagi");
        UpdateShiftPagi.setEnabled(false);
        UpdateStafMenu.add(UpdateShiftPagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        UpdateShiftMalam.setBackground(new java.awt.Color(255, 250, 229));
        btnGroup_Staf_Update.add(UpdateShiftMalam);
        UpdateShiftMalam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UpdateShiftMalam.setText("Malam");
        UpdateShiftMalam.setEnabled(false);
        UpdateStafMenu.add(UpdateShiftMalam, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, -1));

        UpdateCabangCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UBM-A", "UBM-S" }));
        UpdateCabangCbx.setEnabled(false);
        UpdateStafMenu.add(UpdateCabangCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 140, 40));

        UpdateStaf_NamaField.setEnabled(false);
        UpdateStafMenu.add(UpdateStaf_NamaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 180, 30));
        UpdateStafMenu.add(UpdateStaf_IDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 180, 30));

        UpdateTglMasuk.setEnabled(false);
        UpdateStafMenu.add(UpdateTglMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 180, 30));

        SearchUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchUpdate.setText("Cari");
        SearchUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchUpdateActionPerformed(evt);
            }
        });
        UpdateStafMenu.add(SearchUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 90, 30));

        StafPanel.add(UpdateStafMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));

        HapusStafMenu.setBackground(new java.awt.Color(255, 250, 229));
        HapusStafMenu.setMaximumSize(new java.awt.Dimension(1280, 600));
        HapusStafMenu.setMinimumSize(new java.awt.Dimension(1280, 600));
        HapusStafMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                HapusStafMenuComponentShown(evt);
            }
        });
        HapusStafMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HapusStafTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        HapusStafTitle.setText("Hapus Pegawai");
        HapusStafMenu.add(HapusStafTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        HapusStafID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusStafID.setText("ID Staf");
        HapusStafMenu.add(HapusStafID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        HapusStafNama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusStafNama.setText("Nama Lengkap");
        HapusStafMenu.add(HapusStafNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        HapusStafCabang.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusStafCabang.setText("ID Cabang");
        HapusStafMenu.add(HapusStafCabang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        HapusStafShift.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusStafShift.setText("Shift");
        HapusStafMenu.add(HapusStafShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        HapusStafTglMasuk.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusStafTglMasuk.setText("Tanggal Masuk");
        HapusStafMenu.add(HapusStafTglMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        HapusStaf_CancelButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusStaf_CancelButton.setText("Batal");
        HapusStaf_CancelButton.setEnabled(false);
        HapusStaf_CancelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HapusStaf_CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusStaf_CancelButtonActionPerformed(evt);
            }
        });
        HapusStafMenu.add(HapusStaf_CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 120, -1));

        HapusStaf_ConfirmButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusStaf_ConfirmButton.setText("Hapus");
        HapusStaf_ConfirmButton.setEnabled(false);
        HapusStaf_ConfirmButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HapusStaf_ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusStaf_ConfirmButtonActionPerformed(evt);
            }
        });
        HapusStafMenu.add(HapusStaf_ConfirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        HapusShiftPagi.setBackground(new java.awt.Color(255, 250, 229));
        btnGroup_Staf_Hapus.add(HapusShiftPagi);
        HapusShiftPagi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HapusShiftPagi.setText("Pagi");
        HapusShiftPagi.setEnabled(false);
        HapusStafMenu.add(HapusShiftPagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        HapusShiftMalam.setBackground(new java.awt.Color(255, 250, 229));
        btnGroup_Staf_Hapus.add(HapusShiftMalam);
        HapusShiftMalam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HapusShiftMalam.setText("Malam");
        HapusShiftMalam.setEnabled(false);
        HapusStafMenu.add(HapusShiftMalam, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        HapusCabangCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UBM-A", "UBM-S" }));
        HapusCabangCbx.setEnabled(false);
        HapusStafMenu.add(HapusCabangCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 140, 40));

        HapusStaf_NamaField.setEnabled(false);
        HapusStafMenu.add(HapusStaf_NamaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 180, 30));
        HapusStafMenu.add(HapusStaf_IDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 180, 30));

        HapusTglMasuk.setEnabled(false);
        HapusStafMenu.add(HapusTglMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 180, 30));

        HapusStaf_SearchButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HapusStaf_SearchButton.setText("Cari");
        HapusStaf_SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusStaf_SearchButtonActionPerformed(evt);
            }
        });
        HapusStafMenu.add(HapusStaf_SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 90, 30));

        StafPanel.add(HapusStafMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));

        MainPanel.add(StafPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 1110, 580));

        SupplierPanel.setBackground(new java.awt.Color(255, 250, 229));
        SupplierPanel.setMaximumSize(new java.awt.Dimension(1280, 600));
        SupplierPanel.setMinimumSize(new java.awt.Dimension(1280, 600));
        SupplierPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StafBar1.setBackground(new java.awt.Color(255, 227, 128));
        StafBar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddSupplier.setBackground(new java.awt.Color(255, 250, 229));
        AddSupplier.setPreferredSize(new java.awt.Dimension(150, 150));

        AddSupplierLogo.setBackground(new java.awt.Color(255, 227, 128));
        AddSupplierLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddSupplierLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Add Supplier.png"))); // NOI18N
        AddSupplierLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddSupplierLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddSupplierLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddSupplierLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AddSupplierLayout = new javax.swing.GroupLayout(AddSupplier);
        AddSupplier.setLayout(AddSupplierLayout);
        AddSupplierLayout.setHorizontalGroup(
            AddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddSupplierLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddSupplierLayout.setVerticalGroup(
            AddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddSupplierLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(AddSupplierLogo)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        StafBar1.add(AddSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ListSupplier.setBackground(new java.awt.Color(255, 250, 229));
        ListSupplier.setPreferredSize(new java.awt.Dimension(150, 150));

        ListSupplierLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListSupplierLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo List Supplier.png"))); // NOI18N
        ListSupplierLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListSupplierLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListSupplierLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListSupplierLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ListSupplierLayout = new javax.swing.GroupLayout(ListSupplier);
        ListSupplier.setLayout(ListSupplierLayout);
        ListSupplierLayout.setHorizontalGroup(
            ListSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListSupplierLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ListSupplierLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListSupplierLayout.setVerticalGroup(
            ListSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListSupplierLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ListSupplierLogo)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        StafBar1.add(ListSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        UpdateSupplier.setBackground(new java.awt.Color(255, 250, 229));
        UpdateSupplier.setPreferredSize(new java.awt.Dimension(150, 150));

        UpdateSupplierLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateSupplierLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Update Supplier.png"))); // NOI18N
        UpdateSupplierLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateSupplierLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateSupplierLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateSupplierLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout UpdateSupplierLayout = new javax.swing.GroupLayout(UpdateSupplier);
        UpdateSupplier.setLayout(UpdateSupplierLayout);
        UpdateSupplierLayout.setHorizontalGroup(
            UpdateSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpdateSupplierLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UpdateSupplierLayout.setVerticalGroup(
            UpdateSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateSupplierLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(UpdateSupplierLogo)
                .addGap(22, 22, 22))
        );

        StafBar1.add(UpdateSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        HapusSupplier.setBackground(new java.awt.Color(255, 250, 229));
        HapusSupplier.setPreferredSize(new java.awt.Dimension(150, 150));

        HapusSupplierLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HapusSupplierLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Hapus Supplier.png"))); // NOI18N
        HapusSupplierLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HapusSupplierLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HapusSupplierLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HapusSupplierLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HapusSupplierLayout = new javax.swing.GroupLayout(HapusSupplier);
        HapusSupplier.setLayout(HapusSupplierLayout);
        HapusSupplierLayout.setHorizontalGroup(
            HapusSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HapusSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HapusSupplierLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HapusSupplierLayout.setVerticalGroup(
            HapusSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HapusSupplierLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(HapusSupplierLogo)
                .addGap(22, 22, 22))
        );

        StafBar1.add(HapusSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

        SupplierPanel.add(StafBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 150, 580));

        AddSupplierMenu.setBackground(new java.awt.Color(255, 250, 229));
        AddSupplierMenu.setMaximumSize(new java.awt.Dimension(1280, 600));
        AddSupplierMenu.setMinimumSize(new java.awt.Dimension(1280, 600));
        AddSupplierMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddSupplierTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        AddSupplierTitle.setText("Data Supplier Baru");
        AddSupplierMenu.add(AddSupplierTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        AddSupplierID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddSupplierID.setText("ID Supplier");
        AddSupplierMenu.add(AddSupplierID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        AddSupplierNama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddSupplierNama.setText("Nama Supplier");
        AddSupplierMenu.add(AddSupplierNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        AddSupplierKotaID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddSupplierKotaID.setText("ID Kota");
        AddSupplierMenu.add(AddSupplierKotaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        AddSupplier_CancelButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddSupplier_CancelButton.setText("Batal");
        AddSupplier_CancelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddSupplierMenu.add(AddSupplier_CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 120, -1));

        AddSupplier_SaveButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddSupplier_SaveButton.setText("Simpan ");
        AddSupplier_SaveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddSupplierMenu.add(AddSupplier_SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        KotaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JKT", "BDG", "BGR", "U-DNKY", "S&P", "SSK" }));
        AddSupplierMenu.add(KotaCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 140, 40));
        AddSupplierMenu.add(AddSupplier_NamaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 180, 30));
        AddSupplierMenu.add(AddSupplier_IDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 180, 30));

        SupplierPanel.add(AddSupplierMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));

        ListSupplierMenu.setBackground(new java.awt.Color(255, 250, 229));
        ListSupplierMenu.setMaximumSize(new java.awt.Dimension(1280, 600));
        ListSupplierMenu.setMinimumSize(new java.awt.Dimension(1280, 600));
        ListSupplierMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Supplier", "Nama Supplier", "ID Kota"
            }
        ));
        SupplierTable.setViewportView(TabelSupplier);

        ListSupplierMenu.add(SupplierTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 940, 350));

        ListSupplierTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ListSupplierTitle.setText("Daftar Supplier");
        ListSupplierMenu.add(ListSupplierTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        SupplierPanel.add(ListSupplierMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));

        UpdateSupplierMenu.setBackground(new java.awt.Color(255, 250, 229));
        UpdateSupplierMenu.setMaximumSize(new java.awt.Dimension(1280, 600));
        UpdateSupplierMenu.setMinimumSize(new java.awt.Dimension(1280, 600));
        UpdateSupplierMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpdateSupplierTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        UpdateSupplierTitle.setText("Update Data Supplier");
        UpdateSupplierMenu.add(UpdateSupplierTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        UpdateSupplierID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateSupplierID.setText("ID Supplier");
        UpdateSupplierMenu.add(UpdateSupplierID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        UpdateSupplierNama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateSupplierNama.setText("Nama Supplier");
        UpdateSupplierMenu.add(UpdateSupplierNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        UpdateSupplierKotaID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateSupplierKotaID.setText("ID Kota");
        UpdateSupplierMenu.add(UpdateSupplierKotaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        UpdateSupplier_CancelButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateSupplier_CancelButton.setText("Batal");
        UpdateSupplier_CancelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UpdateSupplierMenu.add(UpdateSupplier_CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 120, -1));

        UpdateSupplier_SaveButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdateSupplier_SaveButton.setText("Simpan ");
        UpdateSupplier_SaveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UpdateSupplierMenu.add(UpdateSupplier_SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        UpdateKotaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JKT", "BDG", "BGR", "U-DNKY", "S&P", "SSK" }));
        UpdateSupplierMenu.add(UpdateKotaCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 140, 40));
        UpdateSupplierMenu.add(UpdateSupplier_NamaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 180, 30));
        UpdateSupplierMenu.add(UpdateSupplier_IDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 180, 30));

        UpdateSupplier_SearchButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UpdateSupplier_SearchButton.setText("Cari");
        UpdateSupplierMenu.add(UpdateSupplier_SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 121, 80, 30));

        SupplierPanel.add(UpdateSupplierMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));

        HapusSupplierMenu.setBackground(new java.awt.Color(255, 250, 229));
        HapusSupplierMenu.setMaximumSize(new java.awt.Dimension(1280, 600));
        HapusSupplierMenu.setMinimumSize(new java.awt.Dimension(1280, 600));
        HapusSupplierMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HapusSupplierTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        HapusSupplierTitle.setText("Hapus Supplier");
        HapusSupplierMenu.add(HapusSupplierTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        HapusSupplierID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusSupplierID.setText("ID Supplier");
        HapusSupplierMenu.add(HapusSupplierID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        HapusSupplierNama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusSupplierNama.setText("Nama Supplier");
        HapusSupplierMenu.add(HapusSupplierNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        HapusSupplierKotaID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusSupplierKotaID.setText("ID Kota");
        HapusSupplierMenu.add(HapusSupplierKotaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        HapusSupplier_CancelButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusSupplier_CancelButton.setText("Batal");
        HapusSupplier_CancelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HapusSupplierMenu.add(HapusSupplier_CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 120, -1));

        HapusSupplier_ConfirmButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HapusSupplier_ConfirmButton.setText("Hapus");
        HapusSupplier_ConfirmButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HapusSupplierMenu.add(HapusSupplier_ConfirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        HapusKotaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JKT", "BDG", "BGR", "U-DNKY", "S&P", "SSK" }));
        HapusKotaCbx.setEnabled(false);
        HapusSupplierMenu.add(HapusKotaCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 140, 40));

        HapusSupplier_NamaField.setEnabled(false);
        HapusSupplierMenu.add(HapusSupplier_NamaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 180, 30));
        HapusSupplierMenu.add(HapusSupplier_IDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 180, 30));

        HapusSupplier_SearchButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HapusSupplier_SearchButton.setText("Cari");
        HapusSupplierMenu.add(HapusSupplier_SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 121, 80, 30));

        SupplierPanel.add(HapusSupplierMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));

        MainPanel.add(SupplierPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 1110, 580));

        StokPanel.setBackground(new java.awt.Color(255, 250, 229));
        StokPanel.setMaximumSize(new java.awt.Dimension(1280, 600));
        StokPanel.setMinimumSize(new java.awt.Dimension(1280, 600));
        StokPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                StokPanelComponentShown(evt);
            }
        });
        StokPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Barang", "Nama Barang", "Kata Kunci" }));
        StokPanel.add(SearchCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 140, 40));
        StokPanel.add(SearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 250, 40));

        SearchButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchButton.setText("Cari");
        SearchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        StokPanel.add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 90, 40));

        TabelStok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Barang", "Nama Barang", "Supplier", "Stok", "Satuan"
            }
        ));
        StockTable.setViewportView(TabelStok);

        StokPanel.add(StockTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 970, 330));

        StokTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        StokTitle.setText("Kontrol Stok");
        StokPanel.add(StokTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        MainPanel.add(StokPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 1110, 580));

        PembelianPanel.setBackground(new java.awt.Color(255, 250, 229));
        PembelianPanel.setMaximumSize(new java.awt.Dimension(1280, 600));
        PembelianPanel.setMinimumSize(new java.awt.Dimension(1280, 600));
        PembelianPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PembelianPanelComponentShown(evt);
            }
        });
        PembelianPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelPembelian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Barang", "Nama Barang", "Harga Satuan", "Jumlah", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PembelianTable.setViewportView(TabelPembelian);

        PembelianPanel.add(PembelianTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 510, 370));

        PembelianTotalField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PembelianTotalField.setEnabled(false);
        PembelianPanel.add(PembelianTotalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 250, 40));

        PembelianBayar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PembelianBayar.setText("Bayar");
        PembelianBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembelianBayarMouseClicked(evt);
            }
        });
        PembelianBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PembelianBayarActionPerformed(evt);
            }
        });
        PembelianPanel.add(PembelianBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 120, 50));

        PembelianReset.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PembelianReset.setText("Reset");
        PembelianReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembelianResetMouseClicked(evt);
            }
        });
        PembelianReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PembelianResetActionPerformed(evt);
            }
        });
        PembelianPanel.add(PembelianReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, 120, 50));

        PembelianTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        PembelianTitle.setText("Pembelian");
        PembelianPanel.add(PembelianTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        JumlahCounter.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        JumlahCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JumlahCounterStateChanged(evt);
            }
        });
        PembelianPanel.add(JumlahCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 50, 30));

        PembelianSubtotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PembelianSubtotal.setText("Subtotal");
        PembelianPanel.add(PembelianSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, -1, -1));

        PembelianIDBon.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PembelianIDBon.setText("ID Bon");
        PembelianPanel.add(PembelianIDBon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        PembelianNamaBarang.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PembelianNamaBarang.setText("Barang");
        PembelianPanel.add(PembelianNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        PembelianJumlah.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PembelianJumlah.setText("Jumlah");
        PembelianPanel.add(PembelianJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        PembelianTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PembelianTotal.setText("Harga Total");
        PembelianPanel.add(PembelianTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        PembelianSubtotalField.setEditable(false);
        PembelianSubtotalField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PembelianPanel.add(PembelianSubtotalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 250, 40));

        PembelianIDBonField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PembelianPanel.add(PembelianIDBonField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 250, 40));

        BarangSelectCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarangSelectCbxActionPerformed(evt);
            }
        });
        PembelianPanel.add(BarangSelectCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 250, 40));

        PembelianAddtoCart.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PembelianAddtoCart.setText("Tambah");
        PembelianAddtoCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembelianAddtoCartMouseClicked(evt);
            }
        });
        PembelianAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PembelianAddtoCartActionPerformed(evt);
            }
        });
        PembelianPanel.add(PembelianAddtoCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 120, 50));

        MainPanel.add(PembelianPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 1110, 580));

        TransaksiPanel.setBackground(new java.awt.Color(255, 250, 229));
        TransaksiPanel.setMaximumSize(new java.awt.Dimension(1280, 600));
        TransaksiPanel.setMinimumSize(new java.awt.Dimension(1280, 600));
        TransaksiPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransaksiSearchCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Bon", "Tanggal Transaksi" }));
        TransaksiSearchCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiSearchCbxActionPerformed(evt);
            }
        });
        TransaksiPanel.add(TransaksiSearchCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 140, 40));
        TransaksiPanel.add(TransaksiSearchByIDBon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 250, 40));
        TransaksiPanel.add(TransaksiSearchByDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 250, 40));

        Transaksi_SearchButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Transaksi_SearchButton.setText("Cari");
        Transaksi_SearchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TransaksiPanel.add(Transaksi_SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 90, 40));

        TabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Barang", "Nama Barang", "Tanggal Transaksi", "Jumlah", "Harga Satuan", "Total"
            }
        ));
        TransaksiTable.setViewportView(TabelTransaksi);

        TransaksiPanel.add(TransaksiTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 1010, 330));

        TransaksiTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TransaksiTitle.setText("Riwayat Transaksi");
        TransaksiPanel.add(TransaksiTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        Subtotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Subtotal.setText("Subtotal");
        TransaksiPanel.add(Subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, -1, -1));

        SubtotalField.setEnabled(false);
        TransaksiPanel.add(SubtotalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, 250, 40));

        MainPanel.add(TransaksiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 1110, 580));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.png"))); // NOI18N
        MainPanel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 1140, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        if (Koneksi.openConnection() == null) {
            return;
        }

        if ("user".equals(UsernameField.getText()) && "pass".equals(PasswordField.getText())) {
            BarangLogo.setEnabled(true);
            TransaksiLogo.setEnabled(true);
            StafLogo.setEnabled(true);
            SupplyLogo.setEnabled(true);
            PembelianLogo.setEnabled(true);
            StokLogo.setEnabled(true);

            LoginPanel.setVisible(false);

            hasLogin = true;
        } else {
            JOptionPane.showMessageDialog(null, "Username atau password salah");
        }
        Koneksi.closeConnection();
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void AddStafLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStafLogoMouseClicked
        // TODO add your handling code here:
        AddStafMenu.setVisible(true);
        ListStafMenu.setVisible(false);
        UpdateStafMenu.setVisible(false);
        HapusStafMenu.setVisible(false);
    }//GEN-LAST:event_AddStafLogoMouseClicked

    private void AddStafLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStafLogoMouseEntered
        // TODO add your handling code here:
        AddStaf.setBackground(gray);
    }//GEN-LAST:event_AddStafLogoMouseEntered

    private void AddStafLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStafLogoMouseExited
        // TODO add your handling code here:
        AddStaf.setBackground(normal_btn);
    }//GEN-LAST:event_AddStafLogoMouseExited

    private void ListStafLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListStafLogoMouseClicked
        // TODO add your handling code here:
        ListStafMenu.setVisible(true);
        AddStafMenu.setVisible(false);
        UpdateStafMenu.setVisible(false);
        HapusStafMenu.setVisible(false);
    }//GEN-LAST:event_ListStafLogoMouseClicked

    private void ListStafLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListStafLogoMouseEntered
        // TODO add your handling code here:
        ListStaf.setBackground(gray);
    }//GEN-LAST:event_ListStafLogoMouseEntered

    private void ListStafLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListStafLogoMouseExited
        // TODO add your handling code here:
        ListStaf.setBackground(normal_btn);
    }//GEN-LAST:event_ListStafLogoMouseExited

    private void UpdateStafLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateStafLogoMouseClicked
        // TODO add your handling code here:
        UpdateStafMenu.setVisible(true);
        AddStafMenu.setVisible(false);
        ListStafMenu.setVisible(false);
        HapusStafMenu.setVisible(false);
    }//GEN-LAST:event_UpdateStafLogoMouseClicked

    private void UpdateStafLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateStafLogoMouseEntered
        // TODO add your handling code here:
        UpdateStaf.setBackground(gray);
    }//GEN-LAST:event_UpdateStafLogoMouseEntered

    private void UpdateStafLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateStafLogoMouseExited
        // TODO add your handling code here:
        UpdateStaf.setBackground(normal_btn);
    }//GEN-LAST:event_UpdateStafLogoMouseExited

    private void SearchUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchUpdateActionPerformed
        if(UpdateStaf_IDField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "THE TEXT FIELD IS EMPTY!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String id = UpdateStaf_IDField.getText();
        Petugas p = petugasController.getByID_Petugas(id);
        
        if(p == null){
            JOptionPane.showMessageDialog(this, "ID: " + id + " not found!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        SearchUpdate.setEnabled(false);
        UpdateStaf_IDField.setEnabled(false);
        UpdateStaf_NamaField.setEnabled(true);
        UpdateCabangCbx.setEnabled(true);
        UpdateShiftPagi.setEnabled(true);
        UpdateShiftMalam.setEnabled(true);
        UpdateTglMasuk.setEnabled(true);
        UpdateSave.setEnabled(true);
        UpdateCancel.setEnabled(true);
        
        int size=UpdateCabangCbx.getModel().getSize();
        int i;
        for(i=size-1; i>=0; i--){
            Cabang cek = (Cabang) UpdateCabangCbx.getModel().getElementAt(i);
            if (cek.getID_Cabang().equals(p.getID_Cabang()))
                break;
        }
        
        UpdateCabangCbx.setSelectedIndex(i);
        UpdateStaf_NamaField.setText(p.getNama_Petugas());
        if(p.getShift().equals("Pagi")) UpdateShiftPagi.setSelected(true);
        else UpdateShiftMalam.setSelected(true);
        UpdateTglMasuk.setDate(p.getTanggal_Masuk());
    }//GEN-LAST:event_SearchUpdateActionPerformed

    private void HapusStaf_SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusStaf_SearchButtonActionPerformed
        if(HapusStaf_IDField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "THE TEXT FIELD IS EMPTY!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String id = HapusStaf_IDField.getText();
        Petugas p = petugasController.getByID_Petugas(id);
        
        if(p == null){
            JOptionPane.showMessageDialog(this, "ID: " + id + " not found!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int size=HapusCabangCbx.getModel().getSize();
        int i;
        for(i=size-1; i>=0; i--){
            Cabang cek = (Cabang) HapusCabangCbx.getModel().getElementAt(i);
            if (cek.getID_Cabang().equals(p.getID_Cabang()))
                break;
        }
        
        HapusCabangCbx.setSelectedIndex(i);
        HapusStaf_NamaField.setText(p.getNama_Petugas());
        if(p.getShift().equals("Pagi")) HapusShiftPagi.setSelected(true);
        else HapusShiftMalam.setSelected(true);
        HapusTglMasuk.setDate(p.getTanggal_Masuk());
        
        HapusStaf_IDField.setEnabled(false);
        HapusStaf_SearchButton.setEnabled(false);
        HapusStaf_ConfirmButton.setEnabled(true);
        HapusStaf_CancelButton.setEnabled(true);
    }//GEN-LAST:event_HapusStaf_SearchButtonActionPerformed

    private void HapusStafLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HapusStafLogoMouseClicked
        // TODO add your handling code here:
        HapusStafMenu.setVisible(true);
        AddStafMenu.setVisible(false);
        ListStafMenu.setVisible(false);
        UpdateStafMenu.setVisible(false);
    }//GEN-LAST:event_HapusStafLogoMouseClicked

    private void HapusStafLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HapusStafLogoMouseEntered
        // TODO add your handling code here:
        DeleteStaf.setBackground(gray);
    }//GEN-LAST:event_HapusStafLogoMouseEntered

    private void HapusStafLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HapusStafLogoMouseExited
        // TODO add your handling code here:
        DeleteStaf.setBackground(yellow_tran);
    }//GEN-LAST:event_HapusStafLogoMouseExited

    private void AddBarangLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBarangLogoMouseClicked
        // TODO add your handling code here:
        AddBarangMenu.setVisible(true);
        ListBarangMenu.setVisible(false);
        UpdateBarangMenu.setVisible(false);
        HapusBarangMenu.setVisible(false);
    }//GEN-LAST:event_AddBarangLogoMouseClicked

    private void AddBarangLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBarangLogoMouseEntered
        // TODO add your handling code here:
        AddBarang.setBackground(gray);
    }//GEN-LAST:event_AddBarangLogoMouseEntered

    private void AddBarangLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBarangLogoMouseExited
        // TODO add your handling code here:
        AddBarang.setBackground(yellow_tran);
    }//GEN-LAST:event_AddBarangLogoMouseExited

    private void ListBarangLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListBarangLogoMouseClicked
        // TODO add your handling code here:
        ListBarangMenu.setVisible(true);
        AddBarangMenu.setVisible(false);
        UpdateBarangMenu.setVisible(false);
        HapusBarangMenu.setVisible(false);
    }//GEN-LAST:event_ListBarangLogoMouseClicked

    private void ListBarangLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListBarangLogoMouseEntered
        // TODO add your handling code here:
        ListBarang.setBackground(gray);
    }//GEN-LAST:event_ListBarangLogoMouseEntered

    private void ListBarangLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListBarangLogoMouseExited
        // TODO add your handling code here:
        ListBarang.setBackground(yellow_tran);
    }//GEN-LAST:event_ListBarangLogoMouseExited

    private void UpdataBarangLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdataBarangLogoMouseClicked
        // TODO add your handling code here:
        UpdateBarangMenu.setVisible(true);
        AddBarangMenu.setVisible(false);
        ListBarangMenu.setVisible(false);
        HapusBarangMenu.setVisible(false);
    }//GEN-LAST:event_UpdataBarangLogoMouseClicked

    private void UpdataBarangLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdataBarangLogoMouseEntered
        // TODO add your handling code here:
        UpdateBarang.setBackground(gray);
    }//GEN-LAST:event_UpdataBarangLogoMouseEntered

    private void UpdataBarangLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdataBarangLogoMouseExited
        // TODO add your handling code here:
        UpdateBarang.setBackground(yellow_tran);
    }//GEN-LAST:event_UpdataBarangLogoMouseExited

    private void DeleteBarangLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBarangLogoMouseClicked
        // TODO add your handling code here:
        HapusBarangMenu.setVisible(true);
        AddBarangMenu.setVisible(false);
        ListBarangMenu.setVisible(false);
        UpdateBarangMenu.setVisible(false);
    }//GEN-LAST:event_DeleteBarangLogoMouseClicked

    private void DeleteBarangLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBarangLogoMouseEntered
        // TODO add your handling code here:
        HapusBarang.setBackground(gray);
    }//GEN-LAST:event_DeleteBarangLogoMouseEntered

    private void DeleteBarangLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBarangLogoMouseExited
        // TODO add your handling code here:
        HapusBarang.setBackground(yellow_tran);
    }//GEN-LAST:event_DeleteBarangLogoMouseExited

    private void SearchUpdateBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchUpdateBarangActionPerformed
        if(UpdateBarang_IDBarangField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "THE TEXT FIELD IS EMPTY!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String id = UpdateBarang_IDBarangField.getText();
        Barang b = barangController.getByID_Barang(id);
        
        if(b == null){
            JOptionPane.showMessageDialog(this, "ID: " + id + " not found!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        SearchUpdateBarang.setEnabled(false);
        UpdateBarang_IDBarangField.setEnabled(false);
        UpdateBarang_IDKCbx.setEnabled(true);
        UpdateBarang_NamaBarangField.setEnabled(true);
        UpdateBarang_HargaField.setEnabled(true);
        UpdateBarang_TglMasuk.setEnabled(true);
        UpdateBarang_TglExp.setEnabled(true);
        UpdateBarangConfirm.setEnabled(true);
        UpdateBarangCancel.setEnabled(true);
        
        int size=UpdateBarang_IDKCbx.getModel().getSize();
        int i;
        for(i=size-1; i>=0; i--){
            Katagori cek = (Katagori) UpdateBarang_IDKCbx.getModel().getElementAt(i);
            if (cek.getID_Katagori().equals(b.getID_Katagori()))
                break;
        }
        
        UpdateBarang_IDKCbx.setSelectedIndex(i);
        UpdateBarang_NamaBarangField.setText(b.getNama_Barang());
        UpdateBarang_HargaField.setText("" + b.getHarga_Barang());
        UpdateBarang_TglMasuk.setDate(b.getTanggal_Masuk());
        UpdateBarang_TglExp.setDate(b.getTanggal_Kadaluarsa());
    }//GEN-LAST:event_SearchUpdateBarangActionPerformed

    private void SearchHapusBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchHapusBarangActionPerformed
        if(HapusBarang_IDBarangField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "THE TEXT FIELD IS EMPTY!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String id = HapusBarang_IDBarangField.getText();
        Barang b = barangController.getByID_Barang(id);
        
        if(b == null){
            JOptionPane.showMessageDialog(this, "ID: " + id + " not found!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int size=HapusBarang_IDKCbx.getModel().getSize();
        int i;
        for(i=size-1; i>=0; i--){
            Katagori cek = (Katagori) HapusBarang_IDKCbx.getModel().getElementAt(i);
            if (cek.getID_Katagori().equals(b.getID_Katagori()))
                break;
        }
        
        HapusBarang_IDKCbx.setSelectedIndex(i);
        HapusBarang_NamaBarangField.setText(b.getNama_Barang());
        HapusBarang_HargaField.setText("" + b.getHarga_Barang());
        HapusBarang_TglMasuk.setDate(b.getTanggal_Masuk());
        HapusBarang_TglExp.setDate(b.getTanggal_Kadaluarsa());
        
        HapusBarang_IDBarangField.setEnabled(false);
        SearchHapusBarang.setEnabled(false);
        HapusBarangConfirm.setEnabled(true);
        HapusBarangCancel.setEnabled(true);
    }//GEN-LAST:event_SearchHapusBarangActionPerformed

    private void AddSupplierLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddSupplierLogoMouseClicked
        // TODO add your handling code here:
        AddSupplierMenu.setVisible(true);
        ListSupplierMenu.setVisible(false);
        UpdateSupplierMenu.setVisible(false);
        HapusSupplierMenu.setVisible(false);
    }//GEN-LAST:event_AddSupplierLogoMouseClicked

    private void AddSupplierLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddSupplierLogoMouseEntered
        // TODO add your handling code here:
        AddSupplier.setBackground(gray);
    }//GEN-LAST:event_AddSupplierLogoMouseEntered

    private void AddSupplierLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddSupplierLogoMouseExited
        // TODO add your handling code here:
        AddSupplier.setBackground(yellow_tran);
    }//GEN-LAST:event_AddSupplierLogoMouseExited

    private void ListSupplierLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListSupplierLogoMouseClicked
        // TODO add your handling code here:
        ListSupplierMenu.setVisible(true);
        AddSupplierMenu.setVisible(false);
        UpdateSupplierMenu.setVisible(false);
        HapusSupplierMenu.setVisible(false);
    }//GEN-LAST:event_ListSupplierLogoMouseClicked

    private void ListSupplierLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListSupplierLogoMouseEntered
        // TODO add your handling code here:
        ListSupplier.setBackground(gray);
    }//GEN-LAST:event_ListSupplierLogoMouseEntered

    private void ListSupplierLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListSupplierLogoMouseExited
        // TODO add your handling code here:
        ListSupplier.setBackground(yellow_tran);
    }//GEN-LAST:event_ListSupplierLogoMouseExited

    private void UpdateSupplierLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateSupplierLogoMouseClicked
        // TODO add your handling code here:
        UpdateSupplierMenu.setVisible(true);
        AddSupplierMenu.setVisible(false);
        ListSupplierMenu.setVisible(false);
        HapusSupplierMenu.setVisible(false);
    }//GEN-LAST:event_UpdateSupplierLogoMouseClicked

    private void UpdateSupplierLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateSupplierLogoMouseEntered
        // TODO add your handling code here:
        UpdateSupplier.setBackground(gray);
    }//GEN-LAST:event_UpdateSupplierLogoMouseEntered

    private void UpdateSupplierLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateSupplierLogoMouseExited
        // TODO add your handling code here:
        UpdateSupplier.setBackground(yellow_tran);
    }//GEN-LAST:event_UpdateSupplierLogoMouseExited

    private void HapusSupplierLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HapusSupplierLogoMouseClicked
        // TODO add your handling code here:
        HapusSupplierMenu.setVisible(true);
        AddSupplierMenu.setVisible(false);
        ListSupplierMenu.setVisible(false);
        UpdateSupplierMenu.setVisible(false);
    }//GEN-LAST:event_HapusSupplierLogoMouseClicked

    private void HapusSupplierLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HapusSupplierLogoMouseEntered
        // TODO add your handling code here:
        HapusSupplier.setBackground(gray);
    }//GEN-LAST:event_HapusSupplierLogoMouseEntered

    private void HapusSupplierLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HapusSupplierLogoMouseExited
        // TODO add your handling code here:
        HapusSupplier.setBackground(yellow_tran);
    }//GEN-LAST:event_HapusSupplierLogoMouseExited

    private void BarangLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarangLogoMouseClicked
        if (!hasLogin) {
            return;
        }

        // TODO add your handling code here:
        BarangPanel.setVisible(true);
        StokPanel.setVisible(false);
        StafPanel.setVisible(false);
        SupplierPanel.setVisible(false);
        PembelianPanel.setVisible(false);
        TransaksiPanel.setVisible(false);
    }//GEN-LAST:event_BarangLogoMouseClicked

    private void BarangLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarangLogoMouseEntered
        // TODO add your handling code here:
        Barang.setBackground(gray);
    }//GEN-LAST:event_BarangLogoMouseEntered

    private void BarangLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarangLogoMouseExited
        // TODO add your handling code here:
        Barang.setBackground(normal_btn);
    }//GEN-LAST:event_BarangLogoMouseExited

    private void StafLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StafLogoMouseClicked
        if (!hasLogin) {
            return;
        }
        // TODO add your handling code here:
        StafPanel.setVisible(true);
        StokPanel.setVisible(false);
        BarangPanel.setVisible(false);
        SupplierPanel.setVisible(false);
        PembelianPanel.setVisible(false);
        TransaksiPanel.setVisible(false);
    }//GEN-LAST:event_StafLogoMouseClicked

    private void StafLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StafLogoMouseEntered
        // TODO add your handling code here:
        Staf.setBackground(gray);
    }//GEN-LAST:event_StafLogoMouseEntered

    private void StafLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StafLogoMouseExited
        // TODO add your handling code here:
        Staf.setBackground(normal_btn);
    }//GEN-LAST:event_StafLogoMouseExited

    private void StokLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StokLogoMouseClicked
        if (!hasLogin) {
            return;
        }
        // TODO add your handling code here:
        StokPanel.setVisible(true);
        StafPanel.setVisible(false);
        BarangPanel.setVisible(false);
        SupplierPanel.setVisible(false);
        PembelianPanel.setVisible(false);
        TransaksiPanel.setVisible(false);
    }//GEN-LAST:event_StokLogoMouseClicked

    private void StokLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StokLogoMouseEntered
        // TODO add your handling code here:
        Stok.setBackground(gray);
    }//GEN-LAST:event_StokLogoMouseEntered

    private void StokLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StokLogoMouseExited
        // TODO add your handling code here:
        Stok.setBackground(normal_btn);
    }//GEN-LAST:event_StokLogoMouseExited

    private void SupplyLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplyLogoMouseClicked
        if (!hasLogin) {
            return;
        }
        // TODO add your handling code here:
        SupplierPanel.setVisible(true);
        StokPanel.setVisible(false);
        StafPanel.setVisible(false);
        BarangPanel.setVisible(false);
        PembelianPanel.setVisible(false);
        TransaksiPanel.setVisible(false);
    }//GEN-LAST:event_SupplyLogoMouseClicked

    private void SupplyLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplyLogoMouseEntered
        // TODO add your handling code here:
        Supply.setBackground(gray);
    }//GEN-LAST:event_SupplyLogoMouseEntered

    private void SupplyLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplyLogoMouseExited
        // TODO add your handling code here:
        Supply.setBackground(normal_btn);
    }//GEN-LAST:event_SupplyLogoMouseExited

    private void TransaksiLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiLogoMouseClicked
        if (!hasLogin) {
            return;
        }
        // TODO add your handling code here:
        TransaksiPanel.setVisible(true);
        BarangPanel.setVisible(false);
        StokPanel.setVisible(false);
        StafPanel.setVisible(false);
        SupplierPanel.setVisible(false);
        PembelianPanel.setVisible(false);
    }//GEN-LAST:event_TransaksiLogoMouseClicked

    private void TransaksiLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiLogoMouseEntered
        // TODO add your handling code here:
        Transaksi.setBackground(gray);
    }//GEN-LAST:event_TransaksiLogoMouseEntered

    private void TransaksiLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiLogoMouseExited
        // TODO add your handling code here:
        Transaksi.setBackground(normal_btn);
    }//GEN-LAST:event_TransaksiLogoMouseExited

    private void TransaksiSearchCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiSearchCbxActionPerformed
        // TODO add your handling code here:
        if (TransaksiSearchCbx.getSelectedItem().toString().equals("ID Barang")) {
            TransaksiSearchByIDBon.setEnabled(true);
            TransaksiSearchByDate.setEnabled(false);
        } else {
            TransaksiSearchByDate.setEnabled(true);
            TransaksiSearchByIDBon.setEnabled(false);
        }
    }//GEN-LAST:event_TransaksiSearchCbxActionPerformed

    private void PembelianLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianLogoMouseClicked
        if (!hasLogin) {
            return;
        }
        // TODO add your handling code here:
        PembelianPanel.setVisible(true);
        BarangPanel.setVisible(false);
        StokPanel.setVisible(false);
        StafPanel.setVisible(false);
        SupplierPanel.setVisible(false);
        TransaksiPanel.setVisible(false);
    }//GEN-LAST:event_PembelianLogoMouseClicked

    private void PembelianLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianLogoMouseEntered
        // TODO add your handling code here:
        Pembelian.setBackground(gray);
    }//GEN-LAST:event_PembelianLogoMouseEntered

    private void PembelianLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianLogoMouseExited
        // TODO add your handling code here:
        Pembelian.setBackground(normal_btn);
    }//GEN-LAST:event_PembelianLogoMouseExited

    private void PembelianAddtoCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianAddtoCartMouseClicked
        // TODO add your handling code here:
        PembelianIDBonField.setText(PembelianIDBonField.getText());
        PembelianIDBonField.setEnabled(false);
    }//GEN-LAST:event_PembelianAddtoCartMouseClicked

    private void PembelianBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianBayarMouseClicked
        // TODO add your handling code here:
        PembelianIDBonField.setText(null);
        PembelianIDBonField.setEnabled(true);

        //SOMETHING MISSING HERE
        //MASUKKAN ISI TABEL PEMBELIAN SEBAGAI HISTORY TRANSAKSI DI SINI
        //WHEN FIXED, PLS DELETE THIS COMMENT
        DefaultTableModel model = (DefaultTableModel) TabelPembelian.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_PembelianBayarMouseClicked

    private void PembelianResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianResetMouseClicked
        // TODO add your handling code here:
        PembelianIDBonField.setText(null);
        PembelianIDBonField.setEnabled(true);

        DefaultTableModel model = (DefaultTableModel) TabelPembelian.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_PembelianResetMouseClicked

    private void AddBarang_SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBarang_SaveButtonActionPerformed
        try {
            if (IDBarangField.getText().equals(""))    throw new Exception("ID");
            if (NamaBarangField.getText().equals(""))  throw new Exception("Nama");
            if (HargaBarangField.getText().equals("")) throw new Exception("Harga");
            if (BarangTglMasuk.getDate() == null)      throw new Exception("TglMasuk");
            if (BarangTglExp.getDate() == null)        throw new Exception("TglKeluar");

            String id = IDBarangField.getText();
            String nama = NamaBarangField.getText();
            String kategori = ((Katagori) IDKCbx.getSelectedItem()).getID_Katagori();
            int harga = Integer.parseInt(HargaBarangField.getText());
            Date masuk = BarangTglMasuk.getDate();
            Date kadaluarsa = BarangTglExp.getDate();
            
            Barang b = new Barang(id, kategori, nama, harga, DatetoSQL(masuk), DatetoSQL(kadaluarsa));
            barangController.setDml(b, OperasiCRUD.INSERT);
            
            JOptionPane.showMessageDialog(this, "Data berhasil masuk!", "Message", JOptionPane.PLAIN_MESSAGE);
            AddBarang_CancelButtonActionPerformed(null);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Tulis angka dengan benar!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + " tidak boleh kosong!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddBarang_SaveButtonActionPerformed

    private void AddBarangMenuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_AddBarangMenuComponentShown
        List<Katagori> list = katagoriController.getAllKatagori();
        int size = list.size();

        Boolean isUpdated = false;

        if (size != IDKCbx.getModel().getSize()) {
            isUpdated = true;
        } else {
            for (int i = 0; i < size; i++) {
                if (!list.get(i).toString().equals(IDKCbx.getModel().getElementAt(i).toString())) {
                    isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            return;
        }

        IDKCbx.setModel(new javax.swing.DefaultComboBoxModel<>(list.toArray()));
    }//GEN-LAST:event_AddBarangMenuComponentShown

    private void IDKCbxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDKCbxMouseClicked
        AddBarangMenuComponentShown(null);
    }//GEN-LAST:event_IDKCbxMouseClicked

    private void AddBarang_CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBarang_CancelButtonActionPerformed
        IDBarangField.setText("");
        NamaBarangField.setText("");
        HargaBarangField.setText("");
        BarangTglMasuk.setDate(null);
        BarangTglExp.setDate(null);
        IDKCbx.setSelectedIndex(0);
    }//GEN-LAST:event_AddBarang_CancelButtonActionPerformed

    private void ListBarangMenuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ListBarangMenuComponentShown
        List<Barang> list = barangController.getAllBarang();
        if(list == null)
            return;
        
        int size = list.size();
        Object[][] data = new Object[size][6];
        Object[] columnNames = {
            "ID Barang", 
            "ID Katagori", 
            "Nama Barang", 
            "Harga Barang", 
            "Tanggal Masuk", 
            "Tanggal Kadaluarsa"
        };
        
        for(int i=0; i<size; i++){
            data[i][0] = list.get(i).getID_Barang();
            data[i][1] = list.get(i).getID_Katagori();
            data[i][2] = list.get(i).getNama_Barang();
            data[i][3] = list.get(i).getHarga_Barang();
            data[i][4] = list.get(i).getTanggal_Masuk();
            data[i][5] = list.get(i).getTanggal_Kadaluarsa();
        }
        
        TabelBarang.setModel(new javax.swing.table.DefaultTableModel(data, columnNames){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }//GEN-LAST:event_ListBarangMenuComponentShown

    private void UpdateBarangConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBarangConfirmActionPerformed
        try {
            if (UpdateBarang_IDBarangField.getText().equals(""))   throw new Exception("ID");
            if (UpdateBarang_NamaBarangField.getText().equals("")) throw new Exception("Nama");
            if (UpdateBarang_HargaField.getText().equals(""))      throw new Exception("Harga");
            if (UpdateBarang_TglMasuk.getDate() == null)           throw new Exception("TglMasuk");
            if (UpdateBarang_TglExp.getDate() == null)             throw new Exception("TglKeluar");

            String id = UpdateBarang_IDBarangField.getText();
            String nama = UpdateBarang_NamaBarangField.getText();
            String kategori = ((Katagori) UpdateBarang_IDKCbx.getSelectedItem()).getID_Katagori();
            int harga = Integer.parseInt(UpdateBarang_HargaField.getText());
            Date masuk = UpdateBarang_TglMasuk.getDate();
            Date kadaluarsa = UpdateBarang_TglExp.getDate();
            
            Barang b = new Barang(id, kategori, nama, harga, DatetoSQL(masuk), DatetoSQL(kadaluarsa));
            barangController.setDml(b, OperasiCRUD.UPDATE);
            
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate!", "Message", JOptionPane.PLAIN_MESSAGE);
            UpdateBarangCancelActionPerformed(null);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Tulis angka dengan benar!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + " tidak boleh kosong!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UpdateBarangConfirmActionPerformed

    private void UpdateBarangMenuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_UpdateBarangMenuComponentShown
        List<Katagori> list = katagoriController.getAllKatagori();
        int size = list.size();

        Boolean isUpdated = false;

        if (size != UpdateBarang_IDKCbx.getModel().getSize()) {
            isUpdated = true;
        } else {
            for (int i = 0; i < size; i++) {
                if (!list.get(i).toString().equals(UpdateBarang_IDKCbx.getModel().getElementAt(i).toString())) {
                    isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            return;
        }

        UpdateBarang_IDKCbx.setModel(new javax.swing.DefaultComboBoxModel<>(list.toArray()));
        UpdateBarang_IDKCbx.setSelectedIndex(-1);
    }//GEN-LAST:event_UpdateBarangMenuComponentShown

    private void UpdateBarangCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBarangCancelActionPerformed
        UpdateBarang_IDBarangField.setText("");
        UpdateBarang_NamaBarangField.setText("");
        UpdateBarang_IDKCbx.setSelectedIndex(-1);
        UpdateBarang_HargaField.setText("");
        UpdateBarang_TglMasuk.setDate(null);
        UpdateBarang_TglExp.setDate(null);
        
        SearchUpdateBarang.setEnabled(true);
        UpdateBarang_IDBarangField.setEnabled(true);
        UpdateBarang_IDKCbx.setEnabled(false);
        UpdateBarang_NamaBarangField.setEnabled(false);
        UpdateBarang_HargaField.setEnabled(false);
        UpdateBarang_TglMasuk.setEnabled(false);
        UpdateBarang_TglExp.setEnabled(false);
        UpdateBarangConfirm.setEnabled(false);
        UpdateBarangCancel.setEnabled(false);
    }//GEN-LAST:event_UpdateBarangCancelActionPerformed

    private void HapusBarangMenuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_HapusBarangMenuComponentShown
        List<Katagori> list = katagoriController.getAllKatagori();
        int size = list.size();

        Boolean isUpdated = false;

        if (size != HapusBarang_IDKCbx.getModel().getSize()) {
            isUpdated = true;
        } else {
            for (int i = 0; i < size; i++) {
                if (!list.get(i).toString().equals(HapusBarang_IDKCbx.getModel().getElementAt(i).toString())) {
                    isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            return;
        }

        HapusBarang_IDKCbx.setModel(new javax.swing.DefaultComboBoxModel<>(list.toArray()));
        HapusBarang_IDKCbx.setSelectedIndex(-1);
    }//GEN-LAST:event_HapusBarangMenuComponentShown

    private void HapusBarangConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusBarangConfirmActionPerformed
        try {
            if (HapusBarang_IDBarangField.getText().equals(""))   throw new Exception("ID");

            String id = HapusBarang_IDBarangField.getText();
            
            Barang b = new Barang(id, null, null, 0, null, null);
            barangController.setDml(b, OperasiCRUD.DELETE);
            
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!", "Message", JOptionPane.PLAIN_MESSAGE);
            HapusBarangCancelActionPerformed(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + " tidak boleh kosong!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_HapusBarangConfirmActionPerformed

    private void HapusBarangCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusBarangCancelActionPerformed
        HapusBarang_IDBarangField.setText("");
        HapusBarang_NamaBarangField.setText("");
        HapusBarang_IDKCbx.setSelectedIndex(-1);
        HapusBarang_HargaField.setText("");
        HapusBarang_TglMasuk.setDate(null);
        HapusBarang_TglExp.setDate(null);
        
        
        HapusBarang_IDBarangField.setEnabled(true);
        SearchHapusBarang.setEnabled(true);
        HapusBarangConfirm.setEnabled(false);
        HapusBarangCancel.setEnabled(false);
    }//GEN-LAST:event_HapusBarangCancelActionPerformed

    private void AddStafMenuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_AddStafMenuComponentShown
        List<Cabang> list = cabangController.getAllCabang();
        int size = list.size();

        Boolean isUpdated = false;

        if (size != CabangCbx.getModel().getSize()) {
            isUpdated = true;
        } else {
            for (int i = 0; i < size; i++) {
                if (!list.get(i).toString().equals(CabangCbx.getModel().getElementAt(i).toString())) {
                    isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            return;
        }

        CabangCbx.setModel(new javax.swing.DefaultComboBoxModel<>(list.toArray()));
    }//GEN-LAST:event_AddStafMenuComponentShown

    private void AddStaf_SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStaf_SaveButtonActionPerformed
        try {
            if (AddStaf_IDField.getText().equals(""))    throw new Exception("ID");
            if (AddStaf_NamaField.getText().equals(""))  throw new Exception("Nama");
            if (StafTglMasuk.getDate() == null)      throw new Exception("TglMasuk");

            String id = AddStaf_IDField.getText();
            String nama = AddStaf_NamaField.getText();
            String cabang = ((Cabang) CabangCbx.getSelectedItem()).getID_Cabang();
            String shift = ShiftPagi.isSelected() ? "Pagi" : "Malam";
            Date masuk = StafTglMasuk.getDate();
            
            Petugas p = new Petugas(id, nama, cabang, shift, DatetoSQL(masuk));
            petugasController.setDml(p, OperasiCRUD.INSERT);
            
            JOptionPane.showMessageDialog(this, "Data berhasil masuk!", "Message", JOptionPane.PLAIN_MESSAGE);
            AddStaf_CancelButtonActionPerformed(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + " tidak boleh kosong!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddStaf_SaveButtonActionPerformed

    private void AddStaf_CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStaf_CancelButtonActionPerformed
        AddStaf_IDField.setText("");
        AddStaf_NamaField.setText("");
        ShiftPagi.setSelected(true);
        StafTglMasuk.setDate(null);
        CabangCbx.setSelectedIndex(0);
    }//GEN-LAST:event_AddStaf_CancelButtonActionPerformed

    private void ListStafMenuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ListStafMenuComponentShown
        List<Petugas> list = petugasController.getAllPetugas();
        if(list == null)
            return;
        
        int size = list.size();
        Object[][] data = new Object[size][5];
        Object[] columnNames = {
            "ID Petugas",  
            "Nama Petugas", 
            "ID Cabang",
            "Shift",
            "Tanggal Masuk"
        };
        
        for(int i=0; i<size; i++){
            data[i][0] = list.get(i).getID_Petugas();
            data[i][1] = list.get(i).getNama_Petugas();
            data[i][2] = list.get(i).getID_Cabang();
            data[i][3] = list.get(i).getShift();
            data[i][4] = list.get(i).getTanggal_Masuk();
        }
        
        TabelStaf.setModel(new javax.swing.table.DefaultTableModel(data, columnNames){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }//GEN-LAST:event_ListStafMenuComponentShown

    private void UpdateStafMenuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_UpdateStafMenuComponentShown
        List<Cabang> list = cabangController.getAllCabang();
        int size = list.size();

        Boolean isUpdated = false;

        if (size != UpdateCabangCbx.getModel().getSize()) {
            isUpdated = true;
        } else {
            for (int i = 0; i < size; i++) {
                if (!list.get(i).toString().equals(UpdateCabangCbx.getModel().getElementAt(i).toString())) {
                    isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            return;
        }

        UpdateCabangCbx.setModel(new javax.swing.DefaultComboBoxModel<>(list.toArray()));
        UpdateCabangCbx.setSelectedItem(-1);
    }//GEN-LAST:event_UpdateStafMenuComponentShown

    private void UpdateSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateSaveActionPerformed
        try {
            if (UpdateStaf_IDField.getText().equals(""))    throw new Exception("ID");
            if (UpdateStaf_NamaField.getText().equals(""))  throw new Exception("Nama");
            if (UpdateTglMasuk.getDate() == null)      throw new Exception("TglMasuk");

            String id = UpdateStaf_IDField.getText();
            String nama = UpdateStaf_NamaField.getText();
            String cabang = ((Cabang) UpdateCabangCbx.getSelectedItem()).getID_Cabang();
            String shift = UpdateShiftPagi.isSelected() ? "Pagi" : "Malam";
            Date masuk = UpdateTglMasuk.getDate();
            
            Petugas p = new Petugas(id, nama, cabang, shift, DatetoSQL(masuk));
            petugasController.setDml(p, OperasiCRUD.UPDATE);
            
            JOptionPane.showMessageDialog(this, "Data berhasil update!", "Message", JOptionPane.PLAIN_MESSAGE);
            UpdateCancelActionPerformed(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + " tidak boleh kosong!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UpdateSaveActionPerformed

    private void UpdateCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCancelActionPerformed
        UpdateStaf_IDField.setText("");
        UpdateStaf_NamaField.setText("");
        UpdateCabangCbx.setSelectedIndex(-1);
        UpdateShiftPagi.setSelected(true);
        UpdateTglMasuk.setDate(null);
        
        SearchUpdate.setEnabled(true);
        UpdateStaf_IDField.setEnabled(true);
        UpdateStaf_NamaField.setEnabled(false);
        UpdateCabangCbx.setEnabled(false);
        UpdateShiftPagi.setEnabled(false);
        UpdateShiftMalam.setEnabled(false);
        UpdateTglMasuk.setEnabled(false);
    }//GEN-LAST:event_UpdateCancelActionPerformed

    private void HapusStafMenuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_HapusStafMenuComponentShown
        List<Cabang> list = cabangController.getAllCabang();
        int size = list.size();

        Boolean isUpdated = false;

        if (size != HapusCabangCbx.getModel().getSize()) {
            isUpdated = true;
        } else {
            for (int i = 0; i < size; i++) {
                if (!list.get(i).toString().equals(HapusCabangCbx.getModel().getElementAt(i).toString())) {
                    isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            return;
        }

        HapusCabangCbx.setModel(new javax.swing.DefaultComboBoxModel<>(list.toArray()));
        HapusCabangCbx.setSelectedItem(-1);
    }//GEN-LAST:event_HapusStafMenuComponentShown

    private void HapusStaf_ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusStaf_ConfirmButtonActionPerformed
        try {
            if (HapusStaf_IDField.getText().equals(""))    throw new Exception("ID");

            String id = HapusStaf_IDField.getText();
            
            Petugas p = new Petugas(id, null, null, null, null);
            petugasController.setDml(p, OperasiCRUD.DELETE);
            
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!", "Message", JOptionPane.PLAIN_MESSAGE);
            HapusStaf_CancelButtonActionPerformed(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + " tidak boleh kosong!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_HapusStaf_ConfirmButtonActionPerformed

    private void HapusStaf_CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusStaf_CancelButtonActionPerformed
        HapusStaf_IDField.setText("");
        HapusStaf_NamaField.setText("");
        HapusCabangCbx.setSelectedIndex(-1);
        HapusShiftPagi.setSelected(true);
        HapusTglMasuk.setDate(null);
        
        HapusStaf_IDField.setEnabled(true);
        HapusStaf_SearchButton.setEnabled(true);
        HapusStaf_ConfirmButton.setEnabled(false);
        HapusStaf_CancelButton.setEnabled(false);
    }//GEN-LAST:event_HapusStaf_CancelButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        if(SearchBar.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "SEARCH TEXT TIDAK BOLEH KOSONG", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE); 
            return;
        }
        
        List<Storage> list;
        String searchType = (String) SearchCbx.getSelectedItem();
        String searchText = SearchBar.getText();
        
        switch(searchType){
            case "ID Barang":
                list = storageController.getByID_Barang(searchText);
                break;
            case "Nama Barang":
                list = storageController.getByNama_Barang(searchText);
                break;
            case "Kata Kunci":
                list = storageController.getByKataKunci(searchText);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Search Type: " + searchType + " not found!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                return;
        }
        
        if(list == null)
            return;
        
        int size = list.size();
        Object[][] data = new Object[size][5];
        Object[] columnNames = {
            "ID Barang",  
            "Nama Barang", 
            "Katagori",
            "Supplier",
            "Stok"
        };
        
        for(int i=0; i<size; i++){
            data[i][0] = list.get(i).getID_Barang();
            data[i][1] = list.get(i).getNama_Barang();
            data[i][2] = list.get(i).getNama_Katagori();
            data[i][3] = list.get(i).getNama_Supplier();
            data[i][4] = list.get(i).getStok();
        }
        
        TabelStok.setModel(new javax.swing.table.DefaultTableModel(data, columnNames){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void StokPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_StokPanelComponentShown
        List<Storage> list = storageController.getAllStorage();
        
        if(list == null)
            return;
        
        int size = list.size();
        Object[][] data = new Object[size][5];
        Object[] columnNames = {
            "ID Barang",  
            "Nama Barang", 
            "Katagori",
            "Supplier",
            "Stok"
        };
        
        for(int i=0; i<size; i++){
            data[i][0] = list.get(i).getID_Barang();
            data[i][1] = list.get(i).getNama_Barang();
            data[i][2] = list.get(i).getNama_Katagori();
            data[i][3] = list.get(i).getNama_Supplier();
            data[i][4] = list.get(i).getStok();
        }
        
        TabelStok.setModel(new javax.swing.table.DefaultTableModel(data, columnNames){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }//GEN-LAST:event_StokPanelComponentShown

    private void PembelianPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PembelianPanelComponentShown
        List<Barang> list = barangController.getAllBarang();
        int size = list.size();

        Boolean isUpdated = false;

        if (size != BarangSelectCbx.getModel().getSize()) {
            isUpdated = true;
        } else {
            for (int i = 0; i < size; i++) {
                if (!list.get(i).toString().equals(BarangSelectCbx.getModel().getElementAt(i).toString())) {
                    isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            return;
        }

        BarangSelectCbx.setModel(new javax.swing.DefaultComboBoxModel<>(list.toArray()));
        BarangSelectCbx.setSelectedIndex(-1);
    }//GEN-LAST:event_PembelianPanelComponentShown

    private void PembelianAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PembelianAddtoCartActionPerformed
        String IDBon = PembelianIDBonField.getText();
        
        if(IDBon.isBlank()){
            JOptionPane.showMessageDialog(this, "ID BON TIDAK BOLEH KOSONG!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(bonController.getByID_Bon(IDBon) != null){
            JOptionPane.showMessageDialog(this, "ID BON SUDAH ADA!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(BarangSelectCbx.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "ID BARANG TIDAK BOLEH KOSONG!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Barang b = (Barang) BarangSelectCbx.getModel().getSelectedItem();
        int jumlah = (int) JumlahCounter.getValue();
        long total = b.getHarga_Barang() * jumlah;
        
        
        // Update the table
        int w = TabelPembelian.getModel().getColumnCount();
        int h = TabelPembelian.getModel().getRowCount();
        
        Object[] coloumnNames = new Object[w];
        for(int k=0; k<w; k++){
            coloumnNames[k] = TabelPembelian.getModel().getColumnName(k);
        }
        
        List<Object[]> dataList = new ArrayList<>();
        for(int i=0; i<h; i++){
            dataList.add(new Object[w]);
            for(int k=0; k<w; k++){
                dataList.get(i)[k] = TabelPembelian.getModel().getValueAt(i, k);
            }
        }
        
        Boolean isFound = false;
        for(Object[] d : dataList){
            if(b.getID_Barang().equals(d[0])){
                // jumlah = jumlah + InputJumlah
                d[3] = (int)d[3] + jumlah;
                
                // total = harga * jumlah
                d[4] = (long)(int)d[2] *(int)d[3];
                
                isFound = true;
                break;
            }
        }
        
        if(!isFound){
            Object[] o = new Object[w];
            
            o[0] = b.getID_Barang();
            o[1] = b.getNama_Barang();
            o[2] = b.getHarga_Barang();
            o[3] = jumlah;
            o[4] = total;
            
            dataList.add(o);
        }
        
        Object[][] data = dataList.toArray(new Object[dataList.size()][w]);
        TabelPembelian.setModel(new DefaultTableModel(data, coloumnNames){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        
        
        // Update Subtotal
        h = TabelPembelian.getModel().getRowCount();
        long subtotal = 0;
        for(int i=0; i<h; i++){
            subtotal += (long) data[i][4];
        }
        PembelianSubtotalField.setText("" + subtotal);
        
        
        // Disable Bon Field and reset input field
        PembelianIDBonField.setEnabled(false);
        BarangSelectCbx.setSelectedIndex(-1);
        JumlahCounter.setValue(1);
        PembelianTotalField.setText("");
    }//GEN-LAST:event_PembelianAddtoCartActionPerformed

    private void BarangSelectCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarangSelectCbxActionPerformed
        if(BarangSelectCbx.getSelectedIndex() == -1){
            return;
        }
        
        Barang b = (Barang) BarangSelectCbx.getModel().getSelectedItem();
        
        PembelianTotalField.setText(b.getHarga_Barang() * (int)JumlahCounter.getValue() + "");
    }//GEN-LAST:event_BarangSelectCbxActionPerformed

    private void JumlahCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JumlahCounterStateChanged
        BarangSelectCbxActionPerformed(null);
    }//GEN-LAST:event_JumlahCounterStateChanged

    private void PembelianResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PembelianResetActionPerformed
        PembelianIDBonField.setEnabled(true);
        PembelianIDBonField.setText("");
        BarangSelectCbx.setSelectedIndex(-1);
        JumlahCounter.setValue(1);
        PembelianTotalField.setText("");
        PembelianSubtotalField.setText("");
        
        // Clear the table
        int w = TabelPembelian.getModel().getColumnCount();
        
        Object[] coloumnNames = new Object[w];
        for(int k=0; k<w; k++){
            coloumnNames[k] = TabelPembelian.getModel().getColumnName(k);
        }
        
        TabelPembelian.setModel(new DefaultTableModel(new Object[][]{}, coloumnNames){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }//GEN-LAST:event_PembelianResetActionPerformed

    private void PembelianBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PembelianBayarActionPerformed
        if(PembelianIDBonField.isEnabled()){
            JOptionPane.showMessageDialog(this, "BELI DULU!", "YOU DONKEY!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Random randomGen = new Random();
        
        String ID_Bon = PembelianIDBonField.getText();
        Date now = Date.from(LocalDateTime.now().atZone( ZoneId.systemDefault()).toInstant());
        long Subtotal = Long.parseLong(PembelianSubtotalField.getText());
        
        String ID_Petugas = JOptionPane.showInputDialog(this, "Masukan ID Petugas");
        do {
            if(ID_Petugas == null || ID_Petugas.isBlank()){
                return;
            }
            JOptionPane.showMessageDialog(this, "Error! ID Petugas tidak ditemukan!");
            ID_Petugas = JOptionPane.showInputDialog(this, "Masukan ID Petugas");
        } while(petugasController.getByID_Petugas(ID_Petugas) == null);
        
        Bon b = new Bon(ID_Bon, DatetoSQL(now), Subtotal, ID_Petugas);
        bonController.setDml(b, OperasiCRUD.INSERT);
        
        // Get Table
        int h = TabelPembelian.getModel().getRowCount();
        List<Transaksi> transaksiList = transaksiController.getAllTransaksi();
        
        for(int i=0; i<h; i++){
            Boolean adaSama;
            String ID_Transaksi = "" + randomGen.nextInt(999999999);
            do {
                adaSama = false;
                for(Transaksi a : transaksiList){
                    if(a.getID_Transaksi().equals(ID_Transaksi)){
                        ID_Transaksi = "" + randomGen.nextInt(999999999);
                        adaSama = true;
                        break;
                    }
                }
            } while(adaSama);
            
            String ID_Barang  = (String) TabelPembelian.getModel().getValueAt(i, 0);
            int jumlah_barang = (int)    TabelPembelian.getModel().getValueAt(i, 3);
            long Harga_Total  = (long)   TabelPembelian.getModel().getValueAt(i, 4);
            
            Transaksi t = new Transaksi(ID_Transaksi, ID_Barang, jumlah_barang, Harga_Total, ID_Bon);
            transaksiController.setDml(t, OperasiCRUD.INSERT);
        }
        
        PembelianResetActionPerformed(null);
    }//GEN-LAST:event_PembelianBayarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(()-> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddBarang;
    private javax.swing.JLabel AddBarangHarga;
    private javax.swing.JLabel AddBarangIDB;
    private javax.swing.JLabel AddBarangIDK;
    private javax.swing.JLabel AddBarangLogo;
    private javax.swing.JPanel AddBarangMenu;
    private javax.swing.JLabel AddBarangNama;
    private javax.swing.JLabel AddBarangTitle;
    private javax.swing.JButton AddBarang_CancelButton;
    private javax.swing.JButton AddBarang_SaveButton;
    private javax.swing.JLabel AddBarang_TglExp;
    private javax.swing.JLabel AddBarang_TglMasuk;
    private javax.swing.JPanel AddStaf;
    private javax.swing.JLabel AddStafCabang;
    private javax.swing.JLabel AddStafID;
    private javax.swing.JLabel AddStafLogo;
    private javax.swing.JPanel AddStafMenu;
    private javax.swing.JLabel AddStafNama;
    private javax.swing.JLabel AddStafShift;
    private javax.swing.JLabel AddStafTitle;
    private javax.swing.JButton AddStaf_CancelButton;
    private javax.swing.JTextField AddStaf_IDField;
    private javax.swing.JTextField AddStaf_NamaField;
    private javax.swing.JButton AddStaf_SaveButton;
    private javax.swing.JLabel AddStaf_TglMasuk;
    private javax.swing.JPanel AddSupplier;
    private javax.swing.JLabel AddSupplierID;
    private javax.swing.JLabel AddSupplierKotaID;
    private javax.swing.JLabel AddSupplierLogo;
    private javax.swing.JPanel AddSupplierMenu;
    private javax.swing.JLabel AddSupplierNama;
    private javax.swing.JLabel AddSupplierTitle;
    private javax.swing.JButton AddSupplier_CancelButton;
    private javax.swing.JTextField AddSupplier_IDField;
    private javax.swing.JTextField AddSupplier_NamaField;
    private javax.swing.JButton AddSupplier_SaveButton;
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Barang;
    private javax.swing.JPanel BarangBar;
    private javax.swing.JLabel BarangLogo;
    private javax.swing.JPanel BarangPanel;
    private javax.swing.JComboBox BarangSelectCbx;
    private javax.swing.JScrollPane BarangTable;
    private com.toedter.calendar.JDateChooser BarangTglExp;
    private com.toedter.calendar.JDateChooser BarangTglMasuk;
    private javax.swing.JComboBox CabangCbx;
    private javax.swing.JLabel DeleteBarangLogo;
    private javax.swing.JPanel DeleteStaf;
    private javax.swing.JPanel HapusBarang;
    private javax.swing.JButton HapusBarangCancel;
    private javax.swing.JButton HapusBarangConfirm;
    private javax.swing.JLabel HapusBarangHarga;
    private javax.swing.JLabel HapusBarangID;
    private javax.swing.JLabel HapusBarangIDK;
    private javax.swing.JPanel HapusBarangMenu;
    private javax.swing.JLabel HapusBarangNama;
    private javax.swing.JLabel HapusBarangTglExp;
    private javax.swing.JLabel HapusBarangTglMasuk;
    private javax.swing.JLabel HapusBarangTitle;
    private javax.swing.JTextField HapusBarang_HargaField;
    private javax.swing.JTextField HapusBarang_IDBarangField;
    private javax.swing.JComboBox HapusBarang_IDKCbx;
    private javax.swing.JTextField HapusBarang_NamaBarangField;
    private com.toedter.calendar.JDateChooser HapusBarang_TglExp;
    private com.toedter.calendar.JDateChooser HapusBarang_TglMasuk;
    private javax.swing.JComboBox HapusCabangCbx;
    private javax.swing.JComboBox<String> HapusKotaCbx;
    private javax.swing.JRadioButton HapusShiftMalam;
    private javax.swing.JRadioButton HapusShiftPagi;
    private javax.swing.JLabel HapusStafCabang;
    private javax.swing.JLabel HapusStafID;
    private javax.swing.JLabel HapusStafLogo;
    private javax.swing.JPanel HapusStafMenu;
    private javax.swing.JLabel HapusStafNama;
    private javax.swing.JLabel HapusStafShift;
    private javax.swing.JLabel HapusStafTglMasuk;
    private javax.swing.JLabel HapusStafTitle;
    private javax.swing.JButton HapusStaf_CancelButton;
    private javax.swing.JButton HapusStaf_ConfirmButton;
    private javax.swing.JTextField HapusStaf_IDField;
    private javax.swing.JTextField HapusStaf_NamaField;
    private javax.swing.JButton HapusStaf_SearchButton;
    private javax.swing.JPanel HapusSupplier;
    private javax.swing.JLabel HapusSupplierID;
    private javax.swing.JLabel HapusSupplierKotaID;
    private javax.swing.JLabel HapusSupplierLogo;
    private javax.swing.JPanel HapusSupplierMenu;
    private javax.swing.JLabel HapusSupplierNama;
    private javax.swing.JLabel HapusSupplierTitle;
    private javax.swing.JButton HapusSupplier_CancelButton;
    private javax.swing.JButton HapusSupplier_ConfirmButton;
    private javax.swing.JTextField HapusSupplier_IDField;
    private javax.swing.JTextField HapusSupplier_NamaField;
    private javax.swing.JButton HapusSupplier_SearchButton;
    private com.toedter.calendar.JDateChooser HapusTglMasuk;
    private javax.swing.JTextField HargaBarangField;
    private javax.swing.JTextField IDBarangField;
    private javax.swing.JComboBox IDKCbx;
    private javax.swing.JSpinner JumlahCounter;
    private javax.swing.JComboBox<String> KotaCbx;
    private javax.swing.JPanel ListBarang;
    private javax.swing.JLabel ListBarangLogo;
    private javax.swing.JPanel ListBarangMenu;
    private javax.swing.JLabel ListBarangTitle;
    private javax.swing.JPanel ListStaf;
    private javax.swing.JLabel ListStafLogo;
    private javax.swing.JPanel ListStafMenu;
    private javax.swing.JLabel ListStafTitle;
    private javax.swing.JPanel ListSupplier;
    private javax.swing.JLabel ListSupplierLogo;
    private javax.swing.JPanel ListSupplierMenu;
    private javax.swing.JLabel ListSupplierTitle;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JTextField NamaBarangField;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPanel Pembelian;
    private javax.swing.JButton PembelianAddtoCart;
    private javax.swing.JButton PembelianBayar;
    private javax.swing.JLabel PembelianIDBon;
    private javax.swing.JTextField PembelianIDBonField;
    private javax.swing.JLabel PembelianJumlah;
    private javax.swing.JLabel PembelianLogo;
    private javax.swing.JLabel PembelianNamaBarang;
    private javax.swing.JPanel PembelianPanel;
    private javax.swing.JButton PembelianReset;
    private javax.swing.JLabel PembelianSubtotal;
    private javax.swing.JTextField PembelianSubtotalField;
    private javax.swing.JScrollPane PembelianTable;
    private javax.swing.JLabel PembelianTitle;
    private javax.swing.JLabel PembelianTotal;
    private javax.swing.JTextField PembelianTotalField;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox<String> SearchCbx;
    private javax.swing.JButton SearchHapusBarang;
    private javax.swing.JButton SearchUpdate;
    private javax.swing.JButton SearchUpdateBarang;
    private javax.swing.JRadioButton ShiftMalam;
    private javax.swing.JRadioButton ShiftPagi;
    private javax.swing.JPanel Staf;
    private javax.swing.JPanel StafBar;
    private javax.swing.JPanel StafBar1;
    private javax.swing.JLabel StafLogo;
    private javax.swing.JPanel StafPanel;
    private javax.swing.JScrollPane StafTable;
    private com.toedter.calendar.JDateChooser StafTglMasuk;
    private javax.swing.JScrollPane StockTable;
    private javax.swing.JPanel Stok;
    private javax.swing.JLabel StokLogo;
    private javax.swing.JPanel StokPanel;
    private javax.swing.JLabel StokTitle;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JTextField SubtotalField;
    private javax.swing.JPanel SupplierPanel;
    private javax.swing.JScrollPane SupplierTable;
    private javax.swing.JPanel Supply;
    private javax.swing.JLabel SupplyLogo;
    private javax.swing.JTable TabelBarang;
    private javax.swing.JTable TabelPembelian;
    private javax.swing.JTable TabelStaf;
    private javax.swing.JTable TabelStok;
    private javax.swing.JTable TabelSupplier;
    private javax.swing.JTable TabelTransaksi;
    private javax.swing.JTextArea TeamData;
    private javax.swing.JScrollPane TextPane;
    private javax.swing.JLabel TitleBar;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel Transaksi;
    private javax.swing.JLabel TransaksiLogo;
    private javax.swing.JPanel TransaksiPanel;
    private com.toedter.calendar.JDateChooser TransaksiSearchByDate;
    private javax.swing.JTextField TransaksiSearchByIDBon;
    private javax.swing.JComboBox<String> TransaksiSearchCbx;
    private javax.swing.JScrollPane TransaksiTable;
    private javax.swing.JLabel TransaksiTitle;
    private javax.swing.JButton Transaksi_SearchButton;
    private javax.swing.JLabel UBMLogo;
    private javax.swing.JLabel UpdataBarangLogo;
    private javax.swing.JPanel UpdateBarang;
    private javax.swing.JButton UpdateBarangCancel;
    private javax.swing.JButton UpdateBarangConfirm;
    private javax.swing.JLabel UpdateBarangHarga;
    private javax.swing.JLabel UpdateBarangID;
    private javax.swing.JLabel UpdateBarangIDK;
    private javax.swing.JPanel UpdateBarangMenu;
    private javax.swing.JLabel UpdateBarangNama;
    private javax.swing.JLabel UpdateBarangTglExp;
    private javax.swing.JLabel UpdateBarangTglMasuk;
    private javax.swing.JLabel UpdateBarangTitle;
    private javax.swing.JTextField UpdateBarang_HargaField;
    private javax.swing.JTextField UpdateBarang_IDBarangField;
    private javax.swing.JComboBox UpdateBarang_IDKCbx;
    private javax.swing.JTextField UpdateBarang_NamaBarangField;
    private com.toedter.calendar.JDateChooser UpdateBarang_TglExp;
    private com.toedter.calendar.JDateChooser UpdateBarang_TglMasuk;
    private javax.swing.JComboBox UpdateCabangCbx;
    private javax.swing.JButton UpdateCancel;
    private javax.swing.JComboBox<String> UpdateKotaCbx;
    private javax.swing.JButton UpdateSave;
    private javax.swing.JRadioButton UpdateShiftMalam;
    private javax.swing.JRadioButton UpdateShiftPagi;
    private javax.swing.JPanel UpdateStaf;
    private javax.swing.JLabel UpdateStafCabang;
    private javax.swing.JLabel UpdateStafID;
    private javax.swing.JLabel UpdateStafLogo;
    private javax.swing.JPanel UpdateStafMenu;
    private javax.swing.JLabel UpdateStafNama;
    private javax.swing.JLabel UpdateStafShift;
    private javax.swing.JLabel UpdateStafTglMasuk;
    private javax.swing.JLabel UpdateStafTitle;
    private javax.swing.JTextField UpdateStaf_IDField;
    private javax.swing.JTextField UpdateStaf_NamaField;
    private javax.swing.JPanel UpdateSupplier;
    private javax.swing.JLabel UpdateSupplierID;
    private javax.swing.JLabel UpdateSupplierKotaID;
    private javax.swing.JLabel UpdateSupplierLogo;
    private javax.swing.JPanel UpdateSupplierMenu;
    private javax.swing.JLabel UpdateSupplierNama;
    private javax.swing.JLabel UpdateSupplierTitle;
    private javax.swing.JButton UpdateSupplier_CancelButton;
    private javax.swing.JTextField UpdateSupplier_IDField;
    private javax.swing.JTextField UpdateSupplier_NamaField;
    private javax.swing.JButton UpdateSupplier_SaveButton;
    private javax.swing.JButton UpdateSupplier_SearchButton;
    private com.toedter.calendar.JDateChooser UpdateTglMasuk;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField UsernameField;
    private javax.swing.ButtonGroup btnGroup_Staf_Add;
    private javax.swing.ButtonGroup btnGroup_Staf_Hapus;
    private javax.swing.ButtonGroup btnGroup_Staf_Update;
    // End of variables declaration//GEN-END:variables
}
