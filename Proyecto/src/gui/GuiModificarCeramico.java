package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class GuiModificarCeramico extends JInternalFrame {

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
		setBounds(100, 100, 450, 300);

	}

}
