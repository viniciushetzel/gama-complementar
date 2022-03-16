/*A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatutários. 
 * Entretanto, o valor máximo da prestação não poderá ultrapassar 30% do salário bruto. 
 * Faça um programa que leia o salário bruto e o valor da prestação e informe se o empréstimo pode ou não ser concedido.
*/

import java.util.Scanner;

public class Emprestimo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario, prestacao, valor;

		System.out.println("Por favor, informe o valor  bruto do salário: ");
		salario = teclado.nextDouble();
		System.out.println("Por favor, informe o valor da prestação: ");
		prestacao = teclado.nextDouble();

		valor = salario * 30 / 100;
		if (prestacao <= valor)
			System.out.println("Empréstimo concedido com sucesso!");
		else
			System.out.println("Desculpe, o valor da prestação não pode ultrapassar  30% do seu salário bruto.");

	}

}
