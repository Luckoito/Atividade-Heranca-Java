package Ex2.B;

public class Test {
    public static void main (String args[])
    {
        Rico herdeiro = new Rico();
        herdeiro.fazCompras(1000.00);

        System.out.println();
        Pobre ze = new Pobre();
        ze.trabalha();

        System.out.println();
        Miseravel anonimo = new Miseravel();
        anonimo.mendiga();
    }
}
