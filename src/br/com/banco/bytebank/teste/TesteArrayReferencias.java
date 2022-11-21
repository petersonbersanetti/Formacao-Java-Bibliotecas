package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.Cliente;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		//Conta[] contas = new Conta[5];
		Object[] referencias = new Object[5];
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		ContaCorrente cc1 = new ContaCorrente(00, 00);
		referencias[0] = cc1;

		ContaPoupanca cc2 = new ContaPoupanca(11, 11);
		referencias[1] = cc2;
//
//		System.out.println("\nNumero da conta na array: " + referencias[1].getNumero());
//		System.out.println("Numero da conta na array: " + cc2.getNumero());
//	

		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast transforma a referencia do tipo conta para uma referencia mais especifica: fala pro computador - fica quieto eu me responsabilizo.
		System.out.println("Numero da conta na array: " + ref.getNumero());

	}

}
