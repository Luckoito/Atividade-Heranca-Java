package Ex2.A;

public class Test {
    public static void main (String args[])
    {
        Animal toto = new Animal("Totó");
        System.out.println(toto.caminha());

        System.out.println();
        System.out.println("Shhhh...");
        Cachorro auau = new Cachorro();
        System.out.println(auau.late());

        System.out.println();
        System.out.println("Parece que alguém está respondendo...");
        Gato miau = new Gato();
        System.out.println(miau.mia());

    }
}
