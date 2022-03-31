package acc.br.cadastro.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import acc.br.cadastro.model.Pessoa;
import acc.br.cadastro.model.Turma;
import acc.br.cadastro.model.Aluno;
import acc.br.cadastro.model.Disciplina;
import acc.br.cadastro.services.DisciplinaService;
import acc.br.cadastro.services.PessoaService;
import acc.br.cadastro.services.AlunoService;
import acc.br.cadastro.services.TurmaService;



//Criando o rest controller
@RestController
public class CadastroController {
    
    @Autowired
    PessoaService pessoaService;
    @Autowired
    DisciplinaService disciplinaService;
    @Autowired
    AlunoService alunoService;
    @Autowired
    TurmaService turmaService;

    @GetMapping("/cadastro")
    private List<Pessoa> getAllPessoa()
    {
        return pessoaService.getAllPessoa();
    }

    @GetMapping("/cadastro/{id}")
    private Pessoa getStudent(@PathVariable("id") int id)
    {
        return pessoaService.getStudentById(id);
    }

    @DeleteMapping("/cadastro/{id}")
    private void deleteStudent(@PathVariable("id") int id)
    {
        pessoaService.delete(id);
    }

    @PostMapping("/cadastro")
    private int savePessoa(@RequestBody Pessoa pessoa)
    {
        pessoaService.saveOrUpdate(pessoa);
        return pessoa.getId();
    }

    //ANOTACAO DISCIPLINA
    @GetMapping("/disciplina")
    private List<Disciplina> getAllDisciplina()
    {
        return disciplinaService.getAllDisciplina();
    }
    @PostMapping("/disciplina")
    private int saveDisciplina(@RequestBody Disciplina disciplina)
    {
        disciplinaService.saveOrUpdate(disciplina);
        return disciplina.getIdDisciplina();
    }
    @DeleteMapping("/disciplina/{idDisciplina}")
    private void deleteDisciplina(@PathVariable("idDisciplina") int idDisciplina)
    {
        disciplinaService.delete(idDisciplina);
    }
    @GetMapping("/disciplina/{idDisciplina}")
    private Disciplina getDisciplina(@PathVariable("idDisciplina") int idDisciplina)
    {
        return disciplinaService.getDisciplinaById(idDisciplina);
    }
    //ANOTACAO ALUNO
    @GetMapping("/aluno")
    private List<Aluno> getAllAluno()
    {
        return alunoService.getAllAluno();
    }
    @PostMapping("/aluno")
    private int saveAluno(@RequestBody Aluno aluno)
    {
        alunoService.saveOrUpdate(aluno);
        return aluno.getId();
    }
    @GetMapping("/aluno/{idPessoa}")
    private Aluno getAluno(@PathVariable("idPessoa") int id)
    {
        return alunoService.getById(id);
    }
    @DeleteMapping("/aluno/{idPessoa}")
    private void deleteAluno(@PathVariable("idPessoa") int idPessoa)
    {
        alunoService.delete(idPessoa);
    }
       //ANOTACAO TURMA
       @GetMapping("/turma")
       private antlr.collections.List getAllTurmas()
       {
           return turmaService.getAllTurmas();
       }
       @PostMapping("/turma")
       private int saveAluno(@RequestBody Turma turma)
       {
                turmaService.saveOrUpdate(turma);
           return turma.getIdTurma();
       }
       @GetMapping("/turma/{idTurma}")
       private Turma getTurma(@PathVariable("idTurma") int id)
       {
           return turmaService.getById(id);
       }
       @DeleteMapping("/aluno/{idTurma}")
       private void deleteTurma(@PathVariable("idTurma") int idTurma)
       {
            turmaService.delete(idTurma);
       } 
}
