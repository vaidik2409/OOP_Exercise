import java.util.*;

public class pra30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println("\nWord Frequency:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}