package misc;

import java.util.HashMap;

public class Pointers {
    public static void main(String[] args) {
        int i = 11;
        int j = i;
        i = 12;
        System.out.println("i :"+i+" j :"+j);

        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        map1.put("value",11);
        map2 = map1;
        map1.put("value",12);
        System.out.println("map1 :"+map1.get("value")+" map2 :"+map2.get("value"));
        System.out.println(map1==map2);
        System.out.println(map1.equals(map2));
    }
}
