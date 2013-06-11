package Vues;

import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueLecture extends JPanel implements Observer {
	private JLabel imgLecture;

	public VueLecture() {
		// setBorder(new TitledBorder("Lecture")); // Titre du panel
		/* Background */
		// setBackground(Color.white);
		// setOpaque(false);
		// redimensionner
		// ImageIcon icon = new ImageIcon(new
		// ImageIcon("img//gdeFond2.jpg").getImage().getScaledInstance(this.getHeight(),
		// this.getWidth(), Image.SCALE_DEFAULT));
		// ImageIcon icon = new ImageIcon("img//gdeFond2.jpg");
		ImageIcon icon = new ImageIcon("img//gdeFond2.jpg");
		imgLecture = new JLabel(icon);
		add(imgLecture);

	}

	/*
	 * public void setImage(ImageIcon icon) { doc =
	 * icon.getImage().getScaledInstance(this.getWidth(), this.getHeight(),
	 * Image.SCALE_DEFAULT); repaint(); }
	 * 
	 * @Override public void paintComponent(Graphics g) {
	 * super.paintComponent(g); if (doc instanceof ImageIcon) {
	 * System.out.println("affichage de doc"); g.drawImage((Image) doc, 0, 0,
	 * getWidth(), getHeight(), null); } }
	 */

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		remove(imgLecture);// removeAll();
		ImageIcon icon = new ImageIcon("img//gdeFond2.jpg");
		// imgLecture// = new JLabel(icon);
		// add(imgLecture);
		revalidate();
	}

}
