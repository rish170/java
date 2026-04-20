import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		System.out.println(h);
		h.put(100,"Abc");
		h.put(101,"Xyz");
		h.put(102,"Lmn");
		System.out.println(h);
		System.out.println(h.get(101));
	}

}
