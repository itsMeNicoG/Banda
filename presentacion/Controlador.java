package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controlador  implements ActionListener{

	private VistaBanda ventana;

    public Controlador(VistaBanda aThis) {
        ventana = aThis;        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (((JButton) e.getSource()).getText().equalsIgnoreCase("Contratar")) {
				ventana.getMimodelo().contratar();
			} else if (((JButton) e.getSource()).getText().equalsIgnoreCase("tocar")) {
				ventana.getMimodelo().vizualizar();
			}	
	}

}
