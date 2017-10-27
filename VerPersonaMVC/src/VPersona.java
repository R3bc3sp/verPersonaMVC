import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VPersona extends JFrame {

	private JPanel contentPane;
	JTextField textNombre;
	JTextField textApellido;
	JTextField textAnyo;
	JLabel lblMostrarEdad;
	JButton btnCalcularEdad;
	JButton btnSalir;

	

	/**
	 * Create the frame.
	 */
	public VPersona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 30, 111, 30);
		contentPane.add(lblNewLabel);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textNombre.setBounds(112, 30, 156, 30);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblApellido.setBounds(10, 76, 111, 30);
		contentPane.add(lblApellido);
		
		textApellido = new JTextField();
		textApellido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textApellido.setColumns(10);
		textApellido.setBounds(112, 76, 156, 30);
		contentPane.add(textApellido);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAo.setBounds(10, 128, 111, 30);
		contentPane.add(lblAo);
		
		textAnyo = new JTextField();
		textAnyo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textAnyo.setColumns(10);
		textAnyo.setBounds(112, 128, 156, 30);
		contentPane.add(textAnyo);
		
		btnCalcularEdad = new JButton("Calcular Edad");
		
		btnCalcularEdad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalcularEdad.setBounds(248, 166, 176, 23);
		contentPane.add(btnCalcularEdad);
		
		lblMostrarEdad = new JLabel("");
		lblMostrarEdad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMostrarEdad.setBounds(10, 225, 414, 26);
		contentPane.add(lblMostrarEdad);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalir.setBounds(248, 200, 176, 23);
		contentPane.add(btnSalir);
	}
	
	public void setControlador(ControladorPersona c){
		//llamo a una clase para que controle mi evento
		//En este caso a mi ControladorPersona
		btnCalcularEdad.addActionListener(c);
		btnSalir.addActionListener(c);
		//Aquí añadiremos todos los elementos que puedan tener un evento
	}
}
