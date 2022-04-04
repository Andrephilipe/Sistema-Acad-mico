/*******************************************
 * Autor : André Philipe
 * Data criacao: 26/03/2022
 * Nome do arquivo: Classe Turma
 * Arquivo de implementacao da classe Turma
 *******************************************/

/****Pacote da classe****/
package acc.br.cadastro.model;

//INICIO: Imports da classe
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//FIM: Imports da classe

@Entity
@Table
public class Turma implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_TURMA_SEG")
    private int idTurma;
    @Column(name="turmaDesc", nullable=false, length=45)
    private String turmaDesc;

    public int getIdTurma() {
        return idTurma;
    }
    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }
    public String getTurmaDesc() {
        return turmaDesc;
    }
    public void setTurmaDesc(String turmaDesc) {

        String MI1 = "MI1 – Manha Iniciante 1";
        String TI1 = "TI1 - Tarde iniciante 1";
        String NI1 = "NI1 – Noite iniciante 1";
        this.turmaDesc = turmaDesc;

        if(turmaDesc.equals(MI1) || turmaDesc.equals(TI1) || turmaDesc.equals(NI1) == true)
        {
            this.turmaDesc = turmaDesc;
        }
        else
        {
            this.turmaDesc = "não identificado";
        }
    }
    public void adicionar(Aluno idAluno, Disciplina iDisciplina, Turma idTurma2) {
    }
    
}
