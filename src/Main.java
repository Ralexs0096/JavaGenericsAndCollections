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
    }
}
