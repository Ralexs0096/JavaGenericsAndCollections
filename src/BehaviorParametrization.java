
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

/** **************************************************************** */
interface PrettyPrintApple {
    String prettyPrint(Apple apple);
}

// implement PrettyPrintApple contract
class AppleFancyFormatter implements PrettyPrintApple {
    public String prettyPrint(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return String.format("""
                A %s %s apple
                """, characteristic, apple.getColor());
    }
}

class AppleSimpleFormatter implements PrettyPrintApple {
    public String prettyPrint(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
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

    // quiz 2.1: Write a flexible prettyPrintApple method

    public static void prettyPrintApple(List<Apple> inventory, PrettyPrintApple p) {
        for(Apple apple : inventory) {
            String output = p.prettyPrint(apple);
            System.out.println(output);
        }
    }
}

