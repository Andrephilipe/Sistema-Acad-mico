/********************************************
 * Autor : André Philipe
 * Data criacao: 26/03/2022
 * Nome do arquivo: Classe MatriculaAluno
 * Arquivo de implementacao da classe MatriculaAluno
 ********************************************/

package acc.br.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MATRICULA_ALUNO")
public class MatriculaAluno
{
    @Id
    @Column(name = "idMatricula")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_MATRICULA")
    private int idMatricula;

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }
    @Column(name = "idAlunoM")
    private int idAlunoM;
    @Column(name = "turmaM")
    private int turmaM;
    @Column(name="discId")
    private int discId;

    public int getIdAlunoM() {
        //logger.info("Inicio cadastro academico.");
        return idAlunoM;
    }
    public void setIdAlunoM(int idAlunoM) {
        this.idAlunoM = idAlunoM;
    }
    public int getTurmaM() {
        return turmaM;
    }
    public void setTurmaM(int turmaM) {
        this.turmaM = turmaM;
    }
    
    public int getDiscId() {
        return discId;
    }
    public void setDiscId(int discId) {
        this.discId = discId;
    }

}