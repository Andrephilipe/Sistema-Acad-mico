package acc.br.cadastro.services;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acc.br.cadastro.model.Aluno;
import acc.br.cadastro.model.MatriculaAluno;
import acc.br.cadastro.repository.MatricularRepository;


@Service
public class MatriculaAlunoService {
    
    @Autowired
    MatricularRepository matricularRepository;


    public List<MatriculaAluno> getAllMatriculaAluno()
    {
        List<MatriculaAluno> matriculaAlunos = new ArrayList<MatriculaAluno>();
        matricularRepository.findAll().forEach(matriculaAluno -> matriculaAlunos.add(matriculaAluno));
        return matriculaAlunos;
    }

    public MatriculaAluno getMatriculaById(Integer idAlunoM)
    {
        return matricularRepository.findById(idAlunoM).get();
    }

    public void saveOrUpdate(MatriculaAluno matriculaAluno)
    {
        matricularRepository.save(matriculaAluno);
    }

    public void delete(Integer idAlunoM)
    {
        matricularRepository.deleteById(idAlunoM);
    }

	public void save(MatriculaAluno matriculaAluno) {
	}

    public MatriculaAluno getById(int idAlunoM) {
        return null;
    }

}

