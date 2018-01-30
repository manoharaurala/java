import java.io.*;
class   Emp{
int id;
Emp()
{
this.id=0;
}
Emp(int id)
{
this.id=id;
}
}







class swapo{
public static void swap1(Emp e1,Emp e2){
Emp temp=new Emp();
temp=e1;
e1=e2;
e2=temp;
System.out.println(" swap inside function emp 1 id\t"+e1.id+"emp 2 id\t"+e2.id);
}

public static void main(String arg[])
{
Emp e1=new Emp(10);
Emp e2=new Emp(20);
System.out.println("emp1 id\t"+e1.id+"emp 2 id\t"+e2.id);
swap1(e1,e2);
System.out.println(" after out of fuction emp1 id\t"+e1.id+"emp 2 id\t"+e2.id);
}
}
