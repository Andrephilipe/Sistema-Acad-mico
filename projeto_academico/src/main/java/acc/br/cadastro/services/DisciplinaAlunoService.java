/**************************************************************************
 * Autor : André Philipe
 * Data criacao: 04/04/2022
 * Nome do arquivo: DisciplinaAlunoService
 * Arquivo de implementacao de service da entidade DisciplinaAluno
 ****************************************************************************/

package acc.br.cadastro.services;

import java.util.ArrayList;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import acc.br.cadastro.model.DisciplinaAluno;
import acc.br.cadastro.repository.DisciplinaAlunoRepository;


@Service
public class DisciplinaAlunoService {
    
    @Autowired
    DisciplinaAlunoRepository disciplinaAlunoRepository;


    public List<DisciplinaAluno> getAllAluno()
    {
        List<DisciplinaAluno> disciplinaAlunos = new ArrayList<DisciplinaAluno>();
        disciplinaAlunoRepository.findAll().forEach(disciplinaAluno -> disciplinaAlunos.add(disciplinaAluno));
        return disciplinaAlunos;
    }

    public DisciplinaAluno getAlunoById(Integer idDisciplinaAl)
    {
        return disciplinaAlunoRepository.findById(idDisciplinaAl).get();
    }

    public void saveOrUpdate(DisciplinaAluno disciplinaAluno)
    {
        disciplinaAlunoRepository.save(disciplinaAluno);
    }

    public void delete(Integer idDisciplinaAl)
    {
        disciplinaAlunoRepository.deleteById(idDisciplinaAl);
    }

	public void save(DisciplinaAluno disciplinaAluno) {
	}

    public DisciplinaAluno getById(int idDisciplinaAl) {
        return null;
    }


}

