
import java.util.Scanner;

public class LerNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, soma;

		System.out.println("Por favor, digite um número: ");
		numero = teclado.nextInt();

		soma = 0;
		System.out.println("A sequência é: ");

		while (soma <= numero) {
			System.out.println(soma);
			soma++;
		}

	}

}
