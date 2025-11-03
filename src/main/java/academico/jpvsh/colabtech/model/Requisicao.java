package academico.jpvsh.colabtech.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Classe modelo de dados para Requisicao.
 * 
 * Esta classe contém o modelo de dados para uma requisição. Ela conta com os mesmos
 * atributos da tabela Requisicao do banco de dados e será usada ao longo da
 * aplicação para envio e recebimento de dados de requisição. Seguindo a estrutura MVC,
 * essa é a camada responsável pela leitura, escrita e validação de dados.
 * 
 * Implementações:
 * - Serializable -> Permite a serialização desta classe em diferentes formatos
 * (ex: JSON).
 * 
 * Notações Java:
 * - @Entity -> Mapeia esta classe a uma tabela do banco de dados.
 * - @Id -> Define a coluna como chave primária.
 * - @GeneratedValue -> Gera automaticamente o valor da chave primária.
 * - @Column -> Define características da coluna (ex: nullable, updatable,
 * unique, etc).
 */

@Entity
public class Requisicao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false, updatable = false)
    private Long usuarioId;

    private String nome;
    private Integer tipo;
    private Integer status;
    private String setor;

    // Construtores
    public Requisicao() {
    }

    public Requisicao(String nome, Integer tipo, Integer status, String setor) {
        this.nome = nome;
        this.tipo = tipo;
        this.status = status;
        this.setor = setor;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
