package academico.jpvsh.colabtech.exception;

public class RequisicaoException extends RuntimeException{
    /**
     * Classe de definição de erros
     * 
     * Esta classe contém um construtor que retorna a mensagem de erro obtida do
     * RuntimeException.
     * 
     */

    // Construtor
    public RequisicaoException(String message) {
        super(message);
    }
}
