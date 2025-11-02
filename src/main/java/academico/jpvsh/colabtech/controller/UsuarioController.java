package academico.jpvsh.colabtech.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academico.jpvsh.colabtech.model.Usuario;
import academico.jpvsh.colabtech.service.UsuarioService;

/**
 * Classe controlador de Usuário
 * 
 * Esta classe é responsável por receber todas as requisições do usuário e
 * executar a lógica de negócio, comunicando-se com o model para processamento
 * de dados e com o view para o output ao usuário. Seguindo a estrutura MVC, o
 * router * envia uma requisição ao dizendo o que deseja. O controller pede
 * dados pro model, processa esses dados e manda para o view colocar no
 * html para o usuário ver.
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
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    // Construtor
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Métodos
    @GetMapping
    public ResponseEntity<List<Usuario>> obterTodosOsUsuarios() {
        List<Usuario> usuarios = usuarioService.obterUsuarios();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Usuario> obterUsuarioPeloId(@PathVariable("id") Long id) {
        Usuario usuario = usuarioService.obterUsuarioPeloId(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> loginUser(@RequestBody Usuario usuario) {
        Usuario usuarioLogin = usuarioService.obterUsuarioPorEmailESenha(usuario.getEmail(), usuario.getSenha());
        return new ResponseEntity<>(usuarioLogin, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Usuario> adicionarUsuario(@RequestBody Usuario usuario) {
        Usuario novoUsuario = usuarioService.addUsuario(usuario);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Usuario> atualizarUsuário(@RequestBody Usuario usuario) {
        Usuario usuarioAtualizado = usuarioService.atualizarUsuario(usuario);
        return new ResponseEntity<>(usuarioAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletarUsuarioPeloId(@PathVariable("id") Long id) {
        usuarioService.removerUsuario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
