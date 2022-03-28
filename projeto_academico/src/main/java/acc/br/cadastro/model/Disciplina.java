package acc.br.cadastro.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Disciplina {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUST_SEQ")
    @Column(name="idDisciplina")
    private Integer idDisciplina;

    private String nomeDisc;
    private int discCredt;

    public Integer getIdDisciplina() {
        return idDisciplina;
    }
    public void setId(Integer idDisciplina) {
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