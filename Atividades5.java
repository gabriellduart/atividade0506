package vetor0;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividades5 {

	public static void main(String[] args) {
		ArrayList<String> ingrediente = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		int alt;
		
		
		System.out.println("Açai da casa");
		ingrediente.add("granola");
		ingrediente.add("morango");
		ingrediente.add("leite em pó");
		ingrediente.add("leite condensado");
		ingrediente.add("banana");
		System.out.println("Ingredientes: "+ingrediente);
		
		System.out.println("remover [1], adicionar [2] ou manter [3]: ");
		alt = ler.nextInt();
		
		if (alt == 1) {
		System.out.println("qual ingrediente deseja excluir?");
		ingrediente.remove(ler.nextInt());
		System.out.println(ingrediente);
		}
		else if (alt == 2) {
			System.out.println("qual ingrediente deseja adicionar?");
			ingrediente.add(ler.next());
			System.out.println(ingrediente);
}
		else System.out.println(ingrediente);
	
	
	}
	}
