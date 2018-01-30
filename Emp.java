import java.io.*;
import java.util.*;
import java.lang.*;
class Emp{

public static void main (String arg[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter id name salary");
String s=br.readLine();
StringTokenizer st=new StringTokenizer(s," ");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken()+"\n");
}
}
}
