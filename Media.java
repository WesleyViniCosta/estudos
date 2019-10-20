package aulas;
import java.util.Scanner;
public class Media {

	static float media, a,b;	
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Digite a primeira nota: ");
	a = scan.nextFloat();
	
	System.out.print("Digite a segunda nota: ");
	b = scan.nextFloat();
	
	calculoMedia(a,b);
	
	System.out.print("Média: " + media);
	}
	
	public static float calculoMedia(float a, float b) {
		media = (a+b)/2;
		return media;
	}
	
}
