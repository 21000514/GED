package Vues;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Modele.ModeleApplication;

public class VueApplication extends JFrame implements Observer {
	private ModeleApplication modeleApp;
	private final static int LARG_ECRAN = 900;
	private final static int HAUT_ECRAN = 700;

	/*
	 * panelTags.setBackground(Color.white);
	 * panelSeries.setBackground(Color.white);
	 * panelCommandes.setBackground(Color.white);
	 * panelLecture.setBackground(Color.white);
	 * panelListe.setBackground(Color.white); panelApercu.setBackground(new
	 * Color(49, 56, 104));
	 */

	private JPanel panelGlobal;
	// private JPanel panelInfo; //Creer un nouveau borderlayout
	private VueTags panelTags;
	private VueSeries panelSeries;
	private VueCommandes panelCommandes;
	private VueLecture panelLecture;
	private VueListe panelListe;
	private VueApercu panelApercu;
	private VueRecherche panelRecherche;

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
		/*
		 * ImageIcon icon = new ImageIcon("backgrounds//gdeFond7.jpg");
		 * panelLecture.setImage(icon);
		 */

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// public void paintComponent(Graphics g) {}

	public void initComponents() {
		/* Instanciation du panel global */
		panelGlobal = new JPanel();
		setContentPane(panelGlobal);
		/* Instanciation des panels */
		panelTags = new VueTags();
		panelSeries = new VueSeries();
		panelCommandes = new VueCommandes();
		panelLecture = new VueLecture();
		panelListe = new VueListe();
		panelRecherche = new VueRecherche();
		panelApercu = new VueApercu();

		/* Background */
		panelGlobal.setBackground(Color.white);
		/* GridBagLayout */
		panelGlobal.setLayout(new GridBagLayout());
		GridBagConstraints gBCons = new GridBagConstraints();
		gBCons.fill = GridBagConstraints.BOTH;
		/* ¨Positionnement */

		gBCons.gridheight = 1;
		gBCons.gridwidth = 1;
		gBCons.gridx = 0;
		gBCons.gridy = 0;
		panelCommandes.setPreferredSize(new Dimension(LARG_ECRAN * 3 / 4,
				HAUT_ECRAN / 12));
		panelGlobal.add(panelCommandes, gBCons);
		gBCons.gridx = 1;
		panelRecherche.setPreferredSize(new Dimension(LARG_ECRAN * 1 / 4,
				HAUT_ECRAN / 12));
		panelGlobal.add(panelRecherche, gBCons);
		gBCons.gridheight = 2;
		gBCons.gridx = 0;
		gBCons.gridy = 1;
		panelLecture.setPreferredSize(new Dimension(LARG_ECRAN * 3 / 4,
				HAUT_ECRAN * 9 / 12));
		panelGlobal.add(panelLecture, gBCons);
		gBCons.gridheight = 1;
		gBCons.gridx = 1;
		panelApercu.setPreferredSize(new Dimension(LARG_ECRAN * 1 / 4,
				HAUT_ECRAN * 5 / 12));
		panelGlobal.add(panelApercu, gBCons);
		gBCons.gridy = 2;
		panelSeries.setPreferredSize(new Dimension(LARG_ECRAN * 1 / 4,
				HAUT_ECRAN * 4 / 12));
		panelGlobal.add(panelSeries, gBCons);
		gBCons.gridx = 0;
		gBCons.gridy = 3;
		panelListe.setPreferredSize(new Dimension(LARG_ECRAN * 3 / 4,
				HAUT_ECRAN * 3 / 12));
		panelGlobal.add(panelListe, gBCons);

		// gBCons.gridheight = 1;
		gBCons.gridx = 1;
		panelTags.setPreferredSize(new Dimension(LARG_ECRAN * 1 / 4,
				HAUT_ECRAN * 3 / 12));
		panelGlobal.add(panelTags, gBCons);

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

		this.repaint();
	}

}