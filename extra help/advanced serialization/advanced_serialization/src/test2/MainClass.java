package test2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A {
	private int a = 10;

	public A() {
		System.out.println("A Constructor");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}

class B extends A {
	private int b = 15;

	public B() {
		System.out.println("B Constructor");
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}

class C extends B implements Serializable {
	private int c = 25;

	public C() {
		System.out.println("C Constructor");
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
}

class D extends C {
	private int d = 30;

	public D() {
		System.out.println("D Constructor");
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}
}

public class MainClass {

	public static void main(String[] args) {
		try {

			System.out.println("/****** SERIALIZATION ******/");
			D d = new D();
			d.setA(100);
			d.setB(101);
			d.setC(102);
			d.setD(103);

			try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test2.ser"))) {
				out.writeObject(d);
			}

			System.out.println("/****** DE-SERIALIZATION ******/");
			D d1=null;
			try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("test2.ser")))
			{
				d1=(D)in.readObject();
			}
			
			System.out.println(d1.getA());
			System.out.println(d1.getB());
			System.out.println(d1.getC());
			System.out.println(d1.getD());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}