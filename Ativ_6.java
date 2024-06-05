package vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Ativ_6 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		int num = 0;
		ArrayList<String> ingredientes = new ArrayList<String>();

		ingredientes.add("banana");
		ingredientes.add("morango");
		ingredientes.add("leite em pó");
		ingredientes.add("leite condensado");
		ingredientes.add("ovomaltine");
		ingredientes.add("paçoca");
		int rmv = 0;

		System.out.println(ingredientes);
		System.out.println("para adicionar ingredientes ao pedido digite 1, para retirar digite 2, mas caso não queira modificar digite outro número.");
		num = ler.nextInt();
		if (num == 1) {
			System.out.println("Digite o que você deseja adicionar em seu açaí: ");
			ingredientes.add(ler.next());
			System.out.println("Seu açaí está montado com os seguintes ingredientes "+ingredientes);
		}
		else if(num == 2) {
			System.out.println("Digite o ingtediente que você deseja remover: ");
			rmv = ler.nextInt();
			ingredientes.remove(rmv);
			System.out.println("Seu açaí está montado com os seguintes ingredintes: "+ingredientes);
			
		}
		else {
			System.out.println("Seu pedido está sendo preparado.");

		}
		ler.close();
	}

}
