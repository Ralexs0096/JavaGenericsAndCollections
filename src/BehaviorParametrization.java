import java.util.ArrayList;
import java.util.List;

class  Apple {
    public String getColor(){
        return "color";
    }
}

public class BehaviorParametrization {
    enum Color { RED, GREEN };

    // this initial resolves the problem of filter apples by green color
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if( Color.GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    // when you find yourself writing nearly repeated code, try to abstract instead.
}
