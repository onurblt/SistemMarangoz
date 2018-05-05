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

	public class DepoAlisSiparis extends JFrame {

		private JPanel contentPane;
		private JLabel closeBtn2;
		private JLabel lblNewLabel_3;
		int pX;
		int pY;
		private JLabel label_1;
		private JTable aktifSiparislerTable;
		private JTextField textField_8;
		private JTextField textField_9;
		private JTextField textField_10;
		private JTextField textField_11;
		private JTextField textField_12;
		private JTextField textField_13;
		private JTextField textField_14;
		private JTable table;
		private JTextField textField;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DepoAlisSiparis frame = new DepoAlisSiparis();
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
		public DepoAlisSiparis() {
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
			closeBtn2.setIcon(new ImageIcon(DepoAlisSiparis.class.getResource("/kapat.png")));
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
			label_1.setIcon(new ImageIcon(DepoAlisSiparis.class.getResource("/kucult.png")));
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setForeground(Color.WHITE);
			label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			contentPane.add(label_1);
			
			JPanel icerikPanel = new JPanel();
			icerikPanel.setBackground(new Color(30, 144, 255));
			icerikPanel.setBounds(121, 80, 1135, 686);
			contentPane.add(icerikPanel);
			icerikPanel.setLayout(new CardLayout(0, 0));
			
			JPanel panel2 = new JPanel();
			panel2.setForeground(Color.ORANGE);
			panel2.setBackground(Color.CYAN);
			icerikPanel.add(panel2, "name_105555047486139");
			panel2.setLayout(null);
			
			JLabel label_22 = new JLabel(" Bekleyen Al\u0131\u015F Sipari\u015Fleri");
			label_22.setForeground(new Color(255, 255, 255));
			label_22.setBounds(456, 10, 299, 20);
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
			
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(178, 230, 138, 20);
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
			
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(811, 329, 138, 20);
			panel2.add(textField_9);
			
			JLabel label_25 = new JLabel("Mail Adresi");
			label_25.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_25.setBounds(669, 329, 86, 20);
			panel2.add(label_25);
			
			JLabel label_26 = new JLabel("Telefon2");
			label_26.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_26.setBounds(669, 361, 73, 20);
			panel2.add(label_26);
			
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(811, 362, 138, 20);
			panel2.add(textField_10);
			
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(471, 362, 138, 20);
			panel2.add(textField_11);
			
			textField_12 = new JTextField();
			textField_12.setColumns(10);
			textField_12.setBounds(471, 330, 138, 20);
			panel2.add(textField_12);
			
			JLabel label_27 = new JLabel("Soyad");
			label_27.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_27.setBounds(372, 329, 73, 20);
			panel2.add(label_27);
			
			JLabel label_28 = new JLabel("Telefon");
			label_28.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_28.setBounds(365, 360, 73, 20);
			panel2.add(label_28);
			
			textField_13 = new JTextField();
			textField_13.setColumns(10);
			textField_13.setBounds(178, 360, 138, 20);
			panel2.add(textField_13);
			
			textField_14 = new JTextField();
			textField_14.setColumns(10);
			textField_14.setBounds(178, 329, 138, 20);
			panel2.add(textField_14);
			
			JLabel lblFirmaAd = new JLabel("Firma Ad\u0131");
			lblFirmaAd.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblFirmaAd.setBounds(36, 298, 118, 20);
			panel2.add(lblFirmaAd);
			
			JLabel label_30 = new JLabel("Ad");
			label_30.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_30.setBounds(36, 329, 86, 20);
			panel2.add(label_30);
			
			JLabel label_31 = new JLabel("G\u00F6rev");
			label_31.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_31.setBounds(36, 361, 73, 20);
			panel2.add(label_31);
			
			JSeparator separator_2 = new JSeparator();
			separator_2.setBackground(new Color(32, 178, 170));
			separator_2.setBounds(36, 261, 976, 12);
			panel2.add(separator_2);
			
			JTextArea textArea_1 = new JTextArea();
			textArea_1.setBounds(178, 407, 329, 54);
			panel2.add(textArea_1);
			
			JLabel label_32 = new JLabel("Adres");
			label_32.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_32.setBounds(36, 417, 73, 20);
			panel2.add(label_32);
			
			JSeparator separator_3 = new JSeparator();
			separator_3.setBackground(new Color(32, 178, 170));
			separator_3.setBounds(36, 472, 976, 2);
			panel2.add(separator_3);
			
			JLabel label_37 = new JLabel("Siparis Malzeme Bilgisi");
			label_37.setForeground(Color.WHITE);
			label_37.setFont(new Font("Tahoma", Font.PLAIN, 14));
			label_37.setBounds(372, 474, 138, 20);
			panel2.add(label_37);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(DepoAlisSiparis.class.getResource("/print.png")));
			lblNewLabel.setBounds(1060, 2, 46, 40);
			panel2.add(lblNewLabel);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(73, 505, 813, 157);
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
			
			JButton button_5 = new JButton("Malzeme Giri\u015Fi");
			button_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					dispose();
					DepoMalzemeGiris depoMalzemeGiris = new DepoMalzemeGiris();
					depoMalzemeGiris.setVisible(true);
				}
			});
			button_5.setIcon(new ImageIcon(DepoAlisSiparis.class.getResource("/complete.png")));
			button_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
			button_5.setBounds(914, 560, 160, 57);
			panel2.add(button_5);
			
			JLabel label_35 = new JLabel("");
			label_35.setIcon(new ImageIcon(DepoAlisSiparis.class.getResource("/search.png")));
			label_35.setBounds(326, 298, 46, 20);
			panel2.add(label_35);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(178, 299, 138, 20);
			panel2.add(textField);
			
			JLabel lblTedarikiBilgileri = new JLabel("Tedarik\u00E7i Bilgileri");
			lblTedarikiBilgileri.setForeground(Color.WHITE);
			lblTedarikiBilgileri.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblTedarikiBilgileri.setBounds(375, 267, 138, 20);
			panel2.add(lblTedarikiBilgileri);
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
					
					icerikPanel.removeAll();
					icerikPanel.repaint();
					icerikPanel.revalidate();
					
					icerikPanel.add(panel2);
					icerikPanel.repaint();
					icerikPanel.revalidate();
				}
			});
			button_1.setIcon(new ImageIcon(DepoAlisSiparis.class.getResource("/tamamla.png")));
			button_1.setFont(new Font("SansSerif", Font.BOLD, 18));
			button_1.setBackground(SystemColor.menu);
			panel_2.add(button_1);
			
			JLabel label_2 = new JLabel("ANA MENU");
			label_2.setBounds(1266, 738, 99, 28);
			contentPane.add(label_2);
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					dispose();
					DepoMenu depoMenu = new DepoMenu();
					depoMenu.setVisible(true);
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
