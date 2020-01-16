package entities;

public class ContaBancaria {

	public static final double TAXA = 5.0;
	private int numConta;
	private String titular;
	private double saldo;

	public ContaBancaria(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}

	public ContaBancaria(int numConta, String titular, double iniDeposito) {
		this.numConta = numConta;
		this.titular = titular;
		deposito(iniDeposito);
	}

	public int getNumConta() {
		return numConta;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	/* Declarando o construtor */
	public void deposito(double aumento) {
		this.saldo += aumento;

	}

	public void sacar(double aumento) {
		this.saldo -= aumento + TAXA;

	}

	@Override
	public String toString() {
		return "numConta= " + numConta + ", titular= " + titular + ", saldo= "
				+ String.format("%.2f", saldo);
	}

}
