package prova;

public class apartamentoDados {
	String nome;
	int numero;
	
	public apartamentoDados(String Nome, int Numero){
		this.nome = Nome;
		this.numero = Numero;
	}
	public void imprime(){
		System.out.println("Nome do Proprietario: "+ this.nome + " numero do Apt: "+this.numero);
}
}
