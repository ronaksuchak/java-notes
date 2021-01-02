package ready_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 23, 12, 34, 57, -67, 100));
		list.add(89);
		System.out.println(list);
		// Attach Iterator to traverse over all the elements
		Iterator<Integer> itr = list.iterator();

		System.out.println("Display elems using explicit Iterator");
		while (itr.hasNext()) {
			if (itr.next() % 2 == 0)
				itr.remove();
		}
		System.out.println("List again "+list);

	}

}
