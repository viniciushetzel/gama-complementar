/*A prefeitura do Rio de Janeiro abriu uma linha de cr�dito para os funcion�rios estatut�rios. 
 * Entretanto, o valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto. 
 * Fa�a um programa que leia o sal�rio bruto e o valor da presta��o e informe se o empr�stimo pode ou n�o ser concedido.
*/

import java.util.Scanner;

public class Emprestimo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario, prestacao, valor;

		System.out.println("Por favor, informe o valor  bruto do sal�rio: ");
		salario = teclado.nextDouble();
		System.out.println("Por favor, informe o valor da presta��o: ");
		prestacao = teclado.nextDouble();

		valor = salario * 30 / 100;
		if (prestacao <= valor)
			System.out.println("Empr�stimo concedido com sucesso!");
		else
			System.out.println("Desculpe, o valor da presta��o n�o pode ultrapassar  30% do seu sal�rio bruto.");

	}

}
