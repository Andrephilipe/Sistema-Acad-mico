/**************************************************************************
* Autor : André Philipe
* Data criacao: 04/04/2022
* Nome do arquivo: DisciplinaAlunoRepository
* Arquivo de implementacao de repositorio da entidade DisciplinaAluno
****************************************************************************/

/****Pacote da classe****/
package acc.br.cadastro.repository;

//INICIO: Imports da interface
import org.springframework.data.repository.CrudRepository;
import acc.br.cadastro.model.DisciplinaAluno;
//FIM: Imports da interface

public interface DisciplinaAlunoRepository extends CrudRepository<DisciplinaAluno, Integer>{
    
}
