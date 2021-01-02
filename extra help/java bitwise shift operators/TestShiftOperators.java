package test;

public class TestShiftOperators {

	public static void main(String[] args) {
		int a = 20;
		int b = -20;
		// signed left shift operator
		System.out.println("a<<2=" + (a << 2));
		System.out.println("b<<2=" + (b << 2));
		// signed right shift operator
		System.out.println("a>>2=" + (a >> 2));
		System.out.println("b>>2=" + (b >> 2));
		//un signed right shift (always fills 0 irrespective of the sign of the number)
		System.out.println("a>>>2=" + (a >>> 2));
		System.out.println("b>>>2=" + (b >>> 2));
		System.out.println("-20 in bin "+Integer.toBinaryString(b));
		String s=String.format("%32s",Integer.toBinaryString(b >>> 2)).replace(' ', '0');
		System.out.println("b>>>2 in bin =" +s);
		System.out.println("b >>> 30="+(b >>> 30));
	}

}
