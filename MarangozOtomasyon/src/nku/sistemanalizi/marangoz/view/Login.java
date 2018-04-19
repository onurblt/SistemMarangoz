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

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userName;
	private JPasswordField passWord;
	private JTextField loginBtn;
	private JTextField closeBtn;
	private JLabel lblNewLabel;
	private JLabel lblifre;
	private JLabel lblNewLabel_1;
	private JLabel closeBtn2;
	private JLabel lblifremiUnuttum;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	int pX;
	int pY;
	private JLabel label_1;
	private JLabel label_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 650, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		userName = new JTextField();
		userName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		userName.setBounds(338, 161, 248, 41);
		contentPane.add(userName);
		userName.setColumns(10);
		
		passWord = new JPasswordField();
		passWord.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passWord.setBounds(338, 225, 248, 41);
		contentPane.add(passWord);
		
		loginBtn = new JTextField();
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		loginBtn.setForeground(new Color(255, 255, 255));
		loginBtn.setBackground(new Color(70, 130, 180));
		loginBtn.setFocusTraversalPolicyProvider(true);
		loginBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginBtn.setFont(new java.awt.Font("Gabriola", 3, 20));
		//loginBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		loginBtn.setHorizontalAlignment(SwingConstants.CENTER);
		loginBtn.setText("G\u0130R\u0130\u015E");
		loginBtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		loginBtn.setEditable(false);
		loginBtn.setBounds(338, 307, 111, 41);
		contentPane.add(loginBtn);
		loginBtn.setColumns(10);
		
		closeBtn = new JTextField();
		closeBtn.setForeground(new Color(255, 255, 255));
		closeBtn.setBackground(new Color(250, 128, 114));
		closeBtn.setDisabledTextColor(new Color(255, 127, 80));
		closeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				dispose();
			}
		});
		closeBtn.setFocusTraversalPolicyProvider(true);
		closeBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		closeBtn.setFont(new java.awt.Font("Gabriola", 3, 20));
		closeBtn.setHorizontalAlignment(SwingConstants.CENTER);
		closeBtn.setText("\u0130PTAL");
		closeBtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		closeBtn.setEditable(false);
		closeBtn.setColumns(10);
		closeBtn.setBounds(475, 307, 111, 41);
		contentPane.add(closeBtn);
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("usr.png")));
		lblNewLabel.setBounds(229, 161, 59, 41);
		contentPane.add(lblNewLabel);
		
		lblifre = new JLabel("");
		lblifre.setHorizontalAlignment(SwingConstants.CENTER);
		lblifre.setIcon(new ImageIcon(Login.class.getResource("pass.png")));
		lblifre.setBounds(229, 227, 59, 41);
		contentPane.add(lblifre);
		
		lblNewLabel_1 = new JLabel("    SÝSTEM G\u0130R\u0130\u015E");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new java.awt.Font("Gabriola", 7, 25));
		lblNewLabel_1.setBounds(122, 11, 279, 69);
		contentPane.add(lblNewLabel_1);
		
		closeBtn2 = new JLabel("");
		closeBtn2.setIcon(new ImageIcon(Login.class.getResource("/kapat.png")));
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
		closeBtn2.setBounds(620, 0, 30, 31);
		contentPane.add(closeBtn2);
		
		lblifremiUnuttum = new JLabel("\u015Eifremi Unuttum!");
		lblifremiUnuttum.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblifremiUnuttum.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblifremiUnuttum.setBounds(411, 382, 111, 14);
		contentPane.add(lblifremiUnuttum);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kullan\u0131c\u0131 Tipi Se\u00E7iniz", "Y\u00F6netici", "\u00DCretim G\u00F6revlisi", "Depo G\u00F6revlisi"}));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setBounds(338, 91, 248, 41);
		contentPane.add(comboBox);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/users.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(229, 91, 59, 41);
		contentPane.add(label);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/login.png")));
		lblNewLabel_2.setBounds(0, 92, 607, 257);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
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
		
		lblNewLabel_3.setBounds(0, 0, 562, 31);
		contentPane.add(lblNewLabel_3);
		
		label_1 = new JLabel("");
		label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setState(ICONIFIED);
			}
		});
		label_1.setIcon(new ImageIcon(Login.class.getResource("/kucult.png")));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(591, 0, 30, 31);
		contentPane.add(label_1);
		
		label_2 = new JLabel("Kay\u0131t Ol!");
		label_2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		label_2.setBounds(141, 383, 111, 14);
		contentPane.add(label_2);
		setUndecorated(true);//remove the frame outline
		setLocationRelativeTo(null);
		
	}
}
