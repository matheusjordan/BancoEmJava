package com.bradesco.app;

public class ContaBank {
	private double saldo = 0;
	private int num;
//	private Agencia agencia;
	
	public ContaBank() {
	}
	
	public ContaBank(int num) {
		this.num = num;
	}
	
	public ContaBank(int num, double saldo) {
		this.num = num;
		this.saldo = saldo;
	}
	
	public void exibeTudo() {
		System.out.println(this.num);
		System.out.println(this.saldo);
	}
	
//	public ContaBank(int num, Agencia agencia) {
//		this.num = num;
//		this.agencia = agencia;
//	}
	
	public void debitaSaldo(double valor) {
		this.saldo -= valor;
	}
	
	public void setSaldo(double valor) {
		this.saldo += valor; 
	}
	
	//Função para visualizar saldo
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
//	public int getAgencia() {
//		return this.agencia.getNum();
//	}
//	
//	public void setAgencia(Agencia agencia) {
//		this.agencia = agencia;
//	}
}
