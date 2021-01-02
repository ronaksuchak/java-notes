Java Identifiers

In Java an identifier can be a 
class name
method name
variable name 

public class Test
{
	public static void main(String[] args)
	{
		boolean exit=true;
	}
}

What is ?
Test : 
main : 
String : 
args : 
exit :  variable name.

Rules for defining Java Identifiers
Valid identifiers for java & other languages like C,C++ are

1. The legal characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), ‘$‘(dollar sign) and ‘_‘ (underscore).

2. Identifiers should not start with digits([0-9]). 

3. Java identifiers are case-sensitive.
4. There is no limit on the length of the identifier
5. Reserved Words can’t be used as an identifier. 

Reserved Words
Keywords & literals

keywords(eg : if , boolean,while etc)  define functionalities and literals(true,false,null) defines a value.

---------------------------
 c, c++,java are statically typed languages
--where data type type is already known at compile time.
Once a variable is declared to be of a certain data type, it cannot hold values of other data types.

Dynamically typed languages -- javascript,  Ruby, Python

Java is  strongly-typed programming language 
--primitive data types (such as integer, character, etc.) are predefined as part of the language and all constants or variables defined  must be described with one of the data types (no type inferencing is supported)

Solve examples of primitive types.


Automatic conversions(widening ) ---Automatic promotions
byte--->short--->int---> long--->float--->double
char ---> int
Rules ---
src & dest - must be compatible, typically dest data type must have higher precision that src data type.
Any arithmetic operation involving bytes --- result type=int
Any arithmetic op involving short --- result type=int
int & long ---> long
long & float ---> float
byte,short......& float & double----> double

Narrowing conversion --- forced conversion(type-casting)
eg --- 
double ---> int 
double ---> float 


Steps for attaching scanner -- 
What is Scanner ?
A class that represents text based parser.
It can parse text data from any source --Console input,Text file , socket, string


Steps ?

1. import java.util.*; or import java.util.Scanner;
2. create instance of Scanner class
constr -- Scanner (InputStream in)
System.in --- stdin
usage -- Scanner sc=new Scanner(System.in);
3.To check data type 
boolean hasNextInt(),hasNextByte(),hasNextLong()......

4. To read data
int nextInt() throws InputMismatchException
double nextDouble() throws InputMismatchException
String next(),String nextLine(),boolean nextBoolean()....

-----------------------------------------------

Object oriented principles

Class & Object

Classes and Objects are basic concepts of Object Oriented Programming which revolve around the real life entities.

Class

A class is a user defined blueprint or prototype from which objects are created.
It represents the set of properties or methods that are common to all objects of one type. 

Class declaration includes 

1. Access specifiers  : A class can be public or has default access 
2. Class name: The name should begin with a capital  letter & then follow camel case convention
3. Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. (Implicit super class of all java classes is java.lang.Object)
4. Interfaces(if any): A comma-separated list of interfaces implemented by the class, if  any, preceded by the keyword implements. A class can implement more than one interface.
5. Body: The class body surrounded by braces, { }.

6. Constructors are used for initializing new objects. 
7. Fields are  variables that provides the state of the class and its objects
8. Methods are used to implement the behavior of the class and its objects.

eg : Student,Employee,Flight,PurchaseOrder, Shape ,BankAccount

Object

It is a basic unit of Object Oriented Programming and represents the real life entities.  A typical Java program creates many objects, which  interact by invoking methods.

An object consists of :

State : It is represented by attributes of an object. (properties of an object)
Behavior : It is represented by methods of an object (actions upon data)
Identity : It gives a unique identity to an object and enables one object to interact with other objects. eg : Emp id / Student PRN / Invoice No 

Creating an object

The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory. The new operator also invokes the class constructor.

Constructor -- is a special method having
same name as the class name
no explicit return type 
may be parameterized or parameter less.

Parameterized constructor is used init state of the object.

If a class does not explicitly declare any constr , the Java compiler automatically provides a no-argument constructor,called the default constructor. 

This default constructor implicitely calls the super class's  no-argument constructor 

Encapsulation in Java

Encapsulation is defined as the wrapping up of data & code under a single unit. It is the mechanism that binds together code and the data it manipulates.
It's is a protective shield that prevents the data from being accessed by the code outside this shield.

The variables or data of a class is hidden from any other class and can be accessed only through any member function/method of own class in which they are declared.

As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.


Tight Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods as its accessors.

