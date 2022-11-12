package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class VistaOperario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaOperario frame = new VistaOperario();
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
	public VistaOperario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelOperario = new JPanel();
		contentPane.add(panelOperario, BorderLayout.CENTER);
		panelOperario.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelEstadoMozo = new JPanel();
		panelOperario.add(panelEstadoMozo);
		panelEstadoMozo.setLayout(new GridLayout(2, 2, 0, 0));
		
		JScrollPane scrollPaneMozosEstado = new JScrollPane();
		panelEstadoMozo.add(scrollPaneMozosEstado);
		
		JList listMozosEstado = new JList();
		scrollPaneMozosEstado.setViewportView(listMozosEstado);
		
		JPanel panelEstados = new JPanel();
		panelEstadoMozo.add(panelEstados);
		panelEstados.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton botonActivo = new JButton("Activo");
		panelEstados.add(botonActivo);
		
		JButton botonAusente = new JButton("Ausente");
		panelEstados.add(botonAusente);
		
		JButton botonDeFranco = new JButton("De franco");
		panelEstados.add(botonDeFranco);
		
		JPanel panelAsignacion = new JPanel();
		panelOperario.add(panelAsignacion);
		panelAsignacion.setLayout(new GridLayout(2, 1, 0, 0));
		
		JScrollPane scrollPaneMesas = new JScrollPane();
		panelAsignacion.add(scrollPaneMesas);
		
		JList listMesas = new JList();
		scrollPaneMesas.setViewportView(listMesas);
		
		JPanel panelBotones = new JPanel();
		panelAsignacion.add(panelBotones);
		panelBotones.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panelBotonAsignar = new JPanel();
		panelBotones.add(panelBotonAsignar);
		
		JButton botonAsignar = new JButton("Asignar");
		panelBotonAsignar.add(botonAsignar);
		
		JPanel panelBotonVovler = new JPanel();
		panelBotones.add(panelBotonVovler);
		
		JButton botonVolver = new JButton("Volver");
		panelBotonVovler.add(botonVolver);
	}

}
