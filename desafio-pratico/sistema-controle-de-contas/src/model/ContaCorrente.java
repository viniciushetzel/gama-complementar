package model;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numeroConta, double saldo) {
		super(numeroConta, saldo);
	}

	@Override
	public boolean sacar(double valor) {
		if (valor > super.getSaldo()) {
			super.sacar(valor);
			return true;
		} else {
			return false;
		}
	}

}
