import java.io.IOException;

public class Tester {
    public static void main (String[] args) throws UnknownPokemonException, IOException{
        Pokedex test1 = new Pokedex("journal.txt");
        System.out.println(test1);
        test1.generateLetter("allen");
        test1.sort();
        System.out.println(test1);
    }
}
