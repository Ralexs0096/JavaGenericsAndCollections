
import java.util.ArrayList;
import java.util.List;

class  Apple {
    public String getColor(){
        return "color";
    }
    public Integer getWeight() {
        return 1;
    }
}

enum Color { RED, GREEN };

/** **************************************************************** */
// let define a contract to model the selection criteria (predicate)
interface ApplePredicate{
    boolean test (Apple apple);
}

/** **************************** Main Class of the chapter ************************************ */
public class BehaviorParametrization {
    public static List<Apple> filterApples(List<Apple> inventory,
                                           ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}

