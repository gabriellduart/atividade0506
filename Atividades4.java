package vetor0;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividades4 {

	public static void main(String[] args) {
		ArrayList<String> carros =  new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		
		
		carros.add("fusca");
		carros.add("corolla");
		carros.add("camaro");
		carros.add("gol");
		carros.add("brasilia");
		carros.add("porsche");
		carros.add("civic");
		carros.add("monza");
		carros.add("eco sport");
		carros.add("meriva");
	
	    System.out.println("carros disponiveis: "+carros+" escolha um numero de 0 a 9:");
	    int num = ler.nextInt();
	    System.out.println(carros.get(num));
	
	    ler.close();
	}
	

}
