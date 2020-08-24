package com.lab2.revisaopoo;

public class ContaTeste {

	public static void main(String[] args) {
		Conta c1 = new Conta("123");
		Conta c2 = new Conta("456");

		c1.sacar(450);
		c1.depositar(500);
		c1.sacar(150);
		
		c2.depositar(25);
		c2.sacar(48);
		c2.depositar(450);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	}

}