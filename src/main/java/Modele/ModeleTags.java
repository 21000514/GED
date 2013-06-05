package Modele;

import java.util.ArrayList;
import java.util.List;

public class ModeleTags {

	private List<String> tags;
	
	public ModeleTags() {
		tags = new ArrayList();
	}
	public void addTags(String s)
	{
		tags.add(s);
	}
}
