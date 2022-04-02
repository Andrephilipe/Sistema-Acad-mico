/*******************************************
 * Autor : André Philipe
 * Data criacao: 26/03/2022
 * Nome do arquivo: Classe Pessoa
 * Arquivo de implementacao da classe pessoa
 *******************************************/

/****Pacote da classe****/
package acc.br.cadastro.model;

//INICIO: Imports da classe
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//FIM: Imports da classe

@Table
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_SEQ")
    @Column(name="IDpessoa")
    public Integer idPessoa;

    @Column(name="PESSOAnome", nullable=false, length=45)
    private String pessoaNome;

    @Column(name="PESSOACPF", nullable=false, length=14)
    private String cpf;
    //Enum tipo sexo
    public enum Sexo {

        MASCULINO,
        FEMININO,
        OUTROS;
    }
    @Column(name = "PESSOASexo")
    private String pessoaSexo;

    @Column(name = "PessoaTipo")
    private String tipo;

    @Column(name = "Turma_idTurma")
    public int Turma_idTurma;

    /*INICIO: GETRS E SETS IDpessoa*/ 
    public Integer getId() {
        return idPessoa;
    }
    public void setId(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }
    /*FIM: GETRS E SETS IDpessoa*/ 

    /*INICIO: GETRS E SETS PESSOAnome*/ 
    public String getPessoaNome() {
        return pessoaNome;
    }
    public void setPessoaNome(String pessoaNome) throws Exception 
    {

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
    /*FIM: GETRS E SETS PESSOAnome*/ 
    
    /*INICIO: GETRS E SETS PESSOASexo*/ 
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
    /*FIM: GETRS E SETS PESSOASexo*/ 

    /*INICIO: GETRS E SETS PessoaTipo*/ 
    
    private enum pessoaTipoA{
        ALUNO, ALUNOBOLSISTA
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) throws Exception {
        this.tipo = tipo;
        String alunoB = "ALUNO";//new ObjectMapper().writeValueAsString(pessoaTipoA.ALUNOBOLSISTA);
        String alunoNb = "ALUNOBOLSISTA";//new ObjectMapper().writeValueAsString(pessoaTipoA.ALUNO);
        System.out.println(alunoB);
        System.out.println(alunoNb);
        System.out.println(tipo);
        if(tipo == "" || tipo == null){

            throw new Exception("O campo tipo é obrigatorio.");
            //sthis.tipo = new ObjectMapper().writeValueAsString(pessoaTipoA.ALUNO);
        }
        else if(tipo.equals(alunoB) || tipo.equals(alunoNb) == true)
        {
            System.out.println(tipo);
            this.tipo = tipo;
        }
        else
        {
            throw new Exception("Os valores tipo devem ser ALUNO OU ALUNOBOLSISTA..");
        }

    }
    /*FIM: GETRS E SETS PessoaTipo*/ 

    /*INICIO: GETRS E SETS PESSOACPF*/ 
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
    /*FIM: GETRS E SETS PESSOACPF*/ 

    /*INICIO: GETRS E SETS Turma_idTurma*/ 
    public int getTurma_idTurma() {
        return Turma_idTurma;
    }
    public void setidTurma(int turma_idTurma) {
        this.Turma_idTurma = turma_idTurma;
    }
    /*FIM: GETRS E SETS Turma_idTurma*/ 
}
