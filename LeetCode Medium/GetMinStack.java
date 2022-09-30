import java.util.*;

public class GetMinStack {
    Stack<Integer> s;
    Integer minEle;

    // Constructor
    void GetMinStackStack() {
        s = new Stack<Integer>();
    }

    void getMin() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Minimum Element in the " + " stack is: " + minEle);
        }
    }
    // prints top element of MyStack
    void peek() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty ");
            return;
        }
        Integer t = s.peek(); // Top element.
        System.out.print("Top Most Element is: ");

        if (t < minEle)
            System.out.println(minEle);
        else
            System.out.println(t);
    }

    void pop() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();

        if (t < minEle) {
            System.out.println(minEle);
            minEle = 2 * minEle - t;
        } else
            System.out.println(t);
    }

    // Insert new number into MyStack
    void push(Integer x) {
        if (s.isEmpty()) {
            minEle = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }

        // If new number is less than original minEle
        if (x < minEle) {
            s.push(2 * x - minEle);
            minEle = x;
        } else
            s.push(x);

        System.out.println("Number Inserted: " + x);
    }


    public static void main(String[] args) {
        GetMinStack s = new GetMinStack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();

    }
}
