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
	private JPanel panelModificaMesa;
	private JPanel panelAgregaMesa;
	private JPanel panelNroMesa;
	private JPanel panelLabelNroMesa;
	private JPanel panelTextNroMesa;
	private JLabel labelNroMesa;
	private JPanel panelComensales;
	private JPanel panelLabelComensales;
	private JLabel labelComnesales;
	private JPanel panelSpinnerComensales;
	private JSpinner spinnerCantComensales;
	private JPanel panelBotonAgregar;
	private JButton botonAgregar;
	private JPanel panelEliminarMesa;
	private JScrollPane scrollPaneMesas;
	private JList listMesas;
	private JPanel panelBotonEliminar;
	private JButton botonEliminar;
	private JPanel panelBotonVolver;
	private JButton botonVolver;

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
		
		panelModificaMesa = new JPanel();
		contentPane.add(panelModificaMesa, BorderLayout.CENTER);
		panelModificaMesa.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelAgregaMesa = new JPanel();
		panelModificaMesa.add(panelAgregaMesa);
		panelAgregaMesa.setLayout(new GridLayout(3, 0, 0, 0));
		
		panelNroMesa = new JPanel();
		panelAgregaMesa.add(panelNroMesa);
		panelNroMesa.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelLabelNroMesa = new JPanel();
		panelNroMesa.add(panelLabelNroMesa);
		
		labelNroMesa = new JLabel("Numero de mesa:");
		panelLabelNroMesa.add(labelNroMesa);
		
		panelTextNroMesa = new JPanel();
		panelNroMesa.add(panelTextNroMesa);
		
		textFieldNroMesa = new JTextField();
		panelTextNroMesa.add(textFieldNroMesa);
		textFieldNroMesa.setColumns(10);
		
		panelComensales = new JPanel();
		panelAgregaMesa.add(panelComensales);
		panelComensales.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelLabelComensales = new JPanel();
		panelComensales.add(panelLabelComensales);
		
		labelComnesales = new JLabel("Cantidad de comensales:");
		panelLabelComensales.add(labelComnesales);
		
		panelSpinnerComensales = new JPanel();
		panelComensales.add(panelSpinnerComensales);
		
		spinnerCantComensales = new JSpinner();
		panelSpinnerComensales.add(spinnerCantComensales);
		
		panelBotonAgregar = new JPanel();
		panelAgregaMesa.add(panelBotonAgregar);
		
		botonAgregar = new JButton("Agregar");
		panelBotonAgregar.add(botonAgregar);
		
		panelEliminarMesa = new JPanel();
		panelModificaMesa.add(panelEliminarMesa);
		panelEliminarMesa.setLayout(new GridLayout(3, 0, 0, 0));
		
		scrollPaneMesas = new JScrollPane();
		panelEliminarMesa.add(scrollPaneMesas);
		
		listMesas = new JList();
		scrollPaneMesas.setViewportView(listMesas);
		
		panelBotonEliminar = new JPanel();
		panelEliminarMesa.add(panelBotonEliminar);
		
		botonEliminar = new JButton("Eliminar");
		panelBotonEliminar.add(botonEliminar);
		
		panelBotonVolver = new JPanel();
		panelEliminarMesa.add(panelBotonVolver);
		
		botonVolver = new JButton("Volver");
		panelBotonVolver.add(botonVolver);
	}

}
