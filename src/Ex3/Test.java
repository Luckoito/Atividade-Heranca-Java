package Ex3;

import java.text.DecimalFormat;

public class Test {
    public static void main (String args [])
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        ContaCorrente conta1 = new ContaCorrente("Lucas", 100.50);
        ContaPoupanca conta2 = new ContaPoupanca("Leandro", 200, 2.95);

        conta1.deposito(0.50);

        System.out.println();
        conta1.saque(20);

        System.out.println();
        conta1.transferencia(500, conta2);

        System.out.println();
        conta1.transferencia(50, conta2);

        System.out.println();
        conta1.saque(200);

        System.out.println();
        conta2.saque(200);

        System.out.println();
        System.out.println("Saldo da conta poupança: R$" + conta2.saldo);
        System.out.println("Rendimentos da conta poupança em um ano com os juros de " + conta2.getJuros()*100 + "%: R$" + decimalFormat.format(conta2.rendimentos()));
    }
    
}
