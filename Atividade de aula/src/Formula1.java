
public class Formula1 extends Esporte{
	private int numVoltas;

	public int getNumVoltas() {
		return numVoltas;
	}

	public void setNumVoltas(int numVoltas) {
		this.numVoltas = numVoltas;
	}
	
	@Override
	public String toString() {

		return super.toString() + " Numero de votlas:" + getNumVoltas();
	}
}
