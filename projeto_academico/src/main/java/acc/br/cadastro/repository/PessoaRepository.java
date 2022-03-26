package acc.br.cadastro.repository;

import org.springframework.data.repository.CrudRepository;

import acc.br.cadastro.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer>{
    
}
