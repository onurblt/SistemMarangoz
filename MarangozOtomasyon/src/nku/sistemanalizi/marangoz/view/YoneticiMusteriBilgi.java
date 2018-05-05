package nku.sistemanalizi.marangoz.view;

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
import java.util.ArrayList;
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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;

import nku.sistemanalizi.marangoz.controller.MusteriController;
import nku.sistemanalizi.marangoz.controller.PersonelController;
import nku.sistemanalizi.marangoz.model.Musteri;
import nku.sistemanalizi.marangoz.model.Personel;

import java.awt.Button;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class YoneticiMusteriBilgi extends JFrame {

	private JPanel contentPane;
	int pX,pY;
	
	JPanel panelMenu;
	JPanel icerikPanel;
	JPanel panel_2;
	JPanel panel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_11;
	private JTextField tfFirma2;
	private JTextField tfAd2;
	private JTextField tfSoyad2;
	private JTextField tfTelefon12;
	private JTextField tfTelefon22;
	private JTextField tfMail2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoneticiMusteriBilgi frame = new YoneticiMusteriBilgi();
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
	public YoneticiMusteriBilgi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 698);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel frameDrag = new JLabel();
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
		lblNewLabel.setIcon(new ImageIcon(YoneticiMenu.class.getResource("/cikis.png")));
		lblNewLabel.setForeground(new Color(72, 61, 139));
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				YoneticiMenu yoneticiMenu = new YoneticiMenu();
				yoneticiMenu.setVisible(true);
			}
		});
		contentPane.add(lblNewLabel);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panelMenu.setBackground(new Color(60, 179, 113));
		panelMenu.setBounds(23, 72, 99, 581);
		contentPane.add(panelMenu);
		panelMenu.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button = new JButton();
		button.setIcon(new ImageIcon(YoneticiMusteriBilgi.class.getResource("/personelekle.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				icerikPanel.removeAll();
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
				icerikPanel.add(panel_2);
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
			}
		});
		button.setBackground(SystemColor.menu);
		panelMenu.add(button);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setIcon(new ImageIcon(YoneticiMusteriBilgi.class.getResource("/personelara.png")));
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
		
		panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_2.setBackground(new Color(0, 250, 154));
		icerikPanel.add(panel_2, "name_4516788086034");
		panel_2.setLayout(null);
		
		JLabel lblAd = new JLabel("Firma Ad\u0131*");
		lblAd.setBounds(28, 41, 96, 14);
		panel_2.add(lblAd);
		
		textField = new JTextField();
		textField.setBounds(122, 38, 136, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Ad*");
		label.setBounds(28, 72, 46, 14);
		panel_2.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 69, 136, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_3 = new JLabel("Soyad*");
		label_3.setBounds(28, 103, 59, 14);
		panel_2.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(122, 100, 136, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 156, 136, 20);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(122, 187, 136, 20);
		panel_2.add(textField_5);
		
		JLabel label_7 = new JLabel("Adres");
		label_7.setBounds(28, 234, 59, 14);
		panel_2.add(label_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(121, 234, 329, 89);
		panel_2.add(textArea);
		
		JButton btnNewButton_1 = new JButton("Kaydet");
		btnNewButton_1.setIcon(new ImageIcon(YoneticiMusteriBilgi.class.getResource("/kaydet.png")));
		btnNewButton_1.setBounds(199, 445, 107, 23);
		panel_2.add(btnNewButton_1);
		
		JLabel lblMusteriKayýt = new JLabel("M\u00FC\u015Fteri Kay\u0131t");
		lblMusteriKayýt.setForeground(Color.WHITE);
		lblMusteriKayýt.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		lblMusteriKayýt.setBounds(241, 0, 125, 27);
		panel_2.add(lblMusteriKayýt);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(122, 128, 136, 20);
		panel_2.add(textField_11);
		
		JLabel label_4 = new JLabel("Telefon");
		label_4.setBounds(28, 131, 64, 14);
		panel_2.add(label_4);
		
		JLabel label_6 = new JLabel("Telefon2");
		label_6.setBounds(28, 156, 64, 14);
		panel_2.add(label_6);
		
		JLabel label_8 = new JLabel("Mail Adresi");
		label_8.setBounds(28, 190, 73, 14);
		panel_2.add(label_8);
		
		JButton btnNewButton_3 = new JButton("Temizle");
		btnNewButton_3.setIcon(new ImageIcon(YoneticiMusteriBilgi.class.getResource("/sil2.png")));
		btnNewButton_3.setBounds(399, 445, 107, 23);
		panel_2.add(btnNewButton_3);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 250, 154));
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		icerikPanel.add(panel_3, "name_4532427943942");
		panel_3.setLayout(null);
		
		JButton button_3 = new JButton("Ekle");
		button_3.setBounds(181, 618, 89, 23);
		panel_3.add(button_3);
		
		JButton button_4 = new JButton("G\u00FCncelle");
		button_4.setBounds(239, 666, 114, 22);
		panel_3.add(button_4);
		
		JButton button_5 = new JButton("Sil");
		button_5.setBounds(322, 618, 89, 23);
		panel_3.add(button_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 25, 652, 149);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Firma Ad\u0131", "Ad", "Soyad", "Telefon", "Telefon2", "Mail Adres", "Adres"
			}
		));
		
		table.getColumnModel().getColumn(6).setPreferredWidth(97);
		scrollPane.setViewportView(table);
		JLabel label_22 = new JLabel("M\u00FC\u015Fteri Listesi");
		label_22.setForeground(Color.WHITE);
		label_22.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		label_22.setBounds(269, 0, 158, 27);
		panel_3.add(label_22);
		
		JLabel label_9 = new JLabel("Firma Ad\u0131");
		label_9.setBounds(20, 202, 96, 14);
		panel_3.add(label_9);
		
		KeyListener keyListener = new KeyListener() {
			public boolean run = false;

			public void keyPressed(KeyEvent keyEvent) {
				// printIt("Pressed", keyEvent);
				run = true;
			}

			public void keyReleased(KeyEvent keyEvent) {
				// printIt("Released", keyEvent);
				if (run) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.setRowCount(0);
					ArrayList<Musteri> bulunan = MusteriController.Ara("",tfAd2.getText(), tfSoyad2.getText());

					for (int i = 0; i < bulunan.size(); i++) {
						model.addRow(new Object[] { bulunan.get(i).ad, bulunan.get(i).soyad });
					}
					run = false;
				}
			}

			public void keyTyped(KeyEvent keyEvent) {
				// printIt("Typed", keyEvent);
			}
		};
		
		tfFirma2 = new JTextField();
		tfFirma2.setColumns(10);
		tfFirma2.setBounds(114, 199, 136, 20);
		panel_3.add(tfFirma2);
		
		tfAd2 = new JTextField();
		tfAd2.setColumns(10);
		tfAd2.setBounds(114, 230, 136, 20);
		panel_3.add(tfAd2);
		
		JLabel label_10 = new JLabel("Ad");
		label_10.setBounds(20, 233, 46, 14);
		panel_3.add(label_10);
		
		JLabel label_11 = new JLabel("Soyad");
		label_11.setBounds(20, 264, 59, 14);
		panel_3.add(label_11);
		
		tfSoyad2 = new JTextField();
		tfSoyad2.setColumns(10);
		tfSoyad2.setBounds(114, 261, 136, 20);
		panel_3.add(tfSoyad2);
		
		JLabel label_13 = new JLabel("Telefon");
		label_13.setBounds(20, 292, 64, 14);
		panel_3.add(label_13);
		
		tfTelefon12 = new JTextField();
		tfTelefon12.setColumns(10);
		tfTelefon12.setBounds(114, 289, 136, 20);
		panel_3.add(tfTelefon12);
		
		tfTelefon22 = new JTextField();
		tfTelefon22.setColumns(10);
		tfTelefon22.setBounds(114, 317, 136, 20);
		panel_3.add(tfTelefon22);
		
		JLabel label_14 = new JLabel("Telefon2");
		label_14.setBounds(20, 317, 64, 14);
		panel_3.add(label_14);
		
		JLabel label_15 = new JLabel("Mail Adresi");
		label_15.setBounds(20, 351, 73, 14);
		panel_3.add(label_15);
		
		tfMail2 = new JTextField();
		tfMail2.setColumns(10);
		tfMail2.setBounds(114, 348, 136, 20);
		panel_3.add(tfMail2);
		
		JTextArea tfAdres2 = new JTextArea();
		tfAdres2.setBounds(113, 395, 329, 89);
		panel_3.add(tfAdres2);
		
		JLabel label_16 = new JLabel("Adres");
		label_16.setBounds(20, 395, 59, 14);
		panel_3.add(label_16);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(YoneticiMusteriBilgi.class.getResource("/search.png")));
		label_5.setBounds(289, 202, 46, 14);
		panel_3.add(label_5);
		
		JButton btnGuncelle = new JButton("G\u00FCncelle");
		btnGuncelle.setBounds(501, 391, 89, 23);
		panel_3.add(btnGuncelle);
		
		JButton btnSil = new JButton("Sil");
		btnSil.setBounds(501, 461, 89, 23);
		panel_3.add(btnSil);
		
		

		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
}
