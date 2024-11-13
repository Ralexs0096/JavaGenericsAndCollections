import java.util.ArrayList;
import java.util.List;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        // Recall that every type in java is either a reference type or a primitive type.
        /**
         * A references type is any class, interface, or array type.
         * All reference types are subtypes of class Object, and any variable of reference
         * type may be set to the value null.
         *
         * There are eight primitive types, and each of these has a corresponding
         * library class of reference type.
         *
         * long -> Long
         * int -> Integer
         * ...
         *
         * the library classes are located in the package java.lang.
         *
         *
         * Conversion of a primitive type to the corresponding reference type is called boxing
         * and conversion of the reference type to the corresponding primitive type is called unboxing.
         */

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        int n = ints.get(0);

        // the code above is equivalent to:

//        List<Integer> ints = new ArrayList<Integer>();
//        ints.add(1);
//        int n = ints.get(0).intValue();


    }

    // the argument type must always be bound to reference types.
    public static int sum(List<Integer> nums) {
        int s = 0;
        for (int n : nums) {s += n; }; // <--- here, the unboxing occurs.
        return  s; // result types may be either primitive or reference types.
    }
}
