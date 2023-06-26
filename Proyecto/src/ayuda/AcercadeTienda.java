package ayuda;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class AcercadeTienda extends JInternalFrame {

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
		setBounds(100, 100, 450, 300);

	}

}
