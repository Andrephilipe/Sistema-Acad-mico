/**************************************************************************
* Autor : André Philipe
* Data criacao: 04/04/2022
* Nome do arquivo: MatricularRepository
* Arquivo de implementacao de repositorio da entidade MatricularRepository
****************************************************************************/

/****Pacote da classe****/
package acc.br.cadastro.repository;

//INICIO: Imports da interface
import org.springframework.data.repository.CrudRepository;
import acc.br.cadastro.model.MatriculaAluno;
//FIM: Imports da interface

public interface MatricularRepository extends CrudRepository<MatriculaAluno, Integer>{
    
}