package Ex1;

public class Funcionario {
    private String nome;
    private double salario;

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public double getSalario()
    {
        return this.salario;
    }

    public void addAumento(double valor) 
    {
        this.salario += (valor > 0 ? valor : 0);    
    }

    public double ganhoAnual ()
    {
        return this.salario * 12;
    }

    public void exibeDados ()
    {
        System.out.println("Funcionário: " + this.getNome() );
        System.out.println("Salário: " + this.getSalario() );
        System.out.println("Ganho Anual: " + this.ganhoAnual() );
    }
}
