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
	private JPanel panelModificaProducto;
	private JPanel panelAgregar;
	private JPanel panelID;
	private JPanel panelLabelID;
	private JLabel labelID;
	private JPanel panelTextID;
	private JPanel panelLabelNombre;
	private JLabel labelNombre;
	private JPanel panelTextNombre;
	private JPanel panelCosto;
	private JPanel panelLabelCosto;
	private JLabel labelCosto;
	private JPanel panelTextCosto;
	private JPanel panelVenta;
	private JPanel panelLabelVenta;
	private JLabel labelVenta;
	private JPanel panelTextVenta;
	private JPanel panelStock;
	private JPanel panelLabelStock;
	private JLabel labelStock;
	private JPanel panelTextStock;
	private JPanel panelBotonAgregar;
	private JButton botonAgregar;
	private JScrollPane scrollPaneProductos;
	private JList listProductos;
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
		
		panelModificaProducto = new JPanel();
		contentPane.add(panelModificaProducto, BorderLayout.CENTER);
		panelModificaProducto.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelAgregar = new JPanel();
		panelModificaProducto.add(panelAgregar);
		panelAgregar.setLayout(new GridLayout(6, 0, 0, 0));
		
		panelID = new JPanel();
		panelAgregar.add(panelID);
		panelID.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelLabelID = new JPanel();
		panelID.add(panelLabelID);
		
		labelID = new JLabel("ID:");
		panelLabelID.add(labelID);
		
		panelTextID = new JPanel();
		panelID.add(panelTextID);
		
		textFieldID = new JTextField();
		panelTextID.add(textFieldID);
		textFieldID.setColumns(10);
		
		JPanel panelNombre = new JPanel();
		panelAgregar.add(panelNombre);
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
		
		panelCosto = new JPanel();
		panelAgregar.add(panelCosto);
		panelCosto.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelLabelCosto = new JPanel();
		panelCosto.add(panelLabelCosto);
		
		labelCosto = new JLabel("Precio costo:");
		panelLabelCosto.add(labelCosto);
		
		panelTextCosto = new JPanel();
		panelCosto.add(panelTextCosto);
		
		textFieldCosto = new JTextField();
		panelTextCosto.add(textFieldCosto);
		textFieldCosto.setColumns(10);
		
		panelVenta = new JPanel();
		panelAgregar.add(panelVenta);
		panelVenta.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelLabelVenta = new JPanel();
		panelVenta.add(panelLabelVenta);
		
		labelVenta = new JLabel("Precio venta:");
		panelLabelVenta.add(labelVenta);
		
		panelTextVenta = new JPanel();
		panelVenta.add(panelTextVenta);
		
		textFieldVenta = new JTextField();
		panelTextVenta.add(textFieldVenta);
		textFieldVenta.setColumns(10);
		
		panelStock = new JPanel();
		panelAgregar.add(panelStock);
		panelStock.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelLabelStock = new JPanel();
		panelStock.add(panelLabelStock);
		
		labelStock = new JLabel("Stock inicial:");
		panelLabelStock.add(labelStock);
		
		panelTextStock = new JPanel();
		panelStock.add(panelTextStock);
		
		textFieldStock = new JTextField();
		panelTextStock.add(textFieldStock);
		textFieldStock.setColumns(10);
		
		panelBotonAgregar = new JPanel();
		panelAgregar.add(panelBotonAgregar);
		
		botonAgregar = new JButton("Agregar");
		panelBotonAgregar.add(botonAgregar);
		
		JPanel panelEliminar = new JPanel();
		panelModificaProducto.add(panelEliminar);
		panelEliminar.setLayout(new GridLayout(3, 0, 0, 0));
		
		scrollPaneProductos = new JScrollPane();
		panelEliminar.add(scrollPaneProductos);
		
		listProductos = new JList();
		scrollPaneProductos.setViewportView(listProductos);
		
		panelBotonEliminar = new JPanel();
		panelEliminar.add(panelBotonEliminar);
		
		botonEliminar = new JButton("Eliminar");
		panelBotonEliminar.add(botonEliminar);
		
		panelBotonVolver = new JPanel();
		panelEliminar.add(panelBotonVolver);
		
		botonVolver = new JButton("Volver");
		panelBotonVolver.add(botonVolver);
	}

}
