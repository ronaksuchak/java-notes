package ready_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 12, 34, 56, -67, 100));
		list.add(89);
		System.out.println(list);
		// Attach Iterator to traverse over all the elements
		Iterator<Integer> itr = list.iterator();
		list.add(22);
		System.out.println("Display elems using explicit Iterator");
		while (itr.hasNext())
			System.out.print(itr.next());
		

	}

}
