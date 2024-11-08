import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // chapter 1: the whole is greater than the sum of its parts.

        // using generics
        List<Integer> ints = Arrays.asList(1,2,3);
        int s = 0;

        for (int n : ints) {
            s += n;
        }

        assert s == 20;

        // before generics:

//        int[] ints = new int[] { 1,2,3 };
//        int s = 0;
//        for (int i = 0; i <ints.length; i++) { s += ints[i]; }
//        assert s == 6;

        List<String> words = new ArrayList<>();
        /**
         * In the collections framework, class ArrayList<E> implements interface
         * List<E>.
         */
        words.add("Hello ");
        words.add("world!");

        String s2 = words.get(0) + words.get(1);
        assert s2.equals("Hello world!");

        // same code before generics:

//        List words = new ArrayList();
//        words.add("Hello ");
//        words.add("world!");
//        String s2 = ((String)words.get(0))+((String)words.get(1));
//        assert s2.equals("Hello world!");

        // Cast-iron guarante:
        // the implicit casts added by the compilation of generics never fail.

        /**
         * Generics Versus Templates Generics in Java resemble templates in C++. There are just two important things to bear in mind about the relationship between Java generics and C++ templates: syntax and semantics. The syntax is deliberately similar and the semantics are deliberately different.
         * Syntactically, angle brackets were chosen because they are familiar to C++ users, and because square brackets would be hard to parse. However, there is one difference in syntax. In C++, nested parameters require extra spaces, so you see things like this:
         *
         * List<List<String>>
         *
         * In Java, no spaces are required, and it’s fine to write this:
         *
         * List<List<String>>
         */

    }
}
