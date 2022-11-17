package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.Cliente;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22, 33); //Object
		ContaPoupanca cp = new ContaPoupanca(33, 22); //Object
		Cliente cliente = new Cliente();			  //Object
		
		System.out.println(cc.toString());// referencia do objeto mesma saida 
		System.out.println(cp);
		System.out.println(cliente);
		
		println(cp);
		println(cc);
		println(cliente);
		
	}
	
	
	static void println() {}
	static void println(int a) {}
	static void println (boolean valor) {}
//	static void println (ContaPoupanca conta) {}
//	static void println (ContaCorrente conta) {}
	static void println (Object conta) {}
}
