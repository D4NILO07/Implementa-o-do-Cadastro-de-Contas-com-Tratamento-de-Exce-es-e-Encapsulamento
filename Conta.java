public class Conta {
    private String numeroConta;
    private String titular;
    private double saldo;

    // Construtor
    public Conta(String numeroConta, String titular, double saldo) throws ExcecaoDadoInvalido {
        setNumeroConta(numeroConta);
        setTitular(titular);
        setSaldo(saldo);
    }

    // Getter e Setter para número da conta
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) throws ExcecaoDadoInvalido {
        if (numeroConta == null || numeroConta.isEmpty()) {
            throw new ExcecaoDadoInvalido("Número da conta inválido");
        }
        this.numeroConta = numeroConta;
    }

    // Getter e Setter para titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) throws ExcecaoDadoInvalido {
        if (titular == null || titular.isEmpty()) {
            throw new ExcecaoDadoInvalido("Nome do titular inválido");
        }
        this.titular = titular;
    }

    // Getter e Setter para saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) throws ExcecaoDadoInvalido {
        if (saldo < 0) {
            throw new ExcecaoDadoInvalido("Saldo não pode ser negativo");
        }
        this.saldo = saldo;
    }
}
