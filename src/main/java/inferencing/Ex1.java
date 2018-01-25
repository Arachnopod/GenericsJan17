package inferencing;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Ex1 {
  public static void main(String[] args) {
    Map<String, Integer> data = new HashMap<>();
    data.put("One", 1);
    data.put("Two", 2);
    data.put("Three", 3);
    data.put("Four", 4);

    Comparator<Map.Entry<String, Integer>> forward = Map.Entry.comparingByValue();
    Comparator<Map.Entry<String, Integer>> reverse = forward.reversed();
    data.entrySet()
        .stream()
//        .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))\
//        .sorted(reverse)
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
        .forEach(e -> System.out.println(e.getValue() + " is called " + e.getKey()));
  }
}
