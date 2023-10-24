package Ex1;

public class Assistente extends Funcionario {
    private int matricula;
    private String tipo = "Assistente";

    public void setMatricula (int matricula)
    {
        this.matricula = matricula;
    }

    public int getMatricula ()
    {
        return this.matricula;
    }

    public void exibeDados ()
    {
        System.out.println("Funcionário: " + this.getNome() );
        System.out.println("Tipo: " + this.tipo );
        System.out.println("Matrícula: " + this.getMatricula() );
        System.out.println("Salário: " + this.getSalario() );
        System.out.println("Ganho Anual: " + this.ganhoAnual() );
    }
}
