package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

public class VistaPedidos extends JFrame {

	private JPanel contentPane;
	private JPanel panelPedidos;
	private JPanel panelMesas;
	private JScrollPane scrollPaneMesas;
	private JList listMesas;
	private JPanel panelBotonAgregarComanda;
	private JButton botonAgregarComanda;
	private JPanel panelProducto;
	private JPanel panelAgregoPedido;
	private JPanel panelLabelProducto;
	private JLabel labelProducto;
	private JPanel panelComboBoxProducto;
	private JComboBox comboBoxProducto;
	private JPanel panelCantidad;
	private JPanel panelLabelCantidad;
	private JLabel labelCantidad;
	private JPanel panelSpinnerCantidad;
	private JSpinner spinnerCantidad;
	private JPanel panelBotonAgregarPedido;
	private JButton botonAgregarPedido;
	private JPanel panelListaPedidos;
	private JScrollPane scrollPanePedidos;
	private JList listPedidos;
	private JPanel panelBotonVolver;
	private JButton botonVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPedidos frame = new VistaPedidos();
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
	public VistaPedidos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panelPedidos = new JPanel();
		contentPane.add(panelPedidos, BorderLayout.CENTER);
		panelPedidos.setLayout(new GridLayout(0, 3, 0, 0));
		
		panelMesas = new JPanel();
		panelPedidos.add(panelMesas);
		panelMesas.setLayout(new GridLayout(2, 0, 0, 0));
		
		scrollPaneMesas = new JScrollPane();
		panelMesas.add(scrollPaneMesas);
		
		listMesas = new JList();
		scrollPaneMesas.setViewportView(listMesas);
		
		panelBotonAgregarComanda = new JPanel();
		panelMesas.add(panelBotonAgregarComanda);
		
		botonAgregarComanda = new JButton("Agregar comanda");
		panelBotonAgregarComanda.add(botonAgregarComanda);
		
		panelAgregoPedido = new JPanel();
		panelPedidos.add(panelAgregoPedido);
		panelAgregoPedido.setLayout(new GridLayout(3, 0, 0, 0));
		
		panelProducto = new JPanel();
		panelAgregoPedido.add(panelProducto);
		panelProducto.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelLabelProducto = new JPanel();
		panelProducto.add(panelLabelProducto);
		
		labelProducto = new JLabel("Producto: ");
		panelLabelProducto.add(labelProducto);
		
		panelComboBoxProducto = new JPanel();
		panelProducto.add(panelComboBoxProducto);
		
		comboBoxProducto = new JComboBox();
		panelComboBoxProducto.add(comboBoxProducto);
		
		panelCantidad = new JPanel();
		panelAgregoPedido.add(panelCantidad);
		panelCantidad.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelLabelCantidad = new JPanel();
		panelCantidad.add(panelLabelCantidad);
		
		labelCantidad = new JLabel("Cantidad:");
		panelLabelCantidad.add(labelCantidad);
		
		panelSpinnerCantidad = new JPanel();
		panelCantidad.add(panelSpinnerCantidad);
		
		spinnerCantidad = new JSpinner();
		panelSpinnerCantidad.add(spinnerCantidad);
		
		panelBotonAgregarPedido = new JPanel();
		panelAgregoPedido.add(panelBotonAgregarPedido);
		
		botonAgregarPedido = new JButton("Agregar pedido");
		panelBotonAgregarPedido.add(botonAgregarPedido);
		
		panelListaPedidos = new JPanel();
		panelPedidos.add(panelListaPedidos);
		panelListaPedidos.setLayout(new GridLayout(2, 0, 0, 0));
		
		scrollPanePedidos = new JScrollPane();
		panelListaPedidos.add(scrollPanePedidos);
		
		listPedidos = new JList();
		scrollPanePedidos.setViewportView(listPedidos);
		
		panelBotonVolver = new JPanel();
		panelListaPedidos.add(panelBotonVolver);
		
		botonVolver = new JButton("Volver");
		panelBotonVolver.add(botonVolver);
	}

}
