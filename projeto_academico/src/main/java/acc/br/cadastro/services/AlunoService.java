package acc.br.cadastro.services;
import java.util.ArrayList;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acc.br.cadastro.model.Aluno;
import acc.br.cadastro.model.Disciplina;
import acc.br.cadastro.model.Pessoa;
import acc.br.cadastro.repository.AlunoRepository;
//import acc.br.cadastro.repository.PessoaRepository;
//import antlr.collections.List;

@Service
public class AlunoService {
    
    @Autowired
    AlunoRepository alunoRepository;

    public List<Aluno> getAllAluno()
    {
        List<Aluno> alunos = new ArrayList<Aluno>();
        alunoRepository.findAll().forEach(aluno -> alunos.add(aluno));
        return alunos;
    }

    public Aluno getStudentById(Integer id)
    {
        return alunoRepository.findById(id).get();
    }

    public void saveOrUpdate(Aluno aluno)
    {
        alunoRepository.save(aluno);
    }

    public void delete(Integer id)
    {
        alunoRepository.deleteById(id);
    }

	public void save(Aluno alunos) {
	}

    public Disciplina getById(int id) {
        return null;
    }
}

