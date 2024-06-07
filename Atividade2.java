package vetor0;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		int a[] = new int [5];
		int soma=0;
		Scanner ler = new Scanner(System.in);
		
		for(int i =0; i<5; i++) {
			System.out.println("informe um valor" + i);
			a[i]= ler.nextInt();
			
			soma+= a[i];
		}
           if (soma>30)
        	   System.out.println("a soma dos numeros é maior que 30, resultando em " + soma);
           else
        	   System.out.println("a soma dos numeros é menor que 30, resultando em " + soma);
ler.close();
	}

}
