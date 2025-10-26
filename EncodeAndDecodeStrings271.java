package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings271 {

    public static void main(String[] args) {
        EncodeAndDecodeStrings271 clazz = new EncodeAndDecodeStrings271();
        String encoded = clazz.encode(List.of(new String[]{"hello", "world", "bro", "!"}));
        List<String> decoded = clazz.decode(encoded);

        System.out.println(Arrays.toString(decoded.toArray()));
    }

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String current : strs) {
            sb.append(current.length());
            sb.append("#");
            sb.append(current);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        char[] arr = str.toCharArray();

        StringBuilder len = new StringBuilder();
        StringBuilder word = new StringBuilder();

        int i = 0;
        while (i < arr.length) {
            len.append(arr[i]);
            i++;

            if (arr[i] == '#') {
                int lenNum = Integer.parseInt(len.toString());
                i++;
                while (lenNum > 0) {
                    word.append(arr[i]);
                    lenNum--;
                    i++;
                }
                result.add(word.toString());

                len = new StringBuilder();
                word = new StringBuilder();

            }
        }

        return result;
    }
}
