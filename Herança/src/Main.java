
public class Main {
	
	public static void main(String[] args) {
	
		PF pf1 = new PF();
		pf1.idade = 40;
		pf1.setCpf("99999999-87");
		pf1.setNome("Francisco Molina");
		pf1.data = "05/03/1983";
		
		PJ pj1 = new PJ();
		pj1.cnpj = "000.000.000/00";
		pj1.idade = 2;
		pj1.setNome("Google");
		pj1.data = "01/02/2021";
		
		System.out.println(pf1.getNome());
		System.out.println(pj1.getNome());
	}
}
