
import java.util.Scanner;

public class LerNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, soma;

		System.out.println("Por favor, digite um n�mero: ");
		numero = teclado.nextInt();

		soma = 0;
		System.out.println("A sequ�ncia �: ");

		while (soma <= numero) {
			System.out.println(soma);
			soma++;
		}

	}

}
