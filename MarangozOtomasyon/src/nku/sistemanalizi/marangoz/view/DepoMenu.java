package nku.sistemanalizi.marangoz.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DepoMenu extends JFrame {

	private JPanel contentPane;
	int pX,pY;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepoMenu frame = new DepoMenu();
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
	public DepoMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		setTitle("Uretim");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		frameDrag.setBounds(0, 0, 699, 35);
		contentPane.add(frameDrag);
		
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
		BtnMinimize.setBounds(699, 0, 28, 35);
		contentPane.add(BtnMinimize);
		
		JLabel BtnClose = new JLabel("");
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
		BtnClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnClose.setBounds(725, 0, 28, 35);
		contentPane.add(BtnClose);
		
		JLabel BtnMalzemeBilgisi = new JLabel("");
		BtnMalzemeBilgisi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				DepoMalzemeOlusturma depoMalzeme = new DepoMalzemeOlusturma();
				depoMalzeme.setVisible(true);
			}
		});
		BtnMalzemeBilgisi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnMalzemeBilgisi.setHorizontalAlignment(SwingConstants.CENTER);
		BtnMalzemeBilgisi.setIcon(new ImageIcon(DepoMenu.class.getResource("/tamamla.png")));
		BtnMalzemeBilgisi.setBounds(292, 59, 157, 112);
		contentPane.add(BtnMalzemeBilgisi);
		
		JLabel BtnTedarikciBilgi = new JLabel("");
		BtnTedarikciBilgi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				setVisible(false);
				DepoTedarikci depoTedarikci = new DepoTedarikci();
				depoTedarikci.setVisible(true);
			}
		});
		BtnTedarikciBilgi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnTedarikciBilgi.setHorizontalAlignment(SwingConstants.CENTER);
		BtnTedarikciBilgi.setIcon(new ImageIcon(DepoMenu.class.getResource("/tedarik.png")));
		BtnTedarikciBilgi.setBounds(292, 235, 157, 112);
		contentPane.add(BtnTedarikciBilgi);
		
		JLabel BtnSatýnalmaBilgisi = new JLabel("");
		BtnSatýnalmaBilgisi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				DepoAlisSiparis depoUrun = new DepoAlisSiparis();
				depoUrun.setVisible(true);
			}
		});
		BtnSatýnalmaBilgisi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnSatýnalmaBilgisi.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/personelmaas.png")));
		BtnSatýnalmaBilgisi.setHorizontalAlignment(SwingConstants.CENTER);
		BtnSatýnalmaBilgisi.setBounds(48, 59, 157, 112);
		contentPane.add(BtnSatýnalmaBilgisi);
		
		JLabel lbl1 = new JLabel("Malzeme Bilgisi");
		lbl1.setForeground(new Color(72, 61, 139));
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(292, 182, 157, 30);
		contentPane.add(lbl1);
		
		JLabel lbl3 = new JLabel("Tedarik\u00E7i Bilgisi");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl3.setForeground(new Color(72, 61, 139));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(292, 358, 157, 30);
		contentPane.add(lbl3);
		
		JLabel BtnExit = new JLabel("\u00C7IKI\u015E");
		BtnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		BtnExit.setIcon(new ImageIcon(DepoMenu.class.getResource("/cikis.png")));
		BtnExit.setForeground(new Color(72, 61, 139));
		BtnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		
		JLabel lbl4 = new JLabel("Al\u0131\u015F Sipari\u015Fler");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setForeground(new Color(72, 61, 139));
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl4.setBounds(48, 182, 157, 30);
		contentPane.add(lbl4);
		BtnExit.setHorizontalAlignment(SwingConstants.CENTER);
		BtnExit.setBounds(648, 420, 79, 35);
		contentPane.add(BtnExit);
		
		JLabel label = new JLabel("");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				DepoMalzemeGiris depoMalzemeGiris = new DepoMalzemeGiris();
				depoMalzemeGiris.setVisible(true);
			}
		});
		label.setIcon(new ImageIcon(DepoMenu.class.getResource("/malzeme.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(524, 59, 157, 112);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Malzeme Giri\u015Fi");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(72, 61, 139));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(524, 182, 157, 30);
		contentPane.add(label_1);
		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
}
