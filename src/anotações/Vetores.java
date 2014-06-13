package anota��es;

import java.util.ArrayList;

public class Vetores {
	public static void main(String[] args) {
		//Lista
		//java.util.ArrayLisa
		ArrayList<Integer> vetor = new ArrayList<>(); //Limita o vetor � apenas valores inteiros
		vetor.add(10); //Acrescenta 1 posi��o com o n�mero 10
		vetor.add(20); //Acrescenta 1 posi��o com o n�mero 20
		
		System.out.println("Tamanho: "+ vetor.size()); //Imprime o tamanho do vetor
		System.out.println("Vator: "+ vetor); //Imprime os elementos vetor
		
		//'remove' pode remover um elemento do vetor, procurando por ele ou pela posi��o
		vetor.remove((Integer)10); //Remove o n�mero 10 do vetor
		
		System.out.println("\nTamanho: "+ vetor.size());
		System.out.println("Vator: "+ vetor);
		
		vetor.add(100); //Adiciona nova posi��o
		vetor.remove(1); //Remove a posi��o 1
		
		System.out.println("\nTamanho: "+ vetor.size());
		System.out.println("Vator: "+ vetor);
		
		vetor.add(200);
		vetor.add(300);
		//Alterar o valor de uma posi��p
		vetor.set(0,100);
		System.out.println("\nTamanho: "+ vetor.size());
		System.out.println("Vator: "+ vetor);
		
		//Recuperando o valor na posi��o 0
		System.out.println("Posi��o 0: "+ vetor.get(0));
		
		//Pegar a posi��o de um valor
		System.out.println("N�mero 100 est� na posi��o: "+ vetor.indexOf((Integer)100));
		
		//Somando elementos do vetor
		int soma=0;
		for (int i=0; i<vetor.size(); i++)
			soma += vetor.get(i);
		System.out.println("Soma: "+ soma);
		
		//String
		ArrayList<String> cores = new ArrayList<>();
		cores.add("azul");
		cores.add("vermelho");
		System.out.println("\nVetor Cores: "+ cores);
	}
}
