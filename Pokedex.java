import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Pokedex class
 *
 * @author Jian Hua
 * @version 1.0
 */
public class Pokedex {
    private List<Pokemon> captured = new ArrayList<>();

    /**
     * default constructor
     *
     */
    public Pokedex() {

    }

    /**
     * constructor that takes one arg
     *
     * @param journal
     *            name of the journal file
     */
    public Pokedex(String journal)
            throws FileNotFoundException, UnknownPokemonException {
        Scanner scan = new Scanner(new File(journal));
        String tem = null;
        String[] array;

        while (scan.hasNextLine()) {
            tem = scan.nextLine();
            array = tem.split(", ");
            if (array[0].equals("Pikachu") || array[0].equals("Ditto")
                    || array[0].equals("Magikarp")) {
                if (array[0].equals("Pikachu")) {
                    captured.add(new Pikachu(Integer.parseInt(array[1]),
                            Integer.parseInt(array[2]),
                            Integer.parseInt(array[3])));
                }
                if (array[0].equals("Ditto")) {
                    captured.add(new Ditto(Integer.parseInt(array[1]),
                            Integer.parseInt(array[2]),
                            Integer.parseInt(array[3])));

                }
                if (array[0].equals("Magikarp")) {
                    captured.add(new Magikarp(Integer.parseInt(array[1]),
                            Integer.parseInt(array[2]),
                            Integer.parseInt(array[3])));
                }
            } else {
                throw new UnknownPokemonException();
            }
        }
    }

    /**
     * method that adds pokemon
     *
     * @param p
     *            the input pokemon
     */
    public void addPokemon(Pokemon p) {
        captured.add(p);
    }

    /**
     * method that sorts pokemons
     */
    public void sort() {
        Collections.sort(captured);
    }

    /**
     * method that generates Letter
     *
     * @param recipient
     *            name of recipient
     */
    public void generateLetter(String recipient) throws IOException {
        File output = new File(recipient + ".txt");
        FileWriter writer = new FileWriter(output);
        String tem = "Dear " + recipient
                + ",\r\nCheck out all of the Pokemon I've caught!\r\n";
        tem = tem + this.toString();
        tem = tem + "Cheers," + "\r\n" + "Jian";
        writer.write(tem);
        writer.close();
    }

    /**
     * toString method
     *
     * @return a string that contents object information
     */
    public String toString() {
        String tem = "";
        for (int i = 0; i < captured.size(); i++) {
            tem = tem + captured.get(i).toString() + "\r\n";
        }
        return tem;
    }

}
