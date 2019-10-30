package aulas;

import java.util.Scanner;

public class CriarCandidato {

    public static void main(String[] args) {

    	Candidato c = new Candidato("Wesley Costa", 17);
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o número do seu candidato: ");
        int numCan = scan.nextInt();
       
        if(numCan == 17) {
        	c.recebeVotos();
        }

        System.out.println(c);
    }
}
