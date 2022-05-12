package br.espm.cambio;

public class Moeda {
    
    private String nome;
    private String simbulo;

    public Moeda() {

    }

    public Moeda(String nome, String simbulo) {
        this.nome = nome;
        this.simbulo = simbulo;
    }

    public String getNome() {
        return nome;
    }
    public String getSimbulo() {
        return simbulo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSimbulo(String simbulo) {
        this.simbulo = simbulo;
    }
}
