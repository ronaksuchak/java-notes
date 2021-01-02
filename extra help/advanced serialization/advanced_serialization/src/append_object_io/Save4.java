package append_object_io;

import java.io.*;
import java.util.*;

public class Save4 {
	public static void main(String args[]) {
		File f1 = new File("test_append.ser");

		try (Scanner sc = new Scanner(System.in);
		// invoke static method to create inst. of appendable Object o/p strm.
				ObjectOutputStream oos = appendableObjectOutputStream(f1)) {

			System.out.println("Enter number");
			E1 e = new E1(sc.nextInt());
			oos.writeObject(e);
			System.out.println(e);
			System.out.println("Enter number");
			e = new E1(sc.nextInt());
			oos.writeObject(e);
			System.out.println(e);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// static method to ret OOS
	static ObjectOutputStream appendableObjectOutputStream(File f)
			throws IOException {
		FileOutputStream fos = new FileOutputStream(f, true);
		boolean append = f.exists() && f.length() > 0;
		// boolean append=false;

		if (append)
			return new ObjectOutputStream(fos) {
				protected void writeStreamHeader() throws IOException {
				}
			};
		else
			return new ObjectOutputStream(fos);
	}

}