package model;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(int numeroConta, double saldo, double limite) {
		super(numeroConta, saldo);
		this.limite = limite;
	}

	@Override
	public boolean sacar(double valor) {
		if (limite + super.getSaldo() >= valor) {
			return super.sacar(valor);
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " - " + limite;
	}

	public double getLimite() {
		return limite;
	}
}
