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
		
		JLabel BtnAktifSiparis = new JLabel("");
		BtnAktifSiparis.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				UretimMuduruSiparisler aktifSiparis = new UretimMuduruSiparisler();
				aktifSiparis.setVisible(true);
				
			}
		});
		
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
		
		JLabel BtnClose = new JLabel("");
		BtnClose.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/kapat.png")));
		BtnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		
		JLabel BtnMinimize = new JLabel("");
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
		BtnMinimize.setBounds(698, 0, 29, 35);
		contentPane.add(BtnMinimize);
		BtnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnClose.setForeground(new Color(255, 255, 255));
		BtnClose.setHorizontalAlignment(SwingConstants.CENTER);
		BtnClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnClose.setBounds(724, 0, 29, 35);
		contentPane.add(BtnClose);
		BtnAktifSiparis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnAktifSiparis.setHorizontalAlignment(SwingConstants.CENTER);
		BtnAktifSiparis.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/anlasma.png")));
		BtnAktifSiparis.setBounds(50, 59, 157, 112);
		contentPane.add(BtnAktifSiparis);
		
		JLabel BtnUrunBilgi = new JLabel("");
		BtnUrunBilgi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				UretimMuduruUrun muduruUrun = new UretimMuduruUrun();
				muduruUrun.setVisible(true);
			}
		});
		BtnUrunBilgi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnUrunBilgi.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/urunPrototip.png")));
		BtnUrunBilgi.setHorizontalAlignment(SwingConstants.CENTER);
		BtnUrunBilgi.setBounds(290, 59, 157, 112);
		contentPane.add(BtnUrunBilgi);
		
		JLabel BtnMusteriBilgi = new JLabel("");
		BtnMusteriBilgi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				UretimMuduruMusteri muduruMusteri =  new UretimMuduruMusteri();
				muduruMusteri.setVisible(true);
			}
		});
		BtnMusteriBilgi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnMusteriBilgi.setHorizontalAlignment(SwingConstants.CENTER);
		BtnMusteriBilgi.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/tedarik.png")));
		BtnMusteriBilgi.setBounds(522, 59, 157, 112);
		contentPane.add(BtnMusteriBilgi);
		
		JLabel BtnExit = new JLabel("\u00C7IKI\u015E");
		BtnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		BtnExit.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/cikis.png")));
		BtnExit.setForeground(new Color(72, 61, 139));
		BtnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		
		JLabel BtnPersonelBilgi = new JLabel("");
		BtnPersonelBilgi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				UretimMuduruPersonel muduruPersonel = new UretimMuduruPersonel();
				muduruPersonel.setVisible(true);
			}
		});
		BtnPersonelBilgi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnPersonelBilgi.setHorizontalAlignment(SwingConstants.CENTER);
		BtnPersonelBilgi.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/personel.png")));
		BtnPersonelBilgi.setBounds(290, 232, 157, 112);
		contentPane.add(BtnPersonelBilgi);
		
		JLabel lbl1 = new JLabel("Sat\u0131\u015F Sipari\u015F");
		lbl1.setForeground(new Color(72, 61, 139));
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(50, 182, 157, 30);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Urun Bilgisi");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setForeground(new Color(72, 61, 139));
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl2.setBounds(290, 182, 157, 30);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("M\u00FC\u015Fteri Bilgisi");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl3.setForeground(new Color(72, 61, 139));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(522, 182, 157, 30);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("Personel Bilgisi");
		lbl4.setForeground(new Color(72, 61, 139));
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setBounds(300, 355, 157, 30);
		contentPane.add(lbl4);
		BtnExit.setHorizontalAlignment(SwingConstants.CENTER);
		BtnExit.setBounds(648, 420, 79, 35);
		contentPane.add(BtnExit);
		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
}
