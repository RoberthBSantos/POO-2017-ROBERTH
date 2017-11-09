//primeiro grafico
package prova;

public class Questao2 { public static void main(String[] args) {
	int sum = 0, number = 1;
	while(number <= 100){
	if (number <= 100) {
		sum += number;
		number += number +1;
		
	}
	else{
		break;
	}
	}
	System.out.println(number);
	System.out.println(sum);
	
}

}
