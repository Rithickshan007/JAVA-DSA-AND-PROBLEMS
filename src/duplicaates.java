import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

class Duplicate1{
    public static void main(String[] args) {
        String s="Terv pro company";
        char[] s1=s.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            for (int j=i+1;j< s1.length;j++){
                if(s1[i]==s1[j]&&s1[j]!=' '){
                    System.out.print(s1[j]+" ");
                }
            }
        }
    }
}

class Duplicate2 {
    public static void main(String[] args) {
        String str = "Rithickshan";
        Map<Character, Integer> duplicate = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            duplicate.put(ch, duplicate.getOrDefault(ch, 0) + 1);
        }

        // Convert the entry set to a list to access by index
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(duplicate.entrySet());
        for (int i = 0; i < entryList.size(); i++) {
            Map.Entry<Character, Integer> entry = entryList.get(i);
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
