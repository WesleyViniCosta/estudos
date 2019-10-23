package aulas;
import java.util.Scanner;
public class Meses {
	
	static int n;
	static String mes;
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Digite o número: ");
	n = scan.nextInt();
	Mes(n);
	System.out.println(mes);
	
	}
	
	public static String Mes(int n) {
	 
		switch (n) {
		case 1: mes = "Janeiro"; break;
		case 2: mes = "Fevereiro"; break;
		case 3: mes = "Marco"; break;
		case 4: mes = "Abril"; break;
		case 5: mes = "Maio"; break;
		case 6: mes = "Junho"; break;
		case 7: mes = "Julho"; break;
		case 8: mes = "Agosto"; break;
		case 9: mes = "Setembro"; break;
		case 10: mes = "Outubro"; break;
		case 11: mes = "Novembro"; break;
		case 12: mes = "Dezembro"; break;
		default: mes = "";
		}
		return mes;
	}
}
