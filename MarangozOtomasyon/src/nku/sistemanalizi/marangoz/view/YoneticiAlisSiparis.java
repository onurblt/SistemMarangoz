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

	public class YoneticiAlisSiparis extends JFrame {

		private JPanel contentPane;
		private JLabel closeBtn2;
		private JLabel lblNewLabel_3;
		int pX;
		int pY;
		private JLabel label_1;
		private JTextField textField_7;
		private JTable aktifSiparislerTable;
		private JTable malzemeGirisTable;
		private JTable table_2;
		private JTextField textField_8;
		private JTextField textField_16;
		private JTextField textField_17;
		private JTextField textField_18;
		private JTextField textField_19;
		private JTextField textField_20;
		private JTextField textField_21;
		private JTable table;
		private JTable table_1;
		private JTextField textField_15;
		private JTextField textField_10;
		private JTextField textField_11;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_13;
		private JTextField textField;
		private JTextField textField_14;
		private JTextField textField_22;
		private JTextField textField_23;
		private JTextField textField_24;
		private JTextField textField_27;
		private JTextField textField_12;
		private JTextField textField_25;
		private JTextField textField_26;
		private JTextField textField_9;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						YoneticiAlisSiparis frame = new YoneticiAlisSiparis();
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
		public YoneticiAlisSiparis() {
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
			closeBtn2.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/kapat.png")));
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
			label_1.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/kucult.png")));
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
			
			JSeparator separator = new JSeparator();
			separator.setBounds(10, 109, 504, 12);
			separator.setBackground(new Color(32, 178, 170));
			panel1.add(separator);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(10, 363, 976, 2);
			separator_1.setBackground(new Color(32, 178, 170));
			panel1.add(separator_1);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 13));
			scrollPane.setBounds(39, 407, 813, 207);
			panel1.add(scrollPane);
			
			malzemeGirisTable = new JTable();
			malzemeGirisTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Malzeme Kodu","Malzeme Adý","Adet" ,"Birim Fiyat", "Açýklama", "Renk","Teslimat Tarihi"
				}
			));
			scrollPane.setRowHeaderView(malzemeGirisTable);
	    	
			scrollPane.setViewportView(malzemeGirisTable);
			JLabel lblMalzemeDetaylar = new JLabel("Malzeme Detaylar\u0131");
			lblMalzemeDetaylar.setForeground(Color.WHITE);
			lblMalzemeDetaylar.setBounds(39, 376, 138, 20);
			lblMalzemeDetaylar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			panel1.add(lblMalzemeDetaylar);
			
			JLabel label_20 = new JLabel("Toplam Fiyat");
			label_20.setBounds(635, 642, 95, 20);
			label_20.setFont(new Font("Tahoma", Font.PLAIN, 13));
			panel1.add(label_20);
			
			textField_7 = new JTextField();
			textField_7.setBounds(766, 643, 86, 20);
			textField_7.setColumns(10);
			panel1.add(textField_7);
			
			JButton button_3 = new JButton("Temizle");
			button_3.setBounds(886, 591, 100, 23);
			button_3.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/sil2.png")));
			panel1.add(button_3);
			
			JButton button_4 = new JButton("Kaydet");
			button_4.setBounds(886, 557, 100, 23);
			button_4.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/kaydet.png")));
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			panel1.add(button_4);
			
			JLabel label_14 = new JLabel("");
			label_14.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/plus.png")));
			label_14.setBounds(969, 287, 48, 17);
			panel1.add(label_14);
			
			JLabel label_17 = new JLabel("");
			label_17.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/kucult.png")));
			label_17.setBounds(969, 315, 48, 17);
			panel1.add(label_17);
			
			JLabel lblTeslimatTarihi = new JLabel("Teslimat Tarihi");
			lblTeslimatTarihi.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblTeslimatTarihi.setBounds(370, 642, 104, 20);
			panel1.add(lblTeslimatTarihi);
			
			JDateChooser dateChooser_6 = new JDateChooser((java.util.Date) null);
			dateChooser_6.setBounds(467, 642, 118, 20);
			panel1.add(dateChooser_6);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(119, 174, 121, 20);
			panel1.add(comboBox);
			
			JLabel label_4 = new JLabel("Firma Ad\u0131");
			label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_4.setBounds(20, 173, 95, 20);
			panel1.add(label_4);
			
			JLabel label_6 = new JLabel("Soyad");
			label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_6.setBounds(20, 204, 73, 20);
			panel1.add(label_6);
			
			JLabel label_7 = new JLabel("Telefon");
			label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_7.setBounds(20, 235, 73, 20);
			panel1.add(label_7);
			
			JLabel label_8 = new JLabel("Telefon2");
			label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_8.setBounds(20, 266, 73, 20);
			panel1.add(label_8);
			
			JLabel label_9 = new JLabel("Adres");
			label_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_9.setBounds(20, 312, 73, 20);
			panel1.add(label_9);
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(119, 298, 290, 54);
			panel1.add(textArea);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(119, 267, 121, 20);
			panel1.add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(119, 236, 121, 20);
			panel1.add(textField_2);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(119, 205, 121, 20);
			panel1.add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(119, 79, 121, 20);
			panel1.add(textField_4);
			
			JLabel label_10 = new JLabel("Sipari\u015F Kodu");
			label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_10.setBounds(17, 78, 86, 20);
			panel1.add(label_10);
			
			JDateChooser dateChooser_8 = new JDateChooser((java.util.Date) null);
			dateChooser_8.setBounds(349, 78, 121, 20);
			panel1.add(dateChooser_8);
			
			JLabel label_11 = new JLabel("Kay\u0131t Tarih");
			label_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_11.setBounds(271, 78, 80, 20);
			panel1.add(label_11);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(349, 174, 121, 20);
			panel1.add(textField_5);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(349, 205, 121, 20);
			panel1.add(textField_6);
			
			textField_13 = new JTextField();
			textField_13.setColumns(10);
			textField_13.setBounds(349, 237, 121, 20);
			panel1.add(textField_13);
			
			JLabel label_12 = new JLabel("Mail Adresi");
			label_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_12.setBounds(255, 236, 86, 20);
			panel1.add(label_12);
			
			JLabel label_51 = new JLabel("G\u00F6rev");
			label_51.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_51.setBounds(255, 204, 73, 20);
			panel1.add(label_51);
			
			JLabel label_52 = new JLabel("Ad");
			label_52.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_52.setBounds(255, 173, 86, 20);
			panel1.add(label_52);
			
			JLabel label = new JLabel("Al\u0131\u015F Sipari\u015F Formu");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
			label.setBounds(432, 11, 279, 31);
			panel1.add(label);
			
			JLabel label_22 = new JLabel("Malzeme Ad\u0131");
			label_22.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_22.setBounds(550, 174, 85, 20);
			panel1.add(label_22);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setBounds(644, 175, 121, 25);
			panel1.add(comboBox_2);
			
			JLabel label_53 = new JLabel("Birim Fiyat");
			label_53.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_53.setBounds(550, 214, 85, 20);
			panel1.add(label_53);
			
			textField_22 = new JTextField();
			textField_22.setColumns(10);
			textField_22.setBounds(644, 211, 121, 23);
			panel1.add(textField_22);
			
			JLabel label_54 = new JLabel("Ebat");
			label_54.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_54.setBounds(550, 248, 60, 14);
			panel1.add(label_54);
			
			textField_23 = new JTextField();
			textField_23.setColumns(10);
			textField_23.setBounds(644, 245, 121, 23);
			panel1.add(textField_23);
			
			JLabel lblRenk = new JLabel("Renk");
			lblRenk.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblRenk.setBounds(550, 282, 60, 14);
			panel1.add(lblRenk);
			
			JComboBox comboBox_8 = new JComboBox();
			comboBox_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
			comboBox_8.setBounds(644, 279, 121, 20);
			panel1.add(comboBox_8);
			
			JLabel label_55 = new JLabel("Adet");
			label_55.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_55.setBounds(550, 312, 51, 20);
			panel1.add(label_55);
			
			JSpinner spinner_2 = new JSpinner();
			spinner_2.setBounds(644, 312, 74, 22);
			panel1.add(spinner_2);
			
			JLabel lblCinsi = new JLabel("Cinsi");
			lblCinsi.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCinsi.setBounds(792, 217, 60, 14);
			panel1.add(lblCinsi);
			
			textField_24 = new JTextField();
			textField_24.setColumns(10);
			textField_24.setBounds(865, 214, 121, 23);
			panel1.add(textField_24);
			
			JLabel lblAklama_1 = new JLabel("A\u00E7\u0131klama");
			lblAklama_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAklama_1.setBounds(792, 254, 60, 14);
			panel1.add(lblAklama_1);
			
			textField_27 = new JTextField();
			textField_27.setColumns(10);
			textField_27.setBounds(865, 253, 121, 23);
			panel1.add(textField_27);
			
			JLabel lblNewLabel_1 = new JLabel("Malzeme Bilgileri");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setBounds(736, 131, 118, 20);
			panel1.add(lblNewLabel_1);
			
			JLabel lblTedarikiBilgileri = new JLabel("Tedarik\u00E7i Bilgileri");
			lblTedarikiBilgileri.setForeground(Color.WHITE);
			lblTedarikiBilgileri.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblTedarikiBilgileri.setBounds(223, 132, 118, 20);
			panel1.add(lblTedarikiBilgileri);
			
			JPanel panel2 = new JPanel();
			panel2.setForeground(Color.ORANGE);
			panel2.setBackground(Color.CYAN);
			icerikPanel.add(panel2, "name_105555047486139");
			panel2.setLayout(null);
			
			JLabel lblBekleyenAlSiparileri = new JLabel("Bekleyen  Al\u0131\u015F Sipari\u015Fleri");
			lblBekleyenAlSiparileri.setForeground(new Color(255, 255, 255));
			lblBekleyenAlSiparileri.setBounds(438, 13, 290, 20);
			lblBekleyenAlSiparileri.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
			panel2.add(lblBekleyenAlSiparileri);
			
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
			
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(178, 230, 109, 20);
			panel2.add(textField_8);
			
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
			
			JLabel lblFirmaAd = new JLabel("Firma Ad\u0131");
			lblFirmaAd.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblFirmaAd.setBounds(36, 284, 118, 20);
			panel2.add(lblFirmaAd);
			
			JSeparator separator_2 = new JSeparator();
			separator_2.setBackground(new Color(32, 178, 170));
			separator_2.setBounds(36, 261, 976, 12);
			panel2.add(separator_2);
			
			JSeparator separator_3 = new JSeparator();
			separator_3.setBackground(new Color(32, 178, 170));
			separator_3.setBounds(36, 315, 976, 2);
			panel2.add(separator_3);
			
			JLabel lblSiparisMalzemeDetay = new JLabel("Siparis Malzeme Detay\u0131");
			lblSiparisMalzemeDetay.setForeground(Color.WHITE);
			lblSiparisMalzemeDetay.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSiparisMalzemeDetay.setBounds(73, 474, 138, 20);
			panel2.add(lblSiparisMalzemeDetay);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/print.png")));
			lblNewLabel.setBounds(1060, 2, 46, 40);
			panel2.add(lblNewLabel);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(73, 505, 813, 146);
			panel2.add(scrollPane_2);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Malzeme Kodu","Malzeme Adý","Adet" ,"Birim Fiyat", "Açýklama", "Renk","Teslimat Tarihi"
				}
			));
			scrollPane_2.setViewportView(table);
			
			JButton button_5 = new JButton("G\u00FCncelle");
			button_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					DepoMenu depoMenu = new DepoMenu();
					depoMenu.setVisible(true);
				}
				
			
			});
			button_5.setBounds(976, 514, 89, 23);
			panel2.add(button_5);
			
			JButton btnIptal = new JButton("\u0130ptal");
			btnIptal.setBounds(976, 566, 89, 23);
			panel2.add(btnIptal);
			
			JLabel label_35 = new JLabel("");
			label_35.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/search.png")));
			label_35.setBounds(297, 284, 46, 20);
			panel2.add(label_35);
			
			JLabel label_25 = new JLabel("Malzeme Ad\u0131");
			label_25.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_25.setBounds(62, 339, 85, 20);
			panel2.add(label_25);
			
			JLabel label_26 = new JLabel("Birim Fiyat");
			label_26.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_26.setBounds(62, 380, 85, 20);
			panel2.add(label_26);
			
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(159, 380, 118, 23);
			panel2.add(textField_10);
			
			JDateChooser dateChooser_7 = new JDateChooser((java.util.Date) null);
			dateChooser_7.setBounds(159, 421, 118, 20);
			panel2.add(dateChooser_7);
			
			JLabel label_27 = new JLabel("Termin Tarihi");
			label_27.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_27.setBounds(62, 421, 104, 20);
			panel2.add(label_27);
			
			JComboBox comboBox_5 = new JComboBox();
			comboBox_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
			comboBox_5.setBounds(400, 339, 86, 20);
			panel2.add(comboBox_5);
			
			JLabel label_28 = new JLabel("A\u00E7\u0131klama");
			label_28.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_28.setBounds(313, 424, 60, 14);
			panel2.add(label_28);
			
			JLabel lblAdet = new JLabel("Adet");
			lblAdet.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAdet.setBounds(313, 377, 51, 20);
			panel2.add(lblAdet);
			
			JSpinner spinner_1 = new JSpinner();
			spinner_1.setBounds(400, 378, 74, 22);
			panel2.add(spinner_1);
			
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(400, 418, 118, 23);
			panel2.add(textField_11);
			
			JLabel label_31 = new JLabel("");
			label_31.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/plus.png")));
			label_31.setBounds(777, 348, 48, 17);
			panel2.add(label_31);
			
			JLabel label_32 = new JLabel("");
			label_32.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/kucult.png")));
			label_32.setBounds(777, 376, 48, 17);
			panel2.add(label_32);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(800, 655, 86, 20);
			panel2.add(textField);
			
			JLabel label_5 = new JLabel("Toplam Fiyat");
			label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_5.setBounds(669, 654, 95, 20);
			panel2.add(label_5);
			
			textField_12 = new JTextField();
			textField_12.setColumns(10);
			textField_12.setBounds(178, 285, 109, 20);
			panel2.add(textField_12);
			
			JLabel lblRenk_1 = new JLabel("Renk");
			lblRenk_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblRenk_1.setBounds(313, 339, 85, 20);
			panel2.add(lblRenk_1);
			
			JLabel label_3 = new JLabel("Cinsi");
			label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_3.setBounds(523, 380, 60, 14);
			panel2.add(label_3);
			
			textField_25 = new JTextField();
			textField_25.setColumns(10);
			textField_25.setBounds(617, 377, 121, 23);
			panel2.add(textField_25);
			
			JLabel label_13 = new JLabel("Ebat");
			label_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_13.setBounds(523, 342, 60, 14);
			panel2.add(label_13);
			
			textField_26 = new JTextField();
			textField_26.setColumns(10);
			textField_26.setBounds(617, 339, 121, 23);
			panel2.add(textField_26);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			comboBox_1.setBounds(157, 340, 120, 29);
			panel2.add(comboBox_1);
			
			JPanel panel3 = new JPanel();
			panel3.setForeground(Color.RED);
			panel3.setBackground(Color.CYAN);
			icerikPanel.add(panel3, "name_105555074451865");
			panel3.setLayout(null);
			
			JLabel label_23 = new JLabel("B\u00FCt\u00FCn Al\u0131\u015F Sipari\u015Fler");
			label_23.setForeground(new Color(255, 255, 255));
			label_23.setBounds(476, 11, 234, 21);
			label_23.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
			panel3.add(label_23);
			
			JScrollPane scrollPane_3 = new JScrollPane();
			scrollPane_3.setBounds(10, 42, 1099, 170);
			panel3.add(scrollPane_3);
			
			table_2 = new JTable();
			table_2.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Siparis Kodu","Firma Adý","Ad","Soyad","Ünvan","Toplam Fiyat","Kayýt Tarihi","Teslimat Tarihi"
				}
			));
			scrollPane_3.setViewportView(table_2);
			
			JLabel label_33 = new JLabel("Sipari\u015F Kodu");
			label_33.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_33.setBounds(41, 230, 86, 20);
			panel3.add(label_33);
			
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
			separator_5.setBounds(41, 472, 976, 2);
			panel3.add(separator_5);
			
			JTextArea textArea_2 = new JTextArea();
			textArea_2.setBounds(183, 405, 329, 58);
			panel3.add(textArea_2);
			
			textField_16 = new JTextField();
			textField_16.setColumns(10);
			textField_16.setBounds(476, 361, 138, 20);
			panel3.add(textField_16);
			
			textField_17 = new JTextField();
			textField_17.setColumns(10);
			textField_17.setBounds(476, 329, 138, 20);
			panel3.add(textField_17);
			
			JLabel label_38 = new JLabel("Mail Adresi");
			label_38.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_38.setBounds(674, 328, 86, 20);
			panel3.add(label_38);
			
			textField_18 = new JTextField();
			textField_18.setColumns(10);
			textField_18.setBounds(816, 328, 138, 20);
			panel3.add(textField_18);
			
			textField_19 = new JTextField();
			textField_19.setColumns(10);
			textField_19.setBounds(816, 361, 138, 20);
			panel3.add(textField_19);
			
			JLabel label_39 = new JLabel("Telefon2");
			label_39.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_39.setBounds(674, 360, 73, 20);
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
			label_41.setBounds(377, 328, 73, 20);
			panel3.add(label_41);
			
			JLabel label_43 = new JLabel("Telefon");
			label_43.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_43.setBounds(370, 359, 73, 20);
			panel3.add(label_43);
			
			textField_20 = new JTextField();
			textField_20.setColumns(10);
			textField_20.setBounds(183, 359, 138, 20);
			panel3.add(textField_20);
			
			textField_21 = new JTextField();
			textField_21.setColumns(10);
			textField_21.setBounds(183, 328, 138, 20);
			panel3.add(textField_21);
			
			JLabel lblFirmaAd_1 = new JLabel("Firma Ad\u0131");
			lblFirmaAd_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblFirmaAd_1.setBounds(41, 297, 118, 20);
			panel3.add(lblFirmaAd_1);
			
			JLabel label_45 = new JLabel("Ad");
			label_45.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_45.setBounds(41, 328, 86, 20);
			panel3.add(label_45);
			
			JLabel label_46 = new JLabel("G\u00F6rev");
			label_46.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_46.setBounds(41, 360, 73, 20);
			panel3.add(label_46);
			
			JLabel label_47 = new JLabel("Adres");
			label_47.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_47.setBounds(41, 415, 73, 20);
			panel3.add(label_47);
			
			JLabel lblSipariMalzemeDetay = new JLabel("Sipari\u015F Malzeme Detay\u0131");
			lblSipariMalzemeDetay.setForeground(Color.WHITE);
			lblSipariMalzemeDetay.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSipariMalzemeDetay.setBounds(288, 474, 146, 20);
			panel3.add(lblSipariMalzemeDetay);
			
			JScrollPane scrollPane_4 = new JScrollPane();
			scrollPane_4.setBounds(78, 505, 813, 149);
			panel3.add(scrollPane_4);
			
			table_1 = new JTable();
			table_1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Malzeme Kodu","Malzeme Adý","Adet" ,"Birim Fiyat", "Açýklama", "Renk","Teslimat Tarihi"
				}
			));
			scrollPane_4.setViewportView(table_1);
			
			textField_15 = new JTextField();
			textField_15.setColumns(10);
			textField_15.setBounds(183, 230, 138, 20);
			panel3.add(textField_15);
			
			JLabel label_36 = new JLabel("");
			label_36.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/search.png")));
			label_36.setBounds(331, 297, 46, 20);
			panel3.add(label_36);
			
			textField_14 = new JTextField();
			textField_14.setColumns(10);
			textField_14.setBounds(805, 666, 86, 20);
			panel3.add(textField_14);
			
			JLabel label_15 = new JLabel("Toplam Fiyat");
			label_15.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_15.setBounds(674, 665, 95, 20);
			panel3.add(label_15);
			
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(183, 297, 138, 20);
			panel3.add(textField_9);
			
			JLabel lblNewLabel_2 = new JLabel("Tedarik\u00E7i Bilgileri");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setBounds(288, 261, 118, 25);
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
			button.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/yeni.png")));
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
			button_1.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/tamamla.png")));
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
			button_2.setIcon(new ImageIcon(YoneticiAlisSiparis.class.getResource("/archive.png")));
			button_2.setFont(new Font("SansSerif", Font.BOLD, 18));
			button_2.setBackground(SystemColor.menu);
			panel_2.add(button_2);
			
			JLabel label_2 = new JLabel("ANA MENU");
			label_2.setBounds(1266, 738, 99, 28);
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
