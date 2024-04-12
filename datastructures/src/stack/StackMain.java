package stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stack=new Stack(10);
        stack.push(5);
        stack.push(4);
        stack.pop();
        stack.printStack();
        System.out.println("Height is : "+stack.getHeight());
    }
}
