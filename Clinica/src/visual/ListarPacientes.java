package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import java.text.ParseException;

import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

public class ListarPacientes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel model;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JFormattedTextField txttelefono;
	private JFormattedTextField txtcelular;

	
	public ListarPacientes() throws ParseException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListarPacientes.class.getResource("/imagenes/dermatology.png")));
		setTitle("Listar Pacientes");
		setBounds(100, 100, 836, 541);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Informaciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 186, 790, 262);
			panel.add(scrollPane);
			
			table = new JTable();
			scrollPane.setViewportView(table);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(10, 22, 46, 14);
			panel.add(lblNombre);
			
			JLabel lblApellido = new JLabel("Apellido:");
			lblApellido.setBounds(10, 50, 46, 14);
			panel.add(lblApellido);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(56, 19, 97, 20);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			
			txtApellido = new JTextField();
			txtApellido.setBounds(56, 47, 97, 20);
			panel.add(txtApellido);
			txtApellido.setColumns(10);
			
			JLabel lblTelefono = new JLabel("Telefono:");
			lblTelefono.setBounds(10, 77, 46, 14);
			panel.add(lblTelefono);
			
			MaskFormatter format = new MaskFormatter("(###)-###-####");
			txttelefono = new JFormattedTextField(format);
			txttelefono.setBounds(56, 77, 97, 20);
			panel.add(txttelefono);
			
			JLabel lblcelular = new JLabel("Celular:");
			lblcelular.setBounds(10, 107, 46, 14);
			panel.add(lblcelular);
			
			txtcelular = new JFormattedTextField(format);
			txtcelular.setBounds(56, 107, 97, 20);
			panel.add(txtcelular);
			
			JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento:");
			lblFechaNacimiento.setBounds(280, 22, 87, 14);
			panel.add(lblFechaNacimiento);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnTratamiento = new JButton("Tratamiento");
				btnTratamiento.setActionCommand("OK");
				buttonPane.add(btnTratamiento);
				getRootPane().setDefaultButton(btnTratamiento);
			}
			
			JButton btnRecibo = new JButton("Recibo");
			buttonPane.add(btnRecibo);
			{
				JButton btnSalir = new JButton("Cancel");
				btnSalir.setActionCommand("Cancel");
				buttonPane.add(btnSalir);
			}
		}
	}
}
