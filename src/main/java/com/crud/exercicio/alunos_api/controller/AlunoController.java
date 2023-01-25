package com.crud.exercicio.alunos_api.controller;
import com.crud.exercicio.alunos_api.model.Aluno;
import com.crud.exercicio.alunos_api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/status")
    public String status(){
        return "Online";
    }

    @GetMapping("/alunos")
    public List <Aluno> listarAlunos(){
        return alunoRepository.findAll();
    }


}
