class Pus{
int a=10;
int b,c;
Pus(int b,int c){
this.b=b;
this.c=c;
System.out.println("class super class constructor");
}
 void prin(){
System.out.println("iniside super class prin() method");

System.out.println("b values is: "+b+"c value is: "+c);

}
}
class Sup extends Pus{
int a=30;
int d,e;
Sup(int a,int m,int n,int o){
super(a,m);
d=n;
e=o;
System.out.println("inside child class constructor");
}
void prin()

{
System.out.println("inside child class");
System.out.println("a value in super class "+super.a);
System.out.println("a value in child class "+a); 
super.prin();
System.out.println("d value is "+d+"e value is "+e);

}
public static void main(String []arg)
{
Sup s=new Sup(100,101,200,201);
s.prin();
}
}



