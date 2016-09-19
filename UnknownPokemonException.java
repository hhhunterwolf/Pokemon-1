/**
 * UnknownPokemonException class
 *
 * @author Jian Hua
 * @version 1.0
 */
public class UnknownPokemonException extends Exception {
    /**
     * default constructor
     *
     */
    public UnknownPokemonException() {
        super();
    }

    /**
     * constructor that takes one arg
     *
     * @param message
     *            input message
     */
    public UnknownPokemonException(String message) {
        super("message");
    }

}
