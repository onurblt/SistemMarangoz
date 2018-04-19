package nku.sistemanalizi.marangoz.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class DepoMalzeme extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepoMalzeme frame = new DepoMalzeme();
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
	public DepoMalzeme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ýþlem Tarihi\n"
				+ "Belge No\n"
				+ ""+"Sipariþ Satýr no\n"
						+ "Malzeme Id \n"
						+ "Miktar Adet\n"
						+ "Toplam Miktar\n"
						+ "");
		lblNewLabel.setBounds(96, 59, 375, 366);
		contentPane.add(lblNewLabel);
	}
}