eg : Create tightly encapsulated Box class , supply public accessors. 
Write a Tester with main(..) 

Advantages of Encapsulation:

1. Data Hiding (security)
2. Increased Flexibility: We can make the variables of the class as read-only or write only or r/w.
3. Reusability: Encapsulation also improves the re-usability and easy to change with new requirements.
4. Testing code is easy

Summary

Encapsulation -- consists of Data hiding + Abstraction

Information hiding -- achieved by private data members & supplying public accessors.

Abstraction -- achieved by supplying an interface to the Client (customer) .Highlighting only WHAT is to be done & not highlighting HOW it's internally implemented.



Objective --- Modify  earlier Java application for the following.

constr-  to init Box params.
Business logic(behaviour) --- displayBoxDetails(void ret) ,calcVolume(ret vol)

Create Java application -- which allows user to supply 3 dims from user using scanner. --- create Box object & display dims & display vol.
Understand memory picture.

------------------------------

Pointers vs java references

pointer arithmatic is not allowed in java.
reference --- holds internal representation of address --

eg : 
Box b1=new Box(1,2,3);
b1++;
b1 += 10;
String s="hello";
s *= 10;



method local vars Vs instance data members
method local vars --- allocated on stack, def. -- uninitialized.
inst. data members --- allocated on heap, inited to def vals(eg - boolean -false,int -0,double 0.0, ref-null)

Javac doesn't allow accessing ANY (prim type or ref type) un-initialized data member.

Automatic Gargabe Collection --- to avoid mem. leaks/holes

JRE creates 2 thrds --- main thrd(to exec main() sequentially) -- fg thrd
G.C --- daemon thrd ---bg thrd --- gets activated periodically  --- releases the memory occupied by un-referenced objects allocated on the heap(the obj whose no. of ref=0) 
To release/close non- Java resources.(eg - closing of Db conn, closing file handles  is NOT done auto. by GC)
Garbage= un -reachable object.

How to request JVM for GC ?
API
System.gc() -- request/hint to JVM to activate garbage collection.



Array handling

Array of primitive types

Objective -- Accept no of data samples(double) from User
Create array & display --confirm default values.
Accept data from User(scanner) & store it in suitable array.
Display array data from for loop.
for-each syntax.
eg : 
double[] data=new double[10];
//print array contents using for
for(int i=0;i<data.length;i++)
  sop(data[i]);
//print array contents using for-each (enhanced for loop)
for(double d : data) //d=data[0],d=data[1]....., d=data[data.length-1]
  sop(d);



Array of References

Objective --- Accept from user --- no of boxes to be made.
Accept box dims from user & display box dims using for-each
int[] ints=new int[5];
eg : sop(....);
Box[] boxes;
boxes=new Box[sc.nextInt()];
for(....)
{
   sop(...);
   boxes[i]=new Box(.....);
}
for(Box b : boxes) //b=boxes[0]
  b.displayDims();

--------------------------
Regarding Packages

What is a package ?
Collection of functionally similar classes & interfaces.

Creating user defined packages
Need ?
1. To group functionally similar classes together.
2. Avoids name space collision
3. Finer control over access specifiers.

About Packages 
1. Creation : package stmt has to be placed as the 1st stmt in Java source.
eg : package p1; => the classes will be part of package p1.
2.Package names are mapped to folder names.
eg : package p1; class A{....}
A.class must exist in folder p1.
3.  For simplicity --- create folder p1 -- under <src> & compile from <src>
From <src>
javac -d ..\bin p1\A.java

-> javac will auto. create the sub-folder <p1> under the <bin> folder & place A.class within <p1>



NOTE : Its not mandatory to create java sources(.java) under package named folder. BUT its mandatory to store packged compiled classes(.class) under package named folders

Earlier half is just maintained as convenience(eg --- javac can then detect auto. dependencies & compile classes ).


4. To run the pkged classes from any folder : you must set Java specific  env var. : classpath
set classpath=g:\dac1\day2\bin;



classpath= Java only env .var
Used mainly by JRE's classloader : to locate & load the classes.
Classloader will try to locate the classes from current folder, if not found --- will refer to classpath entries : to resolve & load Java classes.

What should be value of classpath ---Must be set to top of pakged hierarchy(i.e .class eg : bin) 
set classpath=G:\dac\dac1\day2\bin;(cmd line invocation)
OR better still
set it from environment variables.
-----------------------------------------------