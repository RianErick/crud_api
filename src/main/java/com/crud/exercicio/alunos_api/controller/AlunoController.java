package com.crud.exercicio.alunos_api.controller;
import com.crud.exercicio.alunos_api.model.Aluno;
import com.crud.exercicio.alunos_api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno create (@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }
    @PutMapping("{id}")
    public ResponseEntity <Aluno> update (@PathVariable Long id , @RequestBody Aluno aluno){
        if(!alunoRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        aluno.setId(id);
        aluno = alunoRepository.save(aluno);
        return ResponseEntity.ok(aluno);
    }
    @GetMapping("/listar")
    public List <Aluno> read(){
        return alunoRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> delete (@PathVariable Long id){
         if (!alunoRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        alunoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }



}
