package mechafinch.stmnu;


/**
 * A class that handles command-line menus.
 * 
 * @author Alex Pickering
 */
public class StaticMenu {
    
    /**
     * Runs the function of the chosen entry and returns its result
     * 
     * @param <T> The type returned by the entries
     * @param entries
     * @param input The choice string
     * @return Whatever was returned by the function
     */
    public static <T> T runMenu(MenuEntry<T>[] entries, String input) {
        for(int i = 0; i < entries.length; i++) {
            if(entries[i].matches(input)) return entries[i].run();
        }
        
        return null;
    }
    
    /**
     * Runs the function of the chosen entry
     * 
     * @param entries
     * @param input The choice string
     */
    public static void runMenu(MenuEntryVoid[] entries, String input) {
        for(int i = 0; i < entries.length; i++) {
            if(entries[i].matches(input)) {
                entries[i].run();
                return;
            }
        }
    }
}


