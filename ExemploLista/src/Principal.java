import java.util.ArrayList;
import java.util.List;

public class Principal {
public static void main(String[] args) {
	Figura f1 = new Figura("Quadrado",4,"Quadril�tero");
	Figura f2 = new Figura("Ret�ngulo",4,"Quadril�tero");
	Figura f3 = new Figura("Dec�gono",10,"Decal�tero");
	Figura f4 = new Figura("Ene�gono",9,"Enelatero");
	Figura f5 = new Figura("Hex�gono",6,"Hexal�tero");
	
	List<Figura> listaFigura = new ArrayList<Figura>();
	listaFigura.add(f1);
	listaFigura.add(f2);
	listaFigura.add(f3);
	listaFigura.add(f4);
	listaFigura.add(f5);
	for (int i = 0; i < listaFigura.size(); i++) {
		System.out.println(listaFigura.get(i).toString());
	}
	

}
	

}
