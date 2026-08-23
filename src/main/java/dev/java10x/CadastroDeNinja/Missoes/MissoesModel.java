package dev.java10x.CadastroDeNinja.Missoes;

import dev.java10x.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    //TODO: criar um ENUM: DificuldadeEnum. Mudar "dificuldade para o tipo DificuldadeEnum.
    @Column(name = "dificuldade")
    private String dificuldade;

    //Uma missao pode ter vario ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
