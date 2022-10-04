package DSA.ThuchanhQueue;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        String test = "Quang";
        Character[] charObjectArray =
                test.chars().mapToObj(c -> (char) c).toArray(Character[]::new);

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ConcurrentLinkedQueue<>();

        stack.addAll(Arrays.asList(charObjectArray));
        queue.addAll(Arrays.asList(charObjectArray));

        boolean checked = true;
        for (int i = 0; i < test.length(); i++) {
            if (stack.pop() != queue.poll()) {
                checked = false;
            }
        }

        System.out.printf("Checked: " + checked);
    }
}
