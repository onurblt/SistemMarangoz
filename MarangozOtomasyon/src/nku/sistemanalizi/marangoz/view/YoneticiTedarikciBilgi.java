package nku.sistemanalizi.marangoz.view;



//public class YoneticiTedarikciBilgi extends JFrame {

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

public class YoneticiTedarikciBilgi extends JFrame {

	private JPanel contentPane;
	int pX,pY;
	
	JPanel panelMenu;
	JPanel icerikPanel;
	JPanel panel_2;
	JPanel panel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_20;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_21;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoneticiTedarikciBilgi frame = new YoneticiTedarikciBilgi();
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
	public YoneticiTedarikciBilgi() {
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
		button.setIcon(new ImageIcon(YoneticiTedarikciBilgi.class.getResource("/personelekle.png")));
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
		btnNewButton.setIcon(new ImageIcon(YoneticiTedarikciBilgi.class.getResource("/personelara.png")));
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
		
		panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_2.setBackground(new Color(0, 250, 154));
		icerikPanel.add(panel_2, "name_4516788086034");
		panel_2.setLayout(null);
		
		JLabel lblAd = new JLabel("Ad*");
		lblAd.setBounds(28, 72, 59, 14);
		panel_2.add(lblAd);
		
		textField = new JTextField();
		textField.setBounds(122, 38, 136, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Soyad*");
		label.setBounds(28, 105, 46, 14);
		panel_2.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 69, 136, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_4 = new JLabel("Mail Adresi");
		label_4.setBounds(28, 231, 73, 14);
		panel_2.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 228, 136, 20);
		panel_2.add(textField_4);
		
		JLabel label_7 = new JLabel("Adres");
		label_7.setBounds(30, 276, 59, 14);
		panel_2.add(label_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(124, 273, 357, 89);
		panel_2.add(textArea);
		
		JButton btnNewButton_1 = new JButton("Kaydet");
		btnNewButton_1.setIcon(new ImageIcon(YoneticiTedarikciBilgi.class.getResource("/kaydet.png")));
		btnNewButton_1.setBounds(241, 472, 109, 23);
		panel_2.add(btnNewButton_1);
		
		JLabel lbltedarikKayt = new JLabel("Tedarikçi Kay\u0131t");
		lbltedarikKayt.setForeground(new Color(255, 255, 255));
		lbltedarikKayt.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		lbltedarikKayt.setBounds(241, 0, 187, 27);
		panel_2.add(lbltedarikKayt);
		
		JLabel label_3 = new JLabel("\u00DCnvan");
		label_3.setBounds(28, 136, 46, 14);
		panel_2.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 133, 136, 20);
		panel_2.add(textField_2);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(122, 102, 136, 20);
		panel_2.add(textField_20);
		
		JLabel label_5 = new JLabel("Telefon");
		label_5.setBounds(28, 167, 73, 14);
		panel_2.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(122, 164, 136, 20);
		panel_2.add(textField_5);
		
		JLabel label_6 = new JLabel("Telefon2");
		label_6.setBounds(28, 198, 73, 14);
		panel_2.add(label_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(122, 195, 136, 20);
		panel_2.add(textField_6);
		
		JLabel label_9 = new JLabel("Firma Ad\u0131*");
		label_9.setBounds(28, 41, 59, 14);
		panel_2.add(label_9);
		
		JButton btnYenile = new JButton("Temizle");
		btnYenile.setIcon(new ImageIcon(YoneticiTedarikciBilgi.class.getResource("/sil2.png")));
		btnYenile.setBounds(427, 472, 102, 23);
		panel_2.add(btnYenile);
		
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 25, 652, 149);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel label_22 = new JLabel("Tedarik\u00E7i Listesi");
		label_22.setForeground(new Color(255, 255, 255));
		label_22.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		label_22.setBounds(239, 0, 172, 27);
		panel_3.add(label_22);
		
		JLabel label_8 = new JLabel("Ad*");
		label_8.setBounds(25, 250, 59, 14);
		panel_3.add(label_8);
		
		JLabel label_10 = new JLabel("Soyad*");
		label_10.setBounds(25, 275, 46, 14);
		panel_3.add(label_10);
		
		JLabel label_12 = new JLabel("\u00DCnvan");
		label_12.setBounds(25, 311, 46, 14);
		panel_3.add(label_12);
		
		JLabel label_13 = new JLabel("Telefon");
		label_13.setBounds(25, 342, 73, 14);
		panel_3.add(label_13);
		
		JLabel label_14 = new JLabel("Telefon2");
		label_14.setBounds(25, 373, 73, 14);
		panel_3.add(label_14);
		
		JLabel label_15 = new JLabel("Mail Adresi");
		label_15.setBounds(25, 406, 73, 14);
		panel_3.add(label_15);
		
		JLabel label_16 = new JLabel("Adres");
		label_16.setBounds(27, 451, 59, 14);
		panel_3.add(label_16);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(121, 448, 357, 89);
		panel_3.add(textArea_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(119, 403, 136, 20);
		panel_3.add(textField_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(119, 370, 136, 20);
		panel_3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(119, 339, 136, 20);
		panel_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(119, 308, 136, 20);
		panel_3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(119, 277, 136, 20);
		panel_3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(119, 244, 136, 20);
		panel_3.add(textField_11);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(119, 213, 136, 20);
		panel_3.add(textField_21);
		
		JLabel label_11 = new JLabel("Firma Ad\u0131*");
		label_11.setBounds(25, 216, 59, 14);
		panel_3.add(label_11);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon(YoneticiTedarikciBilgi.class.getResource("/search.png")));
		label_17.setBounds(286, 216, 46, 14);
		panel_3.add(label_17);
		
		JButton btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.setBounds(527, 447, 89, 23);
		panel_3.add(btnGncelle);
		
		JButton button_2 = new JButton("Sil");
		button_2.setBounds(527, 500, 89, 23);
		panel_3.add(button_2);
		
		
		
		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
}
