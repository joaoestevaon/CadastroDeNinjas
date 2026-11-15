package dev.java10x.CadastroDeNinja.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    //Create
    @PostMapping("/criar")
    public String criarMissoes(){
        return "Criando missoes";
    }

    //Read
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }

    //Read
    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesID(@PathVariable Long id){
        return missoesService.listarMissoesID(id);
    }

    //Update
    @PutMapping("/alterar")
    public String alterarMissoesPorId(){
        return "Missao alterada com sucesso";
    }

    //Delete
    @DeleteMapping("/deletar")
    public String deletarMissoesPorId(){
        return "Missao deletada com sucesso";
    }
}
