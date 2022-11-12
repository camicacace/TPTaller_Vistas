package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class VistaModificaMesa extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNroMesa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaModificaMesa frame = new VistaModificaMesa();
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
	public VistaModificaMesa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelModificaMesa = new JPanel();
		contentPane.add(panelModificaMesa, BorderLayout.CENTER);
		panelModificaMesa.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelAgregaMesa = new JPanel();
		panelModificaMesa.add(panelAgregaMesa);
		panelAgregaMesa.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panelNroMesa = new JPanel();
		panelAgregaMesa.add(panelNroMesa);
		panelNroMesa.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelLabelNroMesa = new JPanel();
		panelNroMesa.add(panelLabelNroMesa);
		
		JLabel labelNroMesa = new JLabel("Numero de mesa:");
		panelLabelNroMesa.add(labelNroMesa);
		
		JPanel panelTextNroMesa = new JPanel();
		panelNroMesa.add(panelTextNroMesa);
		
		textFieldNroMesa = new JTextField();
		panelTextNroMesa.add(textFieldNroMesa);
		textFieldNroMesa.setColumns(10);
		
		JPanel panelComensales = new JPanel();
		panelAgregaMesa.add(panelComensales);
		panelComensales.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelLabelComensales = new JPanel();
		panelComensales.add(panelLabelComensales);
		
		JLabel labelComnesales = new JLabel("Cantidad de comensales:");
		panelLabelComensales.add(labelComnesales);
		
		JPanel panelSpinnerComensales = new JPanel();
		panelComensales.add(panelSpinnerComensales);
		
		JSpinner spinnerCantComensales = new JSpinner();
		panelSpinnerComensales.add(spinnerCantComensales);
		
		JPanel panelBotonAgregar = new JPanel();
		panelAgregaMesa.add(panelBotonAgregar);
		
		JButton botonAgregar = new JButton("Agregar");
		panelBotonAgregar.add(botonAgregar);
		
		JPanel panelEliminarMesa = new JPanel();
		panelModificaMesa.add(panelEliminarMesa);
		panelEliminarMesa.setLayout(new GridLayout(3, 0, 0, 0));
		
		JScrollPane scrollPaneMesas = new JScrollPane();
		panelEliminarMesa.add(scrollPaneMesas);
		
		JList listMesas = new JList();
		scrollPaneMesas.setViewportView(listMesas);
		
		JPanel panelBotonEliminar = new JPanel();
		panelEliminarMesa.add(panelBotonEliminar);
		
		JButton botonEliminar = new JButton("Eliminar");
		panelBotonEliminar.add(botonEliminar);
		
		JPanel panelBotonVolver = new JPanel();
		panelEliminarMesa.add(panelBotonVolver);
		
		JButton botonVolver = new JButton("Volver");
		panelBotonVolver.add(botonVolver);
	}

}
