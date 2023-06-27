package configuración;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.UIManager;

import utils.constants;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarCantOpt extends JInternalFrame implements ActionListener {
	private JPanel panel = new JPanel();
	private JLabel lblNewLabel;
	private JTextField txtCantidad;
	private JButton btnAceptar;
	private JButton btnCancelar;
	public static String configcantot;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarCantOpt frame = new ConfigurarCantOpt();
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
	public ConfigurarCantOpt() {
		setClosable(true);
		setTitle("Configurar cantidad \u00F3ptima");
		setBorder(UIManager.getBorder("Menu.border"));
		setResizable(true);
		setBounds(100, 100, 384, 126);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
		lblNewLabel.setBounds(10, 22, 195, 14);
		panel.add(lblNewLabel);
		
		txtCantidad = new JTextField();
		txtCantidad.setText("10");
		txtCantidad.setBounds(210, 19, 39, 20);
		panel.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(271, 18, 89, 23);
		panel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(271, 52, 89, 23);
		panel.add(btnCancelar);
		
		cargarCantidad();

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	
	//Método para la cargar la cantidad óptima
	private void cargarCantidad() {
		txtCantidad.setText(String.valueOf(constants.cantidadOptima));
	}
	
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		try {
			constants.cantidadOptima = Integer.parseInt(txtCantidad.getText());
			JOptionPane.showMessageDialog(null, "Está seguro de cambiar la cantidad óptima de unidades vendidas? ", "",JOptionPane.QUESTION_MESSAGE);
			
			dispose();
		} catch (Exception ex) {
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
