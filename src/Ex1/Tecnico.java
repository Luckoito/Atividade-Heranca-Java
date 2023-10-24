package Ex1;

public class Tecnico extends Assistente {
    private double bonus;
    private String tipo = "Assistente";

    public double ganhoAnual()
    {
        return ( this.getSalario() + (this.bonus > 0 ? this.bonus : 0) ) * 12;
    }

    public double getBonus()
    {
        return this.bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public void exibeDados ()
    {
        System.out.println("Funcionário: " + this.getNome() );
        System.out.println("Tipo: " + this.tipo );
        System.out.println("Matrícula: " + this.getMatricula() );
        System.out.println("Bonus: " + this.getBonus() );
        System.out.println("Salário: " + this.getSalario() );
        System.out.println("Ganho Anual: " + this.ganhoAnual() );
    }
}
