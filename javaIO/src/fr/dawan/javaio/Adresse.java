package fr.dawan.javaio;

import java.io.Serializable;

public class Adresse implements Serializable{

	private static final long serialVersionUID = 778866782519513121L;
	
	private String voie; 
	private String ville;
	
	//transient : Cela veut dire que cette variable sera ignorée lors de la serialisation
	private transient int codePostale;
	
	public Adresse() {
	}

	public Adresse(String voie, String ville, int codePostale) {
		super();
		this.voie = voie;
		this.ville = ville;
		this.codePostale = codePostale;
	}

	public String getVoie() {
		return voie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

	@Override
	public String toString() {
		return "Adresse [voie=" + voie + ", ville=" + ville + ", codePostale=" + codePostale + "]";
	}
	
	

}
