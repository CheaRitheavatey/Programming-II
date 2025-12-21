package w3resource.exercise1;

import java.util.Stack;

public class Leetcode {
    public static void main(String[] args) {
        String s = "(){}}{";
        System.out.println(isValid(s));
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
