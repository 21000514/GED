package Vues;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class VueLecture extends JPanel {
	private Object doc;

	public VueLecture() {
		setBorder(new TitledBorder("Lecture")); // Titre du panel
		/* Background */

		// redimensionner
		// ImageIcon icon = new ImageIcon(new
		// ImageIcon("backgrounds//gdeFond2.jpg").getImage().getScaledInstance(this.getHeight(),
		// this.getWidth(), Image.SCALE_DEFAULT));
		ImageIcon icon = new ImageIcon("backgrounds//gdeFond2.jpg");
		JLabel img = new JLabel(icon);
		add(img);
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

}