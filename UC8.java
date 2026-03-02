import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    private static final int HEIGHT = 7;
    private static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();

        String word = "OOPS";

        for (int row = 0; row < HEIGHT; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.getOrDefault(c, getEmptyPattern());
                line.append(pattern[row]).append("   ");
            }
            System.out.println(line.toString());
        }
    }

    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    private static String[] getEmptyPattern() {
        return new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        };
    }
}