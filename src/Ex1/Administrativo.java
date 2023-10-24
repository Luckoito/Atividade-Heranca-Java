package Ex1;

public class Administrativo extends Assistente{
    private String turno;
    private double bonus;
    private String tipo = "Administrativo";


    public void setTurno(int turno)
    {
        if (turno == 1)
        {
            this.turno = "Matutino";
        } 
        else if (turno == 2 ) 
        {
            this.turno = "Noturno";
        }
    }

    public String getTurno()
    {
        return this.turno;
    }

    public double ganhoAnual()
    {
        if (this.turno == "Noturno" && this.bonus > 0) 
        {
            return (this.getSalario() + this.getBonus()) * 12;
        }
        else 
        { 
            return this.getSalario() * 12; 
        }
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
        System.out.println("Turno: " + this.getTurno() );
        System.out.println("Salário: " + this.getSalario() );
        System.out.println("Ganho Anual: " + this.ganhoAnual() );
    }
}
