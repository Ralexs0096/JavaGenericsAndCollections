
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class  Apple {
    public String getColor(){
        return "color";
    }
    public Integer getWeight() {
        return 1;
    }
}

enum Color {
    RED, GREEN
}

interface ApplePredicate<T> {
    boolean test (T t);
}

/** **************************** Main Class of the chapter ************************************ */
// seventh attempt: abstracting over List type
public class BehaviorParametrization {
    List<Apple> inventory = new ArrayList<>();

    // Introduces a type parameter T (manages to find the sweet spot between flexibility and conciseness)
    public static <T> List<T> filterApples(List<T> list,
                                           Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    List<Apple> redApples = filterApples(inventory, (Apple apple) -> Color.RED.equals(apple.getColor()));
}

