package acc.br.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import acc.br.cadastro.model.Pessoa;
import acc.br.cadastro.repository.PessoaRepository;
import acc.br.cadastro.services.PessoaService;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {
    
    @Autowired
    PessoaService pessoaService;

    @GetMapping
    public ModelAndView listar(){
        ModelAndView modelAndView = new ModelAndView("pessoa/consultarpessoa.html");

        List<Pessoa> pessoas = PessoaRepository.getAllPessoa();
        modelAndView.addObject("pessoas", pessoas);

        return modelAndView;
    }
    /*@GetMapping("/pessoa")
    private List<Pessoa> getAllPessoa()
    {
        return pessoaService.getAllPessoa();
    }

    @GetMapping("/pessoa/{idPessoa}")
    private Pessoa getPessoa(@PathVariable("idPessoa") int idPessoa)
    {
        return pessoaService.getPessoaById(idPessoa);
    }

    @DeleteMapping("/pessoa/{idPessoa}")
    private void deletePessoa(@PathVariable("idPessoa") int idPessoa)
    {
        pessoaService.delete(idPessoa);
        System.out.println("Pessoa deletada com sucesso.");

    }

    @PostMapping("/pessoa")
    private int savePessoa(@RequestBody Pessoa pessoa)
    {
        pessoaService.saveOrUpdate(pessoa);
        return pessoa.getIdPessoa();
    }*/
}
