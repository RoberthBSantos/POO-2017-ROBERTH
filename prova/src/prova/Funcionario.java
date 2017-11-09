package prova;

public class Funcionario {
	String nomeFuncioanrio;
	String empresa;
	
	public Funcionario(String NomeFuncionario,String Empresa){
		this.nomeFuncioanrio = NomeFuncionario;
		this.empresa = Empresa;
	}
	public void imprime(){
		System.out.println("Nome do funcionario: "+ this.nomeFuncioanrio + " nome da empresa "+this.empresa);
}
}
