/****************************************************
 * Autor : André Philipe
 * Data criacao: 26/03/2022
 * Nome do arquivo: Classe DisciplinaAluno
 * Arquivo de implementacao da classe disciplinaAluno
 ***************************************************/

 /****Pacote da classe****/
package acc.br.cadastro.model;

/***INICIO: Imports da classe***/
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/***FIM: Imports da classe***/

@Entity
@Table
public class DisciplinaAluno {
    
    @Id
    @Column(name = "idDisciplinaAl")
    private int idDisciplinaAl;

    @Column(name = "Aluno_IDAlunos")
    private int idAluno;

    /*INICIO: GETRS E SETS idDisciplinaAl*/ 
    public int getId() {
        return idDisciplinaAl;
    }
    public void setId(int idDisciplinaAl) {
        this.idDisciplinaAl = idDisciplinaAl;
    }
    /**FIM: GETRS E SETRS idDisciplinaAl**/

    /*INICIO: GETRS E SETS idAluno*/ 
    public int getIdAluno() {
        return idAluno;
    }
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    /*FIM: GETRS E SETS idAluno*/

    /*INICIO: GETRS E SETS idPessoa
    public int getIdPessoa() {
        return idPessoa;
    }
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    /*FIM: GETRS E SETS idPessoa*/ 

}