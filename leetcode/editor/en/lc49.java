package leetcode.editor.en;

import java.util.*;

public class lc49 {
    public static void main(String[] args) {
        lc49 clazz = new lc49();
        System.out.println(clazz.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapping = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (mapping.containsKey(sorted)) {
                mapping.get(sorted).add(str);
            } else {
                List l = new ArrayList<>();
                l.add(str);
                mapping.put(sorted, l);
            }
        }

        return new ArrayList<>(mapping.values());
    }
}
