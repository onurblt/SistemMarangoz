package nku.sistemanalizi.marangoz.view;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;
import java.awt.Button;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import com.toedter.calendar.JMonthChooser;

public class PersonelBilgi extends JFrame {

	private JPanel contentPane;
	int pX,pY;
	
	JPanel panelMenu;
	JPanel icerikPanel;
	JPanel panel_2;
	JPanel panel_3;
	JPanel panel_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelBilgi frame = new PersonelBilgi();
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
	public PersonelBilgi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 698);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel frameDrag = new JLabel("");
		frameDrag.setBounds(0, 0, 832, 35);
		frameDrag.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pX = e.getX();
				pY = e.getY();
			}
		});
		frameDrag.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				setLocation(getLocation().x+e.getX()-pX,getLocation().y+e.getY()-pY);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(frameDrag);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(831, 0, 28, 35);
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setState(ICONIFIED);
			}
		});
		label_1.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/kucult.png")));
		label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(857, 0, 28, 35);
		
		label_2.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/kapat.png")));
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label_2);
		
		JLabel lblNewLabel = new JLabel("ANA MENU");
		lblNewLabel.setBounds(741, 659, 134, 28);
		
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/cikis.png")));
		lblNewLabel.setForeground(new Color(72, 61, 139));
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				YoneticiMenu yoneticiMenu = new YoneticiMenu();
				yoneticiMenu.setVisible(true);
			}
		});
		contentPane.add(lblNewLabel);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panelMenu.setBackground(new Color(60, 179, 113));
		panelMenu.setBounds(23, 72, 99, 581);
		contentPane.add(panelMenu);
		panelMenu.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button = new JButton();
		button.setIcon(new ImageIcon(Login.class.getResource("/personelekle.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				icerikPanel.removeAll();
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
				icerikPanel.add(panel_2);
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
			}
		});
		button.setBackground(SystemColor.menu);
		panelMenu.add(button);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/personelara.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				icerikPanel.removeAll();
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
				icerikPanel.add(panel_3);
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 18));
		btnNewButton.setBackground(new Color(240, 240, 240));
		panelMenu.add(btnNewButton);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(PersonelBilgi.class.getResource("/personelmaas.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				icerikPanel.removeAll();
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
				icerikPanel.add(panel_4);
				icerikPanel.repaint();
				icerikPanel.revalidate();
			}
		});
		button_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		button_1.setBackground(SystemColor.menu);
		panelMenu.add(button_1);
		
		icerikPanel = new JPanel();
		icerikPanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		icerikPanel.setBackground(new Color(60, 179, 113));
		icerikPanel.setBounds(156, 72, 676, 581);
		contentPane.add(icerikPanel);
		icerikPanel.setLayout(new CardLayout(0, 0));
		
		panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_2.setBackground(new Color(0, 250, 154));
		icerikPanel.add(panel_2, "name_4516788086034");
		panel_2.setLayout(null);
		
		JLabel lblAd = new JLabel("Ad*");
		lblAd.setBounds(28, 41, 59, 14);
		panel_2.add(lblAd);
		
		textField = new JTextField();
		textField.setBounds(122, 38, 136, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Soyad*");
		label.setBounds(28, 72, 46, 14);
		panel_2.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 69, 136, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_3 = new JLabel("T.C No*");
		label_3.setBounds(28, 103, 59, 14);
		panel_2.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(122, 100, 136, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Do\u011Fum T.");
		lblNewLabel_1.setBounds(28, 136, 64, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel label_4 = new JLabel("Mail Adresi");
		label_4.setBounds(28, 164, 73, 14);
		panel_2.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 161, 136, 20);
		panel_2.add(textField_4);
		
		JLabel label_5 = new JLabel("G\u00F6rev");
		label_5.setBounds(28, 327, 46, 14);
		panel_2.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(122, 324, 136, 20);
		panel_2.add(textField_5);
		
		JLabel label_6 = new JLabel("Maa\u015F");
		label_6.setBounds(28, 358, 46, 14);
		panel_2.add(label_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(122, 355, 136, 20);
		panel_2.add(textField_6);
		
		JLabel label_7 = new JLabel("Adres");
		label_7.setBounds(30, 209, 59, 14);
		panel_2.add(label_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(124, 206, 357, 89);
		panel_2.add(textArea);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(122, 131, 136, 20);
		panel_2.add(dateChooser);
		
		JLabel label_8 = new JLabel("Ýþe Baþlama T.");
		label_8.setBounds(28, 392, 84, 14);
		panel_2.add(label_8);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(122, 386, 136, 20);
		panel_2.add(dateChooser_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(505, 25, 136, 153);
		panel_2.add(lblNewLabel_2);
		
		JLabel label_9 = new JLabel("Foto\u011Fraf");
		label_9.setBackground(new Color(255, 255, 255));
		label_9.setBounds(436, 59, 59, 14);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel();
		label_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_10.setIcon(new ImageIcon(PersonelBilgi.class.getResource("/resimekle.png")));
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(446, 84, 35, 28);
		panel_2.add(label_10);
		
		JButton btnNewButton_1 = new JButton("Ekle");
		btnNewButton_1.setIcon(new ImageIcon(PersonelBilgi.class.getResource("/kaydet.png")));
		btnNewButton_1.setBounds(222, 483, 89, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Kaldýr");
		btnNewButton_2.setIcon(new ImageIcon(PersonelBilgi.class.getResource("/sil.png")));
		btnNewButton_2.setBounds(363, 483, 89, 23);
		panel_2.add(btnNewButton_2);
		
		JButton button_2 = new JButton("G\u00FCncelle");
		button_2.setIcon(new ImageIcon(PersonelBilgi.class.getResource("/guncelle.png")));
		button_2.setBounds(280, 531, 114, 22);
		panel_2.add(button_2);
		
		JLabel lblPersonelKayt = new JLabel("Personel Kay\u0131t");
		lblPersonelKayt.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblPersonelKayt.setBounds(241, 0, 125, 27);
		panel_2.add(lblPersonelKayt);
		
		JButton btnYenile = new JButton("Yeni");
		btnYenile.setIcon(new ImageIcon(PersonelBilgi.class.getResource("/sil2.png")));
		btnYenile.setBounds(292, 438, 89, 23);
		panel_2.add(btnYenile);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 250, 154));
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		icerikPanel.add(panel_3, "name_4532427943942");
		panel_3.setLayout(null);
		
		JLabel label_11 = new JLabel("Ad");
		label_11.setBounds(10, 201, 59, 14);
		panel_3.add(label_11);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(104, 198, 136, 20);
		panel_3.add(textField_3);
		
		JLabel label_12 = new JLabel("Soyad");
		label_12.setBounds(10, 232, 46, 14);
		panel_3.add(label_12);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(104, 229, 136, 20);
		panel_3.add(textField_7);
		
		JLabel label_13 = new JLabel("T.C No");
		label_13.setBounds(10, 263, 59, 14);
		panel_3.add(label_13);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(104, 260, 136, 20);
		panel_3.add(textField_8);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(104, 291, 136, 20);
		panel_3.add(dateChooser_2);
		
		JLabel label_14 = new JLabel("Do\u011Fum T.");
		label_14.setBounds(10, 296, 64, 14);
		panel_3.add(label_14);
		
		JLabel label_15 = new JLabel("Mail Adresi");
		label_15.setBounds(10, 324, 73, 14);
		panel_3.add(label_15);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(104, 321, 136, 20);
		panel_3.add(textField_9);
		
		JLabel label_16 = new JLabel("Adres");
		label_16.setBounds(12, 369, 59, 14);
		panel_3.add(label_16);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(106, 366, 357, 89);
		panel_3.add(textArea_1);
		
		JLabel label_17 = new JLabel("G\u00F6rev");
		label_17.setBounds(10, 487, 46, 14);
		panel_3.add(label_17);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(104, 484, 136, 20);
		panel_3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(104, 515, 136, 20);
		panel_3.add(textField_11);
		
		JLabel label_18 = new JLabel("Maa\u015F");
		label_18.setBounds(10, 518, 46, 14);
		panel_3.add(label_18);
		
		JLabel label_19 = new JLabel("\u0130\u015Fe Ba\u015Flama T.");
		label_19.setBounds(10, 552, 84, 14);
		panel_3.add(label_19);
		
		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(104, 546, 136, 20);
		panel_3.add(dateChooser_3);
		
		JButton button_3 = new JButton("Ekle");
		button_3.setBounds(181, 618, 89, 23);
		panel_3.add(button_3);
		
		JButton button_4 = new JButton("G\u00FCncelle");
		button_4.setBounds(239, 666, 114, 22);
		panel_3.add(button_4);
		
		JButton button_5 = new JButton("Sil");
		button_5.setBounds(322, 618, 89, 23);
		panel_3.add(button_5);
		
		JLabel label_20 = new JLabel("");
		label_20.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
		label_20.setBackground(Color.WHITE);
		label_20.setBounds(487, 185, 136, 153);
		panel_3.add(label_20);
		
		JLabel label_21 = new JLabel("Foto\u011Fraf");
		label_21.setBackground(Color.WHITE);
		label_21.setBounds(418, 219, 59, 14);
		panel_3.add(label_21);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 25, 652, 149);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel label_22 = new JLabel("Personel Bilgi");
		label_22.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		label_22.setBounds(239, 0, 114, 27);
		panel_3.add(label_22);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_4.setBackground(new Color(0, 250, 154));
		icerikPanel.add(panel_4, "name_4703425006362");
		panel_4.setLayout(null);
		
		JLabel label_23 = new JLabel("Personel \u00D6demeleri");
		label_23.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		label_23.setBounds(222, 0, 159, 27);
		panel_4.add(label_23);
		
		Button button_6 = new Button("\u00D6deme Yap");
		button_6.setBounds(322, 531, 101, 22);
		panel_4.add(button_6);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 25, 652, 149);
		panel_4.add(scrollPane_1);
		
		JLabel label_24 = new JLabel("Ad");
		label_24.setBounds(10, 201, 59, 14);
		panel_4.add(label_24);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(104, 198, 136, 20);
		panel_4.add(textField_12);
		
		JLabel label_25 = new JLabel("Soyad");
		label_25.setBounds(10, 232, 46, 14);
		panel_4.add(label_25);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(104, 229, 136, 20);
		panel_4.add(textField_13);
		
		JLabel label_26 = new JLabel("T.C No");
		label_26.setBounds(10, 263, 59, 14);
		panel_4.add(label_26);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(104, 260, 136, 20);
		panel_4.add(textField_14);
		
		JDateChooser dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(104, 291, 136, 20);
		panel_4.add(dateChooser_4);
		
		JLabel label_27 = new JLabel("Do\u011Fum T.");
		label_27.setBounds(10, 296, 64, 14);
		panel_4.add(label_27);
		
		JLabel label_28 = new JLabel("Mail Adresi");
		label_28.setBounds(10, 324, 73, 14);
		panel_4.add(label_28);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(104, 321, 136, 20);
		panel_4.add(textField_15);
		
		JLabel label_30 = new JLabel("");
		label_30.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
		label_30.setBackground(Color.WHITE);
		label_30.setBounds(487, 185, 136, 153);
		panel_4.add(label_30);
		
		JLabel label_31 = new JLabel("Foto\u011Fraf");
		label_31.setBackground(Color.WHITE);
		label_31.setBounds(418, 219, 59, 14);
		panel_4.add(label_31);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(104, 356, 136, 20);
		panel_4.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(104, 387, 136, 20);
		panel_4.add(textField_17);
		
		JDateChooser dateChooser_5 = new JDateChooser();
		dateChooser_5.setBounds(104, 418, 136, 20);
		panel_4.add(dateChooser_5);
		
		JLabel label_32 = new JLabel("G\u00F6rev");
		label_32.setBounds(10, 359, 46, 14);
		panel_4.add(label_32);
		
		JLabel label_33 = new JLabel("Maa\u015F");
		label_33.setBounds(10, 390, 46, 14);
		panel_4.add(label_33);
		
		JLabel label_34 = new JLabel("\u0130\u015Fe Ba\u015Flama T.");
		label_34.setBounds(10, 424, 84, 14);
		panel_4.add(label_34);
		
		JLabel label_29 = new JLabel("\u00C7al\u0131\u015Fmad\u0131\u011F\u0131 G\u00FCn Say\u0131s\u0131");
		label_29.setBounds(216, 460, 147, 14);
		panel_4.add(label_29);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(363, 457, 136, 20);
		panel_4.add(textField_18);
		
		JLabel label_35 = new JLabel("Verilecek Miktar");
		label_35.setBounds(216, 488, 147, 14);
		panel_4.add(label_35);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(363, 485, 136, 20);
		panel_4.add(textField_19);
		
		JLabel lblPersonelBilgileri = new JLabel("PERSONEL B\u0130LG\u0130LER\u0130");
		lblPersonelBilgileri.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblPersonelBilgileri.setBackground(new Color(60, 179, 113));
		lblPersonelBilgileri.setBounds(349, 32, 276, 28);
		contentPane.add(lblPersonelBilgileri);
		
		
		
		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
}
