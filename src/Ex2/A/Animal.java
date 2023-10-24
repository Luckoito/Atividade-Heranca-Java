package Ex2.A;

public class Animal {
    private String nome;
    private  String raca;

    public Animal(){}

    public Animal (String nome)
    {
        this.nome = nome;
    }

    public Animal (String nome, String raca)
    {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome()
    {
        return this.nome;
    }

    public String caminha () 
    {
        return (this.nome != null && this.nome != "" ? this.nome : "O animal") + " está caminhando....";
    }
}
