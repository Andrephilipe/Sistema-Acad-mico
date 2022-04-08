/*******************************************
 * Autor : André Philipe
 * Data criacao: 26/03/2022
 * Nome do arquivo: Classe Controller
 * Arquivo de controle da aplicacao
 *******************************************/

 /****Pacote da classe****/
package acc.br.cadastro.controller;

//INICIO: Imports da classe
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
import acc.br.cadastro.model.MatriculaAluno;
import acc.br.cadastro.services.DisciplinaService;
import acc.br.cadastro.services.MatriculaAlunoService;
import acc.br.cadastro.services.PessoaService;
import acc.br.cadastro.services.AlunoService;
import acc.br.cadastro.services.TurmaService;
//FIM: Imports da classe

/**INICIO: rest controller**/
@Controller
@RestController
public class CadastroController {
    
    //@Autowired
    //PessoaService pessoaService;
    @Autowired
    DisciplinaService disciplinaService;
    @Autowired
    AlunoService alunoService;
    @Autowired
    TurmaService turmaService;
    @Autowired
    MatriculaAlunoService matriculaAlunoService;

    /**INICIO - Anotacoes rest pessoa
    @GetMapping("/pessoa")
    private List<Pessoa> getAllPessoa()
    {
        return pessoaService.getAllPessoa();
    }

    @GetMapping("/pessoa/{idPessoa}")
    private Pessoa getPessoa(@PathVariable("idPessoa") int idPessoa)
    {
        return pessoaService.getPessoaById(idPessoa);
    }

    @DeleteMapping("/pessoa/{idPessoa}")
    private void deletePessoa(@PathVariable("idPessoa") int idPessoa)
    {
        pessoaService.delete(idPessoa);
        System.out.println("Pessoa deletada com sucesso.");

    }

    @PostMapping("/pessoa")
    private int savePessoa(@RequestBody Pessoa pessoa)
    {
        pessoaService.saveOrUpdate(pessoa);
        return pessoa.getIdPessoa();
    }
    /**FIM - Anotacoes rest pessoa**/

    /**INICIO - Anotacoes rest disciplina**/
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
        System.out.println("Disciplina deletada com sucesso.");
    }

    @GetMapping("/disciplina/{idDisciplina}")
    private Disciplina getDisciplina(@PathVariable("idDisciplina") int idDisciplina)
    {
        return disciplinaService.getDisciplinaById(idDisciplina);
    }
    /**FIM - Anotacoes rest disciplina**/


    /**INICIO - Anotacoes rest aluno**/
    @GetMapping("/aluno")
    private List<Aluno> getAllAluno()
    {
        return alunoService.getAllAluno();
    }

    @PostMapping("/aluno")
    private int saveAluno(@RequestBody Aluno aluno)
    {
        alunoService.saveOrUpdate(aluno);
        return aluno.getIdAluno();
    }

    @GetMapping("/aluno/{idAluno}")
    private Aluno getAluno(@PathVariable("idAluno") int id)
    {
        return alunoService.getById(id);
    }

    @DeleteMapping("/aluno/{idAluno}")
    private void deleteAluno(@PathVariable("idAluno") int idAluno)
    {
        alunoService.delete(idAluno);
        System.out.println("Aluno deletado com sucesso.");
    }
    /**FIM - Anotacoes rest aluno**/

    /**INICIO - Anotacoes rest turma**/
    @GetMapping("/turma")
    private List<Turma> getAllTurma()
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

    @DeleteMapping("/turma/{idTurma}")
    private void deleteTurma(@PathVariable("idTurma") int idTurma)
    {
        turmaService.delete(idTurma);
        System.out.println("Turma deletada com sucesso.");
    }
    /**FIM - Anotacoes rest turma**/


    /**INICIO - Anotacoes rest matriculaAluno**/
    @GetMapping("/matriculaAluno")
    private List<MatriculaAluno> getAllMatriculaAluno()
    {
        return matriculaAlunoService.getAllMatriculaAluno();
    }

    @PostMapping("/matriculaAluno")
    private int saveAluno(@RequestBody MatriculaAluno matriculaAluno)
    {
    matriculaAlunoService.saveOrUpdate(matriculaAluno);
        return matriculaAluno.getIdMatricula();
    }

    @GetMapping("/matriculaAluno/{idMatricula}")
    private MatriculaAluno getMatriculaById(@PathVariable("idMatricula") int id)
    {
        return matriculaAlunoService.getById(id);
    }
    
    @DeleteMapping("/matriculaAluno/{idMatricula}")
    private void deleteMatricula(@PathVariable("idMatricula") int idMatricula)
    {
    matriculaAlunoService.delete(idMatricula);
        System.out.println("Aluno desmatriculado da turma");
    }
    /**FIM - Anotacoes rest matriculaAluno**/

}
