package aula.eliel.aula.service;

import aula.eliel.aula.model.Biblioteca;
import aula.eliel.aula.repository.LibRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibService {

    @Autowired
    private LibRepository libRepository;

    public List<Biblioteca> BuscarLivro() {
        return libRepository.findAll();
    }


    public Biblioteca CriarLivro(Biblioteca repository){
        return libRepository.save(repository);
    }

    public Biblioteca buscarLivroPorId(Long id){
        return libRepository.findById(id).get();
    }

    public void deletarLivro(Long id){
        libRepository.deleteById(id);
    }


}
