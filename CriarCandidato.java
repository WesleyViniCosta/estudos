package aulas;

import java.util.Scanner;

public class CriarCandidato {

    public static void main(String[] args) {

    	Candidato c = new Candidato("Wesley", 24);
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o número do seu candidato: ");
        int numCan = scan.nextInt();
       
        if(numCan==24){
        	System.out.println("\nNome: " + c.getNome());
        	System.out.println("Número: " + c.getNumero());
        	System.out.println("Votos: " + c.recebeVotos());
        }else {
        	System.out.println("\nNome: " + c.getNome());
        	System.out.println("Número: " + c.getNumero());
        	System.out.println("Votos: " + c.getVotos());
        }
        
    }
}
