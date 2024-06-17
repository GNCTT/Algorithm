import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Asteroid_Collision {

    void RemoveFromStack(Stack<Integer> stack, int numIn, int numOut) {
        if (numIn * numOut > 0) {
            stack.add(numOut);
            return;
        }
        if (numIn < 0 && numOut > 0) {
            stack.add(numOut);
            return;
        }
        System.out.println(numIn + " " + numOut);
        int numInn = Math.abs(numIn);
        int numOutt = Math.abs(numOut);
        if (numInn == numOutt) {
            stack.pop();
            return;
        }
        if (numInn < numOutt) {
            stack.pop();
            if (stack.size() == 0) {
                stack.add(numOut);
            } else {
                int temp = stack.peek();
                //stack.push(numOut);
                RemoveFromStack(stack, temp, numOut);
            }
        }
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> positive = new Stack<>();
        Stack<Integer> negative = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (positive.size() == 0) {
                positive.add(asteroids[i]);
            } else {
                int temp = positive.peek();
                RemoveFromStack(positive, temp, asteroids[i]);
            }
        }
        int[] arr = new int[positive.size()];
        for (int i = 0; i < positive.size(); i++) {
            arr[i] = positive.get(i);
        }
        return arr;
    }
}
