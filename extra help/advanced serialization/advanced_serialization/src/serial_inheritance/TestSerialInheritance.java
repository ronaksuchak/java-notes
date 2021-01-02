package serial_inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B b1 = new B(101, "abc");
		b1.setId(345);
		b1.setName("def");
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.ser"))) {
			out.writeObject(b1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.ser"))) {
			B ref = (B) in.readObject();
			System.out.println("restored " + ref);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class A implements Serializable {
	private int id = 1234;

	public A(int id) {
		super();
		this.id = id;
	}

	public A() {
		id++;
		System.out.println("in A's constr...");
	}

	@Override
	public String toString() {
		return "A [id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

class B extends A {
	private String name;

	public B(int id, String name) {
		super(id);
		this.name = name;
	}

	public B() {
		System.out.println("in B's constr....");
		name = "xyz";

	}

	@Override
	public String toString() {
		return "B " + super.toString() + "name=" + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String nm) {
		name = name.concat(nm);
	}

}
