package prova;

public class veiculoDados {
	String nome;
	String montadora;
	
	public veiculoDados(String Nome, String Montadora){
		this.nome = Nome;
		this.montadora = Montadora;
	}
	public void imprime(){
		System.out.println("o modelo do carro é: "+ this.nome + " e a sua montadora é: "+this.montadora);
}

}
