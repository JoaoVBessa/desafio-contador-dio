package projeto_contador;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosExeption exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}

		terminal.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExeption {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosExeption();
		}

		int contagem = parametroDois - parametroUm;
		for(int cont = 1;  cont <= contagem; cont++) {
			System.out.println("Número atual: " + (cont));
		}
	}
}
