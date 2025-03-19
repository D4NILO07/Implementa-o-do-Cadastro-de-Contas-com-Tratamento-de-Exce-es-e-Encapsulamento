public class Main {
    public static void main(String[] args) {
        try {
            // Criando o gerenciador de contas
            CadastroContas cadastroContas = new CadastroContas();

            // Criando contas
            Conta conta1 = new Conta("12345", "João Silva", 1000.0);
            Conta conta2 = new Conta("67890", "Maria Oliveira", 2000.0);

            // Inserindo contas
            cadastroContas.inserir(conta1);
            cadastroContas.inserir(conta2);

            // Buscando uma conta existente
            Conta contaBuscada = cadastroContas.buscar("12345");
            System.out.println("Conta encontrada: " + contaBuscada.getTitular() + " - Saldo: " + contaBuscada.getSaldo());

            // Tentando cadastrar uma conta com número duplicado
            try {
                cadastroContas.inserir(conta1);
            } catch (ExcecaoElementoJaExistente e) {
                System.out.println("Erro ao cadastrar conta: " + e.getMessage());
            }

            // Remover conta
            cadastroContas.remover("12345");
            System.out.println("Conta 12345 removida com sucesso.");

            // Tentando buscar uma conta inexistente
            try {
                cadastroContas.buscar("12345");
            } catch (ExcecaoElementoInexistente e) {
                System.out.println("Erro ao buscar conta: " + e.getMessage());
            }

        } catch (ExcecaoDadoInvalido | ExcecaoRepositorio | ExcecaoElementoJaExistente | ExcecaoElementoInexistente e) {
            System.out.println("Erro no sistema: " + e.getMessage());
        }
    }
}
