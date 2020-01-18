package mechafinch.stmnu;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Holds a list of identifiers that choose to run a function
 * 
 * @author Alex Pickering
 *
 * @param <T> The return type of the function
 */
public class MenuEntry<T> {
    
    private Supplier<T> function;
    private List<String> identifiers;
    
    /**
     * Creates an instance with a list of identifiers and a function to run
     * 
     * @param identifiers
     * @param function
     */
    public MenuEntry(List<String> identifiers, Supplier<T> function) {
        this.identifiers = identifiers;
        this.function = function;
    }
    
    /**
     * Creates an entry with a single identifier string
     * 
     * @param identifier
     * @param function
     */
    public MenuEntry(String identifier, Supplier<T> function) {
        this(Arrays.asList(new String[] {identifier}), function);
    }
    
    /**
     * Returns if the given string is among the identifiers
     * 
     * @param s
     * @return If the string matches
     */
    public boolean matches(String s) {
        return identifiers.contains(s);
    }
    
    /**
     * Runs the function
     * 
     * @return The result of the function
     */
    public T run() {
        return function.get();
    }
}
