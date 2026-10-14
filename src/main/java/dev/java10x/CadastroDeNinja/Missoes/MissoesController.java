package dev.java10x.CadastroDeNinja.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @PostMapping("/criarmissoes")
    public String criarMissoes(){
        return "Criando missoes";
    }

    @GetMapping("/listarmissoes")
    public String listarMissoes(){
        return "Listando missoes";
    }

    @PutMapping("/alterarmissoes")
    public String alterarMissoesPorId(){
        return "Missao alterada com sucesso";
    }

    @DeleteMapping("/deletarmissoes")
    public String deletarMissoesPorId(){
        return "Missao deletada com sucesso";
    }
}
