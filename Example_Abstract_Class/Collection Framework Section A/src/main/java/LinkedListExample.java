import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		System.out.println(l);
		l.add("Java");
		l.add("Python");
		l.add("C++");
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		
	}

}
