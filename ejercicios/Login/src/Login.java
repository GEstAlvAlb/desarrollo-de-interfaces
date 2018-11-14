import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.PrivateKey;
import java.awt.event.ActionEvent;

public class Login extends JDialog implements ActionListener, KeyListener  {

	private final JPanel contentPanel = new JPanel();
	public JTextField tfUsuario;
	public JPasswordField tfContrase�a;
	public JLabel lblUsuario;
	public JLabel lblContrasea;
	public JButton btEntrar;
	public JButton btSalir;
	private JLabel lbMensaje;
	private JPanel buttonPane;

	private String usuario;
	private String contrasena;

	public Login() {
		setBounds(100, 100, 370, 260);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lbMensaje = new JLabel();
		lbMensaje.setForeground(Color.RED);
		getContentPane().add(lbMensaje, BorderLayout.NORTH);
		
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(189, 69, 118, 20);
		contentPanel.add(tfUsuario);
		tfUsuario.setColumns(10);

		tfContrase�a = new JPasswordField();
		tfContrase�a.setBounds(189, 109, 118, 20);
		contentPanel.add(tfContrase�a);
		tfContrase�a.setColumns(10);

		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(57, 72, 46, 14);
		contentPanel.add(lblUsuario);

		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(57, 112, 67, 14);
		contentPanel.add(lblContrasea);

		//JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		//JButton btEntrar = new JButton("Entrar");
		btEntrar.setActionCommand("entrar");
		buttonPane.add(btEntrar);
		getRootPane().setDefaultButton(btEntrar);

		//JButton btSalir = new JButton("Salir");
		btSalir.setActionCommand("salir");
		buttonPane.add(btSalir);
		
		btEntrar.addActionListener(this);
		btSalir.addActionListener(this);
	

		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		setModal(true);
		setVisible(true);

		
	}
	
	public void mostrarDialogo() {
		setVisible(true);
	}
	
	public void limpiarContrasena() {
		tfContrase�a.setText("");
		tfContrase�a.requestFocus();
	}
	

	public void setMensaje(String mensaje) {
		
		lbMensaje.setText(mensaje);
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContrasena() {
		return contrasena;
	}
	

	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "entrar":
			usuario = tfUsuario.getText();
			contrasena = String.valueOf((tfContrase�a).getPassword());
			setVisible(false);

			break;
		case "salir":
			System.exit(0);
		default:
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}