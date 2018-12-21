package com.bradesco.app;

import java.util.ArrayList;

public class CaixaEletronico {
	private contaBank contaOrigem;
	private contaBank contaDestino;
	
	public CaixaEletronico() {	
	}
	
	public CaixaEletronico(clienteBank cliente, contaBank conta) {
		if(cliente.getContas().contains(conta)) {
			this.contaOrigem = conta;
		}
	}
	
	public void exibe() {
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
	public boolean transferencia(double valor, contaBank contaDest) {
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
