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
import javax.persistence.criteria.CriteriaBuilder.Case;


@Entity
@Table(name = "ALUNO")
public class Aluno extends Pessoa{
    //@Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="aluno_sequence")
    @Column(name="idAluno")
    public int idAluno;
    private String turma;
    private int mensalidade_VL_mensalidade;
    private String tipo;

    public int getIdAluno() {
        return idPessoa;
    }
    public void setIdAluno(int idPessoa) {
        this.idPessoa = idAluno;
    }
    public int getMen() {
        return mensalidade_VL_mensalidade;
    }

    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    //teste tipo bolsa
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        System.out.println(tipo);
        switch (tipo){

            case "B90":
                System.out.println("Desconto de 90%");
                this.mensalidade_VL_mensalidade = (1000 - 900);
                System.out.println(mensalidade_VL_mensalidade);
                this.tipo = tipo;
                break;
            case "B50":
                System.out.println("Desconto de 500");
                this.mensalidade_VL_mensalidade = (1000 - 500);
                System.out.println(mensalidade_VL_mensalidade);
                this.tipo = tipo;
                break;
            case "B10":
                System.out.println("Desconto de 500");
                this.mensalidade_VL_mensalidade = (1000 - 100);
                System.out.println(mensalidade_VL_mensalidade);
                this.tipo = tipo;
                break;

        }
        
    }

}
