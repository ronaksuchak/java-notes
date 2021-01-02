WHY Java ?

1. Platform or architecture independent
(Write once run anywhere!)
2. Simple & robust
3. Secure
4. Automatic memory management.
5. Inherent Multi threaded support
6. Object Oriented support -- Encapsulation,Inheritance & polymorphism , abstraction
7. Excellent I/O support
8. Inherent networking support for TCP/IP , UDP/IP programming & for URLs
......
Development & Execution of java application.
Refer : Java Tutorial slides 4


JDK , JRE & JVM (refer to diagram)


Objective :  Create a java appln to display welcome message on the console.

Writing 1st Java class

A class is a template for object creation.
An Object is an instance of a class.
Objects represent real word entites eg : person,student,faculty,bank account,flight,books etc.
Classes are used to map these real world entities into state(data members) & behaviour(member functions/methods)
Classes & objects map 2 key concepts of OOP --encapsulation & abstraction.


Naming conventions 
class , interfaces , enum names-  1st letter of 1st word must start with upper case & then follow camel case notation.
eg : HelloWorld
data members/methods(functions) --  1st must start with lower case & then follow camel case notation
eg : performanceIndex
calculateSalary

constants -- all uppercase.
eg : PI

Rules on Identifiers

1. Identifiers must start with a letter, a currency character ($), or a connecting character such as the underscore ( _ ),  cannot start with a number!
2. Can't use a Java keyword as an identifier. 
3. Are Case sensitive 


Access specifiers 
private
default(package private) --no access modifier
protected
public



Legal class level access specifiers - 
1. default(scope=current package only)
2. public (scope=accessible form any where)




Objective --- Write Java application , to say hello to user. User name will be supplied as cmd line argument.
(eg : java SayHello Madhra
O/P Hello , Madhura !)

Objective : accept 2 nums as cmd line args , add them & display the result.



Java API -- java docs
java.lang  => pkg name  --default
Integer -- class 
public static int parseInt(String s) throws NumberFormatException
(In case of un parseable integers.)
eg : int num1=Integer.parseInt(args[0]);

Reference for Java documentation 
Java Docs.
Refer to java docs for any explanation of classes/methods..

Basic rules 
1. Java compiler doesn't allow accessing of un initialized data members.
2. Files with no public classes(default scoped) can have a name that does not match with any of the classes in the file .
3. A file can have more than one non public class.
4. There can be only one public class per source code file.
5. If there is a public class in a file, the name of the file must match the name
of the public class. For example, a class declared as public class Example {....}
must be in a source code file named Example.java.
6. Javac doesn't allow accessing of un-inited vars.
eg : int n;
sop(n);
Emp e;
sop(e);
 String s="abc";
s++; //javac error -- pointer aritmetic not allowed in java

6.  Package related rules later....
If the class is part of a package, the package statement must be the first line
in the source code file, before any import statements that may be present.
7. If there are import statements, they must go between the package statement
(if there is one) and the class declaration. If there isn't a package statement,
then the import statement(s) must be the first line(s) in the source code file.
If there are no package or import statements, the class declaration must be
the first line in the source code file.
8. import and package statements apply to all classes within a source code file.
In other words, there's no way to declare multiple classes in a file and have
them in different packages, or use different imports.


Java Data Types 
refer to diagram 

1. primitive data types 
boolean,char,byte,short,long,float,double

What is unicode ?
refer to diagram

2. reference types
class type , array type , interface type

Pointers vs java references
 Pointer arithmatic is not allowed in java.
reference --- holds internal representation of address (equivalent to object pointer in c++)

Conversions regarding primitive types

Automatic conversions(widening ) ---Automatic promotions
byte--->short--->int---> long--->float--->double
char ---> int

long --->float ---is considered automatic type of conversion(since float data type can hold larger range of values than long data type)


Rules ---
src & dest - must be compatible, typically dest data type must be able to store larger magnitude of values than  that of src data type.

1. Any arithmetic operation involving byte,short  --- automatically promoted to --int

2. int & long ---> long
3. long & float ---> float
4. byte,short......& float & double----> double

Narrowing conversion --- forced conversion(type-casting)
eg --- 
double ---> int 
float --> long
double ---> float 


Revise operators & control structures from : Java tutorial slides.


Steps for attaching scanner , to accept inputs from User.(UI)
 
What is Scanner ?
A class (java.util.Scanner)  that represents text based parser(has inherent small ~ 1K buffer)
It can parse text data from any source --Console input,Text file , socket, string

Steps

1. import java.util.*; or import java.util.Scanner;
2. create instance of Scanner class
Scanner class constructor
public  Scanner (InputStream in)
System.in --- standard input (stdin)
usage -- Scanner sc=new Scanner(System.in);

3. To check data type 
public boolean hasNextInt(),
public boolean hasNextByte(),
public boolean hasNextLong()
...
4. To actually read n parse data
public int nextInt() throws InputMismatchException
public double nextDouble() throws InputMismatchException
public String next() 
public String nextLine() 
public boolean nextBoolean() throws InputMismatchException

5. Before terminating application close scanner.
public void close();

Solve : Write java application to accept int(emp id) , double(salary) , emp's first name , is permanent :  boolean from Scanner & display the same using printf.

-----------------------------------------------

Object oriented principles

Class Programming (refer to regarding class n object)

Understand class & object with "house" analogy

Classes are main unit of encapsulation in java.

Encapsulation -- enables of Data hiding ,  Abstraction of behaviour

Data hiding -- achieved by private data members & supplying public setters / getters.

Abstraction -- achieved by supplying an interface to the Client (customer) .Highlighting only WHAT is to be done & not highlighting HOW it's internally implemented.


Advantages ---security
ease of maintenance
ease of usage
ensures easy modification

Syntax of a simple class
public/default class NameOfClass
{
 1. state -- non static data members
 2. constructor/s
 3.actions --member functions (non static methods)
}



Revise constructors 
What is a constructor ?
Why constructor ?
What will happen , if you don't supply a constructor ?
Can they be overloaded ?

Revise "this" keyword
Usages of this
1. To unhide , instance variables from method local variables.(to resolve the conflict)
eg : this.name=name

2. To invoke the constructor ,  from another overloaded constructor in the same class.(constructor chaining , to avoid duplication)
eg : Create a  rectangle with specified x,y,widht,height.
Create a  rectangle with x & y with default values 0 , supply only width & height
Create a default constructor with all values set to 0


Objective --- Create Java application for the following
1. Create a class to represent 3D Box.Provide tight encapsulation
Data members(instance variables=state) -width,height,depth : double --- private


2. Add a constructor-  to init state of a Box
Add Business logic(behaviour) --- 
To display box dimensions (void returning)
To fetch box dimensions (string returning)
To compute volume of a box & return computed volume.


Create a TestBox class , which allows user to supply 3 dimensions  as user i/ps via scanner. Create Box object & display its dimensions & display volume.

Overview of garbage collection
--------------------------------------------
Different Types of variables

method local vars Vs instance data members
method local vars --- allocated on stack, def. -- uninitialized.
inst. data members --- allocated on heap, inited to def vals(eg - boolean -false,int -0,double 0.0, ref-null)


