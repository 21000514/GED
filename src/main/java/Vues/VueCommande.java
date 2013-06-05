package Vues;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VueCommande extends JPanel implements ActionListener
{
	private JButton ajoutFichier= new JButton("+Fichier");
	JFileChooser chooser;
	public VueCommande()
	{
		this.setLayout(new GridLayout(1,5,8,8));
		
		ajoutFichier.setEnabled(true);
		this.add(ajoutFichier);
		ajoutFichier.addActionListener(this);
		
		JButton retraitFichier= new JButton("-Fichier");
		this.add(retraitFichier);
		JButton editMeta= new JButton("edit Meta");
		this.add(editMeta);
		JButton lectureFichier= new JButton("Lecture");
		this.add(lectureFichier);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == ajoutFichier)
		{
			File fichier;
			chooser = new JFileChooser(new File("."));
		   
			int val = chooser.showOpenDialog(this);

		   if (val == JFileChooser.APPROVE_OPTION) 
		   	{
			   fichier=chooser.getSelectedFile();
			   System.out.println(fichier.getName());
			   
		   	}
		   
		   System.out.println("fichier");
		}
		
	}
}