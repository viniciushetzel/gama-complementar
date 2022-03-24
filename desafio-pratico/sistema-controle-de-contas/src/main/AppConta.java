package main;

import java.util.Scanner;

import controller.GerenciaContas;
import model.Conta;
import model.ContaCorrente;
import model.ContaEspecial;

public class AppConta {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		GerenciaContas contas = new GerenciaContas();
		int opicao = 0;
		int numeroConta;
		double saldo;
		double limite;
		String tipoConta;
		String entrada;
		Conta c;

		while (opicao != 4) {
			System.out.println("Opção 1: criar conta.");
			System.out.println("Opção 2: buscar conta.");
			System.out.println("Opção 3: remover conta.");
			System.out.println("Opção 4: sair do programa.");
			System.out.println("Qual sua opção?");
			entrada = teclado.nextLine();
			opicao = Integer.parseInt(entrada);

			switch (opicao) {
			case 1:
				opicao = 0;
				while (opicao != 1 && opicao != 2 && opicao != 3) {
					System.out.println(
							"Informe qual tipo de conta. Tecle um para conta corrente, ou 2 para conta especial. Tecle 3 para voltar ao menu anterior.");
					entrada = teclado.nextLine();
					opicao = Integer.parseInt(entrada);

					switch (opicao) {
					case 1:
						System.out.println("Informe o número da conta.");
						entrada = teclado.nextLine();
						numeroConta = Integer.parseInt(entrada);
						System.out.println("Informe o saldo.");
						entrada = teclado.nextLine();
						saldo = Float.parseFloat(entrada);
						tipoConta = "Conta corrente";
						c = new ContaCorrente(numeroConta, saldo);
						contas.adicionar(c);
						break;
					case 2:
						System.out.println("Informe o número da conta.");
						entrada = teclado.nextLine();
						numeroConta = Integer.parseInt(entrada);
						System.out.println("Informe o saldo.");
						entrada = teclado.nextLine();
						saldo = Float.parseFloat(entrada);
						System.out.println("Informe o limite da conta.");
						entrada = teclado.nextLine();
						limite = Float.parseFloat(entrada);
						tipoConta = "Conta especial";
						c = new ContaEspecial(numeroConta, saldo, limite);
						contas.adicionar(c);
						break;
					case 3:
						System.out.println("Retornando ao menu anterior.");
						break;
					default:
						System.out.println("O tipo de conta é inválido.");
						break;
					}
				}
				break;
			case 2:
				System.out.println("Informe o número da conta a ser buscada.");
				entrada = teclado.nextLine();
				numeroConta = Integer.parseInt(entrada);
				contas.exibir(numeroConta);
				break;
			case 3:
				System.out.println("Informe o número da conta a ser removida.");
				entrada = teclado.nextLine();
				numeroConta = Integer.parseInt(entrada);
				boolean remover = contas.remove(numeroConta);
				break;
			case 4:
				System.out.println("Fim do programa.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}
}
