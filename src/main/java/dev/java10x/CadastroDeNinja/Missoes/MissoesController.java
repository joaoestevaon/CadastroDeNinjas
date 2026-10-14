package dev.java10x.CadastroDeNinja.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @PostMapping("/criar")
    public String criarMissoes(){
        return "Criando missoes";
    }

    @GetMapping("/listar")
    public String listarMissoes(){
        return "Listando missoes";
    }

    @PutMapping("/alterar")
    public String alterarMissoesPorId(){
        return "Missao alterada com sucesso";
    }

    @DeleteMapping("/deletar")
    public String deletarMissoesPorId(){
        return "Missao deletada com sucesso";
    }
}
