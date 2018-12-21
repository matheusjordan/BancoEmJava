package com.bradesco.app;

import java.util.ArrayList;

public class Agencia {
	private int num;
	private ArrayList<ClienteBank> clientes = new ArrayList<>();
	private ArrayList<CaixaEletronico> caixas = new ArrayList<>();
	
	public Agencia() {
	}
	
	public Agencia(int num) {
		this.num = num;
	}
	
	public void exibeTudo() {
		System.out.println(this.num);
		System.out.println(this.clientes);
		System.out.println(this.caixas);
	}
	
	public int getNum() {
		return this.num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public ArrayList<ClienteBank> getClientes() {
		return this.clientes;
	}
	
	public boolean addCliente(ClienteBank cliente) {
		if(this.clientes.contains(cliente)) {
			return false;
		}
		this.clientes.add(cliente);
		return true;
	}
	
	public boolean delCliente(ClienteBank cliente) {
		if(this.clientes.contains(cliente)) {
			this.clientes.remove(cliente);
			return true;
		}
		return false;
	}
	
	public ArrayList<CaixaEletronico> getCaixas(){
		return this.caixas;
	}
	
	public boolean addCaixa(CaixaEletronico caixa) {
		if(this.caixas.contains(caixa)) {
			return false;
		}
		this.caixas.add(caixa);
		return true;
	}
	
	public boolean delCaixa(CaixaEletronico caixa) {
		if(this.caixas.contains(caixa)) {
			this.caixas.remove(caixa);
			return true;
		}
		return false;
	}
	
}
