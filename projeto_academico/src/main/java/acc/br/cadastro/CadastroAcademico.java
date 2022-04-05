package acc.br.cadastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class CadastroAcademico {

	public static Logger logger = LoggerFactory.getLogger(CadastroAcademico.class);
	public static void main(String[] args) {
		logger.info("Inicio cadastro academico.");
		SpringApplication.run(CadastroAcademico.class, args);
		logger.info("Cadastro academico iniciada e pronta para uso.");

	}

}
