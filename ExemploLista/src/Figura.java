
public class Figura {
	public String nome;
	public int nrLados;
	public String tipo;
	
	public Figura(String nome, int nrLados, String tipo) {
		this.nome = nome;
		this.nrLados = nrLados;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Figura [nome=" + nome + ", nrLados=" + nrLados + ", tipo=" + tipo + "]";
	}



}
