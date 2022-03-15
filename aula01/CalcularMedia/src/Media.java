//Faça um programa que leia duas notas de um aluno, calcule e mostre a média aritmética do aluno.

import java.util.Scanner;


public class Media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, media;
		System.out.println("Por favor, informe a nota 1: ");
		n1 = teclado.nextDouble();
		System.out.println("Por favor, informe a nota 2: ");
		n2 = teclado.nextDouble();

		media = (n1 + n2) / 2;
		System.out.println("a nota do aluno é: " + media);

	}

}
