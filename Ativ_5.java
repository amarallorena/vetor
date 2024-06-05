package vetor;

import java.util.ArrayList;
import java.util.Scanner;
public class Ativ_5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int valor;
		ArrayList<String> carros = new ArrayList<String>();
		carros.add("civic");
		carros.add("corolla");
		carros.add("jetta");
		carros.add("onix");
		carros.add("argo");
		carros.add("kwid");
		carros.add("hb20");
		carros.add("renegade");
		carros.add("s10");
		carros.add("hilux");

		System.out.println("De 0 a 0 qual número você deseja ver para ler o nome do carro?");
		valor = ler.nextInt();

		System.out.println(carros.get(valor));
		ler.close();

	}

}
