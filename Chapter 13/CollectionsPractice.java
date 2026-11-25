import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsPractice {
    public static void main(String[] args) {
        List<String> topics = new ArrayList<>();
        topics.add("ArrayList");
        topics.add("HashSet");
        topics.add("Map");
        topics.add("ArrayList");

        Set<String> uniqueTopics = new HashSet<>(topics);
        Map<String, Integer> studyHours = new HashMap<>();
        studyHours.put("ArrayList", 2);
        studyHours.put("HashSet", 1);
        studyHours.put("Map", 3);

        System.out.println("Ordered list: " + topics);
        System.out.println("Unique topics: " + uniqueTopics);
        System.out.println("Hours for Map: " + studyHours.get("Map"));
    }
}
