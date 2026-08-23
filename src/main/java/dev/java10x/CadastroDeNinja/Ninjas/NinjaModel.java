package dev.java10x.CadastroDeNinja.Ninjas;

import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "tb_cdadastro") // o tb junto com a snake_case no nome das tables sao boas praticas
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {


    @Id // O ID diz que o atriubuto logo abaixo e um id (Long id)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    // @ManyToOne um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    private MissoesModel missoes;

}


