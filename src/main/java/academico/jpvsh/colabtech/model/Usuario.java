package academico.jpvsh.colabtech.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Classe modelo de dados para Usuários.
 * 
 * Esta classe contém o modelo de dados para um usuário. Ela conta com os mesmos
 * atributos da tabela Usuário do banco de dados e será usada ao longo da
 * aplicação para envio e recebimento de dados de usuário. Seguindo a estrutura
 * MVC,
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
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String email;
    private String senha;
    private Integer tipoDeAcesso; // Ficará como tipo_de_acesso no SQL DB
    private Integer status;
    private String nome;
    private String posicao;
    private String telefone;
    private String rua;
    private String bairro;
    private String numero;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String urlImagem; // Ficará como url_imagem no SQL DB

    // Construtores
    public Usuario() {
    }

    public Usuario(String email, String senha, Integer tipoDeAcesso, Integer status, String nome, String posicao,
            String telefone, String rua, String bairro, String numero, String cidade, String estado,
            String pais, String cep, String urlImagem) {
        this.email = email;
        this.senha = senha;
        this.tipoDeAcesso = tipoDeAcesso;
        this.status = status;
        this.nome = nome;
        this.posicao = posicao;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.urlImagem = urlImagem;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getTipoDeAcesso() {
        return tipoDeAcesso;
    }

    public void setTipoDeAcesso(Integer tipoDeAcesso) {
        this.tipoDeAcesso = tipoDeAcesso;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
}
