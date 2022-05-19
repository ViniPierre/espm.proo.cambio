package br.espm.cambio;

import java.util.UUID;

public class Moeda {

    private UUID id;
    private String nome;
    private String simbulo;

    public Moeda() {

    }

    public Moeda(String nome, String simbulo) {
        this.nome = nome;
        this.simbulo = simbulo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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
