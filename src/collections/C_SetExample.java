package collections;

import java.util.HashSet;
import java.util.Set;

public class C_SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(1));
        System.out.println(set.add(1));
        System.out.println(set.add(2));
    }

}
