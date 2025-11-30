import java.util.*;

class all_possible_combination {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) return ans;
        Map<Character, String> map = getMap();
        solve(0, digits, "", ans, map);
        return ans;
    }

    private void solve(int i, String digits, String s, List<String> ans, Map<Character, String> map) {
        if (i == digits.length()) {
            ans.add(s);
            return;
        }

        String letters = map.get(digits.charAt(i));
        if (letters == null || letters.isEmpty()) return; // safety for '0' or '1' etc.

        for (char c : letters.toCharArray()) {
            String temp = s + c;               // no need for new String(s)
            solve(i + 1, digits, temp, ans, map); // use i + 1, not i++
        }
    }

    private Map<Character, String> getMap() {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        return map;
    }

    public static void main(String[] args) {
        all_possible_combination obj = new all_possible_combination();
        List<String> res = obj.letterCombinations("45");
        System.out.println(res);


    }
}
