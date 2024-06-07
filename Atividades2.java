package vetor0;

import java.util.ArrayList;
import java.util.Random;

public class Atividades2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		int soma=0;
	    Random random = new Random ();
		
		for (int i=0; i < 5; i++) {
			int numerosAleatorio = random.nextInt();
			numeros.add(numerosAleatorio);
		}
		for (int numero : numeros) {
			if (numero < 0)
				soma++;
			System.out.println(numero);
		}
          System.out.println("o resultado é: "+soma);

	}

}
