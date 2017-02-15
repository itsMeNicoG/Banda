package presentacion;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.TextArea;


@SuppressWarnings("serial")
public class VistaBanda extends JFrame {

	@SuppressWarnings("unused")
	private JPanel contentPane;

	private Mimodelo modelo;
	private Controlador control;
	private JButton btnBanda;
	private JButton button;
	private TextArea textArea;

	public TextArea getTxtBandaTocando() {
		return textArea;
	}



	public VistaBanda(Mimodelo aThis) {
		modelo = aThis;
		initComponents();
		asignarEventos();
	}



	public Mimodelo getMimodelo() {
		return modelo;
	}

	
	public Controlador getControl() {
		if (control == null) {
			control = new Controlador(this);
		}
		return control;
	}
	
	
	private void initComponents() {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		btnBanda = new JButton("Contratar");
		btnBanda.setBounds(10, 11, 205, 23);
		getContentPane().add(btnBanda);
		
		button = new JButton("Tocar");
		button.setBounds(225, 11, 199, 23);
		getContentPane().add(button);
		
		textArea = new TextArea();
		textArea.setBounds(10, 40, 414, 512);
		getContentPane().add(textArea);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	private void asignarEventos() {
		btnBanda.addActionListener(getControl());
		button.addActionListener(getControl());	
	}
}



