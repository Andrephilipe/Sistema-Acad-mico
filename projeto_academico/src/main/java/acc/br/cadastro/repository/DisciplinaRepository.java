/**************************************************************************
* Autor : André Philipe
* Data criacao: 04/04/2022
* Nome do arquivo: DisciplinaRepository
* Arquivo de implementacao de repositorio da entidade DisciplinaRepository
****************************************************************************/

/****Pacote da classe****/
package acc.br.cadastro.repository;

//INICIO: Imports da interface
import org.springframework.data.repository.CrudRepository;
import acc.br.cadastro.model.Disciplina;
//FIM: Imports da interface

public interface DisciplinaRepository extends CrudRepository<Disciplina, Integer>{
    
}