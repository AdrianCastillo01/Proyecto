package configuración;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JInternalFrame;
import javax.swing.border.EtchedBorder;

import utils.constants;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;

public class ConfigurarObsequios extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtObsequio;
	private JTextField txtCant1;
	private JTextField txtCant2;
	private JTextField txtCant3;
	private JButton btnAceptar;
	private JButton btnCancelar;
	public static String configobs;
	private JPanel alertPanel = new JPanel();


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
		setClosable(true);
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setTitle("Configurar Obsequios");
		setBounds(100, 100, 375, 191);
		
		lblNewLabel = new JLabel("Tipo de Obsequio");
		lblNewLabel.setBounds(10, 11, 86, 14);
		
		lblNewLabel_1 = new JLabel("1 a 5 unidades");
		lblNewLabel_1.setBounds(10, 36, 86, 14);
		
		lblNewLabel_2 = new JLabel("6 a 10 unidades");
		lblNewLabel_2.setBounds(10, 61, 86, 14);
		
		lblNewLabel_3 = new JLabel("11 a m\u00E1s unidades");
		lblNewLabel_3.setBounds(10, 86, 86, 14);
		
		txtObsequio = new JTextField();
		txtObsequio.setBounds(125, 8, 86, 20);
		txtObsequio.setText("Lapicero");
		txtObsequio.setColumns(10);
		
		txtCant1 = new JTextField();
		txtCant1.setBounds(125, 33, 86, 20);
		txtCant1.setText("2");
		txtCant1.setColumns(10);
		
		txtCant2 = new JTextField();
		txtCant2.setBounds(125, 58, 86, 20);
		txtCant2.setText("3");
		txtCant2.setColumns(10);
		
		txtCant3 = new JTextField();
		txtCant3.setBounds(125, 83, 86, 20);
		txtCant3.setText("4");
		txtCant3.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(272, 7, 89, 23);
		btnAceptar.addActionListener(this);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(272, 36, 89, 23);
		btnCancelar.addActionListener(this);
		getContentPane().setLayout(null);
		getContentPane().add(lblNewLabel);
		getContentPane().add(lblNewLabel_1);
		getContentPane().add(lblNewLabel_2);
		getContentPane().add(lblNewLabel_3);
		getContentPane().add(txtObsequio);
		getContentPane().add(txtCant1);
		getContentPane().add(txtCant2);
		getContentPane().add(txtCant3);
		getContentPane().add(btnAceptar);
		getContentPane().add(btnCancelar);
		
		alertPanel = new JPanel();
		alertPanel.setBounds(10, 141, 338, 10);
		getContentPane().add(alertPanel);
	
	{
		JPanel alertPane = new JPanel();
		alertPane.setLayout((LayoutManager) new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(alertPane, BorderLayout.SOUTH);}
	{
	Obsequios();	
	}
	}
	

    
	void Obsequios() {
		txtObsequio.setText(String.valueOf(constants.tipoObsequio));
		txtCant1.setText(String.valueOf (constants.obsequioCantidad1));
		txtCant2.setText(String.valueOf(constants.obsequioCantidad2));
		txtCant3.setText(String.valueOf(constants.obsequioCantidad3));
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnNewButton(e);
		}
		
	}
	void cambiar() {
		constants.tipoObsequio=txtObsequio.getText();
		constants.obsequioCantidad1=Integer.parseInt(txtCant1.getText());
		constants.obsequioCantidad2=Integer.parseInt(txtCant2.getText());
		constants.obsequioCantidad3=Integer.parseInt(txtCant3.getText());	 
	}
	
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		cambiar();
		JOptionPane.showMessageDialog(null, "Está seguro de cambiar el obsequio?",
                "",JOptionPane.QUESTION_MESSAGE);
		
		dispose();
	
	
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		
		dispose();
	}
}
