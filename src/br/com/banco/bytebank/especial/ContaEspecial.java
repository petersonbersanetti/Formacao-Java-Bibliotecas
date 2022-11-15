package br.com.banco.bytebank.especial;

import br.com.banco.bytebank.modelo.Conta;

public class ContaEspecial extends Conta {
	
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		// nao deixa caso nao tenha protected na frente pq o saldo só é visivel dentro do pacote dele.
	}

}
