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

    }
}
