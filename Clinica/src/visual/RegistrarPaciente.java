package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Toolkit;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;

public class RegistrarPaciente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JFormattedTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JFormattedTextField txtCelular;
	private JFormattedTextField txtTelefono;
	private MaskFormatter formatTelefono;
	private JTextField txtEmail;
	private JTextField textField;
	private JTextField textField_1;

	public RegistrarPaciente() throws ParseException {
		setTitle("Registrar Paciente");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrarPaciente.class.getResource("/imagenes/dermatology.png")));
		setBounds(100, 100, 556, 377);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(250, 240, 230));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, new Color(64, 64, 64), null, null, null), "Informaciones", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(59, 59, 59)));
			panel.setBackground(new Color(250, 240, 230));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			MaskFormatter formatter = new MaskFormatter("###-#######-#");
			txtCedula = new JFormattedTextField(formatter);
			txtCedula.setBounds(77, 26, 101, 27);
			panel.add(txtCedula);
			
			JLabel lblCedula = new JLabel("Cedula:");
			lblCedula.setBounds(10, 32, 46, 14);
			panel.add(lblCedula);
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setBounds(9, 83, 56, 14);
				panel.add(lblNombre);
			}
			
			txtNombre = new JTextField();
			txtNombre.setBounds(77, 77, 101, 27);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			
			txtApellido = new JTextField();
			txtApellido.setBounds(77, 128, 101, 27);
			panel.add(txtApellido);
			txtApellido.setColumns(10);
			{
				JLabel lblApellido = new JLabel("Apellido:");
				lblApellido.setBounds(6, 134, 68, 14);
				panel.add(lblApellido);
			}
			{
				JLabel lblTelefono = new JLabel("Telefono:");
				lblTelefono.setBounds(10, 236, 56, 14);
				panel.add(lblTelefono);
			}
			{
				JLabel lblCelular = new JLabel("Celular:");
				lblCelular.setBounds(10, 185, 46, 14);
				panel.add(lblCelular);
			}
			{
				formatTelefono = new MaskFormatter("(###)-###-####");
				txtCelular = new JFormattedTextField(formatTelefono);
				txtCelular.setBounds(77, 179, 101, 27);
				panel.add(txtCelular);
			}
			{
				txtTelefono = new JFormattedTextField(formatTelefono);
				txtTelefono.setBounds(77, 230, 101, 27);
				panel.add(txtTelefono);
			}
			{
				JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
				lblFechaNacimiento.setBounds(232, 32, 125, 14);
				panel.add(lblFechaNacimiento);
			}
			
			JDateChooser FechaNacimiento = new JDateChooser();
			FechaNacimiento.setBackground(new Color(250, 235, 215));
			FechaNacimiento.setBounds(336, 25, 166, 28);
			panel.add(FechaNacimiento);
			
			JRadioButton rdbtnHombre = new JRadioButton("");
			rdbtnHombre.setHorizontalAlignment(SwingConstants.LEFT);
			rdbtnHombre.setBounds(232, 81, 19, 18);
			panel.add(rdbtnHombre);
			
			JRadioButton rdbtnMujer = new JRadioButton("");
			rdbtnMujer.setBounds(300, 79, 19, 18);
			panel.add(rdbtnMujer);
			
			JLabel lblHombre = new JLabel("");
			lblHombre.setIcon(new ImageIcon(RegistrarPaciente.class.getResource("/imagenes/man-standing-up.png")));
			lblHombre.setBounds(256, 77, 32, 32);
			panel.add(lblHombre);
			
			JLabel lblMujer = new JLabel("");
			lblMujer.setIcon(new ImageIcon(RegistrarPaciente.class.getResource("/imagenes/female-silhouette.png")));
			lblMujer.setBounds(325, 77, 32, 32);
			panel.add(lblMujer);
			{
				JLabel lblEmail = new JLabel("Email:");
				lblEmail.setBounds(233, 134, 55, 16);
				panel.add(lblEmail);
			}
			{
				JLabel label = new JLabel("*");
				label.setBounds(189, 82, 19, 16);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("*");
				label.setBounds(190, 184, 19, 16);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("*");
				label.setBounds(190, 235, 19, 16);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("*");
				label.setBounds(509, 32, 19, 16);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("*");
				label.setBounds(380, 82, 19, 16);
				panel.add(label);
			}
			{
				JLabel lblGenero = new JLabel("Genero:");
				lblGenero.setBounds(232, 58, 55, 16);
				panel.add(lblGenero);
			}
			
			txtEmail = new JTextField();
			txtEmail.setBounds(277, 128, 192, 28);
			panel.add(txtEmail);
			txtEmail.setColumns(10);
			{
				JLabel label = new JLabel("*");
				label.setBounds(190, 134, 19, 16);
				panel.add(label);
			}
			{
				JLabel lblCiudad = new JLabel("Ciudad:");
				lblCiudad.setBounds(232, 179, 46, 16);
				panel.add(lblCiudad);
			}
			{
				JLabel lblPais = new JLabel("Pais:");
				lblPais.setBounds(232, 212, 37, 16);
				panel.add(lblPais);
			}
			{
				textField = new JTextField();
				textField.setBounds(277, 171, 122, 28);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				textField_1 = new JTextField();
				textField_1.setBounds(277, 206, 122, 28);
				panel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JLabel lblObligatorios = new JLabel("* Obligatorios");
				lblObligatorios.setForeground(new Color(0, 0, 0));
				lblObligatorios.setOpaque(true);
				lblObligatorios.setBackground(new Color(245, 255, 250));
				lblObligatorios.setBounds(300, 241, 99, 16);
				panel.add(lblObligatorios);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistar = new JButton("Registrar");
				btnRegistar.setActionCommand("OK");
				buttonPane.add(btnRegistar);
				getRootPane().setDefaultButton(btnRegistar);
			}
			{
				JButton btnSalir = new JButton("Salir");
				btnSalir.setActionCommand("Cancel");
				buttonPane.add(btnSalir);
			}
		}
	}
}
