package Vues;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import Modele.BDApplication;
import Modele.Metadonnee;

public class VueApplication extends JFrame implements Observer {
	private final static int LARG_ECRAN = 900;
	private final static int HAUT_ECRAN = 650;
	private BDApplication bDApplication;
	private JPanel panelGlobal;
	private VueTag panelTags;
	private VueSeries panelSeries;
	private VueCommandes panelCommandes;
	private VueLecture panelLecture;
	private VueListe panelListe;
	private VueMetaDonnee panelMetaDonnee;
	private VueRecherche panelRecherche;

	public VueApplication(String parT, BDApplication bDApplication) {
		super(parT);
		this.bDApplication = bDApplication;
		initComponents(); // Initialisation des composants
		setSize(LARG_ECRAN, HAUT_ECRAN);
		setLocationRelativeTo(null);// centrage de la fenetre principale
		setResizable(false); // Redimensionnement interdit
		this.repaint();
		pack(); // Redimensionne la fenetre a la taille de son contenu
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// public void paintComponent(Graphics g) {}

	public void initComponents() {
		/* Instanciation du panel global */
		panelGlobal = new JPanel();
		setContentPane(panelGlobal);
		/* Instanciation des panels */
		panelTags = new VueTag();
		panelSeries = new VueSeries();
		panelCommandes = new VueCommandes();
		panelLecture = new VueLecture();
		panelListe = new VueListe(bDApplication.getListe());
		panelRecherche = new VueRecherche();
		panelMetaDonnee = new VueMetaDonnee(new Metadonnee());

		/* Background */
		/*
		 * ImageIcon icon = new ImageIcon("img//gdeFond3.jpg"); JLabel img = new
		 * JLabel(icon); add(img);
		 */
		panelGlobal.setBackground(new Color(12, 65, 127));
		// panelGlobal.setBackground(Color.black);
		panelMetaDonnee.setBackground(new Color(227, 231, 244));
		panelListe.setOpaque(false);
		panelRecherche.setOpaque(false);
		panelSeries.setBackground(new Color(227, 231, 244));
		panelTags.setOpaque(false);
		panelCommandes.setOpaque(false);
		panelLecture.setBackground(new Color(227, 231, 244));
		/* Titres */
		panelMetaDonnee.setBorder(new TitledBorder("Métadonnées"));
		panelSeries.setBorder(new TitledBorder("Series")); // Titre du panel
		TitledBorder tRech = new TitledBorder("Recherche");
		tRech.setTitleColor(Color.white);
		panelRecherche.setBorder(tRech);
		TitledBorder tTag = new TitledBorder("Tags");
		tTag.setTitleColor(Color.white);
		panelTags.setBorder(tTag);

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
		panelGlobal.add(panelCommandes, gBCons); // ajout de panelCommandes
		gBCons.gridx = 1;
		panelRecherche.setPreferredSize(new Dimension(LARG_ECRAN * 1 / 4,
				HAUT_ECRAN / 12));
		panelGlobal.add(panelRecherche, gBCons);// ajout de panelRecherche
		gBCons.gridheight = 2;
		gBCons.gridx = 0;
		gBCons.gridy = 1;
		panelLecture.setPreferredSize(new Dimension(LARG_ECRAN * 3 / 4,
				HAUT_ECRAN * 9 / 12));
		panelGlobal.add(panelLecture, gBCons);// ajout de panelLecture
		gBCons.gridheight = 1;
		gBCons.gridx = 1;
		panelMetaDonnee.setPreferredSize(new Dimension(LARG_ECRAN * 1 / 4,
				HAUT_ECRAN * 5 / 12));
		panelGlobal.add(panelMetaDonnee, gBCons);// ajout de panelMetaDonnee
		gBCons.gridy = 2;
		panelTags.setPreferredSize(new Dimension(LARG_ECRAN * 1 / 4,
				HAUT_ECRAN * 4 / 12));
		panelGlobal.add(panelTags, gBCons);// ajout de panelTags
		gBCons.gridx = 0;
		gBCons.gridy = 3;
		panelListe.setPreferredSize(new Dimension(LARG_ECRAN * 3 / 4,
				HAUT_ECRAN * 3 / 12));
		panelGlobal.add(panelListe, gBCons);// ajout de panelListe

		// gBCons.gridheight = 1;
		gBCons.gridx = 1;
		panelSeries.setPreferredSize(new Dimension(LARG_ECRAN * 1 / 4,
				HAUT_ECRAN * 3 / 12));
		panelGlobal.add(panelSeries, gBCons);// ajout de panelSeries

	}

	public VueListe getVueListe() {
		return panelListe;
	}

	public VueCommandes getVueCommande() {
		return panelCommandes;
	}

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

		this.repaint();
	}

}