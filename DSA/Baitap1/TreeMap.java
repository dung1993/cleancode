package DSA.Baitap1;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<Character, Integer> treeMap = new java.util.TreeMap<>();
        String str = "Mot ngay dep troi";
        int value = 1;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(str.charAt(i) >= 65 && str.charAt(i)  <= 90){
                temp= (char) (str.charAt(i)  + 32);
            }
            if(temp!=' '){
                if (treeMap.containsKey(temp)) {
                    treeMap.put(temp,treeMap.get(temp) + 1);
                } else {
                    treeMap.put(temp, value);
                }
            }
        }
        System.out.println(treeMap);
    }
}
