package acc.br.cadastro.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DisciplinaAluno {
    
    @Id
    @Column
    private int idDisciplina;
    private int idAluno;
    private int idPessoa;

    public int getId() {
        return idDisciplina;
    }
    public void setId(int idDisciplina) {
        this.idDisciplina = idDisciplina;
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