package acc.br.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Pessoa {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_SEQ")
    @Column(name="id")
    private Integer idPessoa;

    @Column(name="PESSOAnome", nullable=false, length=45)
    private String pessoaNome;

    @Column(name="CPF", nullable=false, length=14)
    private String cpf;

    public enum sexo{
        MASCULINO, FEMININO
    };
    private String pessoaSexo;
    private String tipo;
    public Integer getId() {
        return idPessoa;
    }
    //GETS E SETERS ID PESSOA
    public void setId(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }
    public String getPessoaNome() {
        return pessoaNome;
    }
    public void setPessoaNome(String pessoaNome) {
        try{
                this.pessoaNome = pessoaNome;
        }
        catch(NullPointerException e)
        {         
            System.out.println("O Campo Nome é obrigatório.");
    }
}
    //GETS E SETERS ID PESSOA
    
    //GETS E SETERS TIPO SEXO
    public String getPessoaSexo() {
        return pessoaSexo;
    }
    public void setPessoaSexo(String pessoaSexo) {
       this.pessoaSexo = pessoaSexo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
