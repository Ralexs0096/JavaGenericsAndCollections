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

    // Second attempt: parameterizing the color
    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple: inventory) {
            if( apple.getColor().equals(color) ) {
                result.add(apple);
            }
        }

        return result;
    }

//    List<Apple>greenApples = filterApplesByColor(inventory, GREEN);
//    List<Apple>redApples = filterApplesByColor(inventory, RED);

    // now we create a new method to filter the apples by weight, but
    // this new method breaks the DRY principle since repeat code form our initial method `filterApplesByColor`
    public static List<Apple> filterApplesByWeight(List<Apple>inventory, int weight) {
        List<Apple>result = new ArrayList<>();
        for (Apple apple: inventory){
            if ( apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    // when you find yourself writing nearly repeated code, try to abstract instead.
}

