/**
* Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
* For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
* Bonus: Can you do this in one pass?
*/

import java.util.HashSet;

public class IfSumPossible {
    private static HashSet<Integer> b = new HashSet<Integer>();
    private static boolean process(Integer[] a,Integer target){
        for (Integer item : a) {
            if (b.contains(item))
                return true;
            b.add(target - item);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(process(new Integer[]{10, 15, 3, 2, 7},17));
    }
}
