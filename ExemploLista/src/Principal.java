import java.util.ArrayList;
import java.util.List;

public class Principal {
public static void main(String[] args) {
	Figura f1 = new Figura("Quadrado",4,"Quadrilátero");
	Figura f2 = new Figura("Retângulo",4,"Quadrilátero");
	Figura f3 = new Figura("Decágono",10,"Decalátero");
	Figura f4 = new Figura("Eneágono",9,"Enelatero");
	Figura f5 = new Figura("Hexágono",6,"Hexalátero");
	
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
