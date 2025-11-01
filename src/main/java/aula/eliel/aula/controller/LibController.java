package aula.eliel.aula.controller;

import aula.eliel.aula.model.Biblioteca;
import aula.eliel.aula.repository.LibRepository;
import aula.eliel.aula.service.LibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LibController {

    @Autowired
    private LibService libService;

    @GetMapping
    public List<Biblioteca> BuscarLivro(){

        return libService.BuscarLivro();
    }

    @PostMapping
    public Biblioteca CriarLivro(@RequestBody Biblioteca livro){

        return libService.CriarLivro(livro);
    }

    @GetMapping("/{id}")
    public Biblioteca bucsarPorId(@PathVariable Long id){
        return libService.buscarLivroPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id){
        libService.deletarLivro(id);
    }

    @PutMapping("/{id}")
    public Biblioteca atualizarLivros(@PathVariable Long id, @RequestBody Biblioteca model){
        return libService.atualizarLivro(id, model);
    }



}
