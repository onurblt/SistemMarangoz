package nku.sistemanalizi.marangoz.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

//public class YoneticiUrun extends JFrame {
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
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;

import javafx.scene.control.ScrollBar;

import java.awt.Button;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;

public class YoneticiUrun extends JFrame {

	private JPanel contentPane;
	int pX,pY;
	
	JPanel panelMenu;
	JPanel icerikPanel;
	JPanel panel2;
	private JTable tableModelBilgi1;
	private JTable table_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoneticiUrun frame = new YoneticiUrun();
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
	public YoneticiUrun() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 698);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel frameDrag = new JLabel();
		frameDrag.setBounds(10, 0, 832, 35);
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
		
		JLabel BtnMinimize = new JLabel("");
		BtnMinimize.setBounds(831, 0, 28, 35);
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
		contentPane.add(BtnMinimize);
		
		JLabel BtnClose = new JLabel("");
		BtnClose.setBounds(857, 0, 28, 35);
		
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
		BtnClose.setForeground(Color.WHITE);
		BtnClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(BtnClose);
		
		JLabel exitLabel = new JLabel("ANA MENU");
		exitLabel.setBounds(741, 659, 134, 28);
		
		exitLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		exitLabel.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/cikis.png")));
		exitLabel.setForeground(new Color(72, 61, 139));
		exitLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exitLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				YoneticiMenu menu = new YoneticiMenu();
				menu.setVisible(true);
			}
		});
		contentPane.add(exitLabel);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panelMenu.setBackground(new Color(60, 179, 113));
		panelMenu.setBounds(23, 72, 99, 581);
		contentPane.add(panelMenu);
		panelMenu.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				icerikPanel.removeAll();
				icerikPanel.repaint();
				icerikPanel.revalidate();
				
				icerikPanel.add(panel2);
				icerikPanel.repaint();
				icerikPanel.revalidate();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(YoneticiUrun.class.getResource("/personelara.png")));
		panelMenu.add(btnNewButton_1);
		
		icerikPanel = new JPanel();
		icerikPanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		icerikPanel.setBackground(new Color(60, 179, 113));
		icerikPanel.setBounds(156, 72, 676, 581);
		contentPane.add(icerikPanel);
		icerikPanel.setLayout(new CardLayout(0, 0));
		//ek
		JScrollBar jScrollBar = new JScrollBar();
		
		
	
		
		/*scrollPane.add(jScrollBar);
		scrollPane.add(table);
		scrollPane.setViewportView(table);
		jpanelCenter.add(scrollPane);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		 */		
		panel2 = new JPanel();
		panel2.setBackground(new Color(0, 250, 154));
		panel2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		icerikPanel.add(panel2, "name_4532427943942");
		panel2.setLayout(null);
		String[][] sqlData= {{"12","2","4"},{"1","2","7"}};
		String[] header= {"1","2","3"};
		setColumnHeader(sqlData, header);
		
		JScrollPane scrollPaneModelBilgi = new JScrollPane();
		scrollPaneModelBilgi.setBounds(10, 25, 652, 149);
		panel2.add(scrollPaneModelBilgi);
		
		tableModelBilgi1 = new JTable();
		tableModelBilgi1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Satýr No","Kategori","Ürün","Model" 
			}
		));
		scrollPaneModelBilgi.setViewportView(tableModelBilgi1);
		
		JComboBox comboBoxKategori2 = new JComboBox();
		comboBoxKategori2.setBounds(71, 215, 189, 27);
		comboBoxKategori2.setModel(new DefaultComboBoxModel(new String[] {"Kategori Ad\u0131"}));
		comboBoxKategori2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel2.add(comboBoxKategori2);
		
		JComboBox comboBoxUrun2 = new JComboBox();
		comboBoxUrun2.setBounds(71, 266, 189, 27);
		comboBoxUrun2.setModel(new DefaultComboBoxModel(new String[] {"\u00DCr\u00FCn Ad\u0131"}));
		comboBoxUrun2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel2.add(comboBoxUrun2);
		
		JLabel lblizim = new JLabel("\u00C7izim");
		lblizim.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblizim.setBounds(385, 216, 46, 26);
		panel2.add(lblizim);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(YoneticiUrun.class.getResource("/dxfuzanti.png")));
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(460, 216, 46, 26);
		panel2.add(label);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(576, 399, 46, 22);
		panel2.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setBounds(576, 374, 46, 23);
		panel2.add(label_9);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(33, 374, 573, 149);
		panel2.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Malzeme Kodu","Malzeme Adý","Adet","Renk","Ebat","Açýklama"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JLabel label5 = new JLabel("\u00DCr\u00FCn Bilgileri Listesi");
		label5.setForeground(new Color(255, 255, 255));
		label5.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		label5.setBackground(new Color(60, 179, 113));
		label5.setBounds(391, 34, 227, 28);
		contentPane.add(label5);
		
		

		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
	
	public void setColumnHeader(String[][] data,String[] header) {
		//DefaultTableModel model = new DefaultTableModel(data,header);
		
	}
}

