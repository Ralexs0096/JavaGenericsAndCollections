import java.util.ArrayList;
import java.util.List;

class  Apple {
    public String getColor(){
        return "color";
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

    // when you find yourself writing nearly repeated code, try to abstract instead.
}
