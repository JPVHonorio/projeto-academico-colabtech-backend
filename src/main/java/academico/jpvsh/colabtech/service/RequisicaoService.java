package academico.jpvsh.colabtech.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academico.jpvsh.colabtech.exception.RequisicaoException;
import academico.jpvsh.colabtech.exception.UsuarioException;
import academico.jpvsh.colabtech.model.Requisicao;
import academico.jpvsh.colabtech.model.Usuario;
import academico.jpvsh.colabtech.repo.RequisicaoRepo;

/**
 * Classe de Serviço para Requisição.
 * 
 * Esta classe contém todos os métodos de manipulação de dados para Requisição. Ela
 * utiliza o RequisicaoRepo que trás várias funcionalidades básicas já
 * pré-definidas
 * (como save por exemplo para salvar um dado no database) e define novas
 * funcionalidades também.
 * 
 * Notações Java:
 * - @Service -> Define essa classe como sendo um Service
 * - @Autowired -> ?
 */

@Service
public class RequisicaoService {
    private final RequisicaoRepo RequisicaoRepo;

    // Contrutor
    @Autowired
    public RequisicaoService(RequisicaoRepo RequisicaoRepo) {
        this.RequisicaoRepo = RequisicaoRepo;
    }

    // Métodos
    public Requisicao addRequisicao (Requisicao req) {
        return RequisicaoRepo.save(req);
    }

    public List<Requisicao> obterRequisicoes() {
        return RequisicaoRepo.findAll();
    }

    public Requisicao atualizarRequisicao(Requisicao req) {
        return RequisicaoRepo.save(req);
    }

    public List<Requisicao> obterRequisicoesDoUsuario(Long usuarioId) {
        return RequisicaoRepo.findReqByUsuarioId(usuarioId)
                .orElseThrow(() -> new RequisicaoException("Requisições do usuário de Id" + usuarioId + "não encontradas"));
    }

    public void deletarRequisicao(Long id) {
        RequisicaoRepo.deleteReqById(id);
    }
}
