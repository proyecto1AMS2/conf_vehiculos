package Model;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Introducir_datos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private boolean guardado=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Introducir_datos frame = new Introducir_datos();
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
	public Introducir_datos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 484, 399);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{38, 0, 56, 36, 37, 40, 42, 37, 35, 31, 0};
		gbl_panel.rowHeights = new int[]{51, 34, 35, 35, 35, 35, 35, 26, 28, 18, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblD = new JLabel("DATOS DEL CLIENTE ");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setFont(new Font("Arial Black", Font.PLAIN, 15));
		GridBagConstraints gbc_lblD = new GridBagConstraints();
		gbc_lblD.gridwidth = 3;
		gbc_lblD.fill = GridBagConstraints.VERTICAL;
		gbc_lblD.anchor = GridBagConstraints.EAST;
		gbc_lblD.insets = new Insets(0, 0, 5, 5);
		gbc_lblD.gridx = 1;
		gbc_lblD.gridy = 0;
		panel.add(lblD, gbc_lblD);
		
		JLabel lblUsuariousuario = new JLabel("Usuario:Usuario");
		GridBagConstraints gbc_lblUsuariousuario = new GridBagConstraints();
		gbc_lblUsuariousuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuariousuario.gridx = 7;
		gbc_lblUsuariousuario.gridy = 0;
		panel.add(lblUsuariousuario, gbc_lblUsuariousuario);
		
		JLabel lblNombre = new JLabel("Nombre*");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setVerticalAlignment(SwingConstants.TOP);
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		panel.add(lblNombre, gbc_lblNombre);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 5;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido*");
		lblPrimerApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPrimerApellido.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblPrimerApellido = new GridBagConstraints();
		gbc_lblPrimerApellido.anchor = GridBagConstraints.WEST;
		gbc_lblPrimerApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimerApellido.gridx = 1;
		gbc_lblPrimerApellido.gridy = 2;
		panel.add(lblPrimerApellido, gbc_lblPrimerApellido);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 5;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 2;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido*");
		lblSegundoApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblSegundoApellido = new GridBagConstraints();
		gbc_lblSegundoApellido.anchor = GridBagConstraints.WEST;
		gbc_lblSegundoApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblSegundoApellido.gridx = 1;
		gbc_lblSegundoApellido.gridy = 3;
		panel.add(lblSegundoApellido, gbc_lblSegundoApellido);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 5;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 4;
		gbc_textField_2.gridy = 3;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n*");
		lblDireccin.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblDireccin = new GridBagConstraints();
		gbc_lblDireccin.anchor = GridBagConstraints.WEST;
		gbc_lblDireccin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccin.gridx = 1;
		gbc_lblDireccin.gridy = 4;
		panel.add(lblDireccin, gbc_lblDireccin);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 5;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 4;
		gbc_textField_3.gridy = 4;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCorreoElectronico = new JLabel("Correo electr\u00F3nico*");
		lblCorreoElectronico.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblCorreoElectronico = new GridBagConstraints();
		gbc_lblCorreoElectronico.anchor = GridBagConstraints.WEST;
		gbc_lblCorreoElectronico.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoElectronico.gridx = 1;
		gbc_lblCorreoElectronico.gridy = 5;
		panel.add(lblCorreoElectronico, gbc_lblCorreoElectronico);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 5;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 4;
		gbc_textField_4.gridy = 5;
		panel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblGnero = new JLabel("G\u00E9nero");
		lblGnero.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblGnero = new GridBagConstraints();
		gbc_lblGnero.anchor = GridBagConstraints.WEST;
		gbc_lblGnero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGnero.gridx = 1;
		gbc_lblGnero.gridy = 6;
		panel.add(lblGnero, gbc_lblGnero);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_rdbtnHombre = new GridBagConstraints();
		gbc_rdbtnHombre.gridwidth = 3;
		gbc_rdbtnHombre.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnHombre.gridx = 3;
		gbc_rdbtnHombre.gridy = 6;
		panel.add(rdbtnHombre, gbc_rdbtnHombre);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_rdbtnMujer = new GridBagConstraints();
		gbc_rdbtnMujer.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMujer.gridx = 6;
		gbc_rdbtnMujer.gridy = 6;
		panel.add(rdbtnMujer, gbc_rdbtnMujer);
		
		JRadioButton rdbtnNoDeterminado = new JRadioButton("No Determinado");
		rdbtnNoDeterminado.setSelected(true);
		rdbtnNoDeterminado.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_rdbtnNoDeterminado = new GridBagConstraints();
		gbc_rdbtnNoDeterminado.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNoDeterminado.gridx = 7;
		gbc_rdbtnNoDeterminado.gridy = 6;
		panel.add(rdbtnNoDeterminado, gbc_rdbtnNoDeterminado);
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtnHombre);
		grupo1.add( rdbtnMujer);
		grupo1.add(rdbtnNoDeterminado);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFechaNacimiento = new GridBagConstraints();
		gbc_lblFechaNacimiento.anchor = GridBagConstraints.WEST;
		gbc_lblFechaNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaNacimiento.gridx = 1;
		gbc_lblFechaNacimiento.gridy = 7;
		panel.add(lblFechaNacimiento, gbc_lblFechaNacimiento);
		
		JDateChooser dateChooser = new JDateChooser();
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateChooser.gridwidth = 5;
		gbc_dateChooser.gridx = 3;
		gbc_dateChooser.gridy = 7;
		panel.add(dateChooser, gbc_dateChooser);
		
		JButton btnGuardar = new JButton("GUARDAR");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.fill = GridBagConstraints.BOTH;
		gbc_btnGuardar.ipadx = 2;
		gbc_btnGuardar.gridwidth = 2;
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 9;
		panel.add(btnGuardar, gbc_btnGuardar);
		
		JButton btnS = new JButton("SIGUIENTE");
		GridBagConstraints gbc_btnS = new GridBagConstraints();
		gbc_btnS.fill = GridBagConstraints.BOTH;
		gbc_btnS.ipady = 1;
		gbc_btnS.ipadx = 1;
		gbc_btnS.gridwidth = 2;
		gbc_btnS.insets = new Insets(0, 0, 0, 5);
		gbc_btnS.gridx = 6;
		gbc_btnS.gridy = 9;
		panel.add(btnS, gbc_btnS);
		
		/**
		 * 
		 * Listener del boton guardar,en el cual antes de guardar los datos comprobamos que los campos obligatorios no estan en blanco 
		 * 
		 * @author carlos 
		 */
		btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String campos_blanco=comprobarDatos();
            	if(!campos_blanco.equals("El "))
            		JOptionPane.showMessageDialog(panel, campos_blanco+" no puede estar en blanco", "Error", JOptionPane.ERROR_MESSAGE);
            	else
            		guardado=true;
            }

        });
		/**
		 * 
		 * Listener del boton siguiente, en el cual se comprueba que los campos obligatorios no estan vacios y te avisa si no has guardado. 
		 * @author carlos 
		 * 
		 */
		btnS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String campos_blanco=comprobarDatos();
            	if(!campos_blanco.equals("El "))
            	JOptionPane.showMessageDialog(panel, campos_blanco+" no puede estar en blanco", "Error", JOptionPane.ERROR_MESSAGE);
            	else
            		if(!guardado) {
            			int seguir =JOptionPane.showConfirmDialog(null,"No ha guardado los datos, Esta seguro que desea continuar?","Quiere continuar?",JOptionPane.YES_NO_OPTION);
            			 if(seguir==JOptionPane.YES_OPTION) {
            				 JOptionPane.showMessageDialog(panel,"Se abrira una ventana nueva", "Error", JOptionPane.ERROR_MESSAGE);
            			 }
            		}
            	
            }

        });
		
	}
	private String comprobarDatos() {
		String campos_blanco="El ";
		if(textField.getText().equals("")) {
    		campos_blanco=campos_blanco.concat(" nombre ");
    	} 
    	if(textField_1.getText().equals("")) {
    		campos_blanco=campos_blanco.concat(" Primer apellido ");
    	}
    	if(textField_2.getText().equals("")) {
    		campos_blanco=campos_blanco.concat(" Segundo apellido ");
    	}
    	if(textField_3.getText().equals("")) {
    		if(campos_blanco.equals("El "))
    			campos_blanco=" La direccion ";
    		else
    			campos_blanco=campos_blanco.concat(" direccion ");
    	}
    	return campos_blanco;
	}
}
