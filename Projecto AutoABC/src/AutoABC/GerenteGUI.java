package AutoABC;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sql.crudsql;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;

public class GerenteGUI extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField textField_name;
	private JTextField textField_telefono;
	private JTextField textField_direccion;
	private JTextField textField_id;
	private JTextField textField_entidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenteGUI frame = new GerenteGUI();
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
	public GerenteGUI() {
		setTitle("Gerente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(tabbedPane);
		
		JPanel Registrar = new JPanel();
		tabbedPane.addTab("Registrar", null, Registrar, null);
		Registrar.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("CLIENTES");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 23, 160, 38);
		Registrar.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ID");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 100, 89, 23);
		Registrar.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 140, 89, 23);
		Registrar.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Telefono");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(10, 180, 89, 23);
		Registrar.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Direccion");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 220, 89, 23);
		Registrar.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Entidad");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBackground(Color.BLACK);
		lblNewLabel_7.setBounds(10, 260, 89, 23);
		Registrar.add(lblNewLabel_7);
		
		textField_name = new JTextField();
		textField_name.setBounds(124, 141, 222, 23);
		Registrar.add(textField_name);
		textField_name.setColumns(10);
		
		textField_telefono = new JTextField();
		textField_telefono.setBounds(124, 181, 222, 23);
		Registrar.add(textField_telefono);
		textField_telefono.setColumns(10);
		
		textField_direccion = new JTextField();
		textField_direccion.setBounds(124, 221, 222, 23);
		Registrar.add(textField_direccion);
		textField_direccion.setColumns(10);
		
		textField_id = new JTextField();
		textField_id.setBounds(124, 101, 222, 23);
		Registrar.add(textField_id);
		textField_id.setColumns(10);
		
		textField_entidad = new JTextField();
		textField_entidad.setBounds(124, 261, 221, 23);
		Registrar.add(textField_entidad);
		textField_entidad.setColumns(10);
		
		
		JButton btn_registrar = new JButton("Registrar");
		btn_registrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				crudsql objeGerentesql = new crudsql();
				objeGerentesql.insertar(textField_id.getText(), textField_name.getText(), textField_telefono.getText(), textField_direccion.getText(), textField_entidad.getText());
				
				textField_id.setText("");
				textField_name.setText("");
				textField_telefono.setText("");
				textField_direccion.setText("");
				textField_entidad.setText("");
			}
		});
		
		
		btn_registrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_registrar.setBackground(Color.BLACK);
		btn_registrar.setForeground(Color.WHITE);
		btn_registrar.setBounds(81, 329, 108, 23);
		Registrar.add(btn_registrar);
		
		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setIcon(new ImageIcon(GerenteGUI.class.getResource("/Imagenes/Fondo.jpg")));
		lblFondo.setBounds(0, 0, 607, 421);
		Registrar.add(lblFondo);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Repote", null, scrollPane, null);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Reporte Usuarios");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				crudsql crudsql = new crudsql();
				
				textArea.setText(crudsql.Reporte());
			}
		});
		scrollPane.setColumnHeaderView(btnNewButton);
	}
	
	
	
	
	

}