package nku.sistemanalizi.marangoz.view;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;
import java.awt.Button;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import com.toedter.calendar.JMonthChooser;

import nku.sistemanalizi.marangoz.controller.PersonelController;
import nku.sistemanalizi.marangoz.model.Personel;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class YoneticiPersonelBilgi extends JFrame {

	private JPanel contentPane;
	int pX, pY;

	JPanel panelMenu;
	JPanel icerikPanel;
	JPanel panel_2;
	JPanel panel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField tfAd2;
	private JTextField tfSoyad2;
	private JTextField tfTCno2;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_5;
	private JTextField textField_22;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoneticiPersonelBilgi frame = new YoneticiPersonelBilgi();
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
	public YoneticiPersonelBilgi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 698);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel frameDrag = new JLabel("");
		frameDrag.setBounds(0, 0, 932, 35);
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
				setLocation(getLocation().x + e.getX() - pX, getLocation().y + e.getY() - pY);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(frameDrag);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(931, 0, 28, 35);
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
		label_2.setBounds(957, 0, 28, 35);

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
		lblNewLabel.setBounds(798, 659, 134, 28);

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
		panelMenu.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));
		panelMenu.setBackground(new Color(60, 179, 113));
		panelMenu.setBounds(23, 72, 99, 581);
		contentPane.add(panelMenu);
		panelMenu.setLayout(new GridLayout(0, 1, 0, 0));

		JButton button = new JButton();
		button.setIcon(new ImageIcon(Login.class.getResource("/personelekle.png")));
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
		icerikPanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));
		icerikPanel.setBackground(new Color(60, 179, 113));
		icerikPanel.setBounds(156, 72, 776, 581);
		contentPane.add(icerikPanel);
		icerikPanel.setLayout(new CardLayout(0, 0));

		panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_2.setBackground(new Color(0, 250, 154));
		icerikPanel.add(panel_2, "name_4516788086034");
		panel_2.setLayout(null);

		JLabel lblAd = new JLabel("Ad*");
		lblAd.setBounds(28, 41, 59, 14);
		panel_2.add(lblAd);

		textField = new JTextField();
		textField.setBounds(122, 38, 136, 20);
		panel_2.add(textField);
		textField.setColumns(10);

		JLabel label = new JLabel("Soyad*");
		label.setBounds(28, 72, 46, 14);
		panel_2.add(label);

		textField_1 = new JTextField();
		textField_1.setBounds(122, 69, 136, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);

		JLabel label_3 = new JLabel("T.C No*");
		label_3.setBounds(28, 103, 59, 14);
		panel_2.add(label_3);

		textField_2 = new JTextField();
		textField_2.setBounds(122, 100, 136, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Do\u011Fum T.");
		lblNewLabel_1.setBounds(28, 136, 64, 14);
		panel_2.add(lblNewLabel_1);

		JLabel label_4 = new JLabel("Mail Adresi*");
		label_4.setBounds(28, 164, 73, 14);
		panel_2.add(label_4);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 161, 136, 20);
		panel_2.add(textField_4);

		JLabel label_5 = new JLabel("G\u00F6rev");
		label_5.setBounds(28, 347, 46, 14);
		panel_2.add(label_5);

		JLabel label_6 = new JLabel("Maa\u015F");
		label_6.setBounds(28, 378, 46, 14);
		panel_2.add(label_6);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(122, 375, 136, 20);
		panel_2.add(textField_6);

		JLabel label_7 = new JLabel("Adres");
		label_7.setBounds(30, 229, 59, 14);
		panel_2.add(label_7);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(124, 226, 357, 89);
		panel_2.add(textArea);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(122, 131, 136, 20);
		panel_2.add(dateChooser);

		JLabel label_8 = new JLabel("Ýþe Baþlama T.");
		label_8.setBounds(28, 412, 84, 14);
		panel_2.add(label_8);

		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(122, 406, 136, 20);
		panel_2.add(dateChooser_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0),
				new Color(255, 0, 0), new Color(255, 0, 0)));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(505, 25, 136, 153);
		panel_2.add(lblNewLabel_2);

		JLabel label_9 = new JLabel("Foto\u011Fraf");
		label_9.setBackground(new Color(255, 255, 255));
		label_9.setBounds(436, 59, 59, 14);
		panel_2.add(label_9);

		JLabel label_10 = new JLabel();
		label_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_10.setIcon(new ImageIcon(YoneticiPersonelBilgi.class.getResource("/resimekle.png")));
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(446, 84, 35, 28);
		panel_2.add(label_10);

		JButton btnNewButton_1 = new JButton("Kaydet");
		btnNewButton_1.setIcon(new ImageIcon(YoneticiPersonelBilgi.class.getResource("/kaydet.png")));
		btnNewButton_1.setBounds(209, 483, 102, 23);
		panel_2.add(btnNewButton_1);

		JLabel lblPersonelKayt = new JLabel("Personel Kay\u0131t");
		lblPersonelKayt.setForeground(Color.WHITE);
		lblPersonelKayt.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		lblPersonelKayt.setBounds(241, 0, 125, 27);
		panel_2.add(lblPersonelKayt);

		JButton btnYenile = new JButton("Temizle");
		btnYenile.setIcon(new ImageIcon(YoneticiPersonelBilgi.class.getResource("/sil2.png")));
		btnYenile.setBounds(393, 483, 102, 23);
		panel_2.add(btnYenile);

		JLabel label_37 = new JLabel("Telefon");
		label_37.setBounds(28, 192, 46, 14);
		panel_2.add(label_37);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(122, 189, 136, 20);
		panel_2.add(textField_21);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Se\u00E7iniz", "1-Y\u00F6netici",
				"2-\u00DCretim M\u00FCd\u00FCr\u00FC", "3-Depo G\u00F6revlisi", "4-Di\u011Fer" }));
		comboBox.setBounds(122, 344, 136, 20);
		panel_2.add(comboBox);

		JLabel label_39 = new JLabel("\u015Eifre");
		label_39.setBounds(309, 375, 46, 14);
		panel_2.add(label_39);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(403, 372, 136, 20);
		panel_2.add(textField_5);

		JLabel label_40 = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
		label_40.setBounds(309, 347, 73, 14);
		panel_2.add(label_40);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(403, 344, 136, 20);
		panel_2.add(textField_22);

		panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 250, 154));
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));
		icerikPanel.add(panel_3, "name_4532427943942");
		panel_3.setLayout(null);

		JLabel label_11 = new JLabel("Ad");
		label_11.setBounds(10, 236, 59, 14);
		panel_3.add(label_11);

		tfAd2 = new JTextField();
		tfAd2.setColumns(10);
		tfAd2.setBounds(104, 233, 136, 20);
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
					ArrayList<Personel> bulunan = PersonelController.Ara(tfAd2.getText(), tfSoyad2.getText());

					for (int i = 0; i < bulunan.size(); i++) {
						model.addRow(new Object[] {bulunan.get(i).TCno, bulunan.get(i).ad, bulunan.get(i).soyad, bulunan.get(i).dogumTarihi,
								bulunan.get(i).email,bulunan.get(i).tel1,bulunan.get(i).adres,bulunan.get(i).unvan,bulunan.get(i).maas});
					}
					run = false;
				}
			}

			public void keyTyped(KeyEvent keyEvent) {
				// printIt("Typed", keyEvent);
			}
		};

		tfAd2.addKeyListener(keyListener);

		panel_3.add(tfAd2);

		JLabel label_12 = new JLabel("Soyad");
		label_12.setBounds(10, 267, 46, 14);
		panel_3.add(label_12);

		tfSoyad2 = new JTextField();
		tfSoyad2.setColumns(10);
		tfSoyad2.setBounds(104, 264, 136, 20);
		tfSoyad2.addKeyListener(keyListener);

		panel_3.add(tfSoyad2);

		JLabel label_13 = new JLabel("T.C No");
		label_13.setBounds(10, 204, 59, 14);
		panel_3.add(label_13);

		tfTCno2 = new JTextField();
		tfTCno2.setColumns(10);
		tfTCno2.setBounds(104, 201, 136, 20);
		panel_3.add(tfTCno2);

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
		label_16.setBounds(10, 390, 59, 14);
		panel_3.add(label_16);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(104, 387, 357, 89);
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
		label_20.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0),
				new Color(255, 0, 0), new Color(255, 0, 0)));
		label_20.setBackground(Color.WHITE);
		label_20.setBounds(487, 185, 136, 153);
		panel_3.add(label_20);

		JLabel label_21 = new JLabel("Foto\u011Fraf");
		label_21.setBackground(Color.WHITE);
		label_21.setBounds(418, 219, 59, 14);
		panel_3.add(label_21);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 25, 752, 149);
		panel_3.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "TC No", "Ad", "Soyad", "Doðum T.",
				"Mail Ad.", "Telefon", "Adres", "Görev", "Maaþ", "BaþlamaT." }));
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				try {
					tfAd2.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
					tfSoyad2.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
				} catch (ArrayIndexOutOfBoundsException ex) {
				}
			}
		});
		table.getColumnModel().getColumn(8).setPreferredWidth(97);
		
		ArrayList<Personel> liste = PersonelController.Yenile();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < liste.size(); i++) {
			model.addRow(new Object[] {liste.get(i).TCno, liste.get(i).ad, liste.get(i).soyad, liste.get(i).dogumTarihi,
					liste.get(i).email,liste.get(i).tel1,liste.get(i).adres,liste.get(i).unvan,liste.get(i).maas});
		}
		
		scrollPane.setViewportView(table);

		JLabel label_22 = new JLabel("Personel Listesi");
		label_22.setForeground(Color.WHITE);
		label_22.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		label_22.setBounds(258, 0, 153, 27);
		panel_3.add(label_22);

		JLabel label_36 = new JLabel("Telefon");
		label_36.setBounds(10, 352, 46, 14);
		panel_3.add(label_36);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(104, 349, 136, 20);
		panel_3.add(textField_20);

		JLabel label_34 = new JLabel("");
		label_34.setIcon(new ImageIcon(YoneticiPersonelBilgi.class.getResource("/search.png")));
		label_34.setBounds(279, 204, 46, 14);
		panel_3.add(label_34);

		JButton button_2 = new JButton("G\u00FCncelle");
		button_2.setBounds(536, 429, 89, 23);
		panel_3.add(button_2);

		JButton button_7 = new JButton("Sil");
		button_7.setBounds(536, 481, 89, 23);
		panel_3.add(button_7);

		setUndecorated(true);
		setLocationRelativeTo(null);

	}
}
