package aulas;

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
        return this.nome;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getVotos() {
        return this.votos;
    }

    public int recebeVotos() {
        this.votos++;
        return votos;
    }	
    
    /*@Override
    public String toString() {
       return this.getNome()+", Numero: "+ this.getNumero()+"\n votos: "+ getVotos();
    }*/
}
