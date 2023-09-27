
public class Futebol extends Esporte{
	private String campeonato;

	public String getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(String campeonato) {
		this.campeonato = campeonato;
	}
	@Override
	public String toString() {
		return super.toString() + " Campeonato:" + getCampeonato();
	}
}
