package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class GuiListarCeramicos extends JInternalFrame {

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
		setBounds(100, 100, 450, 300);

	}

}
