package Ex2.A;

public class Cachorro extends Animal {
    public String late ()
    {
        return (this.getNome() != null && this.getNome() != "" ? this.getNome() : "O cachorrinho ") + "está falando: Au Au! (S2 *_* S2)";
    }
}
