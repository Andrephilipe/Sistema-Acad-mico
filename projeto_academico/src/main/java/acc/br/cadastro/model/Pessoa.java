package acc.br.cadastro.model;

import javax.persistence.Column;
//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
@Table
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_SEQ")
    @Column(name="id")
    public Integer idPessoa;

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
    public void setPessoaNome(String pessoaNome) throws Exception {

        if(pessoaNome == null || pessoaNome == ""){
            throw new Exception("O Campo Nome e obrigatorio.");
        }
        else if(pessoaNome.length() > 45)
        {
            throw new Exception("O numero de caracteres para o campo deve ser menor ou igual a 45.");
        }
        else
        {
           this.pessoaNome = pessoaNome; 
        }
}
    //GETS E SETERS ID PESSOA
    
    //GETS E SETERS TIPO SEXO
    public String getSexo() {
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
    //Inicio - Gets e Sets campo cpf
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) throws Exception {

        if(cpf == null || cpf == ""){
            throw new Exception("O Campo CPF e obrigatorio.");
        }
        else if(cpf.length() > 14)
        {
            throw new Exception("O numero de caracteres para o campo deve ser menor ou igual a 14.");
        }
        else
        {
           this.cpf = cpf; 
        }
    }
    //Fim - Gets e Sets campo cpf
}
