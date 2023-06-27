package configuración;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import utils.constants;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarDescuentos extends JInternalFrame implements ActionListener {
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblA;
	private JLabel lblA_1;
	private JLabel lblMsDe;
	private JTextField txtDescuento1;
	private JTextField txtDescuento2;
	private JTextField txtDescuento3;
	private JTextField txtDescuento4;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;
	private JButton btnCancelar;
	public static String configdes;
	private JPanel alertPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarDescuentos frame = new ConfigurarDescuentos();
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
	public ConfigurarDescuentos() {
		setBorder(null);
		setClosable(true);
		setTitle("Configurar Descuentos");
		setBounds(100, 100, 450, 188);
		
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("1 a 5 unidades");
		lblNewLabel.setBounds(10, 32, 96, 14);
		panel.add(lblNewLabel);
		
		lblA = new JLabel("5 a 10 unidades");
		lblA.setBounds(10, 57, 96, 14);
		panel.add(lblA);
		
		lblA_1 = new JLabel("10 a  15 unidades");
		lblA_1.setBounds(10, 83, 96, 14);
		panel.add(lblA_1);
		
		lblMsDe = new JLabel("M\u00E1s de 15 unidades");
		lblMsDe.setBounds(10, 108, 96, 14);
		panel.add(lblMsDe);
		
		txtDescuento1 = new JTextField();
		txtDescuento1.setBounds(116, 29, 86, 20);
		panel.add(txtDescuento1);
		txtDescuento1.setColumns(10);
		
		txtDescuento2 = new JTextField();
		txtDescuento2.setColumns(10);
		txtDescuento2.setBounds(116, 54, 86, 20);
		panel.add(txtDescuento2);
		
		txtDescuento3 = new JTextField();
		txtDescuento3.setColumns(10);
		txtDescuento3.setBounds(116, 80, 86, 20);
		panel.add(txtDescuento3);
		
		txtDescuento4 = new JTextField();
		txtDescuento4.setColumns(10);
		txtDescuento4.setBounds(116, 105, 86, 20);
		panel.add(txtDescuento4);
		
		lblNewLabel_1 = new JLabel("%");
		lblNewLabel_1.setBounds(212, 32, 46, 14);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("%");
		lblNewLabel_2.setBounds(212, 57, 46, 14);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("%");
		lblNewLabel_3.setBounds(212, 83, 46, 14);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setBounds(212, 108, 46, 14);
		panel.add(lblNewLabel_4);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(337, 28, 89, 23);
		panel.add(btnNewButton);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(337, 53, 89, 23);
		panel.add(btnCancelar);
		
		alertPanel = new JPanel();
		getContentPane().add(alertPanel, BorderLayout.SOUTH);
	
		Descuento();

	} 

    void Descuento() {
    	
    	txtDescuento1.setText(String.valueOf(constants.porcentaje1));
    	txtDescuento2.setText(String.valueOf(constants.porcentaje2));
    	txtDescuento3.setText(String.valueOf(constants.porcentaje3));
    	txtDescuento4.setText(String.valueOf(constants.porcentaje4));
    	
    }
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
		constants.porcentaje1 =Double.parseDouble(txtDescuento1.getText());
		constants.porcentaje2 =Double.parseDouble(txtDescuento2.getText());
		constants.porcentaje3 =Double.parseDouble(txtDescuento3.getText());
		constants.porcentaje4 =Double.parseDouble(txtDescuento4.getText());
		
		JOptionPane.showMessageDialog(null, "Está seguro de cambiar los descuentos?", "", JOptionPane.QUESTION_MESSAGE);
		dispose();
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
