package vetor0;

import java.util.ArrayList;

public class atividade5 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		int som=0;
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		
		for (int i : numeros) {
			som += i;
		}
	System.out.println("O resultado da soma é: " + som);
	}

}
