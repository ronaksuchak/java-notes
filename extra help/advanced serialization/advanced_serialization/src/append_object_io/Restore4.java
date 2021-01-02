package append_object_io;

import java.io.*;

public class Restore4 {
	public static void main(String args[]) {

		E1 e;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"test_append.ser"))) {
			while (true) {
				e = (E1) ois.readObject();
				System.out.println(e);
			}

		} catch (EOFException e1) {

			System.out.println("data read over");
		} catch (Exception e1) {

			e1.printStackTrace();
		}
	}
}