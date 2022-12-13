import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        String textLower = text.toLowerCase();

        for (int i = 0; i < textLower.length(); i++) {
            char c = textLower.charAt(i);
            if (Character.isLetter(c)) {
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    int amount = map.get(c) + 1;
                    map.put(c, amount);
                }
            }
        }

        int max = -1;
        int min = Integer.MAX_VALUE;
        char mostUsedLetter = textLower.charAt(0);
        char oftenestLetter = textLower.charAt(0);
        for (char c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                mostUsedLetter = c;
            } else if (map.get(c) < min) {
                min = map.get(c);
                oftenestLetter = c;
            }
        }

        System.out.println("Чаще всего встречается буква - " + mostUsedLetter + "\n" + "Реже всего встречается буква - " + oftenestLetter);
    }
}
