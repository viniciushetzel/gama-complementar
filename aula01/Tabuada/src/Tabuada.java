import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {

		int numero, contador, resultado;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, digite um n�mero para calcular a tabuada: ");
		numero = teclado.nextInt();

		contador = 0;

		System.out.println("A tabuada do n�mero " + numero + " �:");
		while (contador <= 10) {
			resultado = numero * contador;
			System.out.println(numero + "x" + contador + "=" + resultado);
			contador++;
		}

	}

}
