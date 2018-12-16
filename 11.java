
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s1="this is an example";
		String s2="this is an EXAMPLE";
		System.out.println("s1 : "+s1);
		System.out.println("s1.splt(\" \") : "+Arrays.toString(s1.split(" ")));
		System.out.println("s1.splt(\"is\",2) : "+Arrays.toString(s1.split("is",2)));

	}
}
