package com.crud.exercicio.alunos_api.repository;

import com.crud.exercicio.alunos_api.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Long> {

     List <Aluno> findByNome(String nome);
}
