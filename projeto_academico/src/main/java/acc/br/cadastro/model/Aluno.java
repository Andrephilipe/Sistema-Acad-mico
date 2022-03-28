package acc.br.cadastro.model;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ALUNO")
public class Aluno extends Pessoa{
    
    @Column
    private String name;
    @Column
    private int mensalidade;
    @Column
    private char tipoBolsa;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMen() {
        return mensalidade;
    }
    public void setMen(int mensalidade) {
        this.mensalidade = mensalidade;
    }
    public char getBolsa() {
        return tipoBolsa;
    }
    public void setBolsa(char tipoBolsa) {
        this.tipoBolsa = tipoBolsa;
    }

}
