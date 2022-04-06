/**************************************************************************
 * Autor : André Philipe
 * Data criacao: 04/04/2022
 * Nome do arquivo: CadastroAcademico.java
 * Arquivo principal da aplicacao
 ****************************************************************************/

 /****Pacote da classe****/
package acc.br.cadastro;

//INICIO: Imports da classe
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//FIM: Imports da classe

@SpringBootApplication
public class CadastroAcademico {

	/**Definicao de logs**/
	public static Logger logger = LoggerFactory.getLogger(CadastroAcademico.class);
	public static void main(String[] args) {
		logger.info("Inicio cadastro academico.");
		SpringApplication.run(CadastroAcademico.class, args);
		logger.info("Cadastro academico iniciada e pronta para uso.");

	}

}
