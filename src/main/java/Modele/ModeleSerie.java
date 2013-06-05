package Modele;

import java.util.ArrayList;
import java.util.List;



public class ModeleSerie
{
	public List<ModeleMetadonnees> serie;
	public ModeleTags modeleTags;
	
	public ModeleSerie()
	{
		serie = new ArrayList();
	}
	
	public void addn(int n,ModeleMetadonnees m)
	{
		serie.add(n,m);
	}
	
	public void addTags(String s)
	{
		modeleTags.addTags(s);
	}
}