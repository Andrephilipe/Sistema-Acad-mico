/**************************************************************************
 * Autor : André Philipe
 * Data criacao: 04/04/2022
 * Nome do arquivo: DisciplinaAlunoRepository
 * Arquivo de implementacao de repositorio da entidade DisciplinaAluno
 ****************************************************************************/

package acc.br.cadastro.repository;

import org.springframework.data.repository.CrudRepository;

import acc.br.cadastro.model.DisciplinaAluno;

public interface DisciplinaAlunoRepository extends CrudRepository<DisciplinaAluno, Integer>{
    
}
