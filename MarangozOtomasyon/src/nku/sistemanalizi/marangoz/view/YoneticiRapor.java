package nku.sistemanalizi.marangoz.view;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.JSlider;
import java.awt.Canvas;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import java.beans.PropertyChangeEvent;

public class YoneticiRapor extends JFrame {

	private JPanel contentPane;
	int pX,pY;
	public int x=0;
	JPanel panelMenu;
	JPanel icerikPanel;
	JPanel panel_3;
	ChartPanel chartpanel;
	
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	JDateChooser dcBitis; 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoneticiRapor frame = new YoneticiRapor();
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
	public YoneticiRapor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 1400, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel frameDrag = new JLabel("");
		frameDrag.setBounds(0, 0, 1304, 35);
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
		label_1.setBounds(1314, 0, 28, 35);
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
		label_2.setBounds(1340, 0, 28, 35);
		
		label_2.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/kapat.png")));
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x=0;
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
		lblNewLabel.setBounds(1240, 727, 134, 28);
		
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setIcon(new ImageIcon(UretimMuduruMenu.class.getResource("/cikis.png")));
		lblNewLabel.setForeground(new Color(72, 61, 139));
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				YoneticiMenu menu = new YoneticiMenu();
				menu.setVisible(true);
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
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/personelmaas.png")));
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
		icerikPanel.setBounds(156, 72, 1083, 650);
		contentPane.add(icerikPanel);
		icerikPanel.setLayout(new CardLayout(0, 0));
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 250, 154));
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		icerikPanel.add(panel_3, "name_4532427943942");
		panel_3.setLayout(null);
		
		JButton btnRaporktsAl = new JButton("Rapor G\u00F6ster");
		btnRaporktsAl.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
					
					Date baslangic = dcBaslangic.getDate();
					Date bitisi = dcBitis.getDate();
					
					DefaultPieDataset piedataset  =  new  DefaultPieDataset();
					piedataset.setValue("Tüm Gelirler", new Integer(300));
					piedataset.setValue("Personel", new Integer(150));
					piedataset.setValue("Malzeme", new Integer(20));
					piedataset.setValue("Elektrik", new Integer(20));
					piedataset.setValue("Su", new Integer(10));
					piedataset.setValue("Diðer", new Integer(40));
					
					
					JFreeChart chart = ChartFactory.createPieChart("Gelir Gider Tablosu",piedataset,true,true,true);
					chartpanel.setChart(chart);
					chartpanel.setVisible(true);
					
				
			}
		});
		btnRaporktsAl.setBounds(869, 569, 147, 34);
		panel_3.add(btnRaporktsAl);
		
		
		dcBitis = new JDateChooser();
		dcBitis.getCalendarButton().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		dcBitis.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				//JOptionPane.showMessageDialog(null, "message");
				
			}
		});
		chartpanel = new ChartPanel(null);
		chartpanel.setBounds(50, 389, 485, 246);
		panel_3.add(chartpanel);
		chartpanel.setVisible(false);
		
		
		dcBitis.setBounds(622, 74, 95, 20);
		panel_3.add(dcBitis);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 186, 476, 152);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Siparis No","Tutar","Ödeme Tarihi"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblGelirlerTablosu = new JLabel("Gelirler Tablosu");
		lblGelirlerTablosu.setBounds(67, 149, 130, 23);
		panel_3.add(lblGelirlerTablosu);
		
		JLabel label_3 = new JLabel("GiderlerTablosu");
		label_3.setBounds(576, 149, 130, 23);
		panel_3.add(label_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(576, 182, 470, 152);
		panel_3.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Tutar", "Ödeme Tarihi", "Açýklama","Ödeme Türü"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblGelirToplam = new JLabel("Gelir Toplam");
		lblGelirToplam.setBounds(68, 353, 111, 20);
		panel_3.add(lblGelirToplam);
		
		JLabel label_4 = new JLabel("Gider Toplam");
		label_4.setBounds(870, 349, 111, 20);
		panel_3.add(label_4);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(156, 353, 86, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(954, 349, 86, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_5 = new JLabel("Toplam Kazan\u00E7");
		label_5.setBounds(585, 569, 111, 20);
		panel_3.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(697, 569, 86, 20);
		panel_3.add(textField_2);
		
		JLabel lblBitiTarihi = new JLabel("Biti\u015F Tarihi");
		lblBitiTarihi.setBounds(505, 74, 86, 20);
		panel_3.add(lblBitiTarihi);
		
		JLabel label = new JLabel("Ba\u015Flang\u0131\u00E7 Tarihi");
		label.setBounds(156, 74, 131, 20);
		panel_3.add(label);
		
		
		
		
		
		
		JLabel lblYoneticiRaporleri = new JLabel("RAPORLAMA");
		lblYoneticiRaporleri.setForeground(new Color(255, 255, 255));
		lblYoneticiRaporleri.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 25));
		lblYoneticiRaporleri.setBackground(new Color(60, 179, 113));
		lblYoneticiRaporleri.setBounds(550, 33, 276, 28);
		contentPane.add(lblYoneticiRaporleri);
		

		
		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
}
