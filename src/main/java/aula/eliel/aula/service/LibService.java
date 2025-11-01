package aula.eliel.aula.service;

import aula.eliel.aula.model.Biblioteca;
import aula.eliel.aula.repository.LibRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    public Biblioteca buscarLivroPorId(@PathVariable Long id){
        return libRepository.findById(id).get();
    }

    public void deletarLivro(Long id){
        libRepository.deleteById(id);
    }

    public Biblioteca atualizarLivro(Long id, Biblioteca libModel){
        Biblioteca novoLivro = libRepository.findById(id).get();
        novoLivro.setNomeDoLivro(libModel.getNomeDoLivro());
        novoLivro.setNomeDoAutor(libModel.getNomeDoAutor());
        novoLivro.setAnoDeLancamento(libModel.getAnoDeLancamento());
        return libRepository.save(novoLivro);
    }


}
