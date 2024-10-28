import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(56);
        s.push(2);
        s.push(89);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
    }
}
