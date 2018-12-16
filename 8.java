
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
		String s3="string example";
		System.out.println("s1.compareTo(s2) : "+s1.compareTo(s2));
		System.out.println("s1.equalsIgnoreCase(s2) : "+s1.equalsIgnoreCase(s2));
		System.out.println("s1.startsWith(\"th\") : "+s1.startsWith("th"));
		System.out.println("s3.endsWith(\"ple\") : "+s3.endsWith("ple"));
		
	}
}
