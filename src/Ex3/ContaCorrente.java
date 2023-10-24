package Ex3;

public class ContaCorrente extends ContaBancaria {
    private double credito;
    private double saldoCredito;

    public ContaCorrente (String nome, Double depInicial)
    {
        this.titular = nome;
        this.saldo = depInicial;
        this.credito = depInicial * 2;  // O crédito do cliente será o dobro do valor de depósito inicial.
        this.saldoCredito = this.credito;
    }

    public void transferencia (double valor, ContaBancaria conta)
    {
        double saldoTotal = this.saldo + this.saldoCredito;

        if (valor > saldoTotal)
        {
            System.out.println("A transferência não pôde ser realizada: Saldo insuficiente");

        } 
        else if ( valor < saldoTotal && valor > this.saldo )
        {
            this.saldoCredito = this.saldoCredito - (valor - this.saldo);
            this.saldo = 0;

            conta.saldo += valor;
            System.out.println("Transferência de R$" + valor + " realizada.");
            System.out.println("Novo saldo: R$" + this.saldo + ".");
            System.out.println("Novo saldo de crédito: R$" + this.saldoCredito + ".");

        } 
        else 
        {
            this.saldo = this.saldo - valor;

            conta.saldo += valor;
            System.out.println("Transferência de R$" + valor + " realizada.");
            System.out.println("Novo saldo: R$" + this.saldo + ".");
            System.out.println("Saldo de crédito: R$" + this.saldoCredito + ".");
        }
    }

    public void saque (double valor)
    {
        double saldoTotal = this.saldo + this.saldoCredito;

        if (valor > saldoTotal)
        {
            System.out.println("O saque não pôde ser realizado: Saldo insuficiente");
        } 
        else if ( valor < saldoTotal && valor > this.saldo )
        {
            this.saldoCredito = this.saldoCredito - (valor - this.saldo);
            this.saldo = 0;

            System.out.println("Saque de R$" + valor + " realizado.");
            System.out.println("Novo saldo: R$" + this.saldo + ".");
            System.out.println("Novo saldo de crédito: R$" + this.saldoCredito + ".");

        } 
        else 
        {
            this.saldo = this.saldo - valor;

            System.out.println("Saque de R$" + valor + " realizado.");
            System.out.println("Novo saldo: R$" + this.saldo + ".");
            System.out.println("Saldo de crédito: R$" + this.saldoCredito + ".");
        }
    }

    
}
