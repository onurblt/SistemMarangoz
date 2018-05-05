package nku.sistemanalizi.marangoz.view;
	/**
	 * Create the frame.
	 */import java.awt.EventQueue;
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
	 import javax.swing.JComboBox;
	 import javax.swing.DefaultComboBoxModel;
	 import javax.swing.table.DefaultTableModel;
import java.awt.Label;
import java.awt.TextField;

	 public class YoneticiGiderler extends JFrame {

	 	private JPanel contentPane;
	 	int pX,pY;
	 	
	 	JPanel panelMenu;
	 	JPanel icerikPanel;
	 	JPanel panel_3;
	 	private JTable table_1;
	 	private JTextField textField_8;
	 	private JTextField textField;
	 	private JTextField textField_1;
	 	private JTextField textField_2;
	 	private JTextField textField_3;
	 	private JTextField textField_4;
	 	private JTextField textField_5;
	 	private JTextField textField_6;
	 	
	 	/**
	 	 * Launch the application.
	 	 */
	 	public static void main(String[] args) {
	 		EventQueue.invokeLater(new Runnable() {
	 			public void run() {
	 				try {
	 					YoneticiGiderler frame = new YoneticiGiderler();
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
	 	public YoneticiGiderler() {
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
	 		lblNewLabel.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/cikis.png")));
	 		lblNewLabel.setForeground(new Color(72, 61, 139));
	 		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	 		lblNewLabel.addMouseListener(new MouseAdapter() {
	 			@Override
	 			public void mousePressed(MouseEvent e) {
	 				dispose();
	 				YoneticiMenu menu = new YoneticiMenu();
	 				menu.setVisible(true);
	 			}
	 		});
	 		contentPane.add(lblNewLabel);
	 		
	 		JPanel panelMenu = new JPanel();
	 		panelMenu.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
	 		panelMenu.setBackground(new Color(60, 179, 113));
	 		panelMenu.setBounds(23, 72, 99, 581);
	 		contentPane.add(panelMenu);
	 		panelMenu.setLayout(new GridLayout(0, 1, 0, 0));
	 		
	 		JButton btnNewButton = new JButton();
	 		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/personelmaas.png")));
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
	 		
	 		
	 		
	 		icerikPanel = new JPanel();
	 		icerikPanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
	 		icerikPanel.setBackground(new Color(60, 179, 113));
	 		icerikPanel.setBounds(156, 72, 676, 581);
	 		contentPane.add(icerikPanel);
	 		icerikPanel.setLayout(new CardLayout(0, 0));
	 		
	 		panel_3 = new JPanel();
	 		panel_3.setBackground(new Color(0, 250, 154));
	 		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
	 		icerikPanel.add(panel_3, "name_4532427943942");
	 		panel_3.setLayout(null);
	 		
	 		JButton button_3 = new JButton("Ekle");
	 		button_3.setBounds(181, 618, 89, 23);
	 		panel_3.add(button_3);
	 		
	 		JButton button_4 = new JButton("G\u00FCncelle");
	 		button_4.setBounds(239, 666, 114, 22);
	 		panel_3.add(button_4);
	 		
	 		JButton button_5 = new JButton("Sil");
	 		button_5.setBounds(322, 618, 89, 23);
	 		panel_3.add(button_5);
	 		
	 		JDateChooser dateChooser = new JDateChooser();
	 		dateChooser.setBounds(469, 53, 124, 20);
	 		panel_3.add(dateChooser);
	 		
	 		Button button_6 = new Button("Temizle");
	 		button_6.setBounds(521, 457, 99, 22);
	 		panel_3.add(button_6);
	 		
	 		Button button_7 = new Button("Kaydet");
	 		button_7.setBounds(392, 457, 99, 22);
	 		panel_3.add(button_7);
	 		
	 		JComboBox comboBox = new JComboBox();
	 		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "1-Personel \u00D6demeleri", "2-Elektrik", "3-Su", "4-Di\u011Fer Masraflar"}));
	 		comboBox.setBounds(239, 77, 182, 23);
	 		panel_3.add(comboBox);
	 		
	 		JLabel lblNewLabel_1 = new JLabel("Ad");
	 		lblNewLabel_1.setBounds(124, 138, 46, 14);
	 		panel_3.add(lblNewLabel_1);
	 		
	 		JLabel label_12 = new JLabel("Soyad");
	 		label_12.setBounds(124, 170, 68, 14);
	 		panel_3.add(label_12);
	 		
	 		JLabel label_13 = new JLabel("A\u00E7\u0131klama");
	 		label_13.setBounds(124, 209, 83, 14);
	 		panel_3.add(label_13);
	 		
	 		JLabel lblTutar = new JLabel("Tutar");
	 		lblTutar.setBounds(124, 249, 83, 14);
	 		panel_3.add(lblTutar);
	 		
	 		textField_8 = new JTextField();
	 		textField_8.setBounds(237, 135, 163, 20);
	 		panel_3.add(textField_8);
	 		textField_8.setColumns(10);
	 		
	 		textField = new JTextField();
	 		textField.setColumns(10);
	 		textField.setBounds(237, 167, 163, 20);
	 		panel_3.add(textField);
	 		
	 		textField_1 = new JTextField();
	 		textField_1.setColumns(10);
	 		textField_1.setBounds(237, 206, 163, 20);
	 		panel_3.add(textField_1);
	 		
	 		textField_2 = new JTextField();
	 		textField_2.setColumns(10);
	 		textField_2.setBounds(237, 246, 163, 20);
	 		panel_3.add(textField_2);
	 		
	 		JLabel lblGiderOlutur = new JLabel("G\u0130DER OLU\u015ETUR");
	 		lblGiderOlutur.setForeground(new Color(255, 255, 255));
	 		lblGiderOlutur.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
	 		lblGiderOlutur.setBackground(new Color(60, 179, 113));
	 		lblGiderOlutur.setBounds(187, 11, 276, 28);
	 		panel_3.add(lblGiderOlutur);
	 		
	 		JLabel lblNewLabel_2 = new JLabel("Gider T\u00FCr\u00FC");
	 		lblNewLabel_2.setBounds(124, 81, 68, 14);
	 		panel_3.add(lblNewLabel_2);
	 		
	 		JPanel panel = new JPanel();
	 		panel.setLayout(null);
	 		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
	 		panel.setBackground(new Color(0, 250, 154));
	 		icerikPanel.add(panel, "name_74032977937217");
	 		
	 		JButton button = new JButton("Ekle");
	 		button.setBounds(181, 618, 89, 23);
	 		panel.add(button);
	 		
	 		JButton button_1 = new JButton("G\u00FCncelle");
	 		button_1.setBounds(239, 666, 114, 22);
	 		panel.add(button_1);
	 		
	 		JButton button_2 = new JButton("Sil");
	 		button_2.setBounds(322, 618, 89, 23);
	 		panel.add(button_2);
	 		
	 		JComboBox comboBox_2 = new JComboBox();
	 		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "1-Personel \u00D6demeleri", "2-Malzeme \u00D6demeleri", "3-Elektrik", "4-Su", "5-Di\u011Fer Masraflar"}));
	 		comboBox_2.setBounds(137, 69, 167, 20);
	 		panel.add(comboBox_2);
	 		
	 		JLabel label = new JLabel("Tarih Aral\u0131\u011F\u0131");
	 		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
	 		label.setBounds(335, 71, 73, 14);
	 		panel.add(label);
	 		
	 		JDateChooser dateChooser_2 = new JDateChooser();
	 		dateChooser_2.setBounds(419, 68, 95, 20);
	 		panel.add(dateChooser_2);
	 		
	 		JDateChooser dateChooser_3 = new JDateChooser();
	 		dateChooser_3.setBounds(544, 68, 95, 20);
	 		panel.add(dateChooser_3);
	 		
	 		JLabel label_3 = new JLabel("-");
	 		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
	 		label_3.setBounds(524, 71, 16, 14);
	 		panel.add(label_3);
	 		
	 		Button button_8 = new Button("G\u00FCncelle");
	 		button_8.setBounds(460, 389, 70, 22);
	 		panel.add(button_8);
	 		
	 		Button button_9 = new Button("Sil");
	 		button_9.setBounds(460, 429, 70, 22);
	 		panel.add(button_9);
	 		
	 		JScrollPane scrollPane_1 = new JScrollPane();
	 		scrollPane_1.setBounds(64, 165, 540, 168);
	 		panel.add(scrollPane_1);
	 		
	 		JButton btnNewButton_1 = new JButton("");
	 		btnNewButton_1.setIcon(new ImageIcon(YoneticiGiderler.class.getResource("/siparisbilgisi.png")));
	 		btnNewButton_1.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				icerikPanel.removeAll();
	 				icerikPanel.repaint();
	 				icerikPanel.revalidate();
	 				
	 				icerikPanel.add(panel);
	 				icerikPanel.repaint();
	 				icerikPanel.revalidate();
	 			}
	 		});
	 		panelMenu.add(btnNewButton_1);
	 		
	 		
	 		
	 		table_1 = new JTable();
	 		table_1.setModel(new DefaultTableModel(
	 			new Object[][] {
	 			},
	 			new String[] {
	 					"Tutar","Ödeme Tarihi","Açýklama","Gider Türü"
	 			}
	 		));
	 		scrollPane_1.setViewportView(table_1);
	 		
	 		JLabel lblAd = new JLabel("Ad");
	 		lblAd.setBounds(76, 359, 62, 14);
	 		panel.add(lblAd);
	 		
	 		textField_3 = new JTextField();
	 		textField_3.setBounds(161, 356, 174, 20);
	 		panel.add(textField_3);
	 		textField_3.setColumns(10);
	 		
	 		JLabel label_4 = new JLabel("Soyad");
	 		label_4.setBounds(76, 397, 62, 14);
	 		panel.add(label_4);
	 		
	 		textField_4 = new JTextField();
	 		textField_4.setColumns(10);
	 		textField_4.setBounds(161, 389, 174, 20);
	 		panel.add(textField_4);
	 		
	 		JLabel label_5 = new JLabel("A\u00E7\u0131klama");
	 		label_5.setBounds(76, 437, 62, 14);
	 		panel.add(label_5);
	 		
	 		JLabel label_6 = new JLabel("Tutar");
	 		label_6.setBounds(76, 476, 62, 14);
	 		panel.add(label_6);
	 		
	 		textField_5 = new JTextField();
	 		textField_5.setColumns(10);
	 		textField_5.setBounds(161, 431, 174, 20);
	 		panel.add(textField_5);
	 		
	 		textField_6 = new JTextField();
	 		textField_6.setColumns(10);
	 		textField_6.setBounds(161, 473, 174, 20);
	 		panel.add(textField_6);
	 		
	 		JLabel lblGiderlerListesi = new JLabel("G\u0130DERLER L\u0130STES\u0130");
	 		lblGiderlerListesi.setForeground(Color.WHITE);
	 		lblGiderlerListesi.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
	 		lblGiderlerListesi.setBackground(new Color(60, 179, 113));
	 		lblGiderlerListesi.setBounds(209, 11, 276, 28);
	 		panel.add(lblGiderlerListesi);
	 		
	 		JLabel lblNewLabel_3 = new JLabel("Gider T\u00FCr\u00FC");
	 		lblNewLabel_3.setBounds(64, 72, 74, 14);
	 		panel.add(lblNewLabel_3);
	 		
	 		
	 		
	 		
	 		setUndecorated(true);
	 		setLocationRelativeTo(null);
	 		
	 	}
	 }

	
