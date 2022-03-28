package acc.br.cadastro.repository;

import org.springframework.data.repository.CrudRepository;

import acc.br.cadastro.model.Disciplina;

public interface DisciplinaRepository extends CrudRepository<Disciplina, Integer>{
    
}