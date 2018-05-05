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
		setBounds(100, 100, 753, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		setTitle("Yönetici Giriþi");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel BtnSiparisBilgi = new JLabel("");
		BtnSiparisBilgi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				dispose();
				YoneticiSatisSiparisi siparisBilgi = new YoneticiSatisSiparisi();
				siparisBilgi.setVisible(true);
			}
		});
		
		JLabel frameDrag = new JLabel("");
		frameDrag.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				setLocation(getLocation().x+e.getX()-pX,getLocation().y+e.getY()-pY);
			}
		});
		frameDrag.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pX = e.getX();
				pY = e.getY();
			}
		});
		frameDrag.setBounds(0, 0, 696, 35);
		contentPane.add(frameDrag);
		
		JLabel BtnClose = new JLabel("");
		BtnClose.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/kapat.png")));
		BtnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		
		JLabel BtnMinimize = new JLabel("");
		BtnMinimize.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnMinimize.setHorizontalAlignment(SwingConstants.CENTER);
		BtnMinimize.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/kucult.png")));
		BtnMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setState(ICONIFIED);
			}
		});
		BtnMinimize.setBounds(699, 0, 28, 27);
		contentPane.add(BtnMinimize);
		BtnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnClose.setForeground(new Color(255, 255, 255));
		BtnClose.setHorizontalAlignment(SwingConstants.CENTER);
		BtnClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnClose.setBounds(725, 0, 28, 27);
		contentPane.add(BtnClose);
		BtnSiparisBilgi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnSiparisBilgi.setHorizontalAlignment(SwingConstants.CENTER);
		BtnSiparisBilgi.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/sipariskayit.png")));
		BtnSiparisBilgi.setBounds(57, 59, 157, 112);
		contentPane.add(BtnSiparisBilgi);
		
		JLabel BtnPersonelBilgi = new JLabel("");
		BtnPersonelBilgi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				setVisible(false);
				YoneticiPersonelBilgi bilgi = new YoneticiPersonelBilgi();
				bilgi.setVisible(true);
			}
		});
		
		JLabel BtnTedarikciBilgi = new JLabel("");
		BtnTedarikciBilgi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				YoneticiMusteriBilgi bilgi = new YoneticiMusteriBilgi();
				bilgi.setVisible(true);
				//CariCard bilgi = new CariCard();
				//bilgi.setVisible(true);
			}
		});
		BtnTedarikciBilgi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnTedarikciBilgi.setHorizontalAlignment(SwingConstants.CENTER);
		BtnTedarikciBilgi.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/musteri.png")));
		BtnTedarikciBilgi.setBounds(281, 59, 157, 112);
		contentPane.add(BtnTedarikciBilgi);
		
		JLabel BtnSatýnalmaBilgi = new JLabel("");
		BtnSatýnalmaBilgi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnSatýnalmaBilgi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				dispose();
				YoneticiAlisSiparis satinAlmaBilgi = new YoneticiAlisSiparis();
				satinAlmaBilgi.setVisible(true);
			}
		});
		BtnSatýnalmaBilgi.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/siparisbilgisi.png")));
		BtnSatýnalmaBilgi.setHorizontalAlignment(SwingConstants.CENTER);
		BtnSatýnalmaBilgi.setBounds(57, 241, 157, 112);
		contentPane.add(BtnSatýnalmaBilgi);
		
		JLabel BtnSistemKullaniciBilgi = new JLabel("");
		BtnSistemKullaniciBilgi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				YoneticiRapor rapor = new YoneticiRapor();
				rapor.setVisible(true);
			}
		});
		BtnSistemKullaniciBilgi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnSistemKullaniciBilgi.setHorizontalAlignment(SwingConstants.CENTER);
		BtnSistemKullaniciBilgi.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/personelmaas.png")));
		BtnSistemKullaniciBilgi.setBounds(514, 419, 157, 112);
		contentPane.add(BtnSistemKullaniciBilgi);
		BtnPersonelBilgi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnPersonelBilgi.setHorizontalAlignment(SwingConstants.CENTER);
		BtnPersonelBilgi.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/personel.png")));
		BtnPersonelBilgi.setBounds(57, 419, 157, 112);
		contentPane.add(BtnPersonelBilgi);
		
		JLabel lbl1 = new JLabel("Sat\u0131\u015F Sipari\u015Fi");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl1.setForeground(new Color(72, 61, 139));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(57, 182, 157, 30);
		contentPane.add(lbl1);
		
		JLabel lbl3 = new JLabel("M\u00FC\u015Fteri Bilgileri");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl3.setForeground(new Color(72, 61, 139));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(281, 182, 157, 30);
		contentPane.add(lbl3);
		
		JLabel lbl6 = new JLabel("Al\u0131\u015F Sipari\u015Fleri");
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setForeground(new Color(72, 61, 139));
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl6.setBounds(57, 364, 157, 30);
		contentPane.add(lbl6);
		
		JLabel lbl4 = new JLabel("Rapor");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl4.setForeground(new Color(72, 61, 139));
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setBounds(514, 542, 157, 30);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("Personel Bilgisi");
		lbl5.setForeground(new Color(72, 61, 139));
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setBounds(57, 542, 157, 30);
		contentPane.add(lbl5);
		
		JLabel BtnExit = new JLabel("\u00C7IKI\u015E");
		BtnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		BtnExit.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/cikis.png")));
		BtnExit.setHorizontalAlignment(SwingConstants.CENTER);
		BtnExit.setForeground(new Color(72, 61, 139));
		BtnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		BtnExit.setBounds(664, 565, 79, 35);
		contentPane.add(BtnExit);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				dispose();
				YoneticiTedarikciBilgi bilgi = new YoneticiTedarikciBilgi();
				bilgi.setVisible(true);
			}
		});
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/tedarik.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(281, 241, 157, 112);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Tedarik\u00E7i");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(72, 61, 139));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(281, 364, 157, 30);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				YoneticiGiderler giderler = new YoneticiGiderler();
				giderler.setVisible(true);
				
			}
		});
		label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_2.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/giderler.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(281, 419, 157, 112);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Giderler");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(72, 61, 139));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(281, 542, 157, 30);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Malzemeler");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(72, 61, 139));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(514, 364, 157, 30);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				YoneticiMalzemeGor gor = new YoneticiMalzemeGor();
				gor.setVisible(true);
			}
		});
		label_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_5.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/malzeme.png")));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(514, 241, 157, 112);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				YoneticiUrun urun = new  YoneticiUrun();
				urun.setVisible(true);
			}
		});
		label_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_6.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/urunprototip.png")));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(514, 59, 157, 112);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u00DCr\u00FCn");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(72, 61, 139));
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(514, 182, 157, 30);
		contentPane.add(label_7);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
	}
}
