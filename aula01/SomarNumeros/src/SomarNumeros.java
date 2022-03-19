/*Escreva um programa que leia vários números inteiros digitados pelo usuário, até que o usuário digite zero.
 *  O zero termina o programa e exibe a soma de todos os valores digitados. 
*/

import java.util.Scanner;

public class SomarNumeros {

	public static void main(String[] args) {
		int numero, contador, soma;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, digite um número");
		numero = teclado.nextInt();

		contador = numero;

		while (numero != 0) {
			System.out.println("Por favor, digite um número");
			numero = teclado.nextInt();
			contador = contador + numero;
		}

		soma = contador;
		System.out.println("A soma dos números digitados é: " + soma);

	}
}
