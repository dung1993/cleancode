package DemoUnitTesting.DemoStack;

import java.util.LinkedList;

public class DemoStack {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6};
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < list.length; i++) {
            stack.push(list[i]);
        }
        System.out.println(stack);
    }
}
