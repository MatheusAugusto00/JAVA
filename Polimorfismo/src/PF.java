
public class PF extends Pessoa{
	
	public String cpf;
	
	public void apresentarNome() {
		System.out.println(this.nome);
		super.apresentarNome();
	}
}
