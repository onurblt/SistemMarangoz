package nku.sistemanalizi.marangoz.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

//public class UretimMuduruUrun extends JFrame {
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
import java.awt.Scrollbar;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;

import javafx.scene.control.ScrollBar;

import java.awt.Button;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;

public class UretimMuduruUrun extends JFrame {

	private JPanel contentPane;
	int pX,pY;
	
	JPanel panelMenu;
	JPanel icerikPanel;
	JPanel panel1;
	JPanel panel2;
	private JTextField textFieldModelAdi1;
	private JTable tableModelBilgi1;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTable table_1;
	private JTextField textField_5;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UretimMuduruUrun frame = new UretimMuduruUrun();
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
	public UretimMuduruUrun() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 698);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel frameDrag = new JLabel();
		frameDrag.setBounds(10, 0, 832, 35);
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
		
		JLabel BtnMinimize = new JLabel("");
		BtnMinimize.setBounds(831, 0, 28, 35);
		BtnMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setState(ICONIFIED);
			}
		});
		BtnMinimize.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/kucult.png")));
		BtnMinimize.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	
		BtnMinimize.setHorizontalAlignment(SwingConstants.CENTER);
		BtnMinimize.setForeground(Color.WHITE);
		BtnMinimize.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(BtnMinimize);
		
		JLabel BtnClose = new JLabel("");
		BtnClose.setBounds(857, 0, 28, 35);
		
		BtnClose.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/kapat.png")));
		BtnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		BtnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnClose.setForeground(new Color(255, 255, 255));
		BtnClose.setHorizontalAlignment(SwingConstants.CENTER);
		BtnClose.setForeground(Color.WHITE);
		BtnClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(BtnClose);
		
		JLabel exitLabel = new JLabel("ANA MENU");
		exitLabel.setBounds(741, 659, 134, 28);
		
		exitLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		exitLabel.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/cikis.png")));
		exitLabel.setForeground(new Color(72, 61, 139));
		exitLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exitLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				UretimMuduruMenu UretimMuduruMenu = new UretimMuduruMenu();
				UretimMuduruMenu.setVisible(true);
			}
		});
		contentPane.add(exitLabel);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panelMenu.setBackground(new Color(60, 179, 113));
		panelMenu.setBounds(23, 72, 99, 581);
		contentPane.add(panelMenu);
		panelMenu.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton menuBtn1 = new JButton();
		menuBtn1.setIcon(new ImageIcon(UretimMuduruUrun.class.getResource("/personelekle.png")));
		menuBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				icerikPanel.removeAll();
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
				icerikPanel.add(panel1);
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
			}
		});
		menuBtn1.setBackground(SystemColor.menu);
		panelMenu.add(menuBtn1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				icerikPanel.removeAll();
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
				icerikPanel.add(panel2);
				icerikPanel.repaint();
				icerikPanel.revalidate();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(UretimMuduruUrun.class.getResource("/personelara.png")));
		panelMenu.add(btnNewButton_1);
		
		icerikPanel = new JPanel();
		icerikPanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		icerikPanel.setBackground(new Color(60, 179, 113));
		icerikPanel.setBounds(156, 72, 676, 581);
		contentPane.add(icerikPanel);
		icerikPanel.setLayout(new CardLayout(0, 0));
		
		panel1 = new JPanel();
		panel1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel1.setBackground(new Color(0, 250, 154));
		icerikPanel.add(panel1, "name_4516788086034");
		panel1.setLayout(null);
		
		JComboBox comboBoxKategori1 = new JComboBox();
		comboBoxKategori1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxKategori1.setModel(new DefaultComboBoxModel(new String[] {"Kategori Se\u00E7iniz"}));
		comboBoxKategori1.setBounds(57, 52, 204, 27);
		panel1.add(comboBoxKategori1);
		
		textFieldModelAdi1 = new JTextField();
		textFieldModelAdi1.setBounds(136, 100, 125, 27);
		panel1.add(textFieldModelAdi1);
		textFieldModelAdi1.setColumns(10);
		
		JButton ekle = new JButton("Kaydet");
		ekle.setIcon(new ImageIcon(UretimMuduruUrun.class.getResource("/kaydet.png")));
		ekle.setBounds(64, 514, 95, 23);
		panel1.add(ekle);
		
		JButton yenile = new JButton("Temizle");
		yenile.setIcon(new ImageIcon(UretimMuduruUrun.class.getResource("/sil2.png")));
		yenile.setBounds(339, 514, 106, 23);
		panel1.add(yenile);
		
		JLabel label3 = new JLabel("\u00DCr\u00FCn Ad\u0131");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label3.setBounds(57, 105, 61, 14);
		panel1.add(label3);
		
		JLabel label_2 = new JLabel("\u00C7izim");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(339, 52, 46, 26);
		panel1.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(UretimMuduruUrun.class.getResource("/dxfuzanti.png")));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(437, 52, 46, 26);
		panel1.add(label_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 316, 541, 140);
		panel1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Malzeme Kodu","Malzeme Adý","Adet","Renk","Ebat","Açýklama"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UretimMuduruUrun.class.getResource("/plus.png")));
		lblNewLabel.setBounds(616, 234, 46, 23);
		panel1.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(UretimMuduruUrun.class.getResource("/kucult.png")));
		label_1.setBounds(616, 268, 46, 22);
		panel1.add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(143, 224, 118, 23);
		panel1.add(comboBox_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(341, 225, 81, 20);
		panel1.add(spinner);
		
		JLabel lblAdet = new JLabel("Adet");
		lblAdet.setBounds(296, 228, 46, 14);
		panel1.add(lblAdet);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(508, 223, 90, 25);
		panel1.add(comboBox_2);
		
		JLabel lblEbat = new JLabel("Cinsi");
		lblEbat.setBounds(57, 268, 46, 14);
		panel1.add(lblEbat);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(112, 268, 106, 23);
		panel1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(483, 268, 115, 23);
		panel1.add(textField_1);
		
		JLabel label_4 = new JLabel("A\u00E7\u0131klama");
		label_4.setBounds(416, 268, 67, 14);
		panel1.add(label_4);
		
		JLabel label_10 = new JLabel("Birim Fiyat");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_10.setBounds(307, 106, 81, 14);
		panel1.add(label_10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(386, 100, 125, 27);
		panel1.add(textField_4);
		
		JLabel label_11 = new JLabel("\u00DCr\u00FCn Olu\u015Ftur");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		label_11.setBackground(new Color(60, 179, 113));
		label_11.setBounds(244, 11, 227, 28);
		panel1.add(label_11);
		
		JLabel lblMalzemeAd = new JLabel("Malzeme Ad\u0131");
		lblMalzemeAd.setBounds(57, 228, 85, 14);
		panel1.add(lblMalzemeAd);
		
		JLabel lblRenk = new JLabel("Renk");
		lblRenk.setBounds(450, 228, 61, 14);
		panel1.add(lblRenk);
		
		JLabel label_13 = new JLabel("Ebat");
		label_13.setBounds(244, 268, 46, 14);
		panel1.add(label_13);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(290, 268, 107, 23);
		panel1.add(textField_5);
		//ek
		JScrollBar jScrollBar = new JScrollBar();
		
		
	
		
		/*scrollPane.add(jScrollBar);
		scrollPane.add(table);
		scrollPane.setViewportView(table);
		jpanelCenter.add(scrollPane);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		 */		
		panel2 = new JPanel();
		panel2.setBackground(new Color(0, 250, 154));
		panel2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		icerikPanel.add(panel2, "name_4532427943942");
		panel2.setLayout(null);
		String[][] sqlData= {{"12","2","4"},{"1","2","7"}};
		String[] header= {"1","2","3"};
		setColumnHeader(sqlData, header);
		
		JScrollPane scrollPaneModelBilgi = new JScrollPane();
		scrollPaneModelBilgi.setBounds(10, 40, 652, 149);
		panel2.add(scrollPaneModelBilgi);
		
		tableModelBilgi1 = new JTable();
		tableModelBilgi1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Satýr No","Kategori","Ürün","Model" 
			}
		));
		scrollPaneModelBilgi.setViewportView(tableModelBilgi1);
		
		JComboBox comboBoxKategori2 = new JComboBox();
		comboBoxKategori2.setBounds(71, 215, 189, 27);
		comboBoxKategori2.setModel(new DefaultComboBoxModel(new String[] {"Kategori Ad\u0131"}));
		comboBoxKategori2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel2.add(comboBoxKategori2);
		
		JComboBox comboBoxUrun2 = new JComboBox();
		comboBoxUrun2.setBounds(71, 266, 189, 27);
		comboBoxUrun2.setModel(new DefaultComboBoxModel(new String[] {"\u00DCr\u00FCn Ad\u0131"}));
		comboBoxUrun2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel2.add(comboBoxUrun2);
		
		JLabel lblizim = new JLabel("\u00C7izim");
		lblizim.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblizim.setBounds(385, 216, 46, 26);
		panel2.add(lblizim);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(UretimMuduruUrun.class.getResource("/dxfuzanti.png")));
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(460, 216, 46, 26);
		panel2.add(label);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(576, 399, 46, 22);
		panel2.add(label_8);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(35, 410, 519, 133);
		panel2.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Malzeme Kodu","Malzeme Adý","Adet","Renk","Ebat","Açýklama"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.setBounds(576, 432, 86, 23);
		panel2.add(btnGncelle);
		
		JButton button = new JButton("Sil");
		button.setBounds(576, 481, 86, 23);
		panel2.add(button);
		
		JLabel label_12 = new JLabel("\u00DCr\u00FCn Bilgileri Listesi");
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		label_12.setBackground(new Color(60, 179, 113));
		label_12.setBounds(235, 11, 227, 28);
		panel2.add(label_12);
		
		JLabel label_5 = new JLabel("Malzeme Ad\u0131");
		label_5.setBounds(35, 337, 85, 14);
		panel2.add(label_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(121, 333, 118, 23);
		panel2.add(comboBox);
		
		JLabel label_6 = new JLabel("Adet");
		label_6.setBounds(274, 337, 46, 14);
		panel2.add(label_6);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(319, 334, 81, 20);
		panel2.add(spinner_1);
		
		JLabel label_7 = new JLabel("Renk");
		label_7.setBounds(428, 337, 61, 14);
		panel2.add(label_7);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(486, 332, 90, 25);
		panel2.add(comboBox_3);
		
		JLabel label_14 = new JLabel("Cinsi");
		label_14.setBounds(35, 372, 46, 14);
		panel2.add(label_14);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(90, 372, 106, 23);
		panel2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(268, 372, 107, 23);
		panel2.add(textField_3);
		
		JLabel label_15 = new JLabel("Ebat");
		label_15.setBounds(222, 372, 46, 14);
		panel2.add(label_15);
		
		JLabel label_16 = new JLabel("A\u00E7\u0131klama");
		label_16.setBounds(394, 372, 67, 14);
		panel2.add(label_16);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(461, 372, 115, 23);
		panel2.add(textField_6);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(UretimMuduruUrun.class.getResource("plus.png")));
		label_9.setBounds(616, 332, 46, 23);
		panel2.add(label_9);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon(UretimMuduruUrun.class.getResource("kucult.png")));
		label_17.setBounds(616, 366, 46, 22);
		panel2.add(label_17);
		
		

		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
	
	public void setColumnHeader(String[][] data,String[] header) {
		//DefaultTableModel model = new DefaultTableModel(data,header);
		
	}
}

