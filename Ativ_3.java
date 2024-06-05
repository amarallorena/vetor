package vetor;
import java.util.ArrayList;
public class Ativ_3 {

	public static void main(String[] args) {
	
		ArrayList<String> frutas = new ArrayList<String>();
		
		frutas.add("maçã");
		frutas.add("morango");
		frutas.add("uva");
		frutas.add("manga");
		frutas.add("kiwi");
		frutas.add("banana");
		frutas.add("abacaxi");
		frutas.add("pitaya");
		frutas.add("laranja");
		frutas.add("melancia");
		
		System.out.println(frutas);
		
		frutas.remove(6);
		frutas.remove(5);
		frutas.remove(4);
		frutas.remove(3);
		frutas.remove(2);
		
		System.out.println(frutas);
		System.out.println(frutas.size());
		
		
	}
}
