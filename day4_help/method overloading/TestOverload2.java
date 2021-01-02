/* Solve after autoboxing & var-args*/
package test_overload;
class TestOverload2 
{
	public static void main(String[] args) 
	{
		test(123);
	}
	
	
	static void test(Integer o)
	{
		System.out.println("in Integer version");
	}
	static void test(double o)
	{
		System.out.println("in double version");
	}
	static void test(int... o)
	{
		System.out.println("in int... version");
	}
}
