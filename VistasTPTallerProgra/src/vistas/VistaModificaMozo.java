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
		
		JPanel panelModificaMozo = new JPanel();
		contentPane.add(panelModificaMozo, BorderLayout.CENTER);
		panelModificaMozo.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panelAgregaMozo = new JPanel();
		panelModificaMozo.add(panelAgregaMozo);
		panelAgregaMozo.setLayout(new GridLayout(5, 0, 0, 0));
		
		JPanel panelNombre = new JPanel();
		panelAgregaMozo.add(panelNombre);
		panelNombre.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelLabelNombre = new JPanel();
		panelNombre.add(panelLabelNombre);
		
		JLabel labelNombre = new JLabel("Nombre:");
		panelLabelNombre.add(labelNombre);
		
		JPanel panelTextNombre = new JPanel();
		panelNombre.add(panelTextNombre);
		
		textFieldNombre = new JTextField();
		panelTextNombre.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JPanel panelApellido = new JPanel();
		panelAgregaMozo.add(panelApellido);
		panelApellido.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelLabelApellido = new JPanel();
		panelApellido.add(panelLabelApellido);
		
		JLabel labelApellido = new JLabel("Apellido");
		panelLabelApellido.add(labelApellido);
		
		JPanel panelTextApellido = new JPanel();
		panelApellido.add(panelTextApellido);
		
		textFieldApellido = new JTextField();
		panelTextApellido.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		JPanel panelFecha = new JPanel();
		panelAgregaMozo.add(panelFecha);
		panelFecha.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelLabelFecha = new JPanel();
		panelFecha.add(panelLabelFecha);
		
		JLabel labelFecha = new JLabel("Fecha de nacimiento:");
		panelLabelFecha.add(labelFecha);
		
		JPanel panelTextFecha = new JPanel();
		panelFecha.add(panelTextFecha);
		
		textFieldFecha = new JTextField();
		panelTextFecha.add(textFieldFecha);
		textFieldFecha.setColumns(10);
		
		JPanel panelCantHijos = new JPanel();
		panelAgregaMozo.add(panelCantHijos);
		panelCantHijos.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelLabelCant = new JPanel();
		panelCantHijos.add(panelLabelCant);
		
		JLabel labelCantHijos = new JLabel("Cantidad de hijos:");
		panelLabelCant.add(labelCantHijos);
		
		JPanel panelTextCant = new JPanel();
		panelCantHijos.add(panelTextCant);
		
		textFieldCantHijos = new JTextField();
		panelTextCant.add(textFieldCantHijos);
		textFieldCantHijos.setColumns(10);
		
		JPanel panelBotonAgregar = new JPanel();
		panelAgregaMozo.add(panelBotonAgregar);
		
		JButton botonAgregar = new JButton("Agregar");
		panelBotonAgregar.add(botonAgregar);
		
		JPanel panelModifica = new JPanel();
		panelModificaMozo.add(panelModifica);
		panelModifica.setLayout(new GridLayout(3, 0, 0, 0));
		
		JScrollPane scrollPaneMozos = new JScrollPane();
		panelModifica.add(scrollPaneMozos);
		
		JList listMozos = new JList();
		scrollPaneMozos.setViewportView(listMozos);
		
		JPanel panelModificaEstados = new JPanel();
		panelModifica.add(panelModificaEstados);
		panelModificaEstados.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelComboBoxEstado = new JPanel();
		panelModificaEstados.add(panelComboBoxEstado);
		
		JComboBox comboBoxEstados = new JComboBox();
		panelComboBoxEstado.add(comboBoxEstados);
		
		JPanel panelBotonCambioEstado = new JPanel();
		panelModificaEstados.add(panelBotonCambioEstado);
		
		JButton botonEstado = new JButton("Cambiar estado");
		panelBotonCambioEstado.add(botonEstado);
		
		JPanel panelBotonEliminar = new JPanel();
		panelModifica.add(panelBotonEliminar);
		
		JButton botonEliminar = new JButton("Eliminar");
		panelBotonEliminar.add(botonEliminar);
		
		JPanel panelAsignar = new JPanel();
		panelModificaMozo.add(panelAsignar);
		panelAsignar.setLayout(new GridLayout(3, 0, 0, 0));
		
		JScrollPane scrollPaneMesas = new JScrollPane();
		panelAsignar.add(scrollPaneMesas);
		
		JList listMesas = new JList();
		scrollPaneMesas.setViewportView(listMesas);
		
		JPanel panelBotonAsignar = new JPanel();
		panelAsignar.add(panelBotonAsignar);
		
		JButton botonAsignar = new JButton("Asignar mesa- mozo");
		panelBotonAsignar.add(botonAsignar);
		
		JPanel panel = new JPanel();
		panelAsignar.add(panel);
		
		JButton botonVolver = new JButton("Volver");
		panel.add(botonVolver);
	}

}
