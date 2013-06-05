package Modele;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;


public class ModeleMetadonnees
{
	private File fichier;
	private String auteur;
	private String nom;
	private ImageIcon icone;
	private List<String> tags = new ArrayList<String>();
	
	public ModeleMetadonnees(File f,String a,String n,ImageIcon i)
	{
		fichier=f;
		auteur=a;
		nom=n;
		icone=i;
	}
	public void addTag(String tag)
	{
		tags.add(tag);
	}
	
	
	
	
	
	
}