/*Escreva um programa que leia v�rios n�meros inteiros digitados pelo usu�rio, at� que o usu�rio digite zero.
 *  O zero termina o programa e exibe a soma de todos os valores digitados. 
*/

import java.util.Scanner;

public class SomarNumeros {

	public static void main(String[] args) {
		int numero, contador, soma;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, digite um n�mero");
		numero = teclado.nextInt();

		contador = numero;

		while (numero != 0) {
			System.out.println("Por favor, digite um n�mero");
			numero = teclado.nextInt();
			contador = contador + numero;
		}

		soma = contador;
		System.out.println("A soma dos n�meros digitados �: " + soma);

	}
}
