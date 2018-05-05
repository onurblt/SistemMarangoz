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
import javax.swing.table.DefaultTableModel;

public class UretimMuduruPersonel extends JFrame {

	private JPanel contentPane;
	int pX,pY;
	
	JPanel panelMenu;
	JPanel icerikPanel;
	JPanel panel_3;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UretimMuduruPersonel frame = new UretimMuduruPersonel();
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
	public UretimMuduruPersonel() {
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
				UretimMuduruMenu UretimMuduruMenu = new UretimMuduruMenu();
				UretimMuduruMenu.setVisible(true);
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
		
		JLabel label_11 = new JLabel("Ad");
		label_11.setBounds(10, 232, 59, 14);
		panel_3.add(label_11);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(104, 198, 136, 20);
		panel_3.add(textField_3);
		
		JLabel label_12 = new JLabel("Soyad");
		label_12.setBounds(10, 263, 46, 14);
		panel_3.add(label_12);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(104, 229, 136, 20);
		panel_3.add(textField_7);
		
		JLabel label_13 = new JLabel("T.C No");
		label_13.setBounds(10, 201, 59, 14);
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
		label_16.setBounds(10, 379, 59, 14);
		panel_3.add(label_16);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(104, 376, 357, 89);
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
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"TC No","Ad", "Soyad","Doðum T.", "Mail Ad.", "Telefon","Adres", "Görev","Maaþ","BaþlamaT."
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("Telefon");
		label.setBounds(10, 351, 73, 14);
		panel_3.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(104, 348, 136, 20);
		panel_3.add(textField);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(UretimMuduruPersonel.class.getResource("/search.png")));
		label_3.setBounds(251, 232, 46, 14);
		panel_3.add(label_3);
		
		JLabel lblUretimMuduruPersonelleri = new JLabel("Personel Listesi");
		lblUretimMuduruPersonelleri.setForeground(new Color(255, 255, 255));
		lblUretimMuduruPersonelleri.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		lblUretimMuduruPersonelleri.setBackground(new Color(60, 179, 113));
		lblUretimMuduruPersonelleri.setBounds(380, 32, 276, 28);
		contentPane.add(lblUretimMuduruPersonelleri);
		
		
		
		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
}
