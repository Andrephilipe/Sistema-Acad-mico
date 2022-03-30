package acc.br.cadastro.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.criteria.CriteriaBuilder.Case;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;




@Entity
@Table(name = "ALUNO")
public class Aluno extends Pessoa implements Serializable{
    //@Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="aluno_sequence")
    @Column(name="idAluno")
    public int idAluno;
    private String turma;
    private int mensalidade_VL_mensalidade;
    private String tipo;
    private enum tipoAluno{
        ALUNO, ALUNOBOLSISTA
    }
    private enum tipoBolsa
    {
        B90, B50, B10
    }

    public int getIdAluno() {
        return idPessoa;
    }
    public void setIdAluno(int idPessoa) {
        this.idPessoa = idAluno;
    }
    public int getMen() {
        return mensalidade_VL_mensalidade;
    }
    public void setMen(int mensalidade_VL_mensalidade) throws JsonProcessingException {
        this.mensalidade_VL_mensalidade = mensalidade_VL_mensalidade;
        System.out.println("Inicio case de mensalidades.");
        switch (tipo){

            case "B90":
                System.out.println("Desconto mensalidade de 90%");
                int vld = (mensalidade_VL_mensalidade * 90) / 100;
                System.out.println("O valor do desconto é :" + vld);
                this.mensalidade_VL_mensalidade = mensalidade_VL_mensalidade - vld;
                this.tipo = new ObjectMapper().writeValueAsString(tipoAluno.ALUNOBOLSISTA);
                break;

            case "B50":
                System.out.println("Desconto mensalidade de 50%");
                int vld5 = (mensalidade_VL_mensalidade * 50) / 100;
                System.out.println(vld5);
                this.mensalidade_VL_mensalidade = mensalidade_VL_mensalidade - vld5;
                this.tipo = new ObjectMapper().writeValueAsString(tipoAluno.ALUNOBOLSISTA);
                break;

            case "B10":
                System.out.println("Desconto de 10%");
                int vld1 = (mensalidade_VL_mensalidade * 10) / 100;
                System.out.println(vld1);
                this.mensalidade_VL_mensalidade = mensalidade_VL_mensalidade - vld1;
                this.tipo = new ObjectMapper().writeValueAsString(tipoAluno.ALUNOBOLSISTA);
                break;
                default:
                this.tipo = new ObjectMapper().writeValueAsString(tipoAluno.ALUNO);
        }
        System.out.println("Fim case de mensalidades.");

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
        this.tipo = tipo;
    }

}
