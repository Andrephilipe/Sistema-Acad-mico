package acc.br.cadastro.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Aluno {
    
    @Id
    @Column
    private int id;
    private String name;
    private int mensalidade;
    private char tipoBolsa;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
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
