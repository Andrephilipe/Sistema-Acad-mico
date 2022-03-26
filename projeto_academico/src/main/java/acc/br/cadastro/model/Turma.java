package acc.br.cadastro.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Turma {
    
    @Id
    @Column
    private int id;
    private char turma;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public char getTurma() {
        return turma;
    }
    public void setTurma(char turma) {
        this.turma = turma;
    }

}
