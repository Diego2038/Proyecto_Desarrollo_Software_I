package AutoABC;


import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import getset.variable;
import sql.crudsql;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import java.awt.Scrollbar;
import javax.swing.JTextPane;
import java.awt.List;
import java.awt.Label;
import javax.swing.JFormattedTextField;
import java.awt.Checkbox;
import java.awt.ScrollPane;

public class AministradorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField_id;
	private JTextField textField_name;
	private JTextField textField_cargo;
	private JTextField textField_contrasena;
	private JTextField textField_buscar_id;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_4;
	private JTextField textField_estado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AministradorGUI frame = new AministradorGUI();
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
	public AministradorGUI() {
		setTitle("Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(Color.BLACK);
		contentPane.add(tabbedPane);
		
		JPanel Registro = new JPanel();
		tabbedPane.addTab("Registro", null, Registro, null);
		Registro.setLayout(null);
		
		textField_estado = new JTextField();
		textField_estado.setBounds(178, 322, 209, 21);
		Registro.add(textField_estado);
		textField_estado.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Registro");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 24, 175, 54);
		Registro.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 120, 65, 21);
		Registro.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 170, 65, 21);
		Registro.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contrase\u00F1a");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 220, 96, 21);
		Registro.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Cargo");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 270, 65, 21);
		Registro.add(lblNewLabel_4);
		
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			crudsql crudsql = new crudsql();
			public void actionPerformed(ActionEvent e) {
				
				crudsql.insertarUsuarios(textField_id.getText(), textField_name.getText(), textField_cargo.getText(), textField_contrasena.getText(), textField_estado.getText() );
				
				textField_id.setText("");
				textField_name.setText("");
				textField_cargo.setText("");
				textField_contrasena.setText("");
				textField_estado.setText("");
			}
		});
		
		
		
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setBackground(Color.WHITE);
		btnRegistrar.setBounds(109, 366, 89, 23);
		Registro.add(btnRegistrar);
		
		textField_id = new JTextField();
		textField_id.setBounds(178, 111, 209, 23);
		Registro.add(textField_id);
		textField_id.setColumns(10);
		
		textField_name = new JTextField();
		textField_name.setBounds(178, 168, 209, 23);
		Registro.add(textField_name);
		textField_name.setColumns(10);
		
		textField_cargo = new JTextField();
		textField_cargo.setBounds(178, 271, 209, 23);
		Registro.add(textField_cargo);
		textField_cargo.setColumns(10);
		
		textField_contrasena = new JTextField();
		textField_contrasena.setBounds(178, 221, 209, 23);
		Registro.add(textField_contrasena);
		textField_contrasena.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Estado");
		lblNewLabel_14.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setBounds(10, 321, 78, 21);
		Registro.add(lblNewLabel_14);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon(AministradorGUI.class.getResource("/Imagenes/Fondo.jpg")));
		lblFondo.setBounds(0, 0, 607, 421);
		Registro.add(lblFondo);
		
		crudsql crudsql2 = new crudsql();
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Usuario", null, scrollPane, null);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
		JButton btnNewButton_2 = new JButton("Registro de Usuarios");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			crudsql crudsql = new crudsql();
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(crudsql.mostrarTabla());
			}
		});
		scrollPane.setColumnHeaderView(btnNewButton_2);
		
		
		
		JPanel Modificar = new JPanel();
		tabbedPane.addTab("Modificar", null, Modificar, null);
		Modificar.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(106, 230, 181, 20);
		Modificar.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			crudsql crudsql = new crudsql();
			variable var = new variable();
			public void actionPerformed(ActionEvent e) {
				
				crudsql.mostrar(textField_buscar_id.getText());
				
				textField_4.setText(var.getUsuario_id());
				textField_6.setText(var.getUsuario_name());
				textField_7.setText(var.getUsuario_contrasena());
				textField_8.setText(var.getUsuario_cargo());
				
				textField_4.setEditable(false);
				
				textArea.setText(crudsql.mostrarTabla());
			}
		});
		
		
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setBackground(Color.BLACK);
		btnBuscar.setBounds(266, 76, 89, 23);
		Modificar.add(btnBuscar);
		
		JLabel lblNewLabel_12 = new JLabel("ID");
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setBounds(10, 233, 46, 14);
		Modificar.add(lblNewLabel_12);
		
		textField_buscar_id = new JTextField();
		textField_buscar_id.setBounds(10, 75, 200, 25);
		Modificar.add(textField_buscar_id);
		textField_buscar_id.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("ID Usuario");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 39, 86, 25);
		Modificar.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Modificar Usuario");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 150, 128, 25);
		Modificar.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("Nombre");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(10, 263, 86, 20);
		Modificar.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(106, 263, 181, 20);
		Modificar.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Contrase\u00F1a");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(10, 294, 86, 20);
		Modificar.add(lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setBounds(106, 294, 181, 20);
		Modificar.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Cargo");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(10, 325, 86, 20);
		Modificar.add(lblNewLabel_10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(106, 325, 181, 20);
		Modificar.add(textField_8);
		textField_8.setColumns(10);
		
		
		JButton btnNewButton_1 = new JButton("Actualizar ");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			 public void actionPerformed(ActionEvent e) {
			     crudsql objCrudsql = new crudsql();
				variable objVariable = new variable();
				
				objVariable.setUsuario_id(textField_4.getText());
				objVariable.setUsuario_name(textField_6.getText());
				objVariable.setUsuario_contrasena(textField_7.getText());
				objVariable.setUsuario_cargo(textField_8.getText());
				objCrudsql.actualizar(objVariable.getUsuario_name(), objVariable.getUsuario_contrasena(), objVariable.getUsuario_cargo(), objVariable.getUsuario_id() );
				
				textField_buscar_id.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
			}
		});
		
		
		
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(55, 370, 115, 23);
		Modificar.add(btnNewButton_1);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setIcon(new ImageIcon(AministradorGUI.class.getResource("/Imagenes/Fondo.jpg")));
		lblNewLabel_11.setBounds(0, 0, 607, 421);
		Modificar.add(lblNewLabel_11);
	}
}

