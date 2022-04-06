/*************************************************
* Autor : André Philipe
* Data criacao: 26/03/2022
* Nome do arquivo: AlunoRepository
* Arquivo de interface da classe AlunoRepository
*************************************************/

/****Pacote da classe****/
package acc.br.cadastro.repository;

//INICIO: Imports da interface
import org.springframework.data.repository.CrudRepository;
import acc.br.cadastro.model.Aluno;
//FIM: Imports da interface

public interface AlunoRepository extends CrudRepository<Aluno, Integer>{
    
}