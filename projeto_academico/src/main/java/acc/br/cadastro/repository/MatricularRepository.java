package acc.br.cadastro.repository;

import org.springframework.data.repository.CrudRepository;

import acc.br.cadastro.model.MatriculaAluno;

public interface MatricularRepository extends CrudRepository<MatriculaAluno, Integer>{
    
}