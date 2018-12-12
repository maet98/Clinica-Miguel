package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

public class RegistrarDoctores extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtEmail;

	
	public RegistrarDoctores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrarDoctores.class.getResource("/imagenes/dentist.png")));
		setTitle("Registrar Doctores");
		setBounds(100, 100, 542, 414);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(250, 235, 215));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(250, 235, 215));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setBounds(6, 45, 55, 16);
				panel.add(lblNombre);
			}
			{
				JLabel lblApellido = new JLabel("Apellido:");
				lblApellido.setBounds(6, 84, 55, 16);
				panel.add(lblApellido);
			}
			{
				JLabel lblCedula = new JLabel("Cedula:");
				lblCedula.setBounds(6, 6, 55, 16);
				panel.add(lblCedula);
			}
			{
				JRadioButton rdbHombre = new JRadioButton("");
				rdbHombre.setHorizontalAlignment(SwingConstants.LEFT);
				rdbHombre.setBounds(62, 227, 19, 18);
				panel.add(rdbHombre);
			}
			{
				JLabel label = new JLabel("");
				label.setIcon(new ImageIcon(RegistrarDoctores.class.getResource("/imagenes/man-standing-up.png")));
				label.setBounds(86, 223, 32, 32);
				panel.add(label);
			}
			{
				JRadioButton rdbMujer = new JRadioButton("");
				rdbMujer.setBounds(130, 225, 19, 18);
				panel.add(rdbMujer);
			}
			{
				JLabel label = new JLabel("");
				label.setIcon(new ImageIcon(RegistrarDoctores.class.getResource("/imagenes/female-silhouette.png")));
				label.setBounds(155, 223, 32, 32);
				panel.add(label);
			}
			{
				JLabel lblGenero = new JLabel("Genero:");
				lblGenero.setBounds(6, 223, 55, 16);
				panel.add(lblGenero);
			}
			{
				JLabel lblFoto = new JLabel("");
				lblFoto.setBounds(294, 6, 184, 137);
				panel.add(lblFoto);
			}
			
			JButton btnFoto = new JButton("Ingresar Foto");
			btnFoto.setBounds(325, 150, 122, 28);
			panel.add(btnFoto);
			
			JLabel lblTelefono = new JLabel("Telefono:");
			lblTelefono.setBounds(6, 126, 55, 16);
			panel.add(lblTelefono);
			
			JLabel lblNewLabel = new JLabel("Celular:");
			lblNewLabel.setBounds(6, 174, 55, 16);
			panel.add(lblNewLabel);
			
			txtApellido = new JTextField();
			txtApellido.setBounds(69, 78, 115, 28);
			panel.add(txtApellido);
			txtApellido.setColumns(10);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(69, 39, 115, 28);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			
			JFormattedTextField txtCedula = new JFormattedTextField();
			txtCedula.setBounds(69, 0, 115, 28);
			panel.add(txtCedula);
			
			JFormattedTextField TxtTelefono = new JFormattedTextField();
			TxtTelefono.setBounds(69, 120, 115, 28);
			panel.add(TxtTelefono);
			
			JFormattedTextField TxtCelular = new JFormattedTextField();
			TxtCelular.setBounds(69, 168, 115, 28);
			panel.add(TxtCelular);
			
			JLabel lblEmail = new JLabel("Email");
			lblEmail.setBounds(240, 227, 55, 16);
			panel.add(lblEmail);
			{
				txtEmail = new JTextField();
				txtEmail.setBounds(325, 227, 122, 28);
				panel.add(txtEmail);
				txtEmail.setColumns(10);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 255, 255));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("");
				btnRegistrar.setIcon(new ImageIcon(RegistrarDoctores.class.getResource("/imagenes/floppy-disk-interface-symbol-for-save-option-button.png")));
				btnRegistrar.setActionCommand("OK");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton btnSalir = new JButton("");
				btnSalir.setIcon(new ImageIcon(RegistrarDoctores.class.getResource("/imagenes/cross-close-or-delete-circular-interface-button-symbol.png")));
				btnSalir.setActionCommand("Cancel");
				buttonPane.add(btnSalir);
			}
		}
	}
}
