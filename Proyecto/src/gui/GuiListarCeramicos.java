package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.event.InternalFrameListener;

import utils.constants;

import javax.swing.event.InternalFrameEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiListarCeramicos extends JInternalFrame {
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnListar;
	private JButton btnCerrar;
	
	public static String listacer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiListarCeramicos frame = new GuiListarCeramicos();
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
	public GuiListarCeramicos() {
		addInternalFrameListener((InternalFrameListener) this);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 214);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener((ActionListener) this);
		btnListar.setBounds(256, 236, 89, 23);
		getContentPane().add(btnListar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener((ActionListener) this);
		btnCerrar.setBounds(96, 236, 89, 23);
		getContentPane().add(btnCerrar);


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
	//botn X
	protected void internalFrameClosingThis(InternalFrameEvent e) {
		dispose();
		listacer=null;
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	//btn cerrar
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
		listacer=null;
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		listar();
	}
	//listar void
			void listar() {
				txtS.setText("");
				imprimir("LISTADO DE CERÁMICOS");
				imprimir("");
				imprimir("Modelo        : " + constants.modelo0);
				imprimir("Precio        : S/.  " + constants.precio0);
				imprimir("Ancho (cm)    : " + constants.ancho0 + "cm");
				imprimir("Largo (cm)    : " + constants.largo0 + "cm");
				imprimir("Espesor (mm)  : " + constants.espesor0 + "mm");
				imprimir("Contenido     : " + constants.contenido0 + " unidades");
				imprimir("");
				imprimir("Modelo        : " + constants.modelo1);
				imprimir("Precio        : S/.  " + constants.precio1);
				imprimir("Ancho (cm)    : " + constants.ancho1 + "cm");
				imprimir("Largo (cm)    : " + constants.largo1 + "cm");
				imprimir("Espesor (mm)  : " + constants.espesor1 + " mm");
				imprimir("Contenido     : " + constants.contenido1 + " unidades");
				imprimir("");
				imprimir("Modelo        : " + constants.modelo1);
				imprimir("Precio        : S/.  " + constants.precio2);
				imprimir("Ancho (cm)    : " + constants.ancho2 + "cm");
				imprimir("Largo (cm)    : " + constants.largo2 + "cm");
				imprimir("Espesor (mm)  : " + constants.espesor2 + " mm");
				imprimir("Contenido     : " + constants.contenido2 + " unidades");
				imprimir("");
				imprimir("Modelo        : " + constants.modelo3);
				imprimir("Precio        : S/.  " + constants.precio3);
				imprimir("Ancho (cm)    : " + constants.ancho3 + "cm");
				imprimir("Largo (cm)    : " + constants.largo3 + "cm");
				imprimir("Espesor (mm)  : " + constants.espesor3 + " mm");
				imprimir("Contenido     : " + constants.contenido3 + " unidades");
				imprimir("");
				imprimir("Modelo        : " + constants.modelo4);
				imprimir("Precio        : S/.  " + constants.precio4);
				imprimir("Ancho (cm)    : " + constants.ancho4 + "cm");
				imprimir("Largo (cm)    : " + constants.largo4 + "cm");
				imprimir("Espesor (mm)  : " + constants.espesor4 + " mm");
				imprimir("Contenido     : " + constants.contenido4 + " unidades");
				imprimir("");
			}
			//salto de linea
			void imprimir(String s) {
				txtS.append(s + "\n");
			}
}
