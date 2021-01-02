package enums;

// An enumeration of Colors 
enum Colors {
	RED(10), YELLOW(20), GREEN(30), BLUE(40), ORANGE(50);
	//public static final Colors RED=new Colors("RED",0);
	private int code;
	private Colors(int code) {
		System.out.println("in constr "+code);
		this.code=code;
	}
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
	
}

class EnumDemo {
	public static void main(String args[]) {
		System.out.println("in  main");
		Colors c;

		c = Colors.GREEN;
		System.out.println(c.name()+" "+c.ordinal()+" "+c.getClass().getName());

/*		// Output an enum value.
		System.out.println("Value of clr: " + c);

		// Compare two enum values.
		if (c == Colors.GREEN)
			System.out.println("Color is green\n");

		// Use an enum to control a switch statement.
		switch (c) {
		case RED:
			System.out.println("1");
			break;
		case GREEN:
			System.out.println("2");
			break;
		case BLUE:
			System.out.println("3");
			break;
		case YELLOW:
			System.out.println("4");
			break;
		case ORANGE:
			System.out.println("5");
			break;
		}
*/	}
}
