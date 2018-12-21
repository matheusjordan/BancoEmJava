package com.bradesco.test;

import com.bradesco.app.*;

public class testClienteBank {
	public static void main(String[] args) {
		contaBank cb1 = new contaBank();
		
		clienteBank cl1 = new clienteBank();
		clienteBank cl2 = new clienteBank("JOSÉ AUGUSTO",cb1);
		
		cl1.exibeTudo();
		System.out.println("----------------");
		cl2.exibeTudo();
		
		cl1.setConta(cb1);
		cl1.setNome("CARLOS JOSÉ");
		System.out.println("----------------");
		cl1.exibeTudo();
		
	}
}
