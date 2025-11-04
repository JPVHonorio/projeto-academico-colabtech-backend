package academico.jpvsh.colabtech.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academico.jpvsh.colabtech.model.Requisicao;
import academico.jpvsh.colabtech.service.RequisicaoService;

/**
 * Classe controlador de Requisição
 * 
 * Esta classe é responsável por receber todas as requisições do Requisição e
 * executar a lógica de negócio, comunicando-se com o model para processamento
 * de dados e com o view para o output ao Requisição. Seguindo a estrutura MVC, o
 * router * envia uma requisição ao dizendo o que deseja. O controller pede
 * dados pro model, processa esses dados e manda para o view colocar no
 * html para o Requisição ver.
 * 
 * Implementações:
 * - Serializable -> Permite a serialização desta classe em diferentes formatos
 * (ex: JSON).
 * 
 * Notações Java:
 * - @RestController -> Este controlador que fará requisições REST API
 * - @RequestMapping -> Define qual será o endpoint para o uso dessa classe
 * - @GetMapping -> Especifica que o método abaixo fará uma requisição GET.
 * Caso adicione um endpoint mais específico o método abaixo será invocado
 * com este endpoint específico.
 * - @PathVariable -> Passar o parâmetro do endpoint para dentro da função.
 * - @PostMapping -> Especifica que o método abaixo fará uma requisição POST.
 * - @RequestBody -> Obter o corpo da requisição e transformar em um tipo
 * de dado específico (no caso, Usuario) para ser usado na função.
 * - @PutMapping -> Especifica que o método abaixo fará uma requisição PUT.
 */

@RestController
@RequestMapping("/requisicao")
public class RequisicaoController {

    private final RequisicaoService requisicaoService;

    // Construtor
    public RequisicaoController(RequisicaoService requisicaoService) {
        this.requisicaoService = requisicaoService;
    }

    // Métodos
    @GetMapping
    public ResponseEntity<List<Requisicao>> obterTodasAsRequisicoes() {
        List<Requisicao> reqs = requisicaoService.obterRequisicoes();
        return new ResponseEntity<>(reqs, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<List<Requisicao>> obterRequisicoesDoUsuario(@PathVariable("id") Long id) {
        List<Requisicao> reqs = requisicaoService.obterRequisicoesDoUsuario(id);
        return new ResponseEntity<>(reqs, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Requisicao> adicionarRequisicao(@RequestBody Requisicao req) {
        Requisicao novaReq = requisicaoService.addRequisicao(req);
        return new ResponseEntity<>(novaReq, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Requisicao> atualizarRequisicao(@RequestBody Requisicao req) {
        Requisicao reqAtualizada = requisicaoService.atualizarRequisicao(req);
        return new ResponseEntity<>(reqAtualizada, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    @Transactional
    public ResponseEntity<?> deletarRequisicaoPeloId(@PathVariable("id") Long id) {
        requisicaoService.deletarRequisicao(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
