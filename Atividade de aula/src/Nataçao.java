
public class Nataçao extends Esporte{
	private String modalidade;

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	@Override
	public String toString() {
		return super.toString() + " Modalidade:" + getModalidade();
	}
}
