package acc.br.cadastro.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ALUNO")
public class Aluno extends Pessoa{
    //@Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="aluno_sequence")
    @Column(name="idAluno")
    public int idAluno;
    private int mensalidade_VL_mensalidade;
    private char AlunoTipoBolsa;

    public int getIdAluno() {
        return idPessoa;
    }
    public void setIdAluno(int idPessoa) {
        this.idPessoa = idAluno;
    }
    public int getMen() {
        return mensalidade_VL_mensalidade;
    }
    public void setMen(int mensalidade_VL_mensalidade) {
        this.mensalidade_VL_mensalidade = mensalidade_VL_mensalidade;
    }
    public char getBolsa() {
        return AlunoTipoBolsa;
    }
    public void setBolsa(char AlunoTipoBolsa) {
        this.AlunoTipoBolsa = AlunoTipoBolsa;
    }

}
