
public class Main {
	public static void main(String[] args) {
		Formula1 f1 = new Formula1();
		f1.setEquipe("Ferrari");
		f1.setNumAtleta(1);
		f1.setNumVoltas(78);
		
		Nataçao n1 = new Nataçao();
		n1.setEquipe("AABB");
		n1.setNumAtleta(1);
		n1.setModalidade("Nado livre - 100 metros rasos");
		
		Futebol fut1 = new Futebol();
		fut1.setEquipe("Vasco");
		fut1.setNumAtleta(11);
		fut1.setCampeonato("Campeonato carioca");
		
		Volei v1 = new Volei();
		v1.setEquipe("Brasil");
		v1.setNumAtleta(6);
		v1.setQuadra("Areia");
		
		System.out.println(f1);
		System.out.println(n1);
		System.out.println(fut1);
		System.out.println(v1);
	}
}
