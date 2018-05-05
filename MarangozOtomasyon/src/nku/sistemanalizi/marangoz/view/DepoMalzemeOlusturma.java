package nku.sistemanalizi.marangoz.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

//public class Malzeme extends JFrame {
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

public class DepoMalzemeOlusturma extends JFrame {

	private JPanel contentPane;
	int pX,pY;
	
	JPanel panelMenu;
	JPanel icerikPanel;
	JPanel panel1;
	JPanel panel2;
	private JTextField textFieldModelAdi1;
	private JTable tableModelBilgi1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepoMalzemeOlusturma frame = new DepoMalzemeOlusturma();
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
	public DepoMalzemeOlusturma() {
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
				DepoMenu depoMenu = new DepoMenu();
				depoMenu.setVisible(true);
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
		menuBtn1.setIcon(new ImageIcon(DepoMalzemeOlusturma.class.getResource("/personelekle.png")));
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
		btnNewButton_1.setIcon(new ImageIcon(DepoMalzemeOlusturma.class.getResource("/personelara.png")));
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
		
		textFieldModelAdi1 = new JTextField();
		textFieldModelAdi1.setBounds(136, 140, 125, 23);
		panel1.add(textFieldModelAdi1);
		textFieldModelAdi1.setColumns(10);
		
		JButton ekle = new JButton("Kaydet");
		ekle.setIcon(new ImageIcon(DepoMalzemeOlusturma.class.getResource("/kaydet.png")));
		ekle.setBounds(391, 500, 95, 23);
		panel1.add(ekle);
		
		JButton yenile = new JButton("Temizle");
		yenile.setIcon(new ImageIcon(DepoMalzemeOlusturma.class.getResource("/sil2.png")));
		yenile.setBounds(525, 500, 106, 23);
		panel1.add(yenile);
		
		JLabel label3 = new JLabel("Malzeme Ad\u0131");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label3.setBounds(28, 145, 90, 14);
		panel1.add(label3);
		
		JLabel label_2 = new JLabel("Ebat");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(28, 183, 90, 14);
		panel1.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(136, 178, 125, 23);
		panel1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 254, 125, 23);
		panel1.add(textField_1);
		
		JLabel label_1 = new JLabel("Renk");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(28, 260, 90, 14);
		panel1.add(label_1);
		
		JLabel label_5 = new JLabel("Fiyat");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setBounds(28, 298, 90, 14);
		panel1.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(136, 292, 125, 23);
		panel1.add(textField_5);
		
		JLabel label5 = new JLabel("Malzeme Olu\u015Ftur");
		label5.setForeground(new Color(255, 255, 255));
		label5.setBounds(226, 11, 227, 28);
		panel1.add(label5);
		label5.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		label5.setBackground(new Color(60, 179, 113));
		
		JLabel lblCinsi = new JLabel("Cinsi");
		lblCinsi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCinsi.setBounds(28, 222, 90, 14);
		panel1.add(lblCinsi);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(136, 216, 125, 23);
		panel1.add(textField_7);
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
		scrollPaneModelBilgi.setBounds(10, 36, 652, 149);
		panel2.add(scrollPaneModelBilgi);
		
		tableModelBilgi1 = new JTable();
		tableModelBilgi1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Malzeme Kodu","Malzeme Adý","Ebat","Adet","Cinsi","Renk","Oluþturma Tarihi" 
			}
		));
		scrollPaneModelBilgi.setViewportView(tableModelBilgi1);
		
		JLabel lblNewLabel = new JLabel("Malzeme Ad\u0131");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(71, 281, 106, 14);
		panel2.add(lblNewLabel);
		
		JLabel label = new JLabel("Ebat");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(71, 328, 106, 14);
		panel2.add(label);
		
		textField_2 = new JTextField();
		textField_2.setBounds(205, 279, 86, 20);
		panel2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(205, 326, 86, 20);
		panel2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_3 = new JLabel("Renk");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(71, 410, 106, 14);
		panel2.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(205, 408, 86, 20);
		panel2.add(textField_4);
		
		JButton btnNewButton = new JButton("G\u00FCncelle");
		btnNewButton.setBounds(472, 420, 89, 23);
		panel2.add(btnNewButton);
		
		JButton button = new JButton("Sil");
		button.setBounds(472, 479, 89, 23);
		panel2.add(button);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(DepoMalzemeOlusturma.class.getResource("/search.png")));
		label_4.setBounds(340, 282, 46, 14);
		panel2.add(label_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(205, 448, 86, 20);
		panel2.add(textField_6);
		
		JLabel label_6 = new JLabel("Fiyat");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(71, 450, 106, 18);
		panel2.add(label_6);
		
		JLabel label_7 = new JLabel("Malzeme Bilgileri Listesi");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		label_7.setBackground(new Color(60, 179, 113));
		label_7.setBounds(241, 11, 227, 28);
		panel2.add(label_7);
		
		JLabel lblCinsi_1 = new JLabel("Cinsi");
		lblCinsi_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCinsi_1.setBounds(71, 371, 106, 14);
		panel2.add(lblCinsi_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(205, 369, 86, 20);
		panel2.add(textField_8);
		
		

		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
	
	public void setColumnHeader(String[][] data,String[] header) {
		//DefaultTableModel model = new DefaultTableModel(data,header);
		
	}
}

