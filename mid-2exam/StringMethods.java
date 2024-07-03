import java.util.*;
class StringMethods
{
public static void main(String args[])
{
String s="cse";
String s1="hello";
String s2="cse";
System.out.println("String constant Pool Checking : "+(s==s1));
System.out.println("String constant Pool Checking : "+(s==s2));
String s3=new String("JaiSriRam");
String s4=new String("JaiSriRam");
System.out.println("Heap Checking : "+(s3==s4));
String s5="java programming";
System.out.println("Second character in cse : "+s.charAt(1));
char c[]=new char[10];
s5.getChars(5,12,c,2);
for(int i=0;i<c.length;i++)
{
System.out.println("Index-"+i+ " : "+c[i]);
}
String s6="hello java, hello python, hello C";
System.out.println("Position of hello from begining in string s6 : "+s6.indexOf("hello"));
System.out.println("Position of hello from begining in string s6 after 0 : "+s6.indexOf("hello",1));
System.out.println("Position of hello from last in string s6 : "+s6.lastIndexOf("hello"));
System.out.println("substring of string s6[from 12 to 24] : "+s6.substring(12,24));
System.out.println("Length of the string s6 : "+s6.length());
System.out.println("Concatenation to string s1 : "+s.concat("branch"));
System.out.println("Region Matches : "+s1.regionMatches(true,0,s6,12,5));
System.out.println("Replace['C' with 'c' in string s6] : "+s6.replace('C','c'));
System.out.println("Startswith : "+s5.startsWith("java"));
System.out.println("endswith : "+s5.endsWith("ing"));
String s7=new String(" StringTrimMethod ");
System.out.println("Before using Trim Method : "+s7);
System.out.println("After using Trim Method : "+s7.trim());
}
}
