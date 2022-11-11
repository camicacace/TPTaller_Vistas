package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class VistaModificaProducto extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldID;
	private JTextField textFieldNombre;
	private JTextField textFieldCosto;
	private JTextField textFieldVenta;
	private JTextField textFieldStock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaModificaProducto frame = new VistaModificaProducto();
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
	public VistaModificaProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelModificaProducto = new JPanel();
		contentPane.add(panelModificaProducto, BorderLayout.CENTER);
		panelModificaProducto.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelAgregar = new JPanel();
		panelModificaProducto.add(panelAgregar);
		panelAgregar.setLayout(new GridLayout(6, 0, 0, 0));
		
		JPanel panelID = new JPanel();
		panelAgregar.add(panelID);
		panelID.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelLabelID = new JPanel();
		panelID.add(panelLabelID);
		
		JLabel labelID = new JLabel("ID:");
		panelLabelID.add(labelID);
		
		JPanel panelTextID = new JPanel();
		panelID.add(panelTextID);
		
		textFieldID = new JTextField();
		panelTextID.add(textFieldID);
		textFieldID.setColumns(10);
		
		JPanel panelNombre = new JPanel();
		panelAgregar.add(panelNombre);
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
		
		JPanel panelCosto = new JPanel();
		panelAgregar.add(panelCosto);
		panelCosto.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelLabelCosto = new JPanel();
		panelCosto.add(panelLabelCosto);
		
		JLabel labelCosto = new JLabel("Precio costo:");
		panelLabelCosto.add(labelCosto);
		
		JPanel panelTextCosto = new JPanel();
		panelCosto.add(panelTextCosto);
		
		textFieldCosto = new JTextField();
		panelTextCosto.add(textFieldCosto);
		textFieldCosto.setColumns(10);
		
		JPanel panelVenta = new JPanel();
		panelAgregar.add(panelVenta);
		panelVenta.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelLabelVenta = new JPanel();
		panelVenta.add(panelLabelVenta);
		
		JLabel labelVenta = new JLabel("Precio venta:");
		panelLabelVenta.add(labelVenta);
		
		JPanel panelTextVenta = new JPanel();
		panelVenta.add(panelTextVenta);
		
		textFieldVenta = new JTextField();
		panelTextVenta.add(textFieldVenta);
		textFieldVenta.setColumns(10);
		
		JPanel panelStock = new JPanel();
		panelAgregar.add(panelStock);
		panelStock.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelLabelStock = new JPanel();
		panelStock.add(panelLabelStock);
		
		JLabel labelStock = new JLabel("Stock inicial:");
		panelLabelStock.add(labelStock);
		
		JPanel panelTextStock = new JPanel();
		panelStock.add(panelTextStock);
		
		textFieldStock = new JTextField();
		panelTextStock.add(textFieldStock);
		textFieldStock.setColumns(10);
		
		JPanel panelBotonAgregar = new JPanel();
		panelAgregar.add(panelBotonAgregar);
		
		JButton botonAgregar = new JButton("Agregar");
		panelBotonAgregar.add(botonAgregar);
		
		JPanel panelEliminar = new JPanel();
		panelModificaProducto.add(panelEliminar);
		panelEliminar.setLayout(new GridLayout(3, 0, 0, 0));
		
		JScrollPane scrollPaneProductos = new JScrollPane();
		panelEliminar.add(scrollPaneProductos);
		
		JList listProductos = new JList();
		scrollPaneProductos.setViewportView(listProductos);
		
		JPanel panelBotonEliminar = new JPanel();
		panelEliminar.add(panelBotonEliminar);
		
		JButton botonEliminar = new JButton("Eliminar");
		panelBotonEliminar.add(botonEliminar);
		
		JPanel panelBotonVolver = new JPanel();
		panelEliminar.add(panelBotonVolver);
		
		JButton botonVolver = new JButton("Volver");
		panelBotonVolver.add(botonVolver);
	}

}
