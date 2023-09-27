
public class Esporte {
	private String equipe;
	
	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public int getNumAtleta() {
		return numAtleta;
	}

	public void setNumAtleta(int numAtleta) {
		this.numAtleta = numAtleta;
	}

	private int numAtleta;
	
	@Override
	public String toString() {
		return "Equipe:" + getEquipe() + " Numero de atletas:" + getNumAtleta();
	}
}
