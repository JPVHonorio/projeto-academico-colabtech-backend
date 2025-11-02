package academico.jpvsh.colabtech.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import academico.jpvsh.colabtech.model.Usuario;

/**
 * Interface para implementar funções comuns de manipulação de dados.
 * 
 * Esta interface extende os métodos existentes do JbaRepository que oferece
 * algumas funções básicas de manipulação de dados para que elas não tenham que
 * ser criadas manualmente. Caso outros métodos sejam necessários eles podem ser
 * definidos aqui.
 * 
 * Esta interface será usada com frequência no service para chamar funções de
 * interação com o database.
 */

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {

    /*
     * Métodos auto Implementados pelo Web Spring
     * A nomenclatura destes métodos está em inglês porque
     * estão seguindo a convensão de nome do WebSpring. Ele entenderá o
     * que está escrito e fará uma auto implementação baseada no nome.
     */

    void deleteUsuarioById(Long id);
    Optional<Usuario> findUsuarioById(Long id);
    Optional<Usuario> findUserByEmailAndSenha (String email, String senha);
}
