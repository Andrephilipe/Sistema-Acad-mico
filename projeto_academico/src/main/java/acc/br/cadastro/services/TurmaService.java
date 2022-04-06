/**************************************************
* Autor : André Philipe
* Data criacao: 26/03/2022
* Nome do arquivo: Classe TurmaService
* Arquivo de implementacao da classe TurmaService
**************************************************/

/****Pacote da classe****/
package acc.br.cadastro.services;

//INICIO: Imports do services
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import acc.br.cadastro.repository.TurmaRepository;
import acc.br.cadastro.model.Turma;
//FIM: Imports do services

@Service
public class TurmaService {

        @Autowired
        TurmaRepository turmaRepository;
        
        public List<Turma> getAllTurmas()
        {
            List<Turma> turmas = new ArrayList<Turma>();
            turmaRepository.findAll().forEach(turma -> turmas.add(turma));
            return turmas;

        }
    
        public Turma getTurmaById(Integer id)
        {
            return turmaRepository.findById(id).get();
        }
    
        public void saveOrUpdate(Turma turma)
        {
            turmaRepository.save(turma);
        }
    
        public void delete(Integer id)
        {
            turmaRepository.deleteById(id);
        }
    
        public void save(Turma turmas) {
        }
    
        public Turma getById(int id) {
            return null;
        }

}
