package acc.br.cadastro.services;
import java.util.ArrayList;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acc.br.cadastro.model.Disciplina;
import acc.br.cadastro.repository.DisciplinaRepository;
//import antlr.collections.List;

@Service
public class DisciplinaService {
    
    @Autowired
    DisciplinaRepository disciplinaRepository;

    public List<Disciplina> getAllDisciplina()
    {
        List<Disciplina> disciplinas = new ArrayList<Disciplina>();
        disciplinaRepository.findAll().forEach(disciplina -> disciplinas.add(disciplina));
        return disciplinas;
    }

    public Disciplina getDisciplinaById(int id)
    {
        return disciplinaRepository.findById(id).get();
    }

    public void saveOrUpdate(Disciplina disciplina)
    {
        disciplinaRepository.save(disciplina);
    }

    public void delete(int id)
    {
        disciplinaRepository.deleteById(id);
    }

	public void save(Disciplina disciplina) {
	}
}