package dev.java10x.CadastroDeNinja.Ninjas;

import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

// Entity transforma uma classe em uma entidade do BD
// JPA = Java Persistance API
@Entity
@Table(name = "tb_cdadastro") // o tb junto com a snake_case no nome das tables sao boas praticas
public class NinjaModel {

    //Resumo
    //@entity - > transforma a minha classe em uma entidade
    //@table -> Vai definir qual tabela do banco de dados essa entidade representa
    //@id -> indica a chave primária da minha classe
    //@generatedValue(strategy = GenerationType.IDENTITY) -> Faz a geração de valores para id ser automática

    //Eu digo como o ID vai funcionar
    //(se vai gerar de 1 em 1, ou 2 em 2...)
    @Id // O ID diz que o atriubuto logo abaixo e um id (Long id)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O GeneratedValue vai passar a estrategia de como vai ser gerado
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    private MissoesModel missoes;

    public  NinjaModel(){
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public NinjaModel(String nome, String email, int idade, MissoesModel missoes) {
        this(nome, email,idade);
        this.missoes = missoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
