package com.bradesco.app;

import com.bradesco.app.contaBank;
import java.util.ArrayList;

public class clienteBank {
	private String nome;
	private ArrayList<contaBank> contas = new ArrayList<>();
	private ArrayList<String> transacoes = new ArrayList<>();
	
	public void exibeTudo() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Contas: " + this.contas);
	}
	
	public clienteBank() {
	}
	
	public clienteBank(String nome, contaBank conta) {
		this.nome = nome;
		this.contas.add(conta);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<contaBank> getContas() {
		return this.contas;
	}
	
	public boolean setConta(contaBank conta) {
		if(contas.contains(conta)) {
			return false;
		}
		contas.add(conta);
		return true;
	}
}
