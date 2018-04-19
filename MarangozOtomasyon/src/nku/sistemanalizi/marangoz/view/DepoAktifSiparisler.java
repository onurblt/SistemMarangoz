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

public class DepoAktifSiparisler extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
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
	private JTable table;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepoAktifSiparisler frame = new DepoAktifSiparisler();
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
	public DepoAktifSiparisler() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 1500, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		lblNewLabel_1 = new JLabel("Sipari\u015F Bilgileri");
		lblNewLabel_1.setBounds(552, 24, 279, 31);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new java.awt.Font("Gabriola", 7, 25));
		contentPane.add(lblNewLabel_1);
		
		closeBtn2 = new JLabel("");
		closeBtn2.setBounds(1335, 0, 30, 31);
		closeBtn2.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/kapat.png")));
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
		label_1.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/kucult.png")));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label_1);
		
		JPanel icerikPanel = new JPanel();
		icerikPanel.setBackground(new Color(30, 144, 255));
		icerikPanel.setBounds(121, 80, 1169, 686);
		contentPane.add(icerikPanel);
		icerikPanel.setLayout(new CardLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.CYAN);
		icerikPanel.add(panel1, "name_95829487275896");
		panel1.setLayout(null);
		
		JLabel label = new JLabel("Sipari\u015F Formu");
		label.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		label.setBounds(518, 11, 118, 21);
		panel1.add(label);
		
		JLabel label_2 = new JLabel("ANA MENU");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				DepoMenu DepoMenu = new DepoMenu();
				DepoMenu.setVisible(true);
			}
		});
		label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setIcon(new ImageIcon(DepoMenu.class.getResource("/cikis.png")));
		label_2.setForeground(new Color(72, 61, 139));
		label_2.setBounds(1048, 647, 111, 28);
		panel1.add(label_2);
		
		JLabel label_3 = new JLabel("Sipari\u015F Kodu");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(10, 78, 86, 20);
		panel1.add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(152, 78, 138, 20);
		panel1.add(textField);
		
		JLabel label_4 = new JLabel("M\u00FC\u015Fteri(Firma Ad\u0131)");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setBounds(10, 132, 118, 20);
		panel1.add(label_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(152, 132, 138, 20);
		panel1.add(comboBox);
		
		JLabel label_5 = new JLabel("Kay\u0131t Tarih");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setBounds(339, 78, 80, 20);
		panel1.add(label_5);
		
		JDateChooser dateChooser = new JDateChooser((java.util.Date) null);
		dateChooser.setBounds(445, 78, 138, 20);
		panel1.add(dateChooser);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(32, 178, 170));
		separator.setBounds(10, 119, 573, 2);
		panel1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(32, 178, 170));
		separator_1.setBounds(10, 348, 573, 2);
		panel1.add(separator_1);
		
		JLabel label_6 = new JLabel("Ad");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(10, 163, 86, 20);
		panel1.add(label_6);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 163, 138, 20);
		panel1.add(textField_1);
		
		JLabel label_7 = new JLabel("Soyad");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(346, 163, 73, 20);
		panel1.add(label_7);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(445, 164, 138, 20);
		panel1.add(textField_2);
		
		JLabel label_8 = new JLabel("Mail Adresi");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(10, 196, 86, 20);
		panel1.add(label_8);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(152, 196, 138, 20);
		panel1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(445, 227, 138, 20);
		panel1.add(textField_4);
		
		JLabel label_9 = new JLabel("Telefon2");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_9.setBounds(346, 226, 73, 20);
		panel1.add(label_9);
		
		JLabel label_10 = new JLabel("Telefon");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_10.setBounds(10, 227, 73, 20);
		panel1.add(label_10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(152, 228, 138, 20);
		panel1.add(textField_5);
		
		JLabel label_11 = new JLabel("G\u00F6rev");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_11.setBounds(346, 194, 73, 20);
		panel1.add(label_11);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(445, 195, 138, 20);
		panel1.add(textField_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(152, 269, 329, 68);
		panel1.add(textArea);
		
		JLabel label_12 = new JLabel("Adres");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_12.setBounds(10, 279, 73, 20);
		panel1.add(label_12);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Kategori Se\u00E7"}));
		comboBox_1.setBounds(731, 77, 138, 20);
		panel1.add(comboBox_1);
		
		JLabel label_13 = new JLabel("\u00DCr\u00FCn");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_13.setBounds(641, 77, 65, 20);
		panel1.add(label_13);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\u00DCr\u00FCn Se\u00E7"}));
		comboBox_2.setBounds(901, 78, 138, 20);
		panel1.add(comboBox_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(1088, 78, 51, 20);
		panel1.add(spinner);
		
		JLabel label_14 = new JLabel("Adet");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_14.setBounds(1049, 77, 51, 20);
		panel1.add(label_14);
		
		JLabel label_15 = new JLabel("Teslimat Tarihi");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_15.setBounds(10, 369, 104, 20);
		panel1.add(label_15);
		
		JDateChooser dateChooser_1 = new JDateChooser((java.util.Date) null);
		dateChooser_1.setBounds(152, 369, 138, 20);
		panel1.add(dateChooser_1);
		
		JLabel label_16 = new JLabel("Autocad Cizim Ekle");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_16.setBounds(10, 404, 118, 20);
		panel1.add(label_16);
		
		JLabel label_17 = new JLabel();
		label_17.setBounds(190, 403, 180, 21);
		panel1.add(label_17);
		
		JLabel label_18 = new JLabel();
		label_18.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_18.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/dxfuzanti.png")));
		label_18.setBounds(152, 400, 39, 28);
		panel1.add(label_18);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBackground(new Color(32, 178, 170));
		separator_2.setBounds(608, 62, 2, 374);
		panel1.add(separator_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(645, 177, 494, 220);
		panel1.add(scrollPane);
		
		JLabel label_19 = new JLabel("Malzeme Bilgisi");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_19.setBounds(641, 143, 138, 20);
		panel1.add(label_19);
		
		JLabel label_20 = new JLabel("Toplam Fiyat");
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_20.setBounds(639, 111, 95, 20);
		panel1.add(label_20);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(731, 112, 138, 20);
		panel1.add(textField_7);
		
		JButton button_3 = new JButton("Yeni");
		button_3.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/sil2.png")));
		button_3.setBounds(577, 511, 89, 23);
		panel1.add(button_3);
		
		JButton button_4 = new JButton("Ekle");
		button_4.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/kaydet.png")));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_4.setBounds(494, 565, 89, 23);
		panel1.add(button_4);
		
		JButton button_5 = new JButton("G\u00FCncelle");
		button_5.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/guncelle.png")));
		button_5.setBounds(566, 612, 114, 22);
		panel1.add(button_5);
		
		JButton button_6 = new JButton("Kald\u0131r");
		button_6.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/sil.png")));
		button_6.setBounds(656, 565, 89, 23);
		panel1.add(button_6);
		
		JPanel panel2 = new JPanel();
		panel2.setForeground(Color.ORANGE);
		panel2.setBackground(Color.CYAN);
		icerikPanel.add(panel2, "name_95829503989898");
		panel2.setLayout(null);
		
		JLabel label_22 = new JLabel("Aktif Sipari\u015Fler");
		label_22.setBounds(520, 10, 104, 20);
		label_22.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		panel2.add(label_22);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 44, 1149, 206);
		panel2.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		JLabel label_21 = new JLabel("");
		label_21.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_21.setBounds(1082, -13, 77, 68);
		panel2.add(label_21);
		label_21.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/print.png")));
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(152, 307, 138, 20);
		panel2.add(textField_8);
		
		JLabel label_24 = new JLabel("Sipari\u015F Kodu");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_24.setBounds(10, 307, 86, 20);
		panel2.add(label_24);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(new Color(32, 178, 170));
		separator_3.setBounds(10, 348, 573, 2);
		panel2.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(new Color(32, 178, 170));
		separator_4.setBounds(10, 577, 573, 2);
		panel2.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBackground(new Color(32, 178, 170));
		separator_5.setBounds(610, 293, 2, 342);
		panel2.add(separator_5);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(152, 361, 138, 20);
		panel2.add(comboBox_3);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(152, 392, 138, 20);
		panel2.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(152, 425, 138, 20);
		panel2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(152, 457, 138, 20);
		panel2.add(textField_11);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(152, 498, 329, 68);
		panel2.add(textArea_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(445, 456, 138, 20);
		panel2.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(445, 424, 138, 20);
		panel2.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(445, 393, 138, 20);
		panel2.add(textField_14);
		
		JLabel label_25 = new JLabel("Soyad");
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_25.setBounds(346, 392, 73, 20);
		panel2.add(label_25);
		
		JLabel label_26 = new JLabel("G\u00F6rev");
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_26.setBounds(346, 423, 73, 20);
		panel2.add(label_26);
		
		JLabel label_27 = new JLabel("Telefon2");
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_27.setBounds(346, 455, 73, 20);
		panel2.add(label_27);
		
		JLabel label_28 = new JLabel("M\u00FC\u015Fteri(Firma Ad\u0131)");
		label_28.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_28.setBounds(10, 361, 118, 20);
		panel2.add(label_28);
		
		JLabel label_29 = new JLabel("Ad");
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_29.setBounds(10, 392, 86, 20);
		panel2.add(label_29);
		
		JLabel label_30 = new JLabel("Mail Adresi");
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_30.setBounds(10, 425, 86, 20);
		panel2.add(label_30);
		
		JLabel label_31 = new JLabel("Telefon");
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_31.setBounds(10, 456, 73, 20);
		panel2.add(label_31);
		
		JLabel label_32 = new JLabel("Adres");
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_32.setBounds(10, 508, 73, 20);
		panel2.add(label_32);
		
		JLabel label_33 = new JLabel("Kay\u0131t Tarih");
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_33.setBounds(339, 307, 80, 20);
		panel2.add(label_33);
		
		JDateChooser dateChooser_2 = new JDateChooser((java.util.Date) null);
		dateChooser_2.setBounds(445, 307, 138, 20);
		panel2.add(dateChooser_2);
		
		JDateChooser dateChooser_3 = new JDateChooser((java.util.Date) null);
		dateChooser_3.setBounds(152, 598, 138, 20);
		panel2.add(dateChooser_3);
		
		JLabel label_34 = new JLabel("Teslimat Tarihi");
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_34.setBounds(10, 598, 104, 20);
		panel2.add(label_34);
		
		JLabel label_35 = new JLabel("Autocad Cizim ");
		label_35.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_35.setBounds(10, 633, 118, 20);
		panel2.add(label_35);
		
		JLabel label_36 = new JLabel();
		label_36.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_36.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/dxfuzanti.png")));
		label_36.setBounds(152, 629, 39, 28);
		panel2.add(label_36);
		
		JLabel label_37 = new JLabel();
		label_37.setBounds(190, 632, 180, 21);
		panel2.add(label_37);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(645, 406, 494, 220);
		panel2.add(scrollPane_2);
		
		JLabel label_38 = new JLabel("Malzeme Bilgisi");
		label_38.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_38.setBounds(641, 372, 138, 20);
		panel2.add(label_38);
		
		JLabel label_39 = new JLabel("Toplam Fiyat");
		label_39.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_39.setBounds(639, 340, 95, 20);
		panel2.add(label_39);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(731, 341, 138, 20);
		panel2.add(textField_15);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(731, 306, 138, 20);
		panel2.add(comboBox_4);
		
		JLabel label_40 = new JLabel("\u00DCr\u00FCn");
		label_40.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_40.setBounds(641, 306, 65, 20);
		panel2.add(label_40);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(901, 307, 138, 20);
		panel2.add(comboBox_5);
		
		JLabel label_41 = new JLabel("Adet");
		label_41.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_41.setBounds(1049, 306, 51, 20);
		panel2.add(label_41);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(1088, 307, 51, 20);
		panel2.add(spinner_1);
		
		JButton button_7 = new JButton("Askýya Al");
		button_7.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/snooze.png")));
		button_7.setBounds(552, 646, 127, 40);
		panel2.add(button_7);
		
		JLabel label_61 = new JLabel("ANA MENU");
		label_61.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				DepoMenu DepoMenu = new DepoMenu();
				DepoMenu.setVisible(true);
			}
		});
		label_61.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/cikis.png")));
		label_61.setForeground(new Color(72, 61, 139));
		label_61.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_61.setBounds(1058, 646, 111, 28);
		panel2.add(label_61);
		
		JPanel panel3 = new JPanel();
		panel3.setForeground(Color.RED);
		panel3.setBackground(Color.CYAN);
		icerikPanel.add(panel3, "name_95829522335429");
		panel3.setLayout(null);
		
		JLabel label_23 = new JLabel("B\u00FCt\u00FCn Sipari\u015Fler");
		label_23.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		label_23.setBounds(518, 11, 118, 21);
		panel3.add(label_23);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 44, 1149, 206);
		panel3.add(scrollPane_3);
		
		JLabel label_42 = new JLabel("");
		label_42.setBounds(1082, -13, 77, 68);
		panel3.add(label_42);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(152, 307, 138, 20);
		panel3.add(textField_16);
		
		JLabel label_43 = new JLabel("Sipari\u015F Kodu");
		label_43.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_43.setBounds(10, 307, 86, 20);
		panel3.add(label_43);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBackground(new Color(32, 178, 170));
		separator_6.setBounds(10, 348, 573, 2);
		panel3.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBackground(new Color(32, 178, 170));
		separator_7.setBounds(10, 577, 573, 2);
		panel3.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBackground(new Color(32, 178, 170));
		separator_8.setBounds(610, 293, 2, 342);
		panel3.add(separator_8);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(152, 361, 138, 20);
		panel3.add(comboBox_6);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(152, 392, 138, 20);
		panel3.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(152, 425, 138, 20);
		panel3.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(152, 457, 138, 20);
		panel3.add(textField_19);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(152, 498, 329, 68);
		panel3.add(textArea_2);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(445, 456, 138, 20);
		panel3.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(445, 424, 138, 20);
		panel3.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(445, 393, 138, 20);
		panel3.add(textField_22);
		
		JLabel label_44 = new JLabel("Soyad");
		label_44.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_44.setBounds(346, 392, 73, 20);
		panel3.add(label_44);
		
		JLabel label_45 = new JLabel("G\u00F6rev");
		label_45.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_45.setBounds(346, 423, 73, 20);
		panel3.add(label_45);
		
		JLabel label_46 = new JLabel("Telefon2");
		label_46.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_46.setBounds(346, 455, 73, 20);
		panel3.add(label_46);
		
		JLabel label_47 = new JLabel("M\u00FC\u015Fteri(Firma Ad\u0131)");
		label_47.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_47.setBounds(10, 361, 118, 20);
		panel3.add(label_47);
		
		JLabel label_48 = new JLabel("Ad");
		label_48.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_48.setBounds(10, 392, 86, 20);
		panel3.add(label_48);
		
		JLabel label_49 = new JLabel("Mail Adresi");
		label_49.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_49.setBounds(10, 425, 86, 20);
		panel3.add(label_49);
		
		JLabel label_50 = new JLabel("Telefon");
		label_50.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_50.setBounds(10, 456, 73, 20);
		panel3.add(label_50);
		
		JLabel label_51 = new JLabel("Adres");
		label_51.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_51.setBounds(10, 508, 73, 20);
		panel3.add(label_51);
		
		JLabel label_52 = new JLabel("Kay\u0131t Tarih");
		label_52.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_52.setBounds(339, 307, 80, 20);
		panel3.add(label_52);
		
		JDateChooser dateChooser_4 = new JDateChooser((java.util.Date) null);
		dateChooser_4.setBounds(445, 307, 138, 20);
		panel3.add(dateChooser_4);
		
		JDateChooser dateChooser_5 = new JDateChooser((java.util.Date) null);
		dateChooser_5.setBounds(152, 598, 138, 20);
		panel3.add(dateChooser_5);
		
		JLabel label_53 = new JLabel("Teslimat Tarihi");
		label_53.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_53.setBounds(10, 598, 104, 20);
		panel3.add(label_53);
		
		JLabel label_54 = new JLabel("Autocad Cizim ");
		label_54.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_54.setBounds(10, 633, 118, 20);
		panel3.add(label_54);
		
		JLabel label_55 = new JLabel();
		label_55.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/dxfuzanti.png")));
		label_55.setBounds(152, 629, 39, 28);
		panel3.add(label_55);
		
		JLabel label_56 = new JLabel();
		label_56.setBounds(190, 632, 180, 21);
		panel3.add(label_56);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(645, 406, 494, 220);
		panel3.add(scrollPane_4);
		
		JLabel label_57 = new JLabel("Malzeme Bilgisi");
		label_57.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_57.setBounds(641, 372, 138, 20);
		panel3.add(label_57);
		
		JLabel label_58 = new JLabel("Toplam Fiyat");
		label_58.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_58.setBounds(639, 340, 95, 20);
		panel3.add(label_58);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(731, 341, 138, 20);
		panel3.add(textField_23);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(731, 306, 138, 20);
		panel3.add(comboBox_7);
		
		JLabel label_59 = new JLabel("\u00DCr\u00FCn");
		label_59.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_59.setBounds(641, 306, 65, 20);
		panel3.add(label_59);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(901, 307, 138, 20);
		panel3.add(comboBox_8);
		
		JLabel label_60 = new JLabel("Adet");
		label_60.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_60.setBounds(1049, 306, 51, 20);
		panel3.add(label_60);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(1088, 307, 51, 20);
		panel3.add(spinner_2);
		
		JButton button_8 = new JButton("Aktifle\u015Ftir");
		button_8.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/gerial.png")));
		button_8.setBounds(464, 646, 127, 40);
		panel3.add(button_8);
		
		JButton button_9 = new JButton("Kald\u0131r");
		button_9.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/sil3.png")));
		button_9.setBounds(645, 646, 127, 40);
		panel3.add(button_9);
		
		JLabel label_62 = new JLabel("ANA MENU");
		label_62.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				DepoMenu DepoMenu = new DepoMenu();
				DepoMenu.setVisible(true);
			}
		});
		label_62.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/cikis.png")));
		label_62.setForeground(new Color(72, 61, 139));
		label_62.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_62.setBounds(1058, 650, 111, 28);
		panel3.add(label_62);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, -10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_2.setBackground(new Color(60, 179, 113));
		panel_2.setBounds(10, 80, 99, 501);
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
		button.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/yeni.png")));
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
		button_1.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/tamamla.png")));
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
		button_2.setIcon(new ImageIcon(DepoAktifSiparisler.class.getResource("/archive.png")));
		button_2.setFont(new Font("SansSerif", Font.BOLD, 18));
		button_2.setBackground(SystemColor.menu);
		panel_2.add(button_2);
		setUndecorated(true);//remove the frame outline
		setLocationRelativeTo(null);
		
	}
}
