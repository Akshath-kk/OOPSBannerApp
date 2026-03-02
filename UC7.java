import java.util.*;

public class OOPSBannerApp {

    public static void main(String[] args) {

        String word = "OOPS";
        CharacterPatternMap patternMap = new CharacterPatternMap();

        List<String[]> patterns = new ArrayList<>();

        for (char c : word.toCharArray()) {
            patterns.add(patternMap.getPattern(c));
        }

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (String[] pattern : patterns) {
                line.append(pattern[row]).append("   ");
            }
            System.out.println(line.toString());
        }
    }

    static class CharacterPatternMap {

        private Map<Character, String[]> map;

        CharacterPatternMap() {
            map = new HashMap<>();

            map.put('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            });

            map.put('P', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    " ***** ",
                    "*      ",
                    "*      ",
                    "*      "
            });

            map.put('S', new String[]{
                    " ***** ",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ***** "
            });
        }

        public String[] getPattern(char c) {
            if (map.containsKey(c)) {
                return map.get(c);
            } else {
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
    }
}