package model;

public abstract class Conta {
	private int numeroConta;
	private double saldo;

	public Conta(int numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean sacar(double valor) {
		if (valor > 0) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return numeroConta + " - R$" + saldo;
	}
}
