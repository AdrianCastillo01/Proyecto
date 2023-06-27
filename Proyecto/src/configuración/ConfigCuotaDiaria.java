package configuración;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import utils.constants;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigCuotaDiaria extends JInternalFrame implements ActionListener {
	private JPanel panel = new JPanel();
	private JLabel lblNewLabel;
	private JTextField txtCuota;
	private JButton btnAceptar;
	private JButton btnCancelar;
	public static String configcuota;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigCuotaDiaria frame = new ConfigCuotaDiaria();
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
	public ConfigCuotaDiaria() {
		setBorder(UIManager.getBorder("FileChooser.listViewBorder"));
		setTitle("Configurar cuota diaria ");
		setResizable(true);
		setClosable(true);
		setBounds(100, 100, 425, 123);
		
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Cuota diaria esperada (S/.)");
		lblNewLabel.setBounds(10, 24, 148, 14);
		panel.add(lblNewLabel);
		
		txtCuota = new JTextField();
		txtCuota.setBounds(162, 21, 86, 20);
		panel.add(txtCuota);
		txtCuota.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(307, 20, 89, 23);
		panel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(307, 54, 89, 23);
		panel.add(btnCancelar);
		
		cargarCuota();

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
		private void cargarCuota() {
			txtCuota.setText(String.valueOf(constants.cuotaDiaria));
		}
	
		double GrabarcuotaDiaria(double cuotaDiaria) {	      
		     return cuotaDiaria;	         
		    }
			
		protected void actionPerformedBtnAceptar(ActionEvent e) {
			try {
				 constants.cuotaDiaria = Double.parseDouble(txtCuota.getText());
				 GrabarcuotaDiaria(constants.cuotaDiaria);
				 
				 JOptionPane.showMessageDialog(null, "La cuota diaria fue cambiada correctamente");
				 dispose();
			} catch (Exception ex) {
			}
		}
		protected void actionPerformedBtnCancelar(ActionEvent e) {
			dispose();
		}
	}
