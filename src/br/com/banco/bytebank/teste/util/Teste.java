package br.com.banco.bytebank.teste.util;

import java.util.ArrayList;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

	
		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(56,56);
		Conta cc2 = new ContaCorrente(87,87);
		
		lista.add(cc);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(13,13);
		Conta cc4 = new ContaCorrente(22,22);
		
		lista.add(cc3);
		lista.add(cc4);
		
		
		//forma antiga
		for (int i=0; i<lista.size();i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		//forma atual
		for(Object oRef : lista) { //a cada elemento do tipo object da lista oRef que se encontra dentro da lista
			System.out.println(oRef);
		}
		
	}

}
