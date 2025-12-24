package w3resource.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Leetcode {
    public static void main(String[] args) {
        String s = "(){}}{";
//        System.out.println(isValid(s));

        int[][] interval = {{1,3},{2,6},{8,10},{15,18}};
//        interval[1] = new int[]{1, 2};

//        System.out.println(Arrays.deepToString(interval));
        System.out.println(merge(interval));
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
}
