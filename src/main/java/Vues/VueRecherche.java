package Vues;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class VueRecherche extends JPanel implements Observer {

	private String texteRech;
	private JTextField rech;

	public VueRecherche() {
		/* Background */
		/*
		 * ImageIcon icon = new ImageIcon("img//gdeFond2.jpg"); JLabel img = new
		 * JLabel(icon); add(img);
		 */
		rech = new JTextField(15);
		rech.setText("Saisir mots-clés...");
		rech.setBackground(new Color(227, 231, 244));
		rech.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {

				if (e.getKeyChar() == KeyEvent.VK_ENTER) {

					texteRech = rech.getText();
				}
			}

			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

		this.add(rech);

	}

	public JTextField getRech() {
		return rech;
	}

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}
}

// "select * from images where nom like '% " + texteRech
// " %' OR auteur like '% " + texteRech " %' OR type like '% " + texteRech " %'"
