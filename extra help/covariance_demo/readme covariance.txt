Regarding co variance
Overrding form of method --- 
has  same method name, same signature, ret type must be same or its sub-type(co-variance)

eg of co-variance
class A {
    A getInstance()
	{
                    return new A();
	}
}

class B extends A
{
    B getInstance()
	{
                    return new B();
	}
}

Solve eg in covariance demo.
