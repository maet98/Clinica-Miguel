package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Tratamiento extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public Tratamiento() {
		setTitle("Tratamiento");
		setBounds(100, 100, 590, 370);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ortodoncia", "Tratamiento de canal", "Limpieza", "Extraccion"}));
		comboBox.setBounds(73, 23, 169, 20);
		contentPanel.add(comboBox);
		
		JLabel lblTratamiento = new JLabel("Tratamiento:\r\n");
		lblTratamiento.setBounds(0, 26, 74, 14);
		contentPanel.add(lblTratamiento);
		
		JLabel lblCosto = new JLabel("Costo:");
		lblCosto.setBounds(0, 72, 55, 16);
		contentPanel.add(lblCosto);
		
		SpinnerNumberModel model = new SpinnerNumberModel(0.0, -1000.0, 1000.0, 0.1);
	    JSpinner spinner = new JSpinner(model);
	    JSpinner.NumberEditor editor = new JSpinner.NumberEditor(spinner);
	    spinner.setEditor(editor);
		spinner.setBounds(75, 66, 86, 28);
		contentPanel.add(spinner);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
