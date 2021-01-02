package test;

public class TestVarArgs {

	public static void main(String[] args) {
		//different ways of calling
		System.out.println(sumIt(1,2,3));
		System.out.println(sumIt(new int[] {2,3,4}));
		System.out.println(sumIt());
		

	}
	static double sumIt(int...ints)
	{
		int sum=0;
		for(int i : ints)
			sum +=i;
		return sum;
	}

}
