package dev.java10x.CadastroDeNinja.Ninjas;

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
    public Optional<NinjaModel> listarNinjasId(Long id){
        return ninjaRespository.findById(id);
    }

}
