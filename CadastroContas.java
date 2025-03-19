import java.util.ArrayList;
import java.util.List;

public class CadastroContas {
    private List<Conta> contas;
    private static final int LIMITE_MAXIMO_CONTAS = 100;  // Limite máximo de contas

    public CadastroContas() {
        this.contas = new ArrayList<>();
    }

    // Inserir conta
    public void inserir(Conta conta) throws ExcecaoRepositorio, ExcecaoElementoJaExistente {
        if (contas.size() >= LIMITE_MAXIMO_CONTAS) {
            throw new ExcecaoRepositorio("Limite máximo de contas atingido");
        }
        
        // Verificar se já existe uma conta com o mesmo número
        for (Conta c : contas) {
            if (c.getNumeroConta().equals(conta.getNumeroConta())) {
                throw new ExcecaoElementoJaExistente("Conta com o número " + conta.getNumeroConta() + " já existe");
            }
        }
        
        contas.add(conta);
    }

    // Buscar conta
    public Conta buscar(String numeroConta) throws ExcecaoElementoInexistente {
        for (Conta c : contas) {
            if (c.getNumeroConta().equals(numeroConta)) {
                return c;
            }
        }
        throw new ExcecaoElementoInexistente("Conta com o número " + numeroConta + " não encontrada");
    }

    // Remover conta
    public void remover(String numeroConta) throws ExcecaoElementoInexistente {
        Conta conta = buscar(numeroConta);  // Se não encontrar, lançará ExcecaoElementoInexistente
        contas.remove(conta);
    }
}
