package com.bradesco.test;

import com.bradesco.app.*;

import java.util.Scanner;

public class testCaixaEletronico {
	public static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Criação das contas bancárias
		ContaBank cb1 = new ContaBank(1);
		cb1.setSaldo(300);
		ContaBank cb2 = new ContaBank(2);
		cb2.setSaldo(150);
		ContaBank cb3 = new ContaBank(3);
		cb3.setSaldo(75);
		
		//Criação dos clientes
		ClienteBank cl1 = new ClienteBank("PEDRO", cb3);
		cl1.addConta(cb2);
		ClienteBank cl2 = new ClienteBank("MATHEUS", cb1);
		
		//Criação e teste dos caixas eletronicos
		CaixaEletronico caixa1 = new CaixaEletronico();
		caixa1.exibeTudo();
		System.out.println("----------------");
		CaixaEletronico caixa2 = new CaixaEletronico(cl1, cb1);
		caixa2.exibeTudo();
		System.out.println("----------------");
		CaixaEletronico caixa3 = new CaixaEletronico(cl1, cb3);
		caixa3.exibeTudo();
		System.out.println("----------------");
		System.out.println("");
		
		//Deposito na conta utilizada no construtor do objeto
		System.out.println(cb3.getSaldo());
		caixa3.deposito(120);
		System.out.println("----------------");
		System.out.println(cb3.getSaldo());
		
		//Saque na conta utilizada no construtor do objeto
		System.out.println("");
		System.out.println(cb3.getSaldo());
		caixa3.saque(450);
		System.out.println("----------------");
		System.out.println(cb3.getSaldo());
		
		//+1 saque na conta utilizada no construtor do objeto
		System.out.println("");
		System.out.println(cb3.getSaldo());
		caixa3.saque(150);
		System.out.println("----------------");
		System.out.println(cb3.getSaldo());
		
		//Verificação do saldo das contas utilizadas na transferencia
		System.out.println("");
		System.out.println(cb2.getSaldo());
		System.out.println("----------------");
		System.out.println(cb3.getSaldo());
		//Método tranferindo um valor maior que o saldo da conta origem
		System.out.println(caixa3.transferencia(500, cb2) ? "Tranferência autorizada!" : "Transferencia não autorizada");
		System.out.println("----------------");
		//Re-verificação do saldo das contas utilizadas na transferencia
		System.out.println(cb2.getSaldo());
		System.out.println("----------------");
		System.out.println(cb3.getSaldo());
		
		//Verificação do saldo das contas utilizadas na transferencia
		System.out.println("");
		System.out.println(cb2.getSaldo());
		System.out.println("----------------");
		System.out.println(cb3.getSaldo());
		//Método tranferindo um valor mmenor que o saldo da conta origem
		System.out.println(caixa3.transferencia(44, cb2) ? "Tranferência autorizada!" : "Transferencia não autorizada");
		System.out.println("----------------");
		//Re-verificação do saldo das contas utilizadas na transferencia
		System.out.println(cb2.getSaldo());
		System.out.println("----------------");
		System.out.println(cb3.getSaldo());
	}
}
