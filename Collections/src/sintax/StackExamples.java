package sintax;

import java.util.Iterator;
import java.util.Stack;

public class StackExamples {

    public static void main(String[] args) {

        //Create Stack
        Stack stack = new Stack();

        Stack<String> stack1 = new Stack<>();

        //Push Elemento on Stack
        stack1.push("1");
        stack1.push("2");
        stack1.push("3");
        stack1.push("4");

        //Popt Element from Stack
        String topElement = stack1.pop();

        //Iterate Elements of Stack
        Iterator iterator = stack1.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println(value);
        }




    }
}
