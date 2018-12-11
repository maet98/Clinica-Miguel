package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class PrincipalClinica extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalClinica frame = new PrincipalClinica();
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
	public PrincipalClinica() {
		setTitle("Clinica Dental Dr. Miguel Estevez");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PrincipalClinica.class.getResource("/imagenes/tooth1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 460);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPacientes = new JMenu("Pacientes");
		menuBar.add(mnPacientes);
		
		JMenuItem mntmRegistrarPaciente = new JMenuItem("Registrar Paciente");
		mntmRegistrarPaciente.setIcon(new ImageIcon(PrincipalClinica.class.getResource("/imagenes/dermatology.png")));
		mnPacientes.add(mntmRegistrarPaciente);
		
		JMenu mnDoctores = new JMenu("Doctores");
		menuBar.add(mnDoctores);
		
		JMenuItem mntmRegistrarDoctor = new JMenuItem("Registrar Doctor");
		mntmRegistrarDoctor.setIcon(new ImageIcon(PrincipalClinica.class.getResource("/imagenes/dentist.png")));
		mnDoctores.add(mntmRegistrarDoctor);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
