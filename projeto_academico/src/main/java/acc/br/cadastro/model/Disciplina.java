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

    @Column(name="DISCIPLINANome", nullable=false, length=45)
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
    public void setNomeDisc(String nomeDisc) throws Exception {
        this.nomeDisc = nomeDisc;

        if(nomeDisc == null || nomeDisc == ""){
            throw new Exception("O Campo nomeDisc e obrigatorio.");
        }
        else if(nomeDisc.length() >= 45)
        {
            throw new Exception("O numero de caracteres para o campo deve ser menor ou igual a 45.");
        }
        else
        {
           this.nomeDisc = nomeDisc; 
        }
    }
    
    public int getDiscCredt() {
        return discCredt;
    }
    public void setDiscCredt(int discCredt) {
        this.discCredt = discCredt;
    }
}