package vetor0;

import java.util.ArrayList;
import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		
		carros.add("fusca");
		carros.add("Brasilia");
		carros.add("chevette");
		carros.add("monza");
		carros.add("Brasilia");
		carros.add("monza");
		carros.add("monza");

        System.out.println(carros);
	}

}
