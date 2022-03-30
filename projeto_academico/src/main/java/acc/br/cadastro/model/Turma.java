package acc.br.cadastro.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import acc.br.cadastro.model.Pessoa;


@Entity
//@Table
public class Turma {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_TURMA_SEG")
    @Column(name="idTurma")
    @JoinColumn(name = "Turma_idTurma")
    private int idTurma;
    @Column(name="TURMADesc", nullable=false, length=45)
    private String turmaDesc;

    public int getIdTurma() {
        return idTurma;
    }
    public void setId(int idTurma) {
        this.idTurma = idTurma;
    }
    public String getTurma() {
        return turmaDesc;
    }
    public void setTurma(String turmaDesc) {
        this.turmaDesc = turmaDesc;
        if(turmaDesc != "MI1 – Manha Iniciante 1" || turmaDesc != "TI1 -  Tarde iniciante 1" || turmaDesc != "NI1 – Noite iniciante 1"){
            this.turmaDesc = "não identificado ";
        }
    }
    
}
