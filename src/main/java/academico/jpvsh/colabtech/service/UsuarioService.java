package academico.jpvsh.colabtech.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academico.jpvsh.colabtech.exception.UsuarioException;
import academico.jpvsh.colabtech.model.Usuario;
import academico.jpvsh.colabtech.repo.UsuarioRepo;

/**
 * Classe de Serviço para Usuário.
 * 
 * Esta classe contém todos os métodos de manipulação de dados para Usuário. Ela
 * utiliza o UsuarioRepo que trás várias funcionalidades básicas já
 * pré-definidas
 * (como save por exemplo para salvar um dado no database) e define novas
 * funcionalidades também.
 * 
 * Notações Java:
 * - @Service -> Define essa classe como sendo um Service
 * - @Autowired -> ?
 */

@Service
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;

    // Contrutor
    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    // Métodos
    public Usuario addUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> obterUsuarios() {
        return usuarioRepo.findAll();
    }

    public Usuario atualizarUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    public Usuario obterUsuarioPeloId(Long id) {
        return usuarioRepo.findUsuarioById(id)
                .orElseThrow(() -> new UsuarioException("Usuario com o id" + id + "não encontrado"));
    }

    public Usuario obterUsuarioPorEmailESenha(String email, String senha) {
        return usuarioRepo.findUserByEmailAndSenha(email, senha)
                .orElseThrow(() -> new UsuarioException("Este email ou senha não foi encontrado."));
    }

    public void deletarUsuario(Long id) {
        usuarioRepo.deleteUserById(id);
    }
}
