package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.InternalFrameListener;

import utils.constants;

import javax.swing.event.InternalFrameEvent;

public class GuiConsultarCeramico extends JInternalFrame implements ActionListener, InternalFrameListener {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JComboBox cboModelo;
	public static JTextField txtAncho;
	public static JTextField txtLargo;
	public static JTextField txtEspesor;
	public static JTextField txtContenido;
	public static JButton btnCerrar;
	
	public static String concer;
	private JTextField txtPrecio;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//GuiConsultarCeramico frame = new GuiConsultarCeramico();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiConsultarCeramico() {
		addInternalFrameListener(this);
		
		concer="concer";
		setClosable(true);
		setBackground(new Color(255, 255, 255));
		setBorder(null);
		setTitle("Consultar Cer\u00E1mico");
		setResizable(true);
		setBounds(100, 100, 329, 191);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(10, 11, 46, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio (S/)");
		lblNewLabel_1.setBounds(10, 36, 56, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Ancho (cm)");
		lblNewLabel_2.setBounds(10, 61, 56, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Largo (cm)");
		lblNewLabel_3.setBounds(10, 86, 56, 14);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Espesor (mm)");
		lblNewLabel_4.setBounds(10, 111, 73, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Contenido");
		lblNewLabel_5.setBounds(10, 136, 73, 14);
		getContentPane().add(lblNewLabel_5);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa"}));
		cboModelo.setBounds(92, 7, 125, 22);
		getContentPane().add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(92, 33, 125, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(92, 58, 125, 20);
		getContentPane().add(txtAncho);
		
		txtLargo = new JTextField();
		txtLargo.setEditable(false);
		txtLargo.setColumns(10);
		txtLargo.setBounds(92, 83, 125, 20);
		getContentPane().add(txtLargo);
		
		txtEspesor = new JTextField();
		txtEspesor.setEditable(false);
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(92, 108, 125, 20);
		getContentPane().add(txtEspesor);
		
		txtContenido = new JTextField();
		txtContenido.setEditable(false);
		txtContenido.setColumns(10);
		txtContenido.setBounds(92, 133, 125, 20);
		getContentPane().add(txtContenido);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(227, 7, 89, 23);
		getContentPane().add(btnCerrar);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(92, 33, 125, 20);
		getContentPane().add(txtPrecio);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		
		dispose();
		concer=null;
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
	protected void internalFrameClosingThis(InternalFrameEvent e) {
		dispose();
		concer=null;
	}
	protected void actionPerformedCboModelo(ActionEvent e) {
		
		
		int m;
		m = leerModelo( );
		mostrarDatos(m);
		
	}
		
	    int leerModelo( ) {
			
			return cboModelo.getSelectedIndex();
		}
	    
	    void mostrarDatos(int m) {

	    	switch(m) {
	    	case 0:
	    	    
	    		txtPrecio.setText(String.valueOf(constants.precio0));
	    		txtAncho.setText(String.valueOf(constants.ancho0));
	    		txtLargo.setText(String.valueOf(constants.largo0));
	    		txtEspesor.setText(String.valueOf(constants.espesor0));
	    		txtContenido.setText(String.valueOf(constants.contenido0));break;
	    		
            case 1:
	    	    
	    		txtPrecio.setText(String.valueOf(constants.precio1));
	    		txtAncho.setText(String.valueOf(constants.ancho1));
	    		txtLargo.setText(String.valueOf(constants.largo1));
	    		txtEspesor.setText(String.valueOf(constants.espesor1));
	    		txtContenido.setText(String.valueOf(constants.contenido1));break;
             
            case 2:
    
	            txtPrecio.setText(String.valueOf(constants.precio2));
	            txtAncho.setText(String.valueOf(constants.ancho2));
	            txtLargo.setText(String.valueOf(constants.largo2));
	            txtEspesor.setText(String.valueOf(constants.espesor2));
	            txtContenido.setText(String.valueOf(constants.contenido2));break;
	            
            case 3:
            	txtPrecio.setText(String.valueOf(constants.precio3));
	            txtAncho.setText(String.valueOf(constants.ancho3));
	            txtLargo.setText(String.valueOf(constants.largo3));
	            txtEspesor.setText(String.valueOf(constants.espesor3));
	            txtContenido.setText(String.valueOf(constants.contenido3));break;
	            
	        default:
	        	txtPrecio.setText(String.valueOf(constants.precio4));
	            txtAncho.setText(String.valueOf(constants.ancho4));
	            txtLargo.setText(String.valueOf(constants.largo4));
	            txtEspesor.setText(String.valueOf(constants.espesor4));
	            txtContenido.setText(String.valueOf(constants.contenido4));break;
	            	
	    		
	    	}
	    	
	    }
	    	
	    }
	    
	   
	


