package mechafinch.stmnu;

import java.util.Arrays;
import java.util.List;

/**
 * Holds a list of identifiers that choose to run a function that returns nothing
 * 
 * @author Alex Pickering
 */
public class MenuEntryVoid {
    
    private Runnable function;
    private List<String> identifiers;
    
    /**
     * Creates an instance with a list of identifiers and a function to run
     * 
     * @param identifiers
     * @param function
     */
    public MenuEntryVoid(List<String> identifiers, Runnable function) {
        this.identifiers = identifiers;
        this.function = function;
    }
    
    public MenuEntryVoid(String identifier, Runnable function) {
        this(Arrays.asList(new String[] {identifier}), function);
    }
    
    /**
     * Returns if the given string is among the identifier
     * 
     * @param s
     * @return If the string matches
     */
    public boolean matches(String s) {
        return identifiers.contains(s);
    }
    
    /**
     * Runs the function
     */
    public void run() {
        function.run();
    }
}
