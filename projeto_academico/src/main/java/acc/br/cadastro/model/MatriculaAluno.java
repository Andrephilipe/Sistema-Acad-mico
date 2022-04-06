/********************************************
* Autor : André Philipe
* Data criacao: 26/03/2022
* Nome do arquivo: Classe MatriculaAluno
* Arquivo de implementacao da classe MatriculaAluno
********************************************/

/****Pacote da classe****/
package acc.br.cadastro.model;

/***INICIO: Imports da classe***/
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/***FIM: Imports da classe***/

@Entity
@Table(name = "MATRICULA_ALUNO")
public class MatriculaAluno
{
    @Id
    @Column(name = "idMatricula")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_MATRICULA")
    private int idMatricula;

    @Column(name = "idAlunoM")
    private int idAlunoM;
    @Column(name = "turmaM")
    private int turmaM;
    @Column(name="discId")
    private int discId;

    /*INICIO: Getters E Setters idMatricula*/ 
    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }
    /*FIM: Getters E Setters idMatricula*/ 

    /*INICIO: Getters E Setters idAlunoM*/ 
    public int getIdAlunoM() {
        return idAlunoM;
    }
    public void setIdAlunoM(int idAlunoM) {
        this.idAlunoM = idAlunoM;
    }
    /*FIM: Getters E Setters idAlunoM*/ 

    /*INICIO: Getters E Setters turmaM*/ 
    public int getTurmaM() {
        return turmaM;
    }
    public void setTurmaM(int turmaM) {
        this.turmaM = turmaM;
    }
    /*FIM: Getters E Setters turmaM*/ 

    /*INICIO: Getters E Setters discId*/ 
    public int getDiscId() {
        return discId;
    }
    public void setDiscId(int discId) {
        this.discId = discId;
    }    
    /*FIM: Getters E Setters discId*/ 

}