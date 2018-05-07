package nku.sistemanalizi.marangoz.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.sun.javafx.font.Disposer;

import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import com.toedter.calendar.JDateChooser;

import nku.sistemanalizi.marangoz.controller.MalzemeController;
import nku.sistemanalizi.marangoz.controller.MusteriController;
import nku.sistemanalizi.marangoz.controller.PersonelController;
import nku.sistemanalizi.marangoz.controller.SatisSiparisController;
import nku.sistemanalizi.marangoz.controller.UrunController;
import nku.sistemanalizi.marangoz.model.Kategori;
import nku.sistemanalizi.marangoz.model.Malzeme;
import nku.sistemanalizi.marangoz.model.Musteri;
import nku.sistemanalizi.marangoz.model.Personel;
import nku.sistemanalizi.marangoz.model.SatisSiparis;
import nku.sistemanalizi.marangoz.model.SatisSiparisDetay;
import nku.sistemanalizi.marangoz.model.Statu;
import nku.sistemanalizi.marangoz.model.Urun;

import javax.swing.JSpinner;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;

public class YoneticiSatisSiparisi extends JFrame {

	private JPanel contentPane;
	private JLabel closeBtn2;
	private JLabel lblNewLabel_3;
	int pX;
	int pY;
	private JLabel label_1;
	private JTextField tfSiparisKoduEkle;
	private JTextField tfMailEkle;
	private JTextField tfTelefon2Ekle;
	private JTextField tfTelefonEkle;
	private JTextField textField_7;
	private JTable aktifSiparislerTable;
	private JTable malzemeGirisTable;
	private JTable butunSiparislerTable;
	private JTextField textField_21;
	private JTable butunSiparisDetaylar;
	private JTable aktifSiparislerMalzemeler;
	private JTextField tfAciklamaEkle;
	private JTextField textField_8;
	private JTextField tfEbatEkle;
	private JTextField tfFiyatEkle;
	private JTextField textField_9;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_22;
	private JTextField textField_25;
	
