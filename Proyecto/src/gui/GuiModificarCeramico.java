package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.InternalFrameListener;

import utils.constants;

import javax.swing.event.InternalFrameEvent;
import javax.swing.DefaultComboBoxModel;

public class GuiModificarCeramico extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JComboBox<String> cboModelo;
	private JButton btbCerrar;
	private JButton btnGrabar;

	public static String modicer;
	
	
	double p, a, l, e, c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiModificarCeramico frame = new GuiModificarCeramico();
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
	public GuiModificarCeramico() {
        addInternalFrameListener((InternalFrameListener) this);
		
		modicer = "modicer";
		
		setTitle("Mofidicar Cer\u00E1mico");
		setResizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 199);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(10, 11, 84, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio(S/)");
		lblNewLabel_1.setBounds(10, 36, 84, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Ancho (cm)");
		lblNewLabel_2.setBounds(10, 61, 84, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Largo (cm)");
		lblNewLabel_3.setBounds(10, 86, 84, 14);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Espesor (mm)");
		lblNewLabel_4.setBounds(10, 111, 84, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Contenido");
		lblNewLabel_5.setBounds(10, 136, 84, 14);
		getContentPane().add(lblNewLabel_5);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(104, 33, 200, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setBounds(104, 58, 200, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtLargo = new JTextField();
		txtLargo.setBounds(104, 83, 200, 20);
		getContentPane().add(txtLargo);
		txtLargo.setColumns(10);
		
		txtEspesor = new JTextField();
		txtEspesor.setBounds(104, 108, 200, 20);
		getContentPane().add(txtEspesor);
		txtEspesor.setColumns(10);
		
		txtContenido = new JTextField();
		txtContenido.setBounds(104, 133, 200, 20);
		getContentPane().add(txtContenido);
		txtContenido.setColumns(10);
		
		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener((ActionListener) this);
		cboModelo.addItem("Cinza Plus");
		cboModelo.addItem("Luxury");
		cboModelo.addItem("Austria");
		cboModelo.addItem("Yungay Mix");
		cboModelo.addItem("Thalía");
		cboModelo.setBounds(104, 7, 200, 22);
		getContentPane().add(cboModelo);
		
		btbCerrar = new JButton("Cerrar");
		btbCerrar.addActionListener((ActionListener) this);
		btbCerrar.setBounds(335, 7, 89, 23);
		getContentPane().add(btbCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener((ActionListener) this);
		btnGrabar.setBounds(335, 32, 89, 23);
		getContentPane().add(btnGrabar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btbCerrar) {
			actionPerformedBtbCerrar(e);
		}
	}
	
	//cerrar
	protected void actionPerformedBtbCerrar(ActionEvent e) {
		dispose();
		modicer=null;
	}
	public void internalFrameActivated(InternalFrameEvent e) {
	}
	public void internalFrameClosed(InternalFrameEvent e) {
	}
	public void internalFrameClosing(InternalFrameEvent e) {
		if (e.getSource() == this) {
			internalFrameClosingThis(e);
		}
	}
	public void internalFrameDeactivated(InternalFrameEvent e) {
	}
	public void internalFrameDeiconified(InternalFrameEvent e) {
	}
	public void internalFrameIconified(InternalFrameEvent e) {
	}
	public void internalFrameOpened(InternalFrameEvent e) {
	}
	
	//boton X
	protected void internalFrameClosingThis(InternalFrameEvent e) {
		dispose();
		modicer=null;
	}
	
	//item del cbo
	protected void actionPerformedCboModelo(ActionEvent e) {
		int inicio = cboModelo.getSelectedIndex();
		 if (inicio == 0) {
				txtPrecio.setText(String.valueOf(constants.precio0));
				txtAncho.setText(String.valueOf(constants.ancho0));
				txtLargo.setText(String.valueOf(constants.largo0));
				txtEspesor.setText(String.valueOf(constants.espesor0));
				txtContenido.setText(String.valueOf(constants.contenido0));
				}
		 if (inicio == 1) {
				txtPrecio.setText(String.valueOf(constants.precio1));
				txtAncho.setText(String.valueOf(constants.ancho1));
				txtLargo.setText(String.valueOf(constants.largo1));
				txtEspesor.setText(String.valueOf(constants.espesor1));
				txtContenido.setText(String.valueOf(constants.contenido1));
		 }
		 if (inicio == 2) {
			 	txtPrecio.setText(String.valueOf(constants.precio2));
				txtAncho.setText(String.valueOf(constants.ancho2));
				txtLargo.setText(String.valueOf(constants.largo2));
				txtEspesor.setText(String.valueOf(constants.espesor2));
				txtContenido.setText(String.valueOf(constants.contenido2));
		 }
		 if (inicio == 3) {
			 	txtPrecio.setText(String.valueOf(constants.precio3));
				txtAncho.setText(String.valueOf(constants.ancho3));
				txtLargo.setText(String.valueOf(constants.largo3));
				txtEspesor.setText(String.valueOf(constants.espesor3));
				txtContenido.setText(String.valueOf(constants.contenido3));
		 }
		 if (inicio == 4) {
			 	txtPrecio.setText(String.valueOf(constants.precio4));
				txtAncho.setText(String.valueOf(constants.ancho4));
				txtLargo.setText(String.valueOf(constants.largo4));
				txtEspesor.setText(String.valueOf(constants.espesor4));
				txtContenido.setText(String.valueOf(constants.contenido4));
		 }
	}
	
	
	//boton grabar
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		//declarar variable
		String modelo = cboModelo.getSelectedItem().toString();
		//ingresar datos
	    double precio = Double.parseDouble(txtPrecio.getText());
	    double ancho = Double.parseDouble(txtAncho.getText());
	    double largo = Double.parseDouble(txtLargo.getText());
	    double espesor = Double.parseDouble(txtEspesor.getText());
	    int contenido = Integer.parseInt(txtContenido.getText());

	    int inicio = cboModelo.getSelectedIndex();
	    if (inicio >= 0 && inicio <= 4) {
	        switch (inicio) {
	            case 0:
	                constants.modelo0 = modelo;
	                constants.precio0 = precio;
	                constants.ancho0 = ancho;
	                constants.largo0 = largo;
	                constants.espesor0 = espesor;
	                constants.contenido0 = contenido;
	                break;
	            case 1:
	            	constants.modelo1 = modelo;
	            	constants.precio1 = precio;
	            	constants.ancho1 = ancho;
	            	constants.largo1 = largo;
	            	constants.espesor1 = espesor;
	            	constants.contenido0 = contenido;
	                break;
	            case 2:
	            	constants.modelo2 = modelo;
	            	constants.precio2 = precio;
	            	constants.ancho2 = ancho;
	            	constants.largo2 = largo;
	            	constants.espesor2 = espesor;
	            	constants.contenido0 = contenido;
	                break;
	            case 3:
	            	constants.modelo3 = modelo;
	            	constants.precio3 = precio;
	            	constants.ancho3 = ancho;
	            	constants.largo3 = largo;
	            	constants.espesor3 = espesor;
	            	constants.contenido0 = contenido;
	                break;
	            default:
	            	constants.modelo4 = modelo;
	            	constants.precio4 = precio;
	            	constants.ancho4 = ancho;
	            	constants.largo4 = largo;
	            	constants.espesor4 = espesor;
	            	constants.contenido0 = contenido;
	        }
	    }
		
	}
			
	
}
