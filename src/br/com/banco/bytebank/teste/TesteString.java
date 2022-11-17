package br.com.banco.bytebank.teste;

public class TesteString {

	public static void main(String[] args) {

		int a = 3;
		String nome = "Alura";
//		String outro = new String ("Alura");

//		nome.replace("A", "a");
//		
//		nome.toLowerCase();
		String outra = nome.toUpperCase();
		String outra1 = nome.toLowerCase();
		String outra2 = nome.replace('A', 'a');
		String outra3 = nome.replace("Al", "aL");
		
		String vazio = " ";
		System.out.println(vazio.isEmpty()); //perguntar se string ta vazia
		
		String outroVazio = vazio.trim(); // tira os espaços da string
		System.out.println(outroVazio.isEmpty());
		
		String alurinha = "       Alura      ";
		String outraAlurinha = alurinha.trim();
		System.out.println(alurinha);
		System.out.println(alurinha.contains("Alu") + " aqui "); //pergunta se oque escrevi contem na minha string
		
		
		

		System.out.println(outraAlurinha);
				

		System.out.println(nome.length()); // quantas letras tem

		for (int i = 0; i < nome.length(); i++) { //imprimindo cada caracter
			System.out.println(nome.charAt(i));
		}

		String sub = nome.substring(1); // me devolve uma substring a partir da posicao indicada
		System.out.println(sub);

		int pos = nome.indexOf("ur"); // retorna posição começando de 0
		System.out.println(pos);

		char c = nome.charAt(2); // retorna a letar na posição 2
		System.out.println(c);

		System.out.println(nome);
		System.out.println(outra);
		System.out.println(outra1);
		System.out.println(outra2);
		System.out.println(outra3);

	}

}
