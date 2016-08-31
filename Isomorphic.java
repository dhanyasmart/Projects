import java.io.*;
import java.util.*;
class Isometric
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
String r="";
String s1=sc.next();
//if(s.length()==s1.length());

for(int i=0;i<s.length();i++)
{
s = s.replace(s.charAt(i),s1.charAt(i));
System.out.println(s);
}

if(s.equals(s1))
System.out.println("isometric");

else
System.out.println("not isometric");

}
}

