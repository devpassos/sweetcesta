package br.com.sweetcesta.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Entity;

@Entity
@ApplicationScoped
public class ProdutoEntity extends PanacheEntity {
    
    String nome;
    String descricao;
    double valor;



    public static ProdutoEntity findByName(String nome) {

        return find("nome", nome).firstResult();


    
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