	JDateChooser dcBaslangic;
	JDateChooser dcBitis;
	JComboBox comboAdEkle;
	JComboBox comboSoyadEkle;
	private JTextField tfRenkEkle;
	SatisSiparis siparis = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoneticiSatisSiparisi frame = new YoneticiSatisSiparisi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public YoneticiSatisSiparisi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 1500, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		closeBtn2 = new JLabel("");
		closeBtn2.setBounds(1335, 0, 30, 31);
		closeBtn2.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/kapat.png")));
		closeBtn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		closeBtn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		closeBtn2.setForeground(new Color(255, 255, 255));
		closeBtn2.setHorizontalAlignment(SwingConstants.CENTER);
		closeBtn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(closeBtn2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 1296, 31);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pX = e.getX();
				pY = e.getY();
			}
		});
		lblNewLabel_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				 setLocation(getLocation().x+e.getX()-pX,getLocation().y+e.getY()-pY);
			}
		});
		contentPane.add(lblNewLabel_3);
		
		label_1 = new JLabel("");
		label_1.setBounds(1306, 0, 30, 31);
		label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setState(ICONIFIED);
			}
		});
		label_1.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/kucult.png")));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label_1);
		
		JPanel icerikPanel = new JPanel();
		icerikPanel.setBackground(new Color(30, 144, 255));
		icerikPanel.setBounds(121, 80, 1135, 686);
		contentPane.add(icerikPanel);
		icerikPanel.setLayout(new CardLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.CYAN);
		icerikPanel.add(panel1, "name_105555021218560");
		panel1.setLayout(null);
		
		JLabel label = new JLabel("Sat\u0131\u015F Sipari\u015F Formu");
		label.setForeground(Color.WHITE);
		label.setBounds(445, 11, 256, 20);
		label.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		panel1.add(label);
		
		JLabel label_3 = new JLabel("Sipari\u015F Kodu");
		label_3.setBounds(10, 78, 86, 20);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_3);
		
		tfSiparisKoduEkle = new JTextField();
		tfSiparisKoduEkle.setBounds(106, 79, 121, 20);
		tfSiparisKoduEkle.setColumns(10);
		panel1.add(tfSiparisKoduEkle);
		
		JLabel label_5 = new JLabel("Kay\u0131t Tarih");
		label_5.setBounds(264, 78, 80, 20);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_5);
		
		JDateChooser dcKayitEkle = new JDateChooser((java.util.Date) null);
		dcKayitEkle.setBounds(339, 78, 121, 20);
		panel1.add(dcKayitEkle);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 369, 976, 2);
		separator_1.setBackground(new Color(32, 178, 170));
		panel1.add(separator_1);
		
		JLabel label_6 = new JLabel("Ad");
		label_6.setBounds(10, 174, 86, 20);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_6);
		
		JLabel label_7 = new JLabel("Soyad");
		label_7.setBounds(10, 205, 73, 20);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_7);
		
		JLabel label_8 = new JLabel("Mail Adresi");
		label_8.setBounds(245, 237, 86, 20);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_8);
		
		tfMailEkle = new JTextField();
		tfMailEkle.setBounds(339, 238, 121, 20);
		tfMailEkle.setColumns(10);
		panel1.add(tfMailEkle);
		
		tfTelefon2Ekle = new JTextField();
		tfTelefon2Ekle.setBounds(106, 268, 121, 20);
		tfTelefon2Ekle.setColumns(10);
		panel1.add(tfTelefon2Ekle);
		
		JLabel label_9 = new JLabel("Telefon2");
		label_9.setBounds(10, 267, 73, 20);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_9);
		
		JLabel label_10 = new JLabel("Telefon");
		label_10.setBounds(10, 236, 73, 20);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_10);
		
		tfTelefonEkle = new JTextField();
		tfTelefonEkle.setBounds(106, 238, 121, 20);
		tfTelefonEkle.setColumns(10);
		panel1.add(tfTelefonEkle);
		
		JTextArea tfAdresEkle = new JTextArea();
		tfAdresEkle.setBounds(106, 304, 290, 54);
		panel1.add(tfAdresEkle);
		
		JLabel label_12 = new JLabel("Adres");
		label_12.setBounds(10, 313, 73, 20);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_12);
		
		JComboBox comboKategoriEkle = new JComboBox();
		comboKategoriEkle.setEditable(true);
		comboKategoriEkle.setFont(new Font("Dialog", Font.PLAIN, 13));
		comboKategoriEkle.setBounds(740, 140, 120, 20);
		comboKategoriEkle.setModel(new DefaultComboBoxModel(new String[] {"Kategori Se\u00E7"}));
		panel1.add(comboKategoriEkle);
		
		ArrayList<Malzeme> kategoriler = MalzemeController.Yenile();
		for(int i = 0; i < kategoriler.size();i++)
		{
			comboKategoriEkle.addItem(kategoriler.get(i).ad);
		}
		
		JLabel label_13 = new JLabel("Kategori");
		label_13.setBounds(650, 140, 65, 20);
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_13);
		
		JComboBox comboUrunEkle = new JComboBox();
		comboUrunEkle.setEditable(true);
		comboUrunEkle.setFont(new Font("Dialog", Font.PLAIN, 13));
		comboUrunEkle.setBounds(740, 174, 120, 20);
		comboUrunEkle.setModel(new DefaultComboBoxModel(new String[] {"\u00DCr\u00FCn Se\u00E7"}));
		panel1.add(comboUrunEkle);
		
		ArrayList<Urun> urunler = UrunController.Yenile();
		for(int i = 0; i < urunler.size();i++)
		{
			comboUrunEkle.addItem(urunler.get(i).ad);
		}
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 413, 813, 188);
		panel1.add(scrollPane);
		
		malzemeGirisTable = new JTable();
		malzemeGirisTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Ürün Kodu","Ürün Adý","Malzeme Adý","Ebat","Cins","Renk","Adet","Ürün Fiyat","Açýklama"
			}
		));
		scrollPane.setRowHeaderView(malzemeGirisTable);
    	
		scrollPane.setViewportView(malzemeGirisTable);
		JLabel label_19 = new JLabel("Sipari\u015F \u0130\u00E7erik Bilgisi");
		label_19.setForeground(Color.WHITE);
		label_19.setBounds(39, 382, 138, 20);
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel1.add(label_19);
		
		textField_7 = new JTextField();
		textField_7.setBounds(766, 636, 86, 20);
		textField_7.setColumns(10);
		panel1.add(textField_7);
		
		JButton button_3 = new JButton("Temizle");
		button_3.setFont(new Font("Dialog", Font.PLAIN, 13));
		button_3.setBounds(922, 578, 100, 23);
		button_3.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/sil2.png")));
		panel1.add(button_3);
		
		JButton button_4 = new JButton("Kaydet");
		button_4.setFont(new Font("Dialog", Font.PLAIN, 13));
		button_4.setBounds(922, 537, 100, 23);
		button_4.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/kaydet.png")));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SatisSiparisController.Ekle(siparis);
			}
		});
		panel1.add(button_4);
		
		JSpinner sAdetEkle = new JSpinner();
		sAdetEkle.setBounds(739, 299, 65, 20);
		panel1.add(sAdetEkle);
		
		JLabel label_16 = new JLabel("Adet");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_16.setBounds(650, 299, 51, 20);
		panel1.add(label_16);
		
		tfAciklamaEkle = new JTextField();
		tfAciklamaEkle.setBounds(739, 330, 121, 20);
		panel1.add(tfAciklamaEkle);
		tfAciklamaEkle.setColumns(10);
		
		JLabel lblAklama = new JLabel("A\u00E7\u0131klama");
		lblAklama.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAklama.setBounds(650, 334, 86, 14);
		panel1.add(lblAklama);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(32, 178, 170));
		separator.setBounds(0, 109, 496, 2);
		panel1.add(separator);
		
		JDateChooser dateChooser_1 = new JDateChooser((java.util.Date) null);
		dateChooser_1.setBounds(537, 636, 95, 20);
		panel1.add(dateChooser_1);
		
		JLabel label_15 = new JLabel("Teslimat Tarihi");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_15.setBounds(410, 636, 104, 20);
		panel1.add(label_15);
		
		tfEbatEkle = new JTextField();
		tfEbatEkle.setColumns(10);
		tfEbatEkle.setBounds(740, 238, 120, 20);
		panel1.add(tfEbatEkle);
		
		JLabel label_31 = new JLabel("Fiyat");
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_31.setBounds(650, 270, 79, 14);
		panel1.add(label_31);
		
		JLabel label_32 = new JLabel("\u00DCr\u00FCn");
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_32.setBounds(650, 174, 65, 20);
		panel1.add(label_32);
		
		tfFiyatEkle = new JTextField();
		tfFiyatEkle.setColumns(10);
		tfFiyatEkle.setBounds(740, 268, 86, 20);
		panel1.add(tfFiyatEkle);
		
		JLabel label_42 = new JLabel("Ebat");
		label_42.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_42.setBounds(650, 240, 80, 14);
		panel1.add(label_42);
		
		JLabel lblToplamFiyat = new JLabel("Toplam Fiyat");
		lblToplamFiyat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblToplamFiyat.setBounds(657, 636, 99, 21);
		panel1.add(lblToplamFiyat);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00FC\u015Fteri Bilgileri");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(201, 127, 138, 20);
		panel1.add(lblNewLabel_1);
		
		JLabel lblrnBilgileri = new JLabel("\u00DCr\u00FCn Bilgileri");
		lblrnBilgileri.setForeground(Color.WHITE);
		lblrnBilgileri.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblrnBilgileri.setBounds(721, 109, 138, 20);
		panel1.add(lblrnBilgileri);
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.setBounds(922, 300, 89, 23);
		panel1.add(btnEkle);
		
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(siparis == null)
				{
					siparis = new SatisSiparis();
				}
				siparis.statu=Statu.ACIK;
				siparis.musteri= new Musteri();
				siparis.musteri.ad=(String)comboAdEkle.getSelectedItem();
				siparis.musteri.soyad=(String)comboSoyadEkle.getSelectedItem();
				ArrayList<Musteri> bul=MusteriController.Ara(siparis.musteri.ad,siparis.musteri.soyad) ;
				if(bul.size()>0)
				{
					siparis.musteriId = bul.get(0).id;
				}
				
				siparis.musteri.tel1=tfTelefonEkle.getText();
				siparis.musteri.tel2=tfTelefonEkle.getText();
				siparis.musteri.email=tfMailEkle.getText();
				siparis.musteri.adres1=tfAdresEkle.getText();
				
				MusteriController.Ekle(siparis.musteri);
				
				SatisSiparisDetay detay=new SatisSiparisDetay();
				detay.malzeme=new Malzeme();
				String mAd=(String)comboKategoriEkle.getSelectedItem();
				
				detay.malzeme=MalzemeController.Ara(mAd).get(0);
				detay.malzemeId=detay.malzeme.id;
				detay.ebat=tfEbatEkle.getText();
				detay.renk=tfRenkEkle.getText();
				String brm=tfFiyatEkle.getText();
				detay.satirNo=1;
				if(brm=="" || brm == null)
				{
					detay.birimTutar=0;
				}
				else
				{
					float deger=Float.parseFloat(tfFiyatEkle.getText());
					if(deger<0)
					{
						deger=0;
					}
					detay.birimTutar=deger;
				}
				
				detay.miktar=(int)sAdetEkle.getValue();
				detay.statu=Statu.ACIK;
				detay.tamamlananMiktar=0;
				siparis.detaylar.add(detay);
				
				
				
			}
		});
		
		JButton btnSil = new JButton("Sil");
		btnSil.setBounds(922, 335, 89, 23);
		panel1.add(btnSil);
		
		comboAdEkle = new JComboBox();
		comboAdEkle.setBounds(106, 175, 121, 20);
		panel1.add(comboAdEkle);
		
		comboAdEkle.setEditable(true);
		ArrayList<Musteri> musteriler = MusteriController.Yenile();
		for(int i = 0; i < musteriler.size();i++)
		{
			comboAdEkle.addItem(musteriler.get(i).ad);
		}
		
		comboAdEkle.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				//tfAdEkle.setText((String)comboAdEkle.getSelectedItem());
			}
		});
		
		comboSoyadEkle = new JComboBox();
		comboSoyadEkle.setEditable(true);
		comboSoyadEkle.setBounds(106, 206, 121, 20);
		panel1.add(comboSoyadEkle);
		
		tfRenkEkle = new JTextField();
		tfRenkEkle.setColumns(10);
		tfRenkEkle.setBounds(740, 205, 120, 20);
		panel1.add(tfRenkEkle);
		
		JLabel lblRenk = new JLabel("Renk");
		lblRenk.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRenk.setBounds(650, 207, 80, 14);
		panel1.add(lblRenk);
		
		JPanel panel2 = new JPanel();
		panel2.setForeground(Color.ORANGE);
		panel2.setBackground(Color.CYAN);
		icerikPanel.add(panel2, "name_105555047486139");
		panel2.setLayout(null);
		
		JLabel label_22 = new JLabel("Bekleyen Sat\u0131\u015F Sipari\u015Fler");
		label_22.setForeground(Color.WHITE);
		label_22.setBounds(451, 11, 257, 20);
		label_22.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		panel2.add(label_22);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 44, 1096, 175);
		panel2.add(scrollPane_1);
		
		aktifSiparislerTable = new JTable();
		aktifSiparislerTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Siparis Kodu","Firma Adý","Ad","Soyad","Ünvan","Toplam Fiyat","Kayýt Tarihi","Teslimat Tarihi"
			}
		));
		scrollPane_1.setViewportView(aktifSiparislerTable);
		
		
		
		JLabel label_18 = new JLabel("Sipari\u015F Kodu");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_18.setBounds(36, 230, 86, 20);
		panel2.add(label_18);
		
		JDateChooser dateChooser_2 = new JDateChooser((java.util.Date) null);
		dateChooser_2.setBounds(471, 230, 138, 20);
		panel2.add(dateChooser_2);
		
		JLabel label_21 = new JLabel("Kay\u0131t Tarih");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_21.setBounds(365, 230, 80, 20);
		panel2.add(label_21);
		
		JLabel label_24 = new JLabel("Teslimat Tarihi");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_24.setBounds(669, 230, 104, 20);
		panel2.add(label_24);
		
		JDateChooser dateChooser_3 = new JDateChooser((java.util.Date) null);
		dateChooser_3.setBounds(811, 230, 138, 20);
		panel2.add(dateChooser_3);
		
		JLabel label_29 = new JLabel("Firma Ad\u0131");
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_29.setBounds(36, 284, 118, 20);
		panel2.add(label_29);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(32, 178, 170));
		separator_2.setBounds(36, 261, 976, 12);
		panel2.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(new Color(32, 178, 170));
		separator_3.setBounds(36, 315, 976, 2);
		panel2.add(separator_3);
		
		JLabel label_37 = new JLabel("Siparis \u0130\u00E7erik Bilgisi");
		label_37.setForeground(Color.WHITE);
		label_37.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_37.setBounds(266, 461, 138, 20);
		panel2.add(label_37);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/print.png")));
		lblNewLabel.setBounds(1060, 2, 46, 40);
		panel2.add(lblNewLabel);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(68, 492, 833, 158);
		panel2.add(scrollPane_2);
		
		aktifSiparislerMalzemeler = new JTable();
		aktifSiparislerMalzemeler.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Ürün Kodu","Ürün Adý","Malzeme Adý","Ebat","Cins","Renk","Adet","Ürün Fiyat","Açýklama"
			}
		));
		scrollPane_2.setViewportView(aktifSiparislerMalzemeler);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(178, 230, 104, 20);
		panel2.add(textField_8);
		
		JLabel label_36 = new JLabel("");
		label_36.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/search.png")));
		label_36.setBounds(292, 230, 35, 21);
		panel2.add(label_36);
		
		JLabel label_28 = new JLabel("");
		label_28.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/plus.png")));
		label_28.setBounds(767, 406, 48, 17);
		panel2.add(label_28);
		
		JLabel label_30 = new JLabel("");
		label_30.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/kucult.png")));
		label_30.setBounds(767, 434, 48, 17);
		panel2.add(label_30);
		
		JButton button_6 = new JButton("G\u00FCncelle");
		button_6.setBounds(966, 504, 89, 23);
		panel2.add(button_6);
		
		JButton btnIptal = new JButton("\u0130ptal");
		btnIptal.setBounds(966, 556, 89, 23);
		panel2.add(btnIptal);
		
		JLabel label_25 = new JLabel("Kategori");
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_25.setBounds(68, 400, 65, 20);
		panel2.add(label_25);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Dialog", Font.PLAIN, 13));
		comboBox_5.setBounds(158, 400, 86, 20);
		panel2.add(comboBox_5);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(157, 431, 87, 20);
		panel2.add(textField_9);
		
		JLabel label_26 = new JLabel("\u00DCr\u00FCn");
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_26.setBounds(271, 400, 65, 20);
		panel2.add(label_26);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Dialog", Font.PLAIN, 13));
		comboBox_6.setBounds(360, 400, 86, 20);
		panel2.add(comboBox_6);
		
		JLabel label_27 = new JLabel("Adet");
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_27.setBounds(464, 400, 51, 20);
		panel2.add(label_27);
		
		JLabel label_49 = new JLabel("A\u00E7\u0131klama");
		label_49.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_49.setBounds(464, 435, 86, 14);
		panel2.add(label_49);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(360, 431, 82, 20);
		panel2.add(textField_12);
		
		JLabel label_50 = new JLabel("Ebat");
		label_50.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_50.setBounds(271, 431, 80, 14);
		panel2.add(label_50);
		
		JLabel label_51 = new JLabel("Fiyat");
		label_51.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_51.setBounds(68, 431, 79, 14);
		panel2.add(label_51);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(553, 400, 65, 20);
		panel2.add(spinner_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(553, 431, 94, 20);
		panel2.add(textField_13);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(178, 285, 138, 20);
		panel2.add(textField_22);
		
		JLabel lblNewLabel_4 = new JLabel("\u00DCr\u00FCn Bilgileri");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(271, 343, 117, 20);
		panel2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Toplam Fiyat");
		lblNewLabel_5.setBounds(681, 664, 81, 14);
		panel2.add(lblNewLabel_5);
		
		textField_25 = new JTextField();
		textField_25.setBounds(772, 661, 109, 20);
		panel2.add(textField_25);
		textField_25.setColumns(10);
		
		JPanel panel3 = new JPanel();
		panel3.setForeground(Color.RED);
		panel3.setBackground(Color.CYAN);
		icerikPanel.add(panel3, "name_105555074451865");
		panel3.setLayout(null);
		
		JLabel label_23 = new JLabel("B\u00FCt\u00FCn Sat\u0131\u015F Sipari\u015Fler");
		label_23.setForeground(Color.WHITE);
		label_23.setBounds(480, 11, 267, 21);
		label_23.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		panel3.add(label_23);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 128, 1099, 170);
		panel3.add(scrollPane_3);
		
		butunSiparislerTable = new JTable();
		butunSiparislerTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Siparis Kodu","Sipariþ Tarihi","Müþteri Adý","Müþteri Soyadý","Tutar","Teslimat Tarihi","Teslimat Adresi","Durum"
			}
		));
		scrollPane_3.setViewportView(butunSiparislerTable);
		
		ArrayList<SatisSiparis> liste = SatisSiparisController.Yenile(false);
		DefaultTableModel model = (DefaultTableModel) butunSiparislerTable.getModel();
		
		for (int i = 0; i < liste.size(); i++) {
			String drm=Statu.ToString(liste.get(i).statu);
			
			model.addRow(new Object[] {liste.get(i).id, liste.get(i).fisTarihi,
					liste.get(i).musteri.ad,liste.get(i).musteri.soyad,liste.get(i).netToplam,
					liste.get(i).teslimTarihi,liste.get(i).adres,drm});
		}
		
		butunSiparislerTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				try {
					//tfAd2.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
					//tfSoyad2.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
					DefaultTableModel model = (DefaultTableModel) butunSiparisDetaylar.getModel();
					model.setRowCount(0);
					
					ArrayList<SatisSiparis> parListe = SatisSiparisController.Yenile(false);
					int selected = (int)butunSiparislerTable.getValueAt(butunSiparislerTable.getSelectedRow(), 0);
					ArrayList<SatisSiparisDetay> detaylar=SatisSiparisController.GetDetaylar(selected);
					
					for(int i = 0; i < detaylar.size();i++)
					{
						
							model.addRow(new Object[] {
									detaylar.get(i).satirNo,
									detaylar.get(i).urun.ad,
									detaylar.get(i).malzeme.ad,
									detaylar.get(i).renk,
									detaylar.get(i).ebat,
									detaylar.get(i).miktar,
									detaylar.get(i).tamamlananMiktar,
									detaylar.get(i).birimTutar,
									detaylar.get(i).toplamTutar,
									Statu.ToString(detaylar.get(i).statu)
							});
						
					}
					
				} catch (ArrayIndexOutOfBoundsException ex) {
				}
			}
		});
			
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(new Color(32, 178, 170));
		separator_4.setBounds(10, 56, 976, 12);
		panel3.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(new Color(32, 178, 170));
		separator_5.setBounds(10, 303, 976, 2);
		panel3.add(separator_5);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(57, 67, 138, 20);
		panel3.add(textField_21);
		
		JLabel label_45 = new JLabel("Ad");
		label_45.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_45.setBounds(10, 66, 86, 20);
		panel3.add(label_45);
		
		JLabel lblSipariSipariiDetaylar = new JLabel("Sat\u0131\u015F Sipari\u015Fi Detaylar\u0131");
		lblSipariSipariiDetaylar.setForeground(Color.WHITE);
		lblSipariSipariiDetaylar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSipariSipariiDetaylar.setBounds(10, 316, 178, 20);
		panel3.add(lblSipariSipariiDetaylar);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 347, 1099, 293);
		panel3.add(scrollPane_4);
		
		butunSiparisDetaylar = new JTable();
		butunSiparisDetaylar.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Satýr No","Ürün Adý","Cins","Renk","Ebat","Adet","TamamlananMiktar","Birim Fiyat","Toplam Fiyat","Durum"
			}
		));
		scrollPane_4.setViewportView(butunSiparisDetaylar);
		
		
		JLabel label_35 = new JLabel("");
		label_35.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/search.png")));
		label_35.setBounds(219, 66, 35, 21);
		panel3.add(label_35);
		
		JLabel lblNewLabel_2 = new JLabel("M\u00FC\u015Fteri Bilgileri");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 34, 107, 20);
		panel3.add(lblNewLabel_2);
		
		JCheckBox cbIptalleriGosterme = new JCheckBox("Iptalleri Gosterme");
		cbIptalleriGosterme.setSelected(true);
		cbIptalleriGosterme.setBounds(611, 66, 199, 23);
		panel3.add(cbIptalleriGosterme);
		
		cbIptalleriGosterme.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {

		        DefaultTableModel model = (DefaultTableModel) butunSiparislerTable.getModel();
				model.setRowCount(0);
		        if(cbIptalleriGosterme.isSelected())
		        {
		        	
					
		        	ArrayList<SatisSiparis> liste = SatisSiparisController.Yenile(false);
		    		for (int i = 0; i < liste.size(); i++) {
		    			String drm=Statu.ToString(liste.get(i).statu);
		    			
		    			model.addRow(new Object[] {liste.get(i).id, liste.get(i).fisTarihi,
		    					liste.get(i).musteri.ad,liste.get(i).musteri.soyad,liste.get(i).netToplam,
		    					liste.get(i).teslimTarihi,liste.get(i).adres,drm});
		    		}
		        }
		        else
		        {
		        
					ArrayList<SatisSiparis> liste = SatisSiparisController.Yenile(true);
		    		for (int i = 0; i < liste.size(); i++) {
		    			String drm=Statu.ToString(liste.get(i).statu);
		    			
		    			model.addRow(new Object[] {liste.get(i).id, liste.get(i).fisTarihi,
		    					liste.get(i).musteri.ad,liste.get(i).musteri.soyad,liste.get(i).netToplam,
		    					liste.get(i).teslimTarihi,liste.get(i).adres,drm});
		    		}
		        }
		      }
		    });

		
		JLabel lblSatSipariBilgileri = new JLabel("Sat\u0131\u015F Sipari\u015F Bilgileri");
		lblSatSipariBilgileri.setForeground(Color.WHITE);
		lblSatSipariBilgileri.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSatSipariBilgileri.setBounds(10, 98, 138, 20);
		panel3.add(lblSatSipariBilgileri);
		
		JLabel lblNewLabel_6 = new JLabel("Ba\u015Flang\u0131\u00E7 Tarihi:");
		lblNewLabel_6.setBounds(264, 70, 107, 14);
		panel3.add(lblNewLabel_6);
		
		dcBaslangic = new JDateChooser();
		dcBaslangic.setBounds(377, 67, 95, 20);
		panel3.add(dcBaslangic);
		
		JLabel lblBitiTarihi = new JLabel("Biti\u015F Tarihi:");
		lblBitiTarihi.setBounds(264, 101, 107, 14);
		panel3.add(lblBitiTarihi);
		
		dcBitis = new JDateChooser();
		dcBitis.setBounds(377, 98, 95, 20);
		panel3.add(dcBitis);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, -10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_2.setBackground(new Color(60, 179, 113));
		panel_2.setBounds(10, 80, 99, 648);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button = new JButton();
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				icerikPanel.removeAll();
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
				icerikPanel.add(panel1);
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
			}
		});
		button.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/yeni.png")));
		button.setBackground(SystemColor.menu);
		panel_2.add(button);
		
		JButton button_1 = new JButton();
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				icerikPanel.removeAll();
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
				icerikPanel.add(panel2);
				icerikPanel.repaint();
				icerikPanel.revalidate();
			}
		});
		button_1.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/tamamla.png")));
		button_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		button_1.setBackground(SystemColor.menu);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				icerikPanel.removeAll();
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
				icerikPanel.add(panel3);
				icerikPanel.repaint();
				icerikPanel.revalidate();
			}
		});
		button_2.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/archive.png")));
		button_2.setFont(new Font("SansSerif", Font.BOLD, 18));
		button_2.setBackground(SystemColor.menu);
		panel_2.add(button_2);
		
		JLabel label_2 = new JLabel("ANA MENU");
		label_2.setBounds(1266, 743, 99, 28);
		contentPane.add(label_2);
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				YoneticiMenu yoneticiMenu = new YoneticiMenu();
				yoneticiMenu.setVisible(true);
			}
		});
		label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/cikis.png")));
		label_2.setForeground(new Color(72, 61, 139));
		setUndecorated(true);//remove the frame outline
		setLocationRelativeTo(null);
		
	}
}
