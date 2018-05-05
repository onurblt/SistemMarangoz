package nku.sistemanalizi.marangoz.view;


//public class DepoTedarikci extends JFrame {

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
import java.awt.Component;
import javax.swing.table.DefaultTableModel;

public class DepoTedarikci extends JFrame {

	private JPanel contentPane;
	int pX,pY;
	
	JPanel panelMenu;
	JPanel icerikPanel;
	JPanel panel2;
	JPanel panel3;
	private JTable tableTedarikciler;
	private JTextField textFieldMailAdres2;
	private JTextField textFieldTelefon2_2;
	private JTextField textFieldTelefon1_2;
	private JTextField textFieldUnvan2;
	private JTextField textFieldSoyad2;
	private JTextField textFieldAd2;
	private JTextField textFieldFirmaAd2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepoTedarikci frame = new DepoTedarikci();
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
	public DepoTedarikci() {
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
		
		JLabel BtnExit = new JLabel("ANA MENU");
		BtnExit.setBounds(741, 659, 134, 28);
		
		BtnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		BtnExit.setIcon(new ImageIcon(DepoMenu.class.getResource("/cikis.png")));
		BtnExit.setForeground(new Color(72, 61, 139));
		BtnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				DepoMenu DepoMenu = new DepoMenu();
				DepoMenu.setVisible(true);
			}
		});
		contentPane.add(BtnExit);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panelMenu.setBackground(new Color(60, 179, 113));
		panelMenu.setBounds(23, 72, 99, 581);
		contentPane.add(panelMenu);
		panelMenu.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton MenuBtn2 = new JButton();
		MenuBtn2.setIcon(new ImageIcon(DepoTedarikci.class.getResource("/personelara.png")));
		MenuBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				icerikPanel.removeAll();
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
				icerikPanel.add(panel2);
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
			}
		});
		MenuBtn2.setFont(new Font("SansSerif", Font.BOLD, 18));
		MenuBtn2.setBackground(new Color(240, 240, 240));
		panelMenu.add(MenuBtn2);
		
		icerikPanel = new JPanel();
		icerikPanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		icerikPanel.setBackground(new Color(60, 179, 113));
		icerikPanel.setBounds(156, 72, 676, 581);
		contentPane.add(icerikPanel);
		icerikPanel.setLayout(new CardLayout(0, 0));
		
		panel2 = new JPanel();
		panel2.setBackground(new Color(0, 250, 154));
		panel2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		icerikPanel.add(panel2, "name_4532427943942");
		panel2.setLayout(null);
		
		JScrollPane scrollPaneTedarikciBilgi = new JScrollPane();
		scrollPaneTedarikciBilgi.setBounds(10, 43, 652, 149);
		panel2.add(scrollPaneTedarikciBilgi);
		
		tableTedarikciler = new JTable();
		tableTedarikciler.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				 "Firma Ad\u0131", "Ad", "Soyad", "Unvan", "Telefon", "Telefon2", "MailAdres", "Adres"
			}
		));
		tableTedarikciler.getColumnModel().getColumn(7).setPreferredWidth(97);
		scrollPaneTedarikciBilgi.setViewportView(tableTedarikciler);
		
		JLabel label_11 = new JLabel("Firma Ad\u0131*");
		label_11.setBounds(25, 216, 59, 14);
		panel2.add(label_11);
		
		JLabel label11 = new JLabel("Tedarik\u00E7i Listesi");
		label11.setForeground(new Color(255, 255, 255));
		label11.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		label11.setBounds(239, 5, 190, 27);
		panel2.add(label11);
		
		JLabel label8 = new JLabel("Ad*");
		label8.setBounds(25, 250, 59, 14);
		panel2.add(label8);
		
		JLabel label7 = new JLabel("Soyad*");
		label7.setBounds(25, 275, 46, 14);
		panel2.add(label7);
		
		JLabel label6 = new JLabel("\u00DCnvan");
		label6.setBounds(25, 311, 46, 14);
		panel2.add(label6);
		
		JLabel label5 = new JLabel("Telefon");
		label5.setBounds(25, 342, 73, 14);
		panel2.add(label5);
		
		JLabel label4 = new JLabel("Telefon2");
		label4.setBounds(25, 373, 73, 14);
		panel2.add(label4);
		
		JLabel label3 = new JLabel("Mail Adresi");
		label3.setBounds(25, 406, 73, 14);
		panel2.add(label3);
		
		JLabel label2 = new JLabel("Adres");
		label2.setBounds(27, 451, 59, 14);
		panel2.add(label2);
		
		JTextArea textAreaAdres2 = new JTextArea();
		textAreaAdres2.setBounds(121, 448, 357, 89);
		panel2.add(textAreaAdres2);
		
		textFieldMailAdres2 = new JTextField();
		textFieldMailAdres2.setColumns(10);
		textFieldMailAdres2.setBounds(119, 403, 136, 20);
		panel2.add(textFieldMailAdres2);
		
		textFieldTelefon2_2 = new JTextField();
		textFieldTelefon2_2.setColumns(10);
		textFieldTelefon2_2.setBounds(119, 370, 136, 20);
		panel2.add(textFieldTelefon2_2);
		
		textFieldTelefon1_2 = new JTextField();
		textFieldTelefon1_2.setColumns(10);
		textFieldTelefon1_2.setBounds(119, 339, 136, 20);
		panel2.add(textFieldTelefon1_2);
		
		textFieldUnvan2 = new JTextField();
		textFieldUnvan2.setColumns(10);
		textFieldUnvan2.setBounds(119, 308, 136, 20);
		panel2.add(textFieldUnvan2);
		
		textFieldSoyad2 = new JTextField();
		textFieldSoyad2.setColumns(10);
		textFieldSoyad2.setBounds(119, 277, 136, 20);
		panel2.add(textFieldSoyad2);
		
		textFieldAd2 = new JTextField();
		textFieldAd2.setColumns(10);
		textFieldAd2.setBounds(119, 244, 136, 20);
		panel2.add(textFieldAd2);
		
		textFieldFirmaAd2 = new JTextField();
		textFieldFirmaAd2.setColumns(10);
		textFieldFirmaAd2.setBounds(119, 213, 136, 20);
		panel2.add(textFieldFirmaAd2);
		
		JLabel label = new JLabel("");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setIcon(new ImageIcon(DepoTedarikci.class.getResource("/search.png")));
		label.setBounds(288, 203, 27, 30);
		panel2.add(label);
		
		panel3 = new JPanel();
		panel3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel3.setBackground(new Color(0, 250, 154));
		icerikPanel.add(panel3, "name_4703425006362");
		panel3.setLayout(null);
		
		JLabel label_23 = new JLabel("Tedarikçi \u00D6demeleri");
		label_23.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		label_23.setBounds(222, 0, 159, 27);
		panel3.add(label_23);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 25, 652, 149);
		panel3.add(scrollPane_1);
		
		
		
		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
}
