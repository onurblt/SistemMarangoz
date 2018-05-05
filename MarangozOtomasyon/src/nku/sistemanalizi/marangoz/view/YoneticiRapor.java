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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSlider;
import java.awt.Canvas;

public class YoneticiRapor extends JFrame {

	private JPanel contentPane;
	int pX,pY;
	
	JPanel panelMenu;
	JPanel icerikPanel;
	JPanel panel_3;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoneticiRapor frame = new YoneticiRapor();
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
	public YoneticiRapor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 1400, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel frameDrag = new JLabel("");
		frameDrag.setBounds(0, 0, 1304, 35);
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
		label_1.setBounds(1314, 0, 28, 35);
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
		label_2.setBounds(1340, 0, 28, 35);
		
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
		lblNewLabel.setBounds(1240, 727, 134, 28);
		
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
		icerikPanel.setBounds(156, 72, 1083, 650);
		contentPane.add(icerikPanel);
		icerikPanel.setLayout(new CardLayout(0, 0));
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 250, 154));
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		icerikPanel.add(panel_3, "name_4532427943942");
		panel_3.setLayout(null);
		
		JButton button_3 = new JButton("Raporlama");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		button_3.setBounds(902, 576, 147, 34);
		panel_3.add(button_3);
		
		JLabel lblTarihAral = new JLabel("Ba\u015Flang\u0131\u00E7 Tarihi");
		lblTarihAral.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTarihAral.setBounds(64, 74, 146, 20);
		panel_3.add(lblTarihAral);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(206, 74, 95, 20);
		panel_3.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(622, 74, 95, 20);
		panel_3.add(dateChooser_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 182, 476, 152);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Siparis No","Tutar","Ödeme Tarihi"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("Biti\u015F Tarihi");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(447, 74, 146, 20);
		panel_3.add(label);
		
		JLabel lblGelirlerTablosu = new JLabel("Gelirler Tablosu");
		lblGelirlerTablosu.setBounds(63, 145, 130, 23);
		panel_3.add(lblGelirlerTablosu);
		
		JLabel label_3 = new JLabel("GiderlerTablosu");
		label_3.setBounds(576, 149, 130, 23);
		panel_3.add(label_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(576, 182, 470, 152);
		panel_3.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Tutar", "Ödeme Tarihi", "Açýklama","Ödeme Türü"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblGelirToplam = new JLabel("Gelir Toplam");
		lblGelirToplam.setBounds(64, 349, 111, 20);
		panel_3.add(lblGelirToplam);
		
		JLabel label_4 = new JLabel("Gider Toplam");
		label_4.setBounds(870, 349, 111, 20);
		panel_3.add(label_4);
		
		textField = new JTextField();
		textField.setBounds(152, 349, 86, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(954, 349, 86, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_5 = new JLabel("Toplam Kazan\u00E7");
		label_5.setBounds(463, 576, 111, 20);
		panel_3.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(575, 576, 86, 20);
		panel_3.add(textField_2);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(255, 140, 0));
		canvas.setBounds(378, 402, 339, 157);
		panel_3.add(canvas);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(new Color(220, 20, 60));
		canvas_1.setBounds(870, 375, 27, 20);
		panel_3.add(canvas_1);
		
		Canvas canvas_2 = new Canvas();
		canvas_2.setBackground(new Color(255, 0, 255));
		canvas_2.setBounds(870, 401, 27, 20);
		panel_3.add(canvas_2);
		
		Canvas canvas_3 = new Canvas();
		canvas_3.setBackground(new Color(30, 144, 255));
		canvas_3.setBounds(870, 427, 27, 20);
		panel_3.add(canvas_3);
		
		Canvas canvas_4 = new Canvas();
		canvas_4.setBackground(new Color(255, 255, 0));
		canvas_4.setBounds(870, 453, 27, 20);
		panel_3.add(canvas_4);
		
		Canvas canvas_5 = new Canvas();
		canvas_5.setBackground(new Color(160, 82, 45));
		canvas_5.setBounds(870, 479, 27, 20);
		panel_3.add(canvas_5);
		
		JLabel lblpersonelOdemeleri = new JLabel("Personel Odemeleri");
		lblpersonelOdemeleri.setBounds(912, 375, 137, 14);
		panel_3.add(lblpersonelOdemeleri);
		
		JLabel label_6 = new JLabel("Malzeme \u00D6demeleri");
		label_6.setBounds(912, 401, 137, 14);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("Elektrik");
		label_7.setBounds(912, 433, 104, 14);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("Su");
		label_8.setBounds(912, 459, 104, 14);
		panel_3.add(label_8);
		
		JLabel label_9 = new JLabel("Di\u011Fer Masraflar");
		label_9.setBounds(912, 485, 104, 14);
		panel_3.add(label_9);
		
		Canvas canvas_6 = new Canvas();
		canvas_6.setBackground(new Color(50, 205, 50));
		canvas_6.setBounds(64, 375, 27, 20);
		panel_3.add(canvas_6);
		
		JLabel lblYoneticiRaporleri = new JLabel("RAPORLAMA");
		lblYoneticiRaporleri.setForeground(new Color(255, 255, 255));
		lblYoneticiRaporleri.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		lblYoneticiRaporleri.setBackground(new Color(60, 179, 113));
		lblYoneticiRaporleri.setBounds(550, 33, 276, 28);
		contentPane.add(lblYoneticiRaporleri);
		
		
		
		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
}
