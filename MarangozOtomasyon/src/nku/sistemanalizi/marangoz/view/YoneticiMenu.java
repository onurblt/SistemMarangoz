package nku.sistemanalizi.marangoz.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseMotionAdapter;

public class YoneticiMenu extends JFrame {

	private JPanel contentPane;
	int pX,pY;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoneticiMenu frame = new YoneticiMenu();
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
	public YoneticiMenu() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		setTitle("Yönetici Giriþi");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				dispose();
				SiparisBilgi siparisBilgi = new SiparisBilgi();
				siparisBilgi.setVisible(true);
			}
		});
		label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/siparisbilgisi.png")));
		label_1.setBounds(57, 59, 157, 112);
		contentPane.add(label_1);
		
		JLabel lblSipariBilgisi = new JLabel("Sipari\u015F Bilgisi");
		lblSipariBilgisi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSipariBilgisi.setForeground(new Color(72, 61, 139));
		lblSipariBilgisi.setHorizontalAlignment(SwingConstants.CENTER);
		lblSipariBilgisi.setBounds(57, 182, 157, 30);
		contentPane.add(lblSipariBilgisi);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				setVisible(false);
				PersonelBilgi bilgi = new PersonelBilgi();
				bilgi.setVisible(true);
			}
		});
		label_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/personel.png")));
		label_3.setBounds(413, 240, 157, 112);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Personel Bilgisi");
		label_4.setForeground(new Color(72, 61, 139));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(413, 363, 157, 30);
		contentPane.add(label_4);
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				TedarikciBilgi bilgi = new TedarikciBilgi();
				bilgi.setVisible(true);
			}
		});
		label_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/tedarik.png")));
		label_7.setBounds(522, 59, 157, 112);
		contentPane.add(label_7);
		
		JLabel lblTedarikiBilgisi = new JLabel("Tedarik\u00E7i Bilgisi");
		lblTedarikiBilgisi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTedarikiBilgisi.setForeground(new Color(72, 61, 139));
		lblTedarikiBilgisi.setHorizontalAlignment(SwingConstants.CENTER);
		lblTedarikiBilgisi.setBounds(522, 182, 157, 30);
		contentPane.add(lblTedarikiBilgisi);
		
		JLabel label_10 = new JLabel("");
		label_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/sistemkullanici.png")));
		label_10.setBounds(180, 240, 157, 112);
		contentPane.add(label_10);
		
		JLabel lblSistemKullancBilgileri = new JLabel("Sistem Kullan\u0131c\u0131 Bilgisi");
		lblSistemKullancBilgileri.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSistemKullancBilgileri.setForeground(new Color(72, 61, 139));
		lblSistemKullancBilgileri.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemKullancBilgileri.setBounds(180, 363, 157, 30);
		contentPane.add(lblSistemKullancBilgileri);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/kapat.png")));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(725, 0, 28, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				dispose();
				MusteriBilgi bilgi = new MusteriBilgi();
				bilgi.setVisible(true);
			}
		});
		label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_2.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/musteri.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(290, 59, 157, 112);
		contentPane.add(label_2);
		
		JLabel lblMusteriBilgisi = new JLabel("Musteri Bilgisi");
		lblMusteriBilgisi.setHorizontalAlignment(SwingConstants.CENTER);
		lblMusteriBilgisi.setForeground(new Color(72, 61, 139));
		lblMusteriBilgisi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMusteriBilgisi.setBounds(276, 182, 157, 30);
		contentPane.add(lblMusteriBilgisi);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				setLocation(getLocation().x+e.getX()-pX,getLocation().y+e.getY()-pY);
			}
		});
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pX = e.getX();
				pY = e.getY();
			}
		});
		lblNewLabel_3.setBounds(0, 0, 696, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/kucult.png")));
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setState(ICONIFIED);
			}
		});
		lblNewLabel_4.setBounds(699, 0, 28, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel label = new JLabel("\u00C7IKI\u015E");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		label.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/cikis.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(72, 61, 139));
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(617, 437, 79, 35);
		contentPane.add(label);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
	}
}
