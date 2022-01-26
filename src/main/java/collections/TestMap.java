package collections;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Kate", 52);
        scores.put("John", 62);
        scores.put("Jane", 72);

        System.out.println(scores);
        System.out.println(scores.get("John"));
    }
}
