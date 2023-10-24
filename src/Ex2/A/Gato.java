package Ex2.A;

public class Gato extends Animal {
    public String mia ()
    {
        return (this.getNome() != null && this.getNome() != "" ? this.getNome() : "O gatinho ") + "está falando: Miaau! (S2 :3 S2)";
    }
}
