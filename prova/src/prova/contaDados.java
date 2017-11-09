package prova;

public class contaDados {
	String nome;
	private double saldo;
	private int numeroConta;
	
	public contaDados(String nNome, int nConta){
		this.nome = nNome;
		this.numeroConta = nConta;
	}
	public void imprime(){
		System.out.println("o Titular da conta é: "+ this.nome + " e o numero da sua conta é: "+this.numeroConta);
}
}
