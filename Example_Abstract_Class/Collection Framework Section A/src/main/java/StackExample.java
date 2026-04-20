import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		System.out.println(s);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		System.out.println("Element at TOS "+s.peek());
		s.pop();
		System.out.println(s);
	}

}
