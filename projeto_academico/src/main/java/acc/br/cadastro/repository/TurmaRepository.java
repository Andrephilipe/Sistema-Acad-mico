/**************************************************************************
* Autor : André Philipe
* Data criacao: 04/04/2022
* Nome do arquivo: TurmaRepository
* Arquivo de implementacao de repositorio da entidade TurmaRepository
****************************************************************************/

/****Pacote da classe****/
package acc.br.cadastro.repository;

//INICIO: Imports da interface
import org.springframework.data.repository.CrudRepository;
import acc.br.cadastro.model.Turma;
//FIM: Imports da interface

public interface TurmaRepository extends CrudRepository<Turma, Integer>{
    
}
