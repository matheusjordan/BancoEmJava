package com.bradesco.test;

import com.bradesco.app.contaBank;

public class testContaBank {
	public static contaBank cb1 = new contaBank();
	public static void main(String[] args) {
		
		System.out.println("Saldo: " + cb1.getSaldo());
		cb1.setSaldo(50);
		cb1.setSaldo(30);
		System.out.println("Saldo: " + cb1.getSaldo());
		cb1.debitaSaldo(90);
		System.out.println("Saldo: " + cb1.getSaldo());
		System.out.println(cb1.cod);
		cb1.setCod(001);
		System.out.println("Conta: " + cb1.cod);
	}
}
