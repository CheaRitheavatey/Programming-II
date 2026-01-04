package w3resource.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Leetcode {
    public static void main(String[] args) {
//        String s = "(){}}{";
//        System.out.println(isValid(s));

        int[][] interval = {{1,3},{2,6},{8,10},{15,18}};
//        interval[1] = new int[]{1, 2};

//        System.out.println(Arrays.deepToString(interval));
//        System.out.println(merge(interval));

        int[] num = {1,2,3,5};
//        System.out.println(isDuplicated(num));

        String s = "racecar";
        String t = "carrace";
//        System.out.println(isAnagram(s,t));


        int[] num1 = {4,5,6};
        int target = 10;
        System.out.println(twoSum(num1,target));
    }

    public static int[][] merge(int[][] interval) {
        int[][] result = new int[interval.length][2];

        for (int i = 0 ; i< interval.length - 1; i++) {
            for (int j = 0; j < interval.length - 1 ; j++) {
                if (interval[i][j] < interval[i+1][j]) {
                    if (interval[i+1][j] - interval[i][j+1] <= 0) {
                        result[i] = new int[]{interval[i][j], interval[i+1][j+1]};
                        System.out.println(Arrays.deepToString(result));
                    } else {
                        result[i] = new int[]{interval[i][j], interval[i][j+1]};
                        System.out.println(Arrays.deepToString(result));
                    }

                } else {
                    if (interval[i][j] - interval[i+1][j+1] <= 0) {
                        result[i] = new int[]{interval[i+1][j], interval[i][j+1]};
                        System.out.println(Arrays.deepToString(result));
                    } else {
                        result[i] = new int[]{interval[i][j], interval[i][j+1]};
                        System.out.println(Arrays.deepToString(result));
                    }
                }

            }

        }
        System.out.println("result " + Arrays.deepToString(result));
        return result;
    }
    
    public static boolean isValid(String s) {
        if (s.length() <= 1) return false;
        
        // if s is odd number also return false
        if (s.length() % 2 == 1) return false;

        Stack<Character> stack = new Stack<>();

        if (s.startsWith("}") || s.startsWith("]") || s.startsWith(")") ) return false;
        for (char i: s.toCharArray()) {

            System.out.println(i);

            if (i == '{' || i == '(' || i == '[') {
                stack.push(i);
            }

            System.out.println("stack" + stack);
            if (i == ')') {
                if (stack.isEmpty() || stack.peek() == '(') {
                   return false;
                } else stack.pop();
            } else if (i == '}') {
                if (stack.isEmpty() || stack.peek() != '{' ) {
                    return false;
                } else stack.pop();
            } else if (i == ']') {
                if (stack.isEmpty() || stack.peek() != '['){
                   return false;
                } else stack.pop();

            }

        }
        System.out.println(stack);
        return stack.isEmpty();
    }

    public static boolean isDuplicated(int[] num) {
        // dictionary
        HashMap<Integer, Integer> dic = new HashMap<>();
        for (int i: num) {
            dic.put(i, dic.getOrDefault(i,0) + 1);
        }

        System.out.println(dic);

        for (int x : dic.values()) {
            System.out.println(x);
            if (x > 1) return true;
        }

        return false;

    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hash1 = new HashMap<>();
        HashMap<Character, Integer> hash2 = new HashMap<>();

        if (s.length() != t.length()) return false;
        Arrays.sort(s.toCharArray());
        Arrays.sort(t.toCharArray());



        for (char c: s.toCharArray()) {
            hash1.put(c, hash1.getOrDefault(c,0) + 1);
        }

        for (char c: t.toCharArray()) {
            hash2.put(c, hash2.getOrDefault(c,0) + 1);
        }

        System.out.println(hash1);
        System.out.println(hash2);

        if (hash1.equals(hash2)) return true;

//        if (hash1.keySet().equals(hash2.keySet())) {
//            System.out.println("hash1 " + hash1.keySet());
//            System.out.println("hash2 "  + hash2.keySet());
//            System.out.println("equal: " + hash1.keySet().equals(hash2.keySet()));
//            System.out.println("equal: " + (hash1.keySet() == hash2.keySet()));
//                System.out.println("value1 " + hash1.values());
//                System.out.println("value2 " + hash2.values());
//            System.out.println("value equal: " + hash1.values().equals(hash2.values()));
////            System.out.println(hash1.values().equals(hash2.values()));
//            if (hash1.values().equals(hash2.values())) {
//                return true;}
//        }else {
//            return false;
//        }
        return false;
    }

    public static int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 1 ; j < nums.length; j++) {
//                if (i!=j) {
//                    if (nums[i] + nums[j] == target) {
//                    res[0] = i;
//                    res[1] = j;
//
//                    }
//
//                }
//
//            }
//        }
//        System.out.println(Arrays.toString(res));
//        return Arrays.stream(res).sorted().toArray();


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (map.containsKey(dif)) {
                return new int[] {map.get(dif),i};
            }

            map.put(nums[i],i );
        }

        return new int[]{};
    }
}
