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

public class UretimMuduruSiparisler extends JFrame {

	private JPanel contentPane;
	private JLabel closeBtn2;
	private JLabel lblNewLabel_3;
	int pX;
	int pY;
	private JLabel label_1;
	private JTable butunSiparislerTable;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTable butunSiparislerMalzemeler;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UretimMuduruSiparisler frame = new UretimMuduruSiparisler();
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
	public UretimMuduruSiparisler() {
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
		closeBtn2.setIcon(new ImageIcon(UretimMuduruSiparisler.class.getResource("/kapat.png")));
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
		label_1.setIcon(new ImageIcon(UretimMuduruSiparisler.class.getResource("/kucult.png")));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label_1);
		
		JPanel icerikPanel = new JPanel();
		icerikPanel.setBackground(new Color(30, 144, 255));
		icerikPanel.setBounds(121, 80, 1135, 686);
		contentPane.add(icerikPanel);
		icerikPanel.setLayout(new CardLayout(0, 0));
		
		JPanel panel3 = new JPanel();
		panel3.setForeground(Color.RED);
		panel3.setBackground(Color.CYAN);
		icerikPanel.add(panel3, "name_105555074451865");
		panel3.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 42, 1099, 170);
		panel3.add(scrollPane_3);
		
		butunSiparislerTable = new JTable();
		butunSiparislerTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Siparis Kodu","Firma Adý","Ad","Soyad","Ünvan","Toplam Fiyat","Kayýt Tarihi","Teslimat Tarihi"
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
		separator_5.setBounds(41, 472, 976, 2);
		panel3.add(separator_5);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(418, 393, 329, 68);
		panel3.add(textArea_2);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(476, 348, 138, 20);
		panel3.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(476, 316, 138, 20);
		panel3.add(textField_17);
		
		JLabel label_38 = new JLabel("Mail Adresi");
		label_38.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_38.setBounds(674, 315, 86, 20);
		panel3.add(label_38);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(816, 315, 138, 20);
		panel3.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(816, 348, 138, 20);
		panel3.add(textField_19);
		
		JLabel label_39 = new JLabel("Telefon2");
		label_39.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_39.setBounds(674, 347, 73, 20);
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
		label_41.setBounds(377, 315, 73, 20);
		panel3.add(label_41);
		
		JLabel label_43 = new JLabel("Telefon");
		label_43.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_43.setBounds(370, 346, 73, 20);
		panel3.add(label_43);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(183, 346, 138, 20);
		panel3.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(183, 315, 138, 20);
		panel3.add(textField_21);
		
		JLabel label_44 = new JLabel("M\u00FC\u015Fteri(Firma Ad\u0131)");
		label_44.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_44.setBounds(41, 284, 118, 20);
		panel3.add(label_44);
		
		JLabel label_45 = new JLabel("Ad");
		label_45.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_45.setBounds(41, 315, 86, 20);
		panel3.add(label_45);
		
		JLabel label_46 = new JLabel("G\u00F6rev");
		label_46.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_46.setBounds(41, 347, 73, 20);
		panel3.add(label_46);
		
		JLabel label_47 = new JLabel("Adres");
		label_47.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_47.setBounds(276, 403, 73, 20);
		panel3.add(label_47);
		
		JLabel label_48 = new JLabel("Sipari\u015F \u0130\u00E7erik Bilgisi");
		label_48.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_48.setBounds(78, 474, 138, 20);
		panel3.add(label_48);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(78, 505, 827, 156);
		panel3.add(scrollPane_4);
		
		butunSiparislerMalzemeler = new JTable();
		butunSiparislerMalzemeler.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Sýra No", "Ürün Kodu","Ürün Adý","Adet" ,"Birim Fiyat", "Top.Fiyat", "Açýklama"
			}
		));
		scrollPane_4.setViewportView(butunSiparislerMalzemeler);
		
		JLabel label_35 = new JLabel("");
		label_35.setIcon(new ImageIcon(UretimMuduruSiparisler.class.getResource("/search.png")));
		label_35.setBounds(335, 283, 35, 21);
		panel3.add(label_35);
		
		JLabel label = new JLabel("Bekleyen Sat\u0131\u015F Sipari\u015Fleri");
		label.setForeground(new Color(255, 255, 255));
		label.setBackground(new Color(255, 255, 255));
		label.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		label.setBounds(476, 11, 235, 20);
		panel3.add(label);
		
		JButton button = new JButton("\u00DCretimi Tamamla!\r\n");
		button.setIcon(new ImageIcon(UretimMuduruSiparisler.class.getResource("/complete.png")));
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button.setBounds(926, 562, 174, 57);
		panel3.add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(183, 284, 138, 20);
		panel3.add(textField);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, -10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_2.setBackground(new Color(60, 179, 113));
		panel_2.setBounds(10, 80, 99, 648);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button_1 = new JButton();
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
		
			}
		});
		button_1.setIcon(new ImageIcon(UretimMuduruSiparisler.class.getResource("/tamamla.png")));
		button_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		button_1.setBackground(SystemColor.menu);
		panel_2.add(button_1);
		
		JLabel label_2 = new JLabel("ANA MENU");
		label_2.setBounds(1266, 743, 99, 28);
		contentPane.add(label_2);
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			UretimMuduruMenu menu = new UretimMuduruMenu();
			menu.setVisible(true);
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
