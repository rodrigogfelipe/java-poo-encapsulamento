package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta;

		System.out.print("Enter account number: ");
		int numConta = sc.nextInt();

		System.out.print("Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();

		System.out.println("Vai depositar na conta (y/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.print("Deposito inicial: ");
			double iniDeposito = sc.nextDouble();
			conta = new ContaBancaria(numConta, titular, iniDeposito);

		} else {
			conta = new ContaBancaria(numConta, titular);
		}

		System.out.println();
		System.out.println("Data conta");
		System.out.println(conta);

		System.out.println();
		System.out.print("Entre com o valor do deposito: ");
		double aumento = sc.nextDouble();
		conta.deposito(aumento);
		System.out.println("Valor atualizado");
		System.out.println(conta);

		System.out.println();
		System.out.print("Entre com o valor do deposito: ");
		aumento = sc.nextDouble();
		conta.sacar(aumento);
		System.out.println("Valor atualizado");
		System.out.println(conta);

	}

}
