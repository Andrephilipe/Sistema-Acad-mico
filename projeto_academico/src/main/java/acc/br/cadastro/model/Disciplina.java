/****************************************************
 * Autor : André Philipe
 * Data criacao: 04/04/2022
 * Nome do arquivo: Classe Disciplina
 * Arquivo de implementacao da classe Disciplina
 ***************************************************/

/****Pacote da classe****/
package acc.br.cadastro.model;

/***INICIO: Imports da classe***/
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/***FIM: Imports da classe***/

@Entity
@Table
public class Disciplina {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUST_SEQ")
    @Column(name="idDisciplina")
    private Integer idDisciplina;

    @Column(name="DISCIPLINANome", nullable=false, length=45)
    private String nomeDisc;

    @Column(name = "DisciplinaCreditos")
    private int discCredt;

    /*INICIO: Getters E Setters idDisciplina*/ 
    public Integer getIdDisciplina() {
        return idDisciplina;
    }
    public void setId(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    /*FIM: Getters E Setters idDisciplina*/ 

    /*INICIO: Getters E Setters nomeDisc*/ 
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
    /*FIM: Getters E Setters nomeDisc*/

    /*INICIO: Getters E Setters discCredt*/ 
    public int getDiscCredt() {
        return discCredt;
    }
    public void setDiscCredt(int discCredt) {
        this.discCredt = discCredt;
    }
    /*FIM: Getters E Setters discCredt*/ 

}