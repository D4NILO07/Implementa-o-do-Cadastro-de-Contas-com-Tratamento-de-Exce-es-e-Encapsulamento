// Exceção para dados inválidos
class ExcecaoDadoInvalido extends Exception {
    public ExcecaoDadoInvalido(String mensagem) {
        super(mensagem);
    }
}

// Exceção para erro no repositório (limite de contas atingido)
class ExcecaoRepositorio extends Exception {
    public ExcecaoRepositorio(String mensagem) {
        super(mensagem);
    }
}

// Exceção para quando já existe um elemento no repositório
class ExcecaoElementoJaExistente extends Exception {
    public ExcecaoElementoJaExistente(String mensagem) {
        super(mensagem);
    }
}

// Exceção para erro ao tentar acessar um elemento inexistente
class ExcecaoElementoInexistente extends Exception {
    public ExcecaoElementoInexistente(String mensagem) {
        super(mensagem);
    }
}
