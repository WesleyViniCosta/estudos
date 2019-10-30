package aula3;

public class Candidato {
    private String nome;
    private int numero;
    private int votos;

    public Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getVotos() {
        return votos;
    }

    public void recebeVotos() {
        votos++;
    }	
    
    public String toString() {
       return " Nome: " + getNome() + " | Numero: "+ getNumero() + "\n Votos: " + getVotos();
    }
}
