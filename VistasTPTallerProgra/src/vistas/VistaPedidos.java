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
		
		JPanel panelPedidos = new JPanel();
		contentPane.add(panelPedidos, BorderLayout.CENTER);
		panelPedidos.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panelMesas = new JPanel();
		panelPedidos.add(panelMesas);
		panelMesas.setLayout(new GridLayout(2, 0, 0, 0));
		
		JScrollPane scrollPaneMesas = new JScrollPane();
		panelMesas.add(scrollPaneMesas);
		
		JList listMesas = new JList();
		scrollPaneMesas.setViewportView(listMesas);
		
		JPanel panelBotonAgregarComanda = new JPanel();
		panelMesas.add(panelBotonAgregarComanda);
		
		JButton botonAgregarComanda = new JButton("Agregar comanda");
		panelBotonAgregarComanda.add(botonAgregarComanda);
		
		JPanel panelAgregoPedido = new JPanel();
		panelPedidos.add(panelAgregoPedido);
		panelAgregoPedido.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panelProducto = new JPanel();
		panelAgregoPedido.add(panelProducto);
		panelProducto.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelLabelProducto = new JPanel();
		panelProducto.add(panelLabelProducto);
		
		JLabel labelProducto = new JLabel("Producto: ");
		panelLabelProducto.add(labelProducto);
		
		JPanel panelComboBoxProducto = new JPanel();
		panelProducto.add(panelComboBoxProducto);
		
		JComboBox comboBoxProducto = new JComboBox();
		panelComboBoxProducto.add(comboBoxProducto);
		
		JPanel panelCantidad = new JPanel();
		panelAgregoPedido.add(panelCantidad);
		panelCantidad.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelLabelCantidad = new JPanel();
		panelCantidad.add(panelLabelCantidad);
		
		JLabel labelCantidad = new JLabel("Cantidad:");
		panelLabelCantidad.add(labelCantidad);
		
		JPanel panelSpinnerCantidad = new JPanel();
		panelCantidad.add(panelSpinnerCantidad);
		
		JSpinner spinnerCantidad = new JSpinner();
		panelSpinnerCantidad.add(spinnerCantidad);
		
		JPanel panelBotonAgregarPedido = new JPanel();
		panelAgregoPedido.add(panelBotonAgregarPedido);
		
		JButton botonAgregarPedido = new JButton("Agregar pedido");
		panelBotonAgregarPedido.add(botonAgregarPedido);
		
		JPanel panelListaPedidos = new JPanel();
		panelPedidos.add(panelListaPedidos);
		panelListaPedidos.setLayout(new GridLayout(2, 0, 0, 0));
		
		JScrollPane scrollPanePedidos = new JScrollPane();
		panelListaPedidos.add(scrollPanePedidos);
		
		JList listPedidos = new JList();
		scrollPanePedidos.setViewportView(listPedidos);
		
		JPanel panelBotonVolver = new JPanel();
		panelListaPedidos.add(panelBotonVolver);
		
		JButton botonVolver = new JButton("Volver");
		panelBotonVolver.add(botonVolver);
	}

}
