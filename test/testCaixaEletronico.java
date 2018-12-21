package com.bradesco.test;

import com.bradesco.app.*;

import java.util.Scanner;

public class testCaixaEletronico {
	public static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Criação das contas bancárias
		contaBank cb1 = new contaBank(1);
		cb1.setSaldo(300);
		contaBank cb2 = new contaBank(2);
		cb2.setSaldo(150);
		contaBank cb3 = new contaBank(3);
		cb3.setSaldo(75);
		
		//Criação dos clientes
		clienteBank cl1 = new clienteBank("PEDRO", cb3);
		cl1.setConta(cb2);
		clienteBank cl2 = new clienteBank("MATHEUS", cb1);
		
		//Criação e teste dos caixas eletronicos
		CaixaEletronico caixa1 = new CaixaEletronico();
		caixa1.exibe();
		System.out.println("----------------");
		CaixaEletronico caixa2 = new CaixaEletronico(cl1, cb1);
		caixa2.exibe();
		System.out.println("----------------");
		CaixaEletronico caixa3 = new CaixaEletronico(cl1, cb3);
		caixa3.exibe();
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
