package com.crud.exercicio.alunos_api.repository;

import com.crud.exercicio.alunos_api.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {

     List <Aluno> findByNome(String nome);
}
