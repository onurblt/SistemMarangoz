package nku.sistemanalizi.marangoz.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Date;
import java.util.Calendar;

import com.toedter.calendar.JDateChooser;
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

public class YoneticiSatisSiparisi extends JFrame {

	private JPanel contentPane;
	private JLabel closeBtn2;
	private JLabel lblNewLabel_3;
	int pX;
	int pY;
	private JLabel label_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable aktifSiparislerTable;
	private JTable malzemeGirisTable;
	private JTable butunSiparislerTable;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTable butunSiparislerMalzemeler;
	private JTable aktifSiparislerMalzemeler;
	private JTextField textField_24;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_9;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_25;
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
		
		textField = new JTextField();
		textField.setBounds(106, 79, 121, 20);
		textField.setColumns(10);
		panel1.add(textField);
		
		JLabel label_4 = new JLabel("Firma Ad\u0131");
		label_4.setBounds(10, 174, 95, 20);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_4);
		
		JLabel label_5 = new JLabel("Kay\u0131t Tarih");
		label_5.setBounds(264, 78, 80, 20);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_5);
		
		JDateChooser dateChooser = new JDateChooser((java.util.Date) null);
		dateChooser.setBounds(339, 78, 121, 20);
		panel1.add(dateChooser);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 369, 976, 2);
		separator_1.setBackground(new Color(32, 178, 170));
		panel1.add(separator_1);
		
		JLabel label_6 = new JLabel("Ad");
		label_6.setBounds(245, 174, 86, 20);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_6);
		
		textField_1 = new JTextField();
		textField_1.setBounds(339, 175, 121, 20);
		textField_1.setColumns(10);
		panel1.add(textField_1);
		
		JLabel label_7 = new JLabel("Soyad");
		label_7.setBounds(10, 205, 73, 20);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_7);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 205, 121, 20);
		textField_2.setColumns(10);
		panel1.add(textField_2);
		
		JLabel label_8 = new JLabel("Mail Adresi");
		label_8.setBounds(245, 237, 86, 20);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_8);
		
		textField_3 = new JTextField();
		textField_3.setBounds(339, 238, 121, 20);
		textField_3.setColumns(10);
		panel1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(106, 268, 121, 20);
		textField_4.setColumns(10);
		panel1.add(textField_4);
		
		JLabel label_9 = new JLabel("Telefon2");
		label_9.setBounds(10, 267, 73, 20);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_9);
		
		JLabel label_10 = new JLabel("Telefon");
		label_10.setBounds(10, 236, 73, 20);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(106, 238, 121, 20);
		textField_5.setColumns(10);
		panel1.add(textField_5);
		
		JLabel label_11 = new JLabel("G\u00F6rev");
		label_11.setBounds(245, 205, 73, 20);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_11);
		
		textField_6 = new JTextField();
		textField_6.setBounds(339, 206, 121, 20);
		textField_6.setColumns(10);
		panel1.add(textField_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(106, 304, 290, 54);
		panel1.add(textArea);
		
		JLabel label_12 = new JLabel("Adres");
		label_12.setBounds(10, 313, 73, 20);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_12);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		comboBox_1.setBounds(740, 174, 120, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Kategori Se\u00E7"}));
		panel1.add(comboBox_1);
		
		JLabel label_13 = new JLabel("Kategori");
		label_13.setBounds(650, 174, 65, 20);
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel1.add(label_13);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		comboBox_2.setBounds(740, 205, 120, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\u00DCr\u00FCn Se\u00E7"}));
		panel1.add(comboBox_2);
		
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
			}
		});
		panel1.add(button_4);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/plus.png")));
		label_14.setBounds(938, 316, 48, 17);
		panel1.add(label_14);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(739, 299, 65, 20);
		panel1.add(spinner);
		
		JLabel label_16 = new JLabel("Adet");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_16.setBounds(650, 299, 51, 20);
		panel1.add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/kucult.png")));
		label_17.setBounds(938, 341, 48, 17);
		panel1.add(label_17);
		
		textField_24 = new JTextField();
		textField_24.setBounds(739, 330, 121, 20);
		panel1.add(textField_24);
		textField_24.setColumns(10);
		
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
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(740, 238, 120, 20);
		panel1.add(textField_10);
		
		JLabel label_31 = new JLabel("Fiyat");
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_31.setBounds(650, 270, 79, 14);
		panel1.add(label_31);
		
		JLabel label_32 = new JLabel("\u00DCr\u00FCn");
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_32.setBounds(651, 205, 65, 20);
		panel1.add(label_32);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(740, 268, 86, 20);
		panel1.add(textField_11);
		
		JLabel label_42 = new JLabel("Ebat");
		label_42.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_42.setBounds(650, 240, 80, 14);
		panel1.add(label_42);
		
		JLabel lblToplamFiyat = new JLabel("Toplam Fiyat");
		lblToplamFiyat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblToplamFiyat.setBounds(657, 636, 99, 21);
		panel1.add(lblToplamFiyat);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(106, 175, 121, 20);
		panel1.add(textField_14);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00FC\u015Fteri Bilgileri");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(201, 127, 138, 20);
		panel1.add(lblNewLabel_1);
		
		JLabel lblrnBilgileri = new JLabel("\u00DCr\u00FCn Bilgileri");
		lblrnBilgileri.setForeground(Color.WHITE);
		lblrnBilgileri.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblrnBilgileri.setBounds(722, 127, 138, 20);
		panel1.add(lblrnBilgileri);
		
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
		scrollPane_3.setBounds(10, 42, 1099, 170);
		panel3.add(scrollPane_3);
		
		butunSiparislerTable = new JTable();
		butunSiparislerTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Siparis Kodu","Firma Adý","Ad","Soyad","Ünvan","Kayýt Tarihi","Teslimat Tarihi"
			}
		));
		scrollPane_3.setViewportView(butunSiparislerTable);
		
		JLabel label_33 = new JLabel("Sipari\u015F Kodu");
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_33.setBounds(41, 230, 86, 20);
		panel3.add(label_33);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(183, 230, 138, 20);
		panel3.add(textField_15);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(new Color(32, 178, 170));
		separator_4.setBounds(41, 261, 976, 12);
		panel3.add(separator_4);
		
		JDateChooser dateChooser_4 = new JDateChooser((java.util.Date) null);
		dateChooser_4.setBounds(476, 230, 138, 20);
		panel3.add(dateChooser_4);
		
		JLabel label_34 = new JLabel("Kay\u0131t Tarih");
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_34.setBounds(370, 230, 80, 20);
		panel3.add(label_34);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(new Color(32, 178, 170));
		separator_5.setBounds(41, 486, 976, 2);
		panel3.add(separator_5);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(183, 413, 329, 68);
		panel3.add(textArea_2);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(476, 367, 138, 20);
		panel3.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(476, 335, 138, 20);
		panel3.add(textField_17);
		
		JLabel label_38 = new JLabel("Mail Adresi");
		label_38.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_38.setBounds(674, 334, 86, 20);
		panel3.add(label_38);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(816, 334, 138, 20);
		panel3.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(816, 367, 138, 20);
		panel3.add(textField_19);
		
		JLabel label_39 = new JLabel("Telefon2");
		label_39.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_39.setBounds(674, 366, 73, 20);
		panel3.add(label_39);
		
		JLabel label_40 = new JLabel("Teslimat Tarihi");
		label_40.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_40.setBounds(674, 230, 104, 20);
		panel3.add(label_40);
		
		JDateChooser dateChooser_5 = new JDateChooser((java.util.Date) null);
		dateChooser_5.setBounds(816, 230, 138, 20);
		panel3.add(dateChooser_5);
		
		JLabel label_41 = new JLabel("Soyad");
		label_41.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_41.setBounds(370, 334, 73, 20);
		panel3.add(label_41);
		
		JLabel label_43 = new JLabel("Telefon");
		label_43.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_43.setBounds(370, 365, 73, 20);
		panel3.add(label_43);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(183, 365, 138, 20);
		panel3.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(183, 334, 138, 20);
		panel3.add(textField_21);
		
		JLabel label_44 = new JLabel("Firma Ad\u0131");
		label_44.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_44.setBounds(41, 303, 118, 20);
		panel3.add(label_44);
		
		JLabel label_45 = new JLabel("Ad");
		label_45.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_45.setBounds(41, 334, 86, 20);
		panel3.add(label_45);
		
		JLabel label_46 = new JLabel("G\u00F6rev");
		label_46.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_46.setBounds(41, 366, 73, 20);
		panel3.add(label_46);
		
		JLabel label_47 = new JLabel("Adres");
		label_47.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_47.setBounds(41, 423, 73, 20);
		panel3.add(label_47);
		
		JLabel label_48 = new JLabel("Sipari\u015F \u0130\u00E7erik Bilgisi");
		label_48.setForeground(Color.WHITE);
		label_48.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_48.setBounds(317, 486, 138, 20);
		panel3.add(label_48);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(78, 519, 827, 156);
		panel3.add(scrollPane_4);
		
		butunSiparislerMalzemeler = new JTable();
		butunSiparislerMalzemeler.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Ürün Kodu","Ürün Adý","Malzeme Adý","Ebat","Cins","Renk","Adet","Ürün Fiyat","Açýklama"
			}
		));
		scrollPane_4.setViewportView(butunSiparislerMalzemeler);
		
		JLabel label_35 = new JLabel("");
		label_35.setIcon(new ImageIcon(YoneticiSatisSiparisi.class.getResource("/search.png")));
		label_35.setBounds(327, 302, 35, 21);
		panel3.add(label_35);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(183, 303, 138, 20);
		panel3.add(textField_23);
		
		JLabel lblNewLabel_2 = new JLabel("M\u00FC\u015Fteri Bilgileri");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(317, 272, 107, 20);
		panel3.add(lblNewLabel_2);
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
