
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

// let define a contract to model the selection criteria (predicate)
interface ApplePredicate{
    boolean test (Apple apple);
}

class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight() >150;
    }
}

class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }
}

// now we can create multiple predicates and pass them to our filter function
class AppleRedAndHeavyPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return Color.RED.equals(apple.getColor())
                &&apple.getWeight() >150;
    }
}

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

