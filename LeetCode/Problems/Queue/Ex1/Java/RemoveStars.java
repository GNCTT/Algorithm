import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RemoveStars {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                stack.add(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        String out = "";
//        while (stack.size() != 0) {
//            out += stack.pop();
//        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            out += stack.get(i);
        }


        return out;
    }
}
