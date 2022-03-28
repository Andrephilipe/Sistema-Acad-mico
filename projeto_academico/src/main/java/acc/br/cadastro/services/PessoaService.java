package acc.br.cadastro.services;
import java.util.ArrayList;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acc.br.cadastro.model.Pessoa;
import acc.br.cadastro.repository.PessoaRepository;
//import antlr.collections.List;

@Service
public class PessoaService {
    
    @Autowired
    PessoaRepository pessoaRepository;

    public List<Pessoa> getAllPessoa()
    {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoaRepository.findAll().forEach(pessoa -> pessoas.add(pessoa));
        return pessoas;
    }

    public Pessoa getStudentById(Integer idPessoa)
    {
        return pessoaRepository.findById(idPessoa).get();
    }

    public void saveOrUpdate(Pessoa pessoa)
    {
        pessoaRepository.save(pessoa);
    }

    public void delete(Integer idPessoa)
    {
        pessoaRepository.deleteById(idPessoa);
    }

	public void save(Pessoa pessoa) {
	}
}

