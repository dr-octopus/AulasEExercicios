package br.edu.unoesc.segundoPeriodo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lista_04 {
	public static void main(String[] args) {
		
		//1)
		Scanner scan = new Scanner(System.in);
		ArrayList<Float> salarios = new ArrayList<>();
		float maior=0,total=0;
		int I=0,menos100=0;
		System.out.println("Insira os sal�rios: ");
		while (true){
			salarios.add(scan.nextFloat());
			if (salarios.get(I) == 0)
				break;
			else if (salarios.get(I) > maior)
				maior = salarios.get(I);
			if (salarios.get(I) <= 100)
				menos100++;
			total += salarios.get(I);
			I++;
		}
		System.out.println("M�dia dos sal�rios: "+ total/I);
		System.out.println("Maior sal�rio: "+ maior);
		System.out.println("Quantidades de sal�rios at� R$100.00: "+ menos100);
		scan.close();
		
		//2)
		System.out.println("\n2: ");
		ArrayList<String> valores = new ArrayList<>();
		for (int i=0; i<5; i++)
			valores.add("Valor "+ i); // Est� sendo adicionada uma String com a palavra 'valor' e o n�mero da vari�vel
		for (int i=0; i<valores.size(); i++)
			System.out.println(valores.get(i));
		// For iterador, itera o Array, vari�vel valor 'pega' o valor da posi��o do array e imprime
		for (String valor : valores)
			System.out.println(valor);
		
		//3)
		System.out.println("\n3: ");
		ArrayList<String> textos = new ArrayList<>();
		textos.add("Texto 1");
		textos.add("Texto 2");
		textos.add("Texto 3");
		textos.add("Texto 4");
		textos.add("Texto 5");
		
		for(String s : textos)
			System.out.println(s);
		
		//4)
		System.out.println("\n4: ");
		System.out.println("Set: ");
		//Set - trabalha baseado na teoria dos conjuntos, n�o ser� adicionado dois valores iguais
		Set<String> conjunto = new HashSet<>();
		conjunto.add("Jo�o da Silva Sauro");
		conjunto.add("Ana Maria");
		conjunto.add("Jo�o da Silva Sauro");
		for (String nome : conjunto)
			System.out.println(nome);
		
		//Map - trabalha com uma chave e um valor
		System.out.println("\nMap: ");
		Map<String, String> estados = new HashMap<>();
		estados.put("SC", "Santa Catarina");
		estados.put("RS", "Rio Grande do Sul");
		System.out.println(estados.get("SC"));
		System.out.println(estados.get("RS"));
		
		//5)
		System.out.println("\n5: ");
		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(1, "String 1");
		mapa.put(1, "String 11");
		mapa.put(2, "String 2");
		mapa.put(2, "String 22");
		mapa.put(3, "String 3");
		mapa.put(3, "String 33");
		for (int i=1; i <= mapa.size(); i++)
			System.out.println(mapa.get(i));
		
		//6)
		System.out.println("\n6: ");
		List<Integer> numeros = new ArrayList<>();
		numeros.add(100);
		numeros.add(20);
		numeros.add(200);
		numeros.add(30);
		numeros.add(80);
		numeros.add(40);
		numeros.add(100);
		numeros.add(200);
		float soma=0;
		for (Integer i : numeros)
			soma += i;
		System.out.println("M�dia: "+ (float) soma/numeros.size());
		
		//7)
		System.out.println("\n7: ");
		Iterator<Integer> it = numeros.iterator();
		soma = 0;
		//O iterator percorre a lista, funciona como ponteiro e come�a da posi��o -1, a fun��o hasNext adiciona um ao apontador
		while (it.hasNext())
			soma += it.next();
		System.out.println("M�dia: "+ (float) soma/numeros.size());
		
		//8)
		System.out.println("\n8: ");
		//O HashSet n�o adiciona valores repetidos, ou seja, a m�dia ser� diferente
		Set<Integer> numeros2 = new HashSet<>();
		numeros2.add(100);
		numeros2.add(20);
		numeros2.add(200);
		numeros2.add(30);
		numeros2.add(80);
		numeros2.add(40);
		numeros2.add(100);
		numeros2.add(200);
		soma = 0;
		for (Integer i : numeros2)
			soma += i;
		System.out.println("M�dia: "+ (float) soma/numeros2.size());
		
		//11)
		System.out.println("\n11: ");
		System.out.println("Listagem 3: ");
		for (String s : textos)
			System.out.println(s);
		System.out.println("Listagem 11: ");
		//Fun��o shuffle sorteia os itens em ordem aleat�ria na cole��o
		Collections.shuffle(textos);
		for (String s : textos)
			System.out.println(s);
		
		//12)
		System.out.print("\n12: ");
		//Busca sequ�ncial:
		String pesquisa = "Texto 2";
		for (int i=0; i<textos.size(); i++){
			if (textos.get(i).equals(pesquisa)){
				System.out.println("\nAchou na posi��o: "+ i);
				break;
			}
		}
		//A busca bin�ria � uma busca 'inteligente', procura um valor no Array dividindo o mesmo em partes
		int pos = Collections.binarySearch(textos, pesquisa);
		System.out.print("Achou na posi��o: "+ pos);
	}
}