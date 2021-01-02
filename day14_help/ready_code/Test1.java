package ready_code;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,12,34,56,-67,100);
		list.remove(4);
		list.set(0, 999);

	}

}
