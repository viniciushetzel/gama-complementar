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
		String entrada;
		Conta c;

		while (opicao != 6) {
			System.out.println("Por favor, escolha uma das opções do menu.");
			System.out.println("Opção 1: criar conta.");
			System.out.println("Opção 2: buscar conta.");
			System.out.println("Opção 3: Realizar um saque.");
			System.out.println("Opção 4: Realizar um depósito.");
			System.out.println("Opção 5: Excluir uma conta.");
			System.out.println("Opção 6: Encerrar a operação.");
			entrada = teclado.nextLine();
			opicao = Integer.parseInt(entrada);

			switch (opicao) {
			case 1:
				System.out.println(
						"Informe qual tipo de conta. Tecle um para conta corrente, 2 para conta especial. Tecle 3 para voltar ao menu anterior.");
				entrada = teclado.nextLine();
				int tipoConta = Integer.parseInt(entrada);

				switch (tipoConta) {
				case 1:
					System.out.println("Informe o número da conta.");
					entrada = teclado.nextLine();
					numeroConta = Integer.parseInt(entrada);
					System.out.println("Informe o saldo.");
					entrada = teclado.nextLine();
					saldo = Float.parseFloat(entrada);
					c = new ContaCorrente(numeroConta, saldo);
					contas.adicionar(c);
					System.out.println("Conta cadastrada com sucesso");
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
					c = new ContaEspecial(numeroConta, saldo, limite);
					contas.adicionar(c);
					System.out.println("Conta cadastrada com sucesso");
					break;

				case 3:
					break;

				default:
					System.out.println("Tipo de conta inválida.");
					break;
				}
				break;

			case 2:
				System.out.println("Por favor, informe o número da conta que deseja pesquisar.");
				entrada = teclado.nextLine();
				numeroConta = Integer.parseInt(entrada);
				System.out.println(contas.exibir(numeroConta));
				break;

			case 3:
				System.out.println("Informe o número da conta.");
				entrada = teclado.nextLine();
				numeroConta = Integer.parseInt(entrada);
				System.out.println("Por favor, informe o valor que deseja sacar.");
				entrada = teclado.nextLine();
				saldo = Float.parseFloat(entrada);
				if (contas.sacar(numeroConta, saldo)) {
					System.out.println("Saque realizado com sucesso.");
				} else {
					System.out.println("Não foi possível realizar a operação solicitada.");
				}
				break;

			case 4:
				System.out.println("Informe o número da conta.");
				entrada = teclado.nextLine();
				numeroConta = Integer.parseInt(entrada);
				System.out.println("Por favor, informe o valor que deseja depositar.");
				entrada = teclado.nextLine();
				saldo = Float.parseFloat(entrada);
				if (contas.depositar(numeroConta, saldo)) {
					System.out.println("Depósito realizado com sucesso.");
				} else {
					System.out.println("Não foi possível realizar a operação solicitada.");
				}
				break;

			case 5:
				System.out.println("Informe o número da conta a ser removida.");
				entrada = teclado.nextLine();
				numeroConta = Integer.parseInt(entrada);
				boolean removeu = contas.remover(numeroConta);
				if (removeu) {
					System.out.println("Conta removida com sucesso.");
				} else {
					System.out.println("Não foi possível remover a conta solicitada.");
				}
				break;

			case 6:
				System.out.println("Operação finalizada com sucesso.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
		teclado.close();
	}

}
