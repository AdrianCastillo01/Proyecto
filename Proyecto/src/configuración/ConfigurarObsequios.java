package configuración;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarObsequios extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtObsequio;
	private JTextField txtCant1;
	private JTextField txtCant2;
	private JTextField txtCant3;
	private JButton btnNewButton;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarObsequios frame = new ConfigurarObsequios();
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
	public ConfigurarObsequios() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setTitle("Configurar Obsequios");
		setBounds(100, 100, 375, 145);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Tipo de Obsequio");
		lblNewLabel.setBounds(10, 11, 86, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("1 a 5 unidades");
		lblNewLabel_1.setBounds(10, 36, 86, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("6 a 10 unidades");
		lblNewLabel_2.setBounds(10, 61, 86, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("11 a m\u00E1s unidades");
		lblNewLabel_3.setBounds(10, 86, 86, 14);
		getContentPane().add(lblNewLabel_3);
		
		txtObsequio = new JTextField();
		txtObsequio.setBounds(125, 8, 86, 20);
		getContentPane().add(txtObsequio);
		txtObsequio.setColumns(10);
		
		txtCant1 = new JTextField();
		txtCant1.setColumns(10);
		txtCant1.setBounds(125, 33, 86, 20);
		getContentPane().add(txtCant1);
		
		txtCant2 = new JTextField();
		txtCant2.setColumns(10);
		txtCant2.setBounds(125, 58, 86, 20);
		getContentPane().add(txtCant2);
		
		txtCant3 = new JTextField();
		txtCant3.setColumns(10);
		txtCant3.setBounds(125, 83, 86, 20);
		getContentPane().add(txtCant3);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(272, 7, 89, 23);
		getContentPane().add(btnNewButton);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(272, 36, 89, 23);
		getContentPane().add(btnCancelar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	}
}
