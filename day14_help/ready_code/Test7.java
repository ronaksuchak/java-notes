package ready_code;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Test7 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 12, 34, 56, -67, 100);
		// Attach Iterator to traverse over all the elements
		ListIterator<Integer> litr = list.listIterator(list.size());
		System.out.println("Display elems using list iterator : in reverse order");
		while (litr.hasNext())
			System.out.print(litr.next());

	}

}
