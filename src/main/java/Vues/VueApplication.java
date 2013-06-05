package Vues;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import Modele.ModeleApplication;

public class VueApplication extends JFrame implements Observer {
	private ModeleApplication modeleApp;

	private final static int LARG_ECRAN = 1100;
	private final static int HAUT_ECRAN = 900;

	private JPanel panelCommandes = new JPanel();
	private JPanel panelTags = new JPanel();
	private JPanel panelSeries = new JPanel();
	private JPanel panelListe = new JPanel();
	private JPanel panelLecture = new JPanel();
	private JPanel panelApercu = new JPanel();
	private Image background;

	public VueApplication(String parT, ModeleApplication modeleApp) {
		super(parT);
		this.modeleApp = modeleApp;
		initComponents();
		// this.paintComponent(this.getGraphics());
		setSize(LARG_ECRAN, HAUT_ECRAN);
		setResizable(false);
		this.repaint();
		pack(); // Redimensionne la fenetre a la taille de son contenu
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/*
	 * public void paintComponent(Graphics g) {
	 * 
	 * try { //img=new java.io.File(
	 * "C:\\Documents and Settings\\Nassa DEGNI\\Bureau\\photo\\image1.jpeg");
	 * BufferedImage img = ImageIO.read(new File("./gdeFond.jpg")); //String
	 * nom=img.getName(); this.paintComponent(g); // permet de dessiner les
	 * composants contenu dans le composant
	 * 
	 * g.drawImage(img, 30, 30, this); } catch(IOException exc) {
	 * exc.printStackTrace(); }
	 * 
	 * }
	 */

	public void initComponents() {
		JPanel panelGlobal = new JPanel();
		setContentPane(panelGlobal);
		panelGlobal.setLayout(new GridBagLayout());
		GridBagConstraints gBCons = new GridBagConstraints();
		gBCons.fill = GridBagConstraints.BOTH;

		panelCommandes.setBorder(new TitledBorder("Commandes"));
		panelCommandes.add(new VueCommande());
		panelTags.setBorder(new TitledBorder("Tags"));
		panelTags.add(new VueTags());
		panelSeries.setBorder(new TitledBorder("Series"));
		// panelSeries.add(new VueTags());
		panelListe.setBorder(new TitledBorder("Liste"));
		panelListe.add(new VueListe());
		panelLecture.setBorder(new TitledBorder("Lecture"));
		// panelLecture.add(new Label("Play !"));
		panelApercu.setBorder(new TitledBorder("Apercu"));
		// panelApercu.add(new Label("Apercu"));

		panelTags.setBackground(Color.white);
		panelSeries.setBackground(Color.white);
		panelCommandes.setBackground(new Color(49, 56, 104));
		panelLecture.setBackground(Color.white);
		panelListe.setBackground(Color.white);
		panelApercu.setBackground(new Color(17, 17, 17));
		/*
		 * panelTags.setBorder(BorderFactory.createLineBorder(Color.black));
		 * panelCommandes
		 * .setBorder(BorderFactory.createLineBorder(Color.green));
		 * panelLecture.setBorder(BorderFactory.createLineBorder(Color.blue));
		 * panelListe.setBorder(BorderFactory.createLineBorder(Color.red));
		 * panelApercu.setBorder(BorderFactory.createLineBorder(Color.yellow));
		 */

		gBCons.gridheight = 1;
		gBCons.gridx = 0;
		gBCons.gridy = 1;
		panelTags.setPreferredSize(new Dimension(LARG_ECRAN / 6,
				HAUT_ECRAN * 6 / 12));
		panelGlobal.add(panelSeries, gBCons);
		gBCons.gridx = 0;
		gBCons.gridy = 2;
		panelTags.setPreferredSize(new Dimension(LARG_ECRAN / 6,
				HAUT_ECRAN * 5 / 12));
		panelGlobal.add(panelTags, gBCons);
		gBCons.gridheight = 1;
		gBCons.gridwidth = 3;
		gBCons.gridx = 0;
		gBCons.gridy = 0;
		panelCommandes.setPreferredSize(new Dimension(LARG_ECRAN,
				HAUT_ECRAN / 12));
		panelGlobal.add(panelCommandes, gBCons);
		gBCons.gridheight = 1;
		gBCons.gridwidth = 1;
		gBCons.gridx = 1;
		gBCons.gridy = 1;
		panelLecture.setPreferredSize(new Dimension(LARG_ECRAN * 2 / 3,
				HAUT_ECRAN * 5 / 12));
		panelGlobal.add(panelLecture, gBCons);
		gBCons.gridx = 1;
		gBCons.gridy = 2;
		panelListe.setPreferredSize(new Dimension(LARG_ECRAN * 2 / 3,
				HAUT_ECRAN * 6 / 12));
		panelGlobal.add(panelListe, gBCons);
		gBCons.gridheight = 2;
		gBCons.gridx = 2;
		gBCons.gridy = 1;
		panelApercu.setPreferredSize(new Dimension(LARG_ECRAN / 6,
				HAUT_ECRAN * 2 / 3));
		panelGlobal.add(panelApercu, gBCons);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

		this.repaint();
	}

}