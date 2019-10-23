package aulas;
import java.util.Scanner;
public class NumerosVetor {
	static int qtd,i;
		
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int vet[] = new int[5];
	
	int aux = 0, i = 0;
	
	System.out.println("Informe os valores: ");
	while(i < vet.length) {
	aux = scan.nextInt();
	vet[i] = aux;
	i = i +1;
	}
	
	QTD_ACIMA_MEDIA(vet);
	System.out.println(qtd);	
	}
	
	public static int QTD_ACIMA_MEDIA(int vet[]) {
			float media = 0,soma = 0;
			
		for(i=0; i<vet.length; i++) {
			soma = soma + vet[i];
			media = soma / vet.length;
		}
		for(i=0; i<vet.length; i++) {
			if(vet[i] > media) 
			qtd = qtd+1;
		}
			return qtd;
	}
}
