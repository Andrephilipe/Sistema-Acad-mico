package acc.br.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;



@Entity
@Table
public class Turma {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_TURMA_SEG")
    @Column(name="idTurma")
    @JoinColumn(name = "Turma_idTurma")
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
        this.turmaDesc = turmaDesc;
    }
    
}
