package dev.java10x.CadastroDeNinja.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVinda(){
        return "Hello World!";
    }

    //Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    //Mostar todos os ninjas (CREATE)
    @GetMapping("/todos")
    public String MostarTodosOsNinjas(){
        return "Mostrar Ninja";
    }

    //Mostrar Ninja por id (READ)
    @GetMapping("/todosID")
    public String MostarTodosOsNinjasPorId(){
        return "Mostrar Ninja por Id";
    }

    //Alterar dados do Ninja (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Ninja alterada por Id";
    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por Id";
    }
}
