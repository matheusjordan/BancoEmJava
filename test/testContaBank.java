package com.bradesco.test;

import com.bradesco.app.ContaBank;

public class testContaBank {
	public static ContaBank cb1 = new ContaBank();
	public static void main(String[] args) {
		
		System.out.println("Saldo: " + cb1.getSaldo());
		cb1.setSaldo(50);
		cb1.setSaldo(30);
		System.out.println("Saldo: " + cb1.getSaldo());
		cb1.debitaSaldo(90);
		System.out.println("Saldo: " + cb1.getSaldo());
		System.out.println(cb1.getNum());
		cb1.setNum(001);
		System.out.println("Conta: " + cb1.getNum());
	}
}
