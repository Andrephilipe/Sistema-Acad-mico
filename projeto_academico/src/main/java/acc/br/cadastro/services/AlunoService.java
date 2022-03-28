package acc.br.cadastro.services;
import java.util.ArrayList;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acc.br.cadastro.model.Aluno;
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

    public Pessoa getStudentById(Integer idPessoa)
    {
        return alunoRepository.findById(idPessoa).get();
    }

    public void saveOrUpdate(Aluno aluno)
    {
        alunoRepository.save(aluno);
    }

    public void delete(Integer idPessoa)
    {
        alunoRepository.deleteById(idPessoa);
    }

	public void save(Aluno alunos) {
	}
}

