package com.bradesco.test;

import com.bradesco.app.*;

public class testeAgencia {

	public static void main(String[] args) {
		ContaBank cb1 = new ContaBank(41823,400);
		cb1.exibeTudo();
		
		ContaBank cb2 = new ContaBank(41824,300);
		cb2.exibeTudo();
		
		ClienteBank cl1 = new ClienteBank("MATHEUS", cb1);
		cl1.addConta(cb2);
		cl1.exibeTudo();
		
		CaixaEletronico caixa = new CaixaEletronico(cl1,cb2);
		Agencia agencia = new Agencia(2655);
		
		System.out.println(agencia.addCliente(cl1));
		System.out.println(agencia.addCaixa(caixa));
		agencia.exibeTudo();
	}

}
