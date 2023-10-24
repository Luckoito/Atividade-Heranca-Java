package Ex3;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public void deposito (double valor)
    {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
        System.out.println("Novo saldo: R$" + this.saldo + ".");
    }

    public void transferencia (double valor, ContaBancaria conta)
    {
        if (valor > this.saldo)
        {
            System.out.println("A transferência não pôde ser realizada: Saldo insuficiente");
        } else 
        {
            this.saldo = this.saldo - valor;
            conta.saldo += valor;
            System.out.println("Transferência de R$" + valor + " realizada.");
            System.out.println("Novo saldo: R$" + this.saldo + ".");
        }
    }

    public void saque (double valor)
    {
        if (valor > this.saldo)
        {
            System.out.println("O saque não pôde ser realizado: Saldo insuficiente");
        } else 
        {
            this.saldo = this.saldo - valor;
            System.out.println("Saque de R$" + valor + " realizado.");
            System.out.println("Novo saldo: R$" + this.saldo + ".");
        }
    }
}
