package ayuda;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AcercadeTienda extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblAutores;
	private JLabel lblAdrian;
	private JLabel lblAutores_2;
	private JLabel lblAutores_3;
	private JButton btnNewButton;
	public static String acercade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcercadeTienda frame = new AcercadeTienda();
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
	public AcercadeTienda() {
		setClosable(true);
		setBorder(UIManager.getBorder("OptionPane.messageAreaBorder"));
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Tienda 1.0");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(176, 0, 117, 53);
		getContentPane().add(lblNewLabel);
		
		separator = new JSeparator();
		separator.setBounds(0, 53, 450, 2);
		getContentPane().add(separator);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAutores.setBounds(198, 64, 72, 44);
		getContentPane().add(lblAutores);
		
		lblAdrian = new JLabel("Adrian Castillo Mendoza");
		lblAdrian.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdrian.setBounds(165, 92, 142, 44);
		getContentPane().add(lblAdrian);
		
		lblAutores_2 = new JLabel("Silvia Laurente Ramos");
		lblAutores_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAutores_2.setBounds(173, 128, 134, 44);
		getContentPane().add(lblAutores_2);
		
		lblAutores_3 = new JLabel("Joaquin");
		lblAutores_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAutores_3.setBounds(165, 169, 134, 44);
		getContentPane().add(lblAutores_3);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(183, 224, 104, 23);
		getContentPane().add(btnNewButton);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		dispose();
		acercade=null;
	}
}
