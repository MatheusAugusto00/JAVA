
public class Volei extends Esporte{
	private String quadra;

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}
	@Override
	public String toString() {
		return super.toString() + " Tipo de quadra:" + getQuadra();
	}
	
}
