import java.util.HashMap;

public class HashMaps {
    public static void hashMaps() {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 77);
        examScores.put("English", 88);
        examScores.put("Computer", 67);
        examScores.put("Civic", 85);
        examScores.put("Chemistry", 64);

        examScores.putIfAbsent("Data P", 99);
        examScores.replace("Math", 43);

        System.out.println(examScores);
        System.out.println(examScores.get("Math"));
        System.out.println(examScores.containsKey("Math"));
        System.out.println(examScores.containsValue(99));

        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10);
        });
        System.out.println(examScores);

    }
}
