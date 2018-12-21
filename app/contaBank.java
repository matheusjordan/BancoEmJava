package com.bradesco.app;

public class contaBank {
	private double saldo = 0;
	private String dono;
	public int cod;
	
	public contaBank() {
	}
	
	public contaBank(int cod) {
		this.cod = cod;
	}
	
	public void debitaSaldo(double valor) {
		this.saldo -= valor;
	}
	
	public void setSaldo(double valor) {
		this.saldo += valor; 
	}
	
	//Função para visualziar saldo
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setCod(int cod) {
		this.cod = cod;
	}
}
