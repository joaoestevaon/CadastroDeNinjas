package dev.java10x.CadastroDeNinja.Ninjas;

import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRespository;

    public NinjaService(NinjaRepository ninjaRespository) {
        this.ninjaRespository = ninjaRespository;
    }

    //Listar todos os ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRespository.findAll();
    }

    //Listar Ninja Por Id
    public NinjaModel listarNinjasId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRespository.findById(id);
        return ninjaPorId.orElse(null);
    }

    //Criar um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRespository.save(ninja);
    }

}
