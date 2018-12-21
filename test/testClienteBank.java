package com.bradesco.test;

import com.bradesco.app.*;

public class testClienteBank {
	public static void main(String[] args) {
		ContaBank cb1 = new ContaBank();
		
		ClienteBank cl1 = new ClienteBank();
		ClienteBank cl2 = new ClienteBank("JOSÉ AUGUSTO",cb1);
		
		cl1.exibeTudo();
		System.out.println("----------------");
		cl2.exibeTudo();
		
		cl1.addConta(cb1);
		cl1.setNome("CARLOS JOSÉ");
		System.out.println("----------------");
		cl1.exibeTudo();
		
	}
}
