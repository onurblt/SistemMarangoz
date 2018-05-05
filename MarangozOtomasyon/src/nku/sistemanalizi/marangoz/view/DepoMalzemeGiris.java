package nku.sistemanalizi.marangoz.view;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//
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
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DepoMalzemeGiris extends JFrame {

	private JPanel contentPane;
	int pX,pY;
	
	JPanel panelMenu;
	JPanel icerikPanel;
	JPanel panel_2;
	JPanel panel_3;
	private JTextField txtTartlcak;
	private JTable malzemeBilgiTable;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTable malzemeKayitTable;
	private JTable faturaNoMalzemeTable;
	private JTextField txtTartlcak_1;
	private JTextField textField_2;
	private JTextField textField_1;
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
					DepoMalzemeGiris frame = new DepoMalzemeGiris();
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
	public DepoMalzemeGiris() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 698);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel frameDrag = new JLabel();
		frameDrag.setBounds(0, 0, 919, 35);
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
		label_1.setBounds(931, 0, 28, 35);
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
		label_2.setBounds(957, 0, 28, 35);
		
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
		lblNewLabel.setBounds(825, 664, 134, 28);
		
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/cikis.png")));
		lblNewLabel.setForeground(new Color(72, 61, 139));
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				DepoMenu depomenu = new DepoMenu();
				depomenu.setVisible(true);
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
		button.setIcon(new ImageIcon(DepoMalzemeGiris.class.getResource("/personelekle.png")));
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
		btnNewButton.setIcon(new ImageIcon(DepoMalzemeGiris.class.getResource("/personelara.png")));
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
		icerikPanel.setBounds(156, 72, 776, 581);
		contentPane.add(icerikPanel);
		icerikPanel.setLayout(new CardLayout(0, 0));
		
		panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_2.setBackground(new Color(0, 250, 154));
		icerikPanel.add(panel_2, "name_4516788086034");
		panel_2.setLayout(null);
		
		
		JLabel lblAd = new JLabel("Belge No");
		lblAd.setBounds(29, 240, 96, 14);
		panel_2.add(lblAd);
		
		txtTartlcak = new JTextField();
		txtTartlcak.setText("Tart\u0131\u015F\u0131lcak(\u0130kisinden biri)");
		txtTartlcak.setBounds(135, 237, 136, 20);
		panel_2.add(txtTartlcak);
		txtTartlcak.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Kaydet");
		btnNewButton_1.setBounds(501, 531, 105, 23);
		btnNewButton_1.setIcon(new ImageIcon(DepoMalzemeGiris.class.getResource("/kaydet.png")));
		panel_2.add(btnNewButton_1);
		
		JLabel lblMusteriKayýt = new JLabel("Malzeme Giri\u015Fi");
		lblMusteriKayýt.setForeground(new Color(255, 255, 255));
		lblMusteriKayýt.setBounds(284, 11, 214, 27);
		lblMusteriKayýt.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		panel_2.add(lblMusteriKayýt);
		
		JButton btnNewButton_3 = new JButton("Temizle");
		btnNewButton_3.setBounds(628, 531, 107, 23);
		btnNewButton_3.setIcon(new ImageIcon(DepoMalzemeGiris.class.getResource("/sil2.png")));
		panel_2.add(btnNewButton_3);
		
		JLabel label = new JLabel("Tarih");
		label.setBounds(511, 268, 96, 14);
		panel_2.add(label);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(575, 265, 136, 20);
		panel_2.add(dateChooser);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 308, 725, 199);
		panel_2.add(scrollPane_1);
		
		malzemeKayitTable = new JTable();
		malzemeKayitTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Malzeme Kodu", "Malzeme Adý", "Ýstenen Adet","Gelen Adet","Kalan Adet"
			}
		));
		scrollPane_1.setViewportView(malzemeKayitTable);
		
		JLabel label_4 = new JLabel("Siparis No");
		label_4.setBounds(29, 271, 96, 14);
		panel_2.add(label_4);
		
		txtTartlcak_1 = new JTextField();
		txtTartlcak_1.setText("Tart\u0131\u015F\u0131lcak(\u0130kisinden biri)");
		txtTartlcak_1.setColumns(10);
		txtTartlcak_1.setBounds(135, 265, 136, 20);
		panel_2.add(txtTartlcak_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(DepoMalzemeGiris.class.getResource("/search.png")));
		lblNewLabel_2.setBounds(296, 262, 58, 17);
		panel_2.add(lblNewLabel_2);
		
		JLabel label_6 = new JLabel("Malzeme Ad\u0131");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(27, 59, 90, 14);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("Ebat");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(27, 97, 90, 14);
		panel_2.add(label_7);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 92, 125, 23);
		panel_2.add(textField_1);
		
		JLabel label_8 = new JLabel("Cinsi");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(27, 136, 90, 14);
		panel_2.add(label_8);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(135, 130, 125, 23);
		panel_2.add(textField_4);
		
		JLabel label_10 = new JLabel("Renk");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_10.setBounds(27, 174, 90, 14);
		panel_2.add(label_10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(135, 168, 125, 23);
		panel_2.add(textField_5);
		
		JLabel label_12 = new JLabel("Fiyat");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_12.setBounds(27, 212, 90, 14);
		panel_2.add(label_12);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(135, 206, 125, 23);
		panel_2.add(textField_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(135, 57, 125, 24);
		panel_2.add(comboBox);
		
		
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
		scrollPane.setBounds(20, 42, 731, 167);
		panel_3.add(scrollPane);
		
		malzemeBilgiTable = new JTable();
		malzemeBilgiTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Belge No","Siparis No", "Tedarikçi","Tarih",
			}
		));
		scrollPane.setViewportView(malzemeBilgiTable);
		
		JLabel label_22 = new JLabel("Malzeme Giri\u015Fleri Listesi");
		label_22.setForeground(new Color(255, 255, 255));
		label_22.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		label_22.setBounds(297, 4, 291, 27);
		panel_3.add(label_22);
		
		JLabel label_9 = new JLabel("Belge No");
		label_9.setBounds(21, 241, 96, 14);
		panel_3.add(label_9);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(152, 238, 136, 20);
		panel_3.add(textField_3);
		
		JLabel label_11 = new JLabel("Tarih");
		label_11.setBounds(21, 331, 59, 14);
		panel_3.add(label_11);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(152, 300, 136, 20);
		panel_3.add(textField_7);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(DepoMalzemeGiris.class.getResource("/search.png")));
		lblNewLabel_1.setBounds(318, 236, 35, 32);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblFirmaAd = new JLabel("Firma Ad\u0131");
		lblFirmaAd.setBounds(21, 306, 121, 14);
		panel_3.add(lblFirmaAd);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(20, 390, 731, 125);
		panel_3.add(scrollPane_2);
		
		faturaNoMalzemeTable = new JTable();
		faturaNoMalzemeTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Malzeme Kodu", "Malzeme Adý", "Ýstenen Adet","Gelen Adet","Kalan Adet"
			}
		));
		scrollPane_2.setViewportView(faturaNoMalzemeTable);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(152, 331, 136, 20);
		panel_3.add(dateChooser_1);
		
		JLabel label_5 = new JLabel("Siparis No");
		label_5.setBounds(20, 272, 96, 14);
		panel_3.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(151, 269, 136, 20);
		panel_3.add(textField_2);
		
		JButton btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.setBounds(531, 530, 89, 23);
		panel_3.add(btnGncelle);
		
		JButton button_1 = new JButton("Sil");
		button_1.setBounds(662, 530, 89, 23);
		panel_3.add(button_1);
		
		

		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
}
