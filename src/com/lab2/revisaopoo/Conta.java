package com.lab2.revisaopoo;

public class Conta {
	private double saldo;
	private String numero;
	
	public Conta(String numero) {
		this.numero = numero;
		this.saldo = 0;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public double sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return valor;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "\nNumero da Conta: " + this.numero + "\nSaldo: " + this.saldo;
	}
}