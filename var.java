import java.lang.*;
class var{
 void lar(int ...x)
{
int min=x[0];
int i=1;
while(i<x.length){
if (x[i]>min){
min=x[i];
}
i++;
}
System.out.println("largest no is: "+min);
}
public static void main(String arg[]){
var e1=new var();
e1.lar(2,889,12,90,100,102,10000);
e1.lar(100,200,300,400,500);
}
}
