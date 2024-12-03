
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

// let define a contract to model the selection criteria (predicate)
interface ApplePredicate{
    boolean test (Apple apple);
}

public class BehaviorParametrization {
    enum Color { RED, GREEN };

   // Third attempt: filtering with every attribute you can think of

   public class AppleHeavyWeightPredicate implements ApplePredicate {
       public boolean test(Apple apple) {
           return apple.getWeight() >150;
       }
   }
    public class AppleGreenColorPredicate implements ApplePredicate {
        public boolean test(Apple apple) {
            return Color.GREEN.equals(apple.getColor());
        }
    }


    /**
     * This is what behavior parameterization means: the ability to tell a method
     * to take multiple behaviors (or strategies) as parameters and use them internally
     * to accomplish different behaviors.
     */

    // attempt fourth: now our method receive a predicate instead of multiple parameters
    // (filtering by abstract criteria)
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

