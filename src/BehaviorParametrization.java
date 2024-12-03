
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

}

