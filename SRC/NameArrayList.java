import java.util.ArrayList;
import java.util.Collections;

public class NameArrayList {
    public static void main(String[] args) {
        ArrayList<String> Names = new ArrayList<String>();
        Names.add("Albert");
        Names.add("Emilie");
        Names.add("Jansen");
        Names.add("Mimi");
        Names.add("Ryan");
        Names.add("Ali");
        Names.add("Damian");
        Names.add("Carlo");

        System.out.println("Me and my friends names are:");
        for (String name : Names) {
            System.out.println(name);
        }
        System.out.println("\n");

        System.out.println("In alphabetical order:");
        Collections.sort(Names);
        for (String name : Names) {
            System.out.println(name);
        }
        System.out.println("\n");

        System.out.println("Randomized:");
        Collections.shuffle(Names);
        for (String name : Names) {
            System.out.println(name);
        }
        System.out.println("\n");

        /*
         * The difference between Collections and Collection or a class and an interface
         * is that a class is a blueprint or prototype from which objects are
         * created(geeksforgeeks.org),
         * while an interface is template tha tells certain methods what to do but not
         * how to do it.
         * Reference:
         * GeeksforGeeks. (2023, May 22). Differences between interface and class in
         * java. GeeksforGeeks.
         * https://www.geeksforgeeks.org/differences-between-interface-and-class-in-
         * java/
         */

        System.out.println("Searching for Ryan:");
        System.out.println("Ryan was found at index: " + Names.indexOf("Ryan"));
        System.out.println("\n");

        System.out.println("Searching for Michelle:");
        System.out.println("Michelle was found at index: " + Names.indexOf("Michelle"));
        System.out.println("\n");

        System.out.println("List as an Array:");
        String[] NamesArray = Names.toArray(new String[Names.size()]);
        for (String name : NamesArray) {
            System.out.println(name);
        }
    }
}