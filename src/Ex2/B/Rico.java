package Ex2.B;

public class Rico extends Pessoa {
    private double dinheiro;

    public Rico()
    {
        this.dinheiro = 999999.00;
    }

    public void fazCompras (Double preco)
    {
        System.out.println("O rico está fazendo compras...");

        System.out.println("Perdendo " + preco + " reais...");
        this.dinheiro = this.dinheiro - preco; 

        System.out.println("Uaaau, agora o rico 'só' tem " + this.dinheiro + " reais... :o");

    }
}
