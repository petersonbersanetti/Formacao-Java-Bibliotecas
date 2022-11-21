package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.GuardadorDeContas;

public class TesteGuardadorConta {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();

		Conta cc = new ContaCorrente(212, 2323);
		guardador.adiciona(cc);

		Conta cc2 = new ContaCorrente(21, 21);
		guardador.adiciona(cc2);

		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());
	}

}
