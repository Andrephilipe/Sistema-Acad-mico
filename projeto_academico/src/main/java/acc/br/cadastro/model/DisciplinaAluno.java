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

    /*INICIO: Getters e Setters idDisciplinaAl*/ 
    public int getId() {
        return idDisciplinaAl;
    }
    public void setId(int idDisciplinaAl) {
        this.idDisciplinaAl = idDisciplinaAl;
    }
    /**FIM: Getters e Setters idDisciplinaAl**/

    /*INICIO: Getters e Setters idAluno*/ 
    public int getIdAluno() {
        return idAluno;
    }
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    /*FIM: Getters e Setters idAluno*/
    
}