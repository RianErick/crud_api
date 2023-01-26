package com.crud.exercicio.alunos_api.controller;
import com.crud.exercicio.alunos_api.model.Aluno;
import com.crud.exercicio.alunos_api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/status")
    public String status(){
        return "Online";
    }
    @GetMapping("/listar")
    public List <Aluno> listarAlunos(){
        return alunoRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno adicionar (@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }



}
