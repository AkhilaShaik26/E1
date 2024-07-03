class BufferAndBuilderToTheString
{
public static void main(String[] args)
{
StringBuffer sbr = new StringBuffer("Java");
StringBuilder sbdr = new StringBuilder("Python");
String str = sbr.toString();
System.out.println("StringBuffer object to String : "+str);
String str1 = sbdr.toString();
System.out.println("StringBuilder object to String : "+str1);
sbr.append("Programming");
System.out.println(sbr);
System.out.println(str);
}
}
