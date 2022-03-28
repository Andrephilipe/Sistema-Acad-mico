package acc.br.cadastro.repository;

import org.springframework.data.repository.CrudRepository;

import acc.br.cadastro.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, String>{
    
}