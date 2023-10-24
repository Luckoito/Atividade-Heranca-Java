package Ex1;

public class Test {
    public static void main(String[] args) 
    {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Lucas");
        funcionario.setSalario(1000.00);
        funcionario.addAumento(3500.00);
        funcionario.exibeDados();

        System.out.println();
        Assistente assistente = new Assistente();
        assistente.setNome("Yuri");
        assistente.setSalario(1500.00);
        assistente.setMatricula(23874);
        assistente.exibeDados();

        System.out.println();
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("William");
        tecnico.setSalario(1500.00);
        tecnico.setMatricula(97482);
        tecnico.setBonus(450.00);
        tecnico.exibeDados();

        System.out.println();
        Administrativo administrativo = new Administrativo();
        administrativo.setNome("Ana");
        administrativo.setSalario(1500.00);
        administrativo.setMatricula(97482);
        administrativo.setBonus(500.00);
        administrativo.setTurno(2);
        administrativo.exibeDados();
    }
}
