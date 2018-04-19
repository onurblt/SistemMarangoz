package nku.sistemanalizi.marangoz.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseMotionAdapter;

public class UretimMuduruMenu extends JFrame {

	private JPanel contentPane;
	int pX,pY;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UretimMuduruMenu frame = new UretimMuduruMenu();
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
	
	public UretimMuduruMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		setTitle("Uretim");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				UretimMuduruAktifSiparis aktifSiparis = new UretimMuduruAktifSiparis();
				aktifSiparis.setVisible(true);
				
			}
		});
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/anlasma.png")));
		label.setBounds(50, 59, 157, 112);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel(" Aktif Sipari\u015F");
		lblNewLabel.setForeground(new Color(72, 61, 139));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(50, 182, 157, 30);
		contentPane.add(lblNewLabel);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				UretimMuduruPersonel muduruPersonel = new UretimMuduruPersonel();
				muduruPersonel.setVisible(true);
			}
		});
		label_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/personel.png")));
		label_3.setBounds(290, 232, 157, 112);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Personel Bilgisi");
		label_4.setForeground(new Color(72, 61, 139));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(300, 355, 157, 30);
		contentPane.add(label_4);
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				UretimMuduruMusteri muduruMusteri =  new UretimMuduruMusteri();
				muduruMusteri.setVisible(true);
			}
		});
		label_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/tedarik.png")));
		label_7.setBounds(522, 59, 157, 112);
		contentPane.add(label_7);
		
		JLabel lblTedarikiBilgisi = new JLabel("M\u00FC\u015Fteri Bilgisi");
		lblTedarikiBilgisi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTedarikiBilgisi.setForeground(new Color(72, 61, 139));
		lblTedarikiBilgisi.setHorizontalAlignment(SwingConstants.CENTER);
		lblTedarikiBilgisi.setBounds(522, 182, 157, 30);
		contentPane.add(lblTedarikiBilgisi);
		
		JLabel lblNewLabel_1 = new JLabel("\u00C7IKI\u015E");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/cikis.png")));
		lblNewLabel_1.setForeground(new Color(72, 61, 139));
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(648, 420, 79, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/kapat.png")));
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
		lblNewLabel_2.setBounds(724, 0, 29, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblPrototipBilgisi = new JLabel("Urun Bilgisi");
		lblPrototipBilgisi.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrototipBilgisi.setForeground(new Color(72, 61, 139));
		lblPrototipBilgisi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrototipBilgisi.setBounds(290, 182, 157, 30);
		contentPane.add(lblPrototipBilgisi);
		
		JLabel label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				UretimMuduruUrun muduruUrun = new UretimMuduruUrun();
				muduruUrun.setVisible(true);
			}
		});
		label_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_5.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/urunPrototip.png")));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(290, 59, 157, 112);
		contentPane.add(label_5);
		
		JLabel frameDrag = new JLabel("");
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
		frameDrag.setBounds(0, 0, 698, 35);
		contentPane.add(frameDrag);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setState(ICONIFIED);
			}
		});
		label_2.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/kucult.png")));
		label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(698, 0, 29, 35);
		contentPane.add(label_2);
		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
}
