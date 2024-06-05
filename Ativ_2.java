package vetor;
import java.util.ArrayList;
public class Ativ_2 {

	public static void main(String[] args) {
ArrayList<Integer> num = new ArrayList<>();
int soma = 0;

num.add(3);
num.add(-5);
num.add(-7);
num.add(-2);
num.add(9);

for (int i : num) {
	if (i<0) {
		soma += i;
	}
}
System.out.println("O resultado da soma dos números negativos é igual a:" + soma);
	
	}

}
