package acc.br.cadastro.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.ObjectMapper;

@MappedSuperclass
@Table
public class Pessoa {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_SEQ")
    @Column(name="idPessoa")
    public Integer idPessoa;

    @Column(name="PESSOAnome", nullable=false, length=45)
    private String pessoaNome;

    @Column(name="CPF", nullable=false, length=14)
    private String cpf;
    //teste sexo id

    public enum Sexo {

        MASCULINO,
        FEMININO,
        OUTROS;
    }
    //teste sexo id

    private String pessoaSexo;
    private String tipo;
    
    //@OneToMany
    @JoinColumn(name = "idTurma")
    @Column(name = "Truma_idTurma")
    public int Turma_idTurma;

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
    public String getPessoaSexo() {
        return pessoaSexo;
    }
    public void setPessoaSexo(String pessoaSexo) throws Exception {

        this.pessoaSexo = pessoaSexo;
        System.out.println("INICIO: case pessoaSexo");
        switch (pessoaSexo){

            case "MASCULINO":
                System.out.println("O sexo informado é MASCULINO");
                this.pessoaSexo = new ObjectMapper().writeValueAsString(Sexo.MASCULINO);
                break;

            case "FEMININO":
                System.out.println("O sexo informado é FEMININO");
                this.pessoaSexo = new ObjectMapper().writeValueAsString(Sexo.FEMININO);
                break;

            case "OUTROS":
                System.out.println("O sexo informado é OUTROS");
                this.pessoaSexo = new ObjectMapper().writeValueAsString(Sexo.OUTROS);
                break;

            case "":
                throw new Exception("O campo sexo é obrigatorio.");


            case "null":
                throw new Exception("O campo não pode ser NULL.");

            default:
                throw new Exception("Os dados válidos são 'MASCULINO, FEMININO OU OUTROS.'");
            
        
        }
        System.out.println("FIM: case pessoaSexo");
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
    //geters e seters id turma

    public int getTurma_idTurma() {
        return Turma_idTurma;
    }
    public void setidTurma(int turma_idTurma) {
        this.Turma_idTurma = turma_idTurma;
    }
}
