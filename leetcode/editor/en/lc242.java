package leetcode.editor.en;

import java.util.Arrays;

public class lc242 {

    public boolean isAnagram(String s, String t) {
        byte[] sBytes = s.getBytes();
        byte[] tBytes = t.getBytes();

        Arrays.sort(sBytes);
        Arrays.sort(tBytes);

        return Arrays.equals(sBytes, tBytes);
    }

}
