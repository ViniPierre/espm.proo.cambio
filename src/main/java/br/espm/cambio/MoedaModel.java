package br.espm.cambio;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moeda")
public class MoedaModel {

    @Id
    @Column(name = "id_moeda")
    private String idMoeda;

    @Column(name = "tx_nome")
    private String txNome;

    @Column(name = "tx_simbulo")
    private String txSimbulo;

    public MoedaModel() {

    }

    public MoedaModel(Moeda moeda) {
        this.idMoeda = moeda.getId().toString();
        this.txNome = moeda.getNome();
        this.txSimbulo = moeda.getSimbulo();
    }

    public Moeda to() {
        Moeda moeda = new Moeda();
        moeda.setId(UUID.fromString(this.idMoeda));
        moeda.setNome(this.txNome);
        moeda.setSimbulo(this.txSimbulo);
        return moeda;
    }
}
