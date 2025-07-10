import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args) {
        String digits = "29";
        List<String> result = new ArrayList<>();

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqr");
        map.put('8', "stuv");
        map.put('9', "wxyz");

        backTrack(result,digits,map,0, new StringBuilder());
        System.out.println(result);
    }

    public static void backTrack(List<String> result, String digits, HashMap<Character, String> map, int index, StringBuilder current){
        if (index == digits.length()){
            result.add(current.toString());
            return;
        }
        String possibleLetter = map.get(digits.charAt(index));
        for (char c : possibleLetter.toCharArray()){
            current.append(c);
            backTrack(result, digits, map,index  + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
