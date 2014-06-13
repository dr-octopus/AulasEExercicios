/*
Prova A1 - Programa��o Desktop
Acad�mico: Luiz Felipe Nazari

Exerc�cio 04
 */

package exerc�cios;

import java.util.ArrayList;
import java.util.Scanner;

public class Prova01_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> agenda = new ArrayList<>();
		int opcao;
		do{
			System.out.println("\n1 - Adicionar nome\n2 - Remover nome\n3 - Procurar nome\n4 - Exibir agenda\n5 - Sair");
			opcao = scan.nextInt();
			switch (opcao){
				case 1:{
					System.out.println("Digite o nome:");
					agenda.add(scan.next());
					break;
				}
				case 2:{
					System.out.println("Digite o nome:");
					agenda.remove(scan.next());
					break;
				}
				case 3:{
					System.out.println("Digite o nome:");
					String nome = scan.next();
					if (agenda.contains(nome))
						System.out.println("O nome est� na lista na posi��o: "+ (agenda.indexOf(nome)+1));
					else
						System.out.println("O nome n�o est� na lista.");
					break;
				}
				case 4:{
					for (String nome : agenda)
						System.out.println(nome);
					break;
				}
				case 5:break;
				default: System.out.println("Comando Inv�lido!");break;
			}
		}while(opcao != 5);
		scan.close();
	}
}
