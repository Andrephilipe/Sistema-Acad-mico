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
    private String nomeDisc;
    private int discCredt;

    public int getIdDisciplina() {
        return idDisciplina;
    }
    public void setId(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    public String getNomeDisc() {
        return nomeDisc;
    }
    public void setNomeDisc(String nomeDisc) {
        this.nomeDisc = nomeDisc;
    }
    public int getDiscCredt() {
        return discCredt;
    }
    public void setDiscCredt(int discCredt) {
        this.discCredt = discCredt;
    }
}