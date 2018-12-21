package com.bradesco.app;

import com.bradesco.app.ContaBank;
import java.util.ArrayList;

public class ClienteBank {
//	private int rg;
	private String nome;
	private ArrayList<ContaBank> contas = new ArrayList<>();
	
	public void exibeTudo() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Contas: " + this.contas);
//		System.out.println("Contas: " + this.rg);
	}
	
	public ClienteBank() {
	}
	
	public ClienteBank(String nome, ContaBank conta) {
		this.nome = nome;
		this.contas.add(conta);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<ContaBank> getContas() {
		return this.contas;
	}
	
	public boolean addConta(ContaBank conta) {
		if(contas.contains(conta)) {
			return false;
		}
		contas.add(conta);
		return true;
	}
}
