package controller;

import java.util.ArrayList;

import model.Conta;

public class GerenciaContas {
	private ArrayList<Conta> contas;

	public GerenciaContas() {
		contas = new ArrayList<>();
	}

	public void adicionar(Conta c) {
		contas.add(c);
	}

	public String exibir(int numeroConta) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumeroConta() == numeroConta) {
				return contas.get(i).toString();
			}
		}
		return "Desculpe, a conta informada não está cadastrada no sistema.";
	}

	private int posicao(int numeroConta) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumeroConta() == numeroConta) {
				return i;
			}
		}
		return -1;
	}

	public boolean sacar(int numeroConta, double valor) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumeroConta() == numeroConta) {
				return contas.get(i).sacar(valor);
			}
		}
		return false;
	}

	public boolean depositar(int numeroConta, double valor) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumeroConta() == numeroConta) {
				return contas.get(i).depositar(valor);
			}
		}
		return false;
	}

	public boolean remover(int numeroConta) {
		int posicao = posicao(numeroConta);
		if (posicao >= 0) {
			if (contas.remove(posicao) != null) {
				return true;
			}
		}
		return false;
	}

}
