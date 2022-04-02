package acc.br.cadastro.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DisciplinaAluno {
    
    @Id
    @Column(name = "idDisciplinaAl")
    private int idDisciplinaAl;

    @Column(name = "Aluno_IDPessoa")
    private int idAluno;

    @Column(name = "Aluno_IDAlunos")
    private int idPessoa;

    public int getId() {
        return idDisciplinaAl;
    }
    public void setId(int idDisciplinaAl) {
        this.idDisciplinaAl = idDisciplinaAl;
    }
    public int getIdAluno() {
        return idAluno;
    }
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    public int getIdPessoa() {
        return idPessoa;
    }
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
}