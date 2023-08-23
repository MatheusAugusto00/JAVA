import java.util.ArrayList;

public class ProgramaListas {
	public static void main(String[] args) {
		
		Pessoas p1 = new Pessoas();
		p1.nome = "Francisco Molina";
		p1.ra = "123456";
		p1.idade = 40;
		
		Pessoas p2 = new Pessoas();
		p2.nome = "João";
		
		Pessoas p3 = new Pessoas();
		p3.nome = "Maria";
		p3.idade = 18;
		
		Pessoas p4 = new Pessoas();
		p4.nome = "Jose";
		
		ArrayList<Pessoas> listaPessoas = new ArrayList<Pessoas>();
		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);
		listaPessoas.add(p4);
		
		System.out.println("O tamanho da lista é:" + listaPessoas.size());
		
		for (int i = 0; i < listaPessoas.size(); i++) {
			System.out.println(listaPessoas.get(i).nome);
		}
	}

}
