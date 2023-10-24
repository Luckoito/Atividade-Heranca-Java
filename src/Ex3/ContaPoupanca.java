package Ex3;

import java.time.LocalDateTime;    
import java.time.format.DateTimeFormatter;

public class ContaPoupanca extends ContaBancaria {
    private String aniversario;
    private double juros;

    public ContaPoupanca (String nome, double depInicial, double juros)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        this.titular = nome;
        this.saldo = depInicial;
        this.aniversario = dtf.format(now);
        this.juros = juros/100;
    }

    public double rendimentos()
    {
        return this.saldo * Math.pow(1.0 + this.juros, 12);
    }

    public double getJuros()
    {
        return this.juros;
    }
    
}
