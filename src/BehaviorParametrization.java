
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

public class BehaviorParametrization {
    enum Color { RED, GREEN };

   // Third attempt: filtering with every attribute you can think of
   public static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag) {
       List<Apple>result = new ArrayList<>();

       for (Apple apple: inventory) {
           if ((flag && apple.getColor().equals(color)) ||
               (!flag &&apple.getWeight() >weight)) {
               result.add(apple);
           }
       }
       return result;
   }

   // An ugly way to select color or weight  ------------>
//    List<Apple>greenApples = filterApples(inventory, GREEN, 0, true);
//    List<Apple>heavyApples = filterApples(inventory, null, 150, false);

}

