package Questao4;

public class EstadoSplit {
	String Estado;
	String Temperatura;
	int Velocidade;
	String Modo;
	
	public EstadoSplit(String estado,String temperatura,int velocidade,String modo){
		this.Estado = estado;
		this.Temperatura = temperatura;
		this.Velocidade = velocidade;
		this.Modo = modo;
	}
	public void liga_desliga(){
		if (this.Estado == "Ligado"){
			System.out.println("Estado:" +this.Estado +" |Temperatura: "+ this.Temperatura + "|Velocidade: "+this.Velocidade+"|Modo: "+this.Modo);
		}
		else{
			if(this.Estado == "Desligado"){
				System.out.println("Split Desligado.");
			}
			else{
				System.out.println("Estado desconhecido.");
			}
		}
		
}
}
