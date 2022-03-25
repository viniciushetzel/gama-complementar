package model;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numeroConta, double saldo) {
		super(numeroConta, saldo);
	}

	@Override
	public boolean sacar(double valor) {
		if (valor <= super.getSaldo()) {
			return super.sacar(valor);
		} else {
			return false;
		}
	}

}
