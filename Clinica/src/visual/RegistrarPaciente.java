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

public class RegistrarPaciente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JFormattedTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JFormattedTextField txtCelular;
	private JFormattedTextField txtTelefono;
	private MaskFormatter formatTelefono;

	public RegistrarPaciente() throws ParseException {
		setTitle("Registrar Paciente");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrarPaciente.class.getResource("/imagenes/dermatology.png")));
		setBounds(100, 100, 556, 377);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			MaskFormatter formatter = new MaskFormatter("###-#######-#");
			txtCedula = new JFormattedTextField(formatter);
			txtCedula.setBounds(53, 29, 87, 20);
			panel.add(txtCedula);
			
			JLabel lblCedula = new JLabel("Cedula:");
			lblCedula.setBounds(10, 32, 46, 14);
			panel.add(lblCedula);
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setBounds(10, 67, 46, 14);
				panel.add(lblNombre);
			}
			
			txtNombre = new JTextField();
			txtNombre.setBounds(53, 64, 86, 20);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			
			txtApellido = new JTextField();
			txtApellido.setBounds(53, 100, 86, 20);
			panel.add(txtApellido);
			txtApellido.setColumns(10);
			{
				JLabel lblApellido = new JLabel("Apellido:");
				lblApellido.setBounds(10, 103, 46, 14);
				panel.add(lblApellido);
			}
			{
				JLabel lblTelefono = new JLabel("Telefono:");
				lblTelefono.setBounds(10, 158, 46, 14);
				panel.add(lblTelefono);
			}
			{
				JLabel lblCelular = new JLabel("Celular:");
				lblCelular.setBounds(10, 131, 46, 14);
				panel.add(lblCelular);
			}
			{
				formatTelefono = new MaskFormatter("(###)-###-####");
				txtCelular = new JFormattedTextField(formatTelefono);
				txtCelular.setBounds(53, 131, 87, 20);
				panel.add(txtCelular);
			}
			{
				txtTelefono = new JFormattedTextField(formatTelefono);
				txtTelefono.setBounds(63, 155, 87, 20);
				panel.add(txtTelefono);
			}
			{
				JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
				lblFechaNacimiento.setBounds(10, 201, 97, 14);
				panel.add(lblFechaNacimiento);
			}
		}
		{
			JPanel buttonPane = new JPanel();
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
