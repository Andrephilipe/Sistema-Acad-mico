package acc.br.cadastro.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Disciplina {
    
    @Id
    @Column
    private int idDisciplina;
    private char nomeDisc;
    private int discCredt;

    public int getId() {
        return idDisciplina;
    }
    public void setId(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    public int getNomeDisc() {
        return nomeDisc;
    }
    public void setNomeDisc(char nomeDisc) {
        this.nomeDisc = nomeDisc;
    }
    public int getDiscCredt() {
        return discCredt;
    }
    public void setDiscCredt(int discCredt) {
        this.discCredt = discCredt;
    }
}