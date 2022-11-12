package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class VistaModificaMozo extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldFecha;
	private JTextField textFieldCantHijos;
	private JPanel panelModificaMozo;
	private JPanel panelAgregaMozo;
	private JPanel panelNombre;
	private JPanel panelLabelNombre;
	private JLabel labelNombre;
	private JPanel panelTextNombre;
	private JPanel panelApellido;
	private JPanel panelLabelApellido;
	private JLabel labelApellido;
	private JPanel panelTextApellido;
	private JPanel panelFecha;
	private JPanel panelLabelFecha;
	private JLabel labelFecha;
	private JPanel panelTextFecha;
	private JPanel panelCantHijos;
	private JPanel panelLabelCant;
	private JLabel labelCantHijos;
	private JPanel panelTextCant;
	private JPanel panelBotonAgregar;
	private JButton botonAgregar;
	private JPanel panelModifica;
	private JScrollPane scrollPaneMozos;
	private JList listMozos;
	private JPanel panelModificaEstados;
	private JPanel panelComboBoxEstado;
	private JComboBox comboBoxEstados;
	private JPanel panelBotonCambioEstado;
	private JButton botonEstado;
	private JPanel panelBotonEliminar;
	private JButton botonEliminar;
	private JPanel panelAsignar;
	private JScrollPane scrollPaneMesas;
	private JList listMesas;
	private JPanel panelBotonAsignar;
	private JButton botonAsignar;
	private JPanel panelBotonVolver;
	private JButton botonVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaModificaMozo frame = new VistaModificaMozo();
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
	public VistaModificaMozo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panelModificaMozo = new JPanel();
		contentPane.add(panelModificaMozo, BorderLayout.CENTER);
		panelModificaMozo.setLayout(new GridLayout(0, 3, 0, 0));
		
		panelAgregaMozo = new JPanel();
		panelModificaMozo.add(panelAgregaMozo);
		panelAgregaMozo.setLayout(new GridLayout(5, 0, 0, 0));
		
		panelNombre = new JPanel();
		panelAgregaMozo.add(panelNombre);
		panelNombre.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelLabelNombre = new JPanel();
		panelNombre.add(panelLabelNombre);
		
		labelNombre = new JLabel("Nombre:");
		panelLabelNombre.add(labelNombre);
		
		panelTextNombre = new JPanel();
		panelNombre.add(panelTextNombre);
		
		textFieldNombre = new JTextField();
		panelTextNombre.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		panelApellido = new JPanel();
		panelAgregaMozo.add(panelApellido);
		panelApellido.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelLabelApellido = new JPanel();
		panelApellido.add(panelLabelApellido);
		
		labelApellido = new JLabel("Apellido");
		panelLabelApellido.add(labelApellido);
		
		panelTextApellido = new JPanel();
		panelApellido.add(panelTextApellido);
		
		textFieldApellido = new JTextField();
		panelTextApellido.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		panelFecha = new JPanel();
		panelAgregaMozo.add(panelFecha);
		panelFecha.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelLabelFecha = new JPanel();
		panelFecha.add(panelLabelFecha);
		
		labelFecha = new JLabel("Fecha de nacimiento:");
		panelLabelFecha.add(labelFecha);
		
		panelTextFecha = new JPanel();
		panelFecha.add(panelTextFecha);
		
		textFieldFecha = new JTextField();
		panelTextFecha.add(textFieldFecha);
		textFieldFecha.setColumns(10);
		
		panelCantHijos = new JPanel();
		panelAgregaMozo.add(panelCantHijos);
		panelCantHijos.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelLabelCant = new JPanel();
		panelCantHijos.add(panelLabelCant);
		
		labelCantHijos = new JLabel("Cantidad de hijos:");
		panelLabelCant.add(labelCantHijos);
		
		panelTextCant = new JPanel();
		panelCantHijos.add(panelTextCant);
		
		textFieldCantHijos = new JTextField();
		panelTextCant.add(textFieldCantHijos);
		textFieldCantHijos.setColumns(10);
		
		panelBotonAgregar = new JPanel();
		panelAgregaMozo.add(panelBotonAgregar);
		
		botonAgregar = new JButton("Agregar");
		panelBotonAgregar.add(botonAgregar);
		
		panelModifica = new JPanel();
		panelModificaMozo.add(panelModifica);
		panelModifica.setLayout(new GridLayout(3, 0, 0, 0));
		
		scrollPaneMozos = new JScrollPane();
		panelModifica.add(scrollPaneMozos);
		
		listMozos = new JList();
		scrollPaneMozos.setViewportView(listMozos);
		
		panelModificaEstados = new JPanel();
		panelModifica.add(panelModificaEstados);
		panelModificaEstados.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelComboBoxEstado = new JPanel();
		panelModificaEstados.add(panelComboBoxEstado);
		
		comboBoxEstados = new JComboBox();
		panelComboBoxEstado.add(comboBoxEstados);
		
		panelBotonCambioEstado = new JPanel();
		panelModificaEstados.add(panelBotonCambioEstado);
		
		botonEstado = new JButton("Cambiar estado");
		panelBotonCambioEstado.add(botonEstado);
		
		panelBotonEliminar = new JPanel();
		panelModifica.add(panelBotonEliminar);
		
		botonEliminar = new JButton("Eliminar");
		panelBotonEliminar.add(botonEliminar);
		
		panelAsignar = new JPanel();
		panelModificaMozo.add(panelAsignar);
		panelAsignar.setLayout(new GridLayout(3, 0, 0, 0));
		
		scrollPaneMesas = new JScrollPane();
		panelAsignar.add(scrollPaneMesas);
		
		listMesas = new JList();
		scrollPaneMesas.setViewportView(listMesas);
		
		panelBotonAsignar = new JPanel();
		panelAsignar.add(panelBotonAsignar);
		
		botonAsignar = new JButton("Asignar mesa- mozo");
		panelBotonAsignar.add(botonAsignar);
		
		panelBotonVolver = new JPanel();
		panelAsignar.add(panelBotonVolver);
		
		botonVolver = new JButton("Volver");
		panelBotonVolver.add(botonVolver);
	}

}
