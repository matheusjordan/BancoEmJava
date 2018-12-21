package com.bradesco.app;

public class CaixaEletronico {
	private ContaBank contaOrigem;
	private ContaBank contaDestino;
	
	public CaixaEletronico() {	
	}
	
	public CaixaEletronico(ClienteBank cliente, ContaBank conta) {
		if(cliente.getContas().contains(conta)) {
			this.contaOrigem = conta;
		}
	}
	
	public void exibeTudo() {
		System.out.println(this.contaOrigem);
		System.out.println(this.contaDestino);
	}
	
	//Função de depósito
	public boolean deposito(double valor) {
		this.contaOrigem.setSaldo(valor);
		return true;
	}
	
	//Função de saque
	public boolean saque(double valor) {
		if( (this.contaOrigem.getSaldo() - valor) < 0 || (valor < 0) ) {
			return false;
		} 
		this.contaOrigem.debitaSaldo(valor);
		return true;
	}
	
	//Função de tranferência
	public boolean transferencia(double valor, ContaBank contaDest) {
		this.contaDestino = contaDest;
				
		if(this.contaOrigem == this.contaDestino) {
			return false;
		}
		
		if(this.saque(valor)) {
			this.contaDestino.setSaldo(valor);
			return true;
		}
		
		return false;
	}
	
	
}
