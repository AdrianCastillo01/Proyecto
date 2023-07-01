package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.GuiConsultarCeramico;

import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.SystemColor;

public class Tienda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JDesktopPane escritorio;
	
	
	
	
	private JMenuBar menuBar;
	private JMenu Archivo;
	private JMenu Mantenimiento;
	private JMenu Ventas;
	private JMenu Configuracion;
	private JMenu Ayuda;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmConsultarCeramico;
	private JMenuItem mntmModificarCeramico;
	private JMenuItem mntmListarCeramicos;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigCantidadOptima;
	private JMenuItem mntmConfigCuotaDiaria;
	private JMenuItem mntmAcercaTienda;
	private JMenuItem mntmConfigObsequios;
	private JMenuItem mntmConfigDescuentos;
	

	/**			
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					//frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 465);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		Archivo = new JMenu("Archivo");
		menuBar.add(Archivo);
		
		mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(this);
		Archivo.add(mntmNewMenuItem);
		
		Mantenimiento = new JMenu("Mantenimiento");
		menuBar.add(Mantenimiento);
		
		mntmConsultarCeramico = new JMenuItem("Consultar cer\u00E1mico");
		mntmConsultarCeramico.addActionListener(this);
		Mantenimiento.add(mntmConsultarCeramico);
		
		mntmModificarCeramico = new JMenuItem("Modificar cer\u00E1mico");
		mntmModificarCeramico.addActionListener(this);
		Mantenimiento.add(mntmModificarCeramico);
		
		mntmListarCeramicos = new JMenuItem("Listar cer\u00E1micos");
		mntmListarCeramicos.addActionListener(this);
		Mantenimiento.add(mntmListarCeramicos);
		
		Ventas = new JMenu("Ventas");
		menuBar.add(Ventas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		Ventas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		Ventas.add(mntmGenerarReportes);
		
		Configuracion = new JMenu("Configuraci\u00F3n");
		menuBar.add(Configuracion);
		
		mntmConfigDescuentos = new JMenuItem("Configurar descuentos ");
		mntmConfigDescuentos.addActionListener(this);
		Configuracion.add(mntmConfigDescuentos);
		
		mntmConfigObsequios = new JMenuItem("Configurar obsequios ");
		mntmConfigObsequios.addActionListener(this);
		Configuracion.add(mntmConfigObsequios);
		
		mntmConfigCantidadOptima = new JMenuItem("Configurar cantidad \u00F3ptima");
		mntmConfigCantidadOptima.addActionListener(this);
		Configuracion.add(mntmConfigCantidadOptima);
		
		mntmConfigCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mntmConfigCuotaDiaria.addActionListener(this);
		Configuracion.add(mntmConfigCuotaDiaria);
		
		Ayuda = new JMenu("Ayuda");
		Ayuda.addActionListener(this);
		menuBar.add(Ayuda);
		
		mntmAcercaTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaTienda.addActionListener(this);
		Ayuda.add(mntmAcercaTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		escritorio = new JDesktopPane();
		escritorio.setBackground(SystemColor.inactiveCaption);
		contentPane.add(escritorio, "name_399908657500700");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmAcercaTienda) {
			actionPerformedMntmAcercaTienda(e);
		}
		if (e.getSource() == Ayuda) {
			actionPerformedMntmAcercaTienda(e);
		}
		if (e.getSource() == mntmConfigCuotaDiaria) {
			actionPerformedMntmConfigCuotaDiaria(e);
		}
		if (e.getSource() == mntmConfigCantidadOptima) {
			actionPerformedMntmConfigCantidadOptima(e);
		}
		if (e.getSource() == mntmConfigObsequios) {
			actionPerformedMntmConfigObsequios(e);
		}
		if (e.getSource() == mntmConfigDescuentos) {
			actionPerformedMntmConfigDescuentos(e);
		}
		if (e.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmListarCeramicos) {
			actionPerformedMntmListarCeramicos(e);
		}
		if (e.getSource() == mntmModificarCeramico) {
			actionPerformedMntmModificarCeramico(e);
		}
		
		if (e.getSource() == mntmConsultarCeramico) {
			actionPerformedMntmConsultarCeramico(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(e);
		}
		
		
	}
	
	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {
		
		dispose();
		
	}
	
	protected void actionPerformedMntmConsultarCeramico(ActionEvent e) {
		
		//declaración para invocar la variable estática consultcer que está en GuiConsultarCerámico
		String p=GuiConsultarCeramico.concer;
		if(p==null) {
			GuiConsultarCeramico concer=new GuiConsultarCeramico();
			escritorio.add(concer);
			concer.setVisible(true);
		}
		
		
	}
	protected void actionPerformedMntmModificarCeramico(ActionEvent e) {
		String p=GuiModificarCeramico.modicer;
		if(p==null) {
			GuiModificarCeramico modicer=new GuiModificarCeramico();
			escritorio.add(modicer);
			modicer.setVisible(true);
		}
	
		
		
		
	}
	protected void actionPerformedMntmListarCeramicos(ActionEvent e) {
		String p=GuiListarCeramicos.listacer;
		if(p==null) {
			GuiListarCeramicos listacer=new GuiListarCeramicos();
			escritorio.add(listacer);
			listacer.setVisible(true);
			}
		
		
		
		
	}
	protected void actionPerformedMntmVender(ActionEvent e) {
		String p=Vender.ven;
		if(p==null) {
			Vender ven= new Vender();
			escritorio.add(ven);
			ven.setVisible(true);
		}
		
		
		
		
		
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent e) {
		String p=GenerarReportes.genrep;
		if(p==null) {
			GenerarReportes genrep=new GenerarReportes();
			escritorio.add(genrep);
			genrep.setVisible(true);
			
		}
		
		

		
	}
	protected void actionPerformedMntmConfigDescuentos(ActionEvent e) {
		String p=ConfigurarDescuentos.configdes;
		if(p==null) {
			ConfigurarDescuentos configdes=new ConfigurarDescuentos();
			escritorio.add(configdes);
			configdes.setVisible(true);}
	
		
		
	}
	protected void actionPerformedMntmConfigObsequios(ActionEvent e) {
		String p=ConfigurarObsequios.configobs;
		if(p==null) {
			ConfigurarObsequios configobs=new ConfigurarObsequios();
			escritorio.add(configobs);
			configobs.setVisible(true);}	
	    
		}
		
		

		
	
	protected void actionPerformedMntmConfigCantidadOptima(ActionEvent e) {
		
		String p=ConfigurarCantOpt.configcantot;
		if(p==null) {
			ConfigurarCantOpt configcantot=new ConfigurarCantOpt();
			escritorio.add(configcantot);
			configcantot.setVisible(true);
			}
		
		

		
	}
	protected void actionPerformedMntmConfigCuotaDiaria(ActionEvent e) {
		String p=ConfigCuotaDiaria.configcuota;
		if(p==null) {
			ConfigCuotaDiaria configcuota=new ConfigCuotaDiaria();
			escritorio.add(configcuota);
			configcuota.setVisible(true);
		}
		


	}
	
	protected void actionPerformedMntmAcercaTienda(ActionEvent e) {
		String p=AcercadeTienda.acercade;
		if(p==null) {
			AcercadeTienda acercade=new AcercadeTienda();
			escritorio.add(acercade);
			acercade.setVisible(true);
		}
	}
}
