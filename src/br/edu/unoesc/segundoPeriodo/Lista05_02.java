package br.edu.unoesc.segundoPeriodo;

import java.util.Scanner;


public class Lista05_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String frase = scan.next();
		if (frase.contains("Java"))
			System.out.println("Cont�m.");
		else
			System.out.println("N�o Cont�m.");
		scan.close();
	}
}

