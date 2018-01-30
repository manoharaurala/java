import java.util.*;
class Stk{
int []a=new int[5];
int max=5;
int size=0;
void push(int n)
{
if (size>max-1)
{
System.out.println("Stack is overflow");
}
else{
a[size]=n;
size++;
}
}
void pop()
{
if(size==0)
{
System.out.println("stack is underflow");
}
else{
System.out.println("poped element is"+a[size-1]);
size--;
}
}
void show()
{
if(size==0){
System.out.println("stack is empty");
}
else{
for(int i=0;i<size;i++)
{
System.out.println(a[i]+"\t");
}
}
}
public  static void main(String arg[])
{
Stk s1=new Stk();
while(true){
System.out.println("1.push 2.pop 3.show 4.exit");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
switch(n)
{
case 1:
System.out.println("enter a no");
int m=sc.nextInt();
s1.push(m);
break;
case 2:
s1.pop();break;
case 3:
System.out.println("stack element is");
s1.show();break;
case 4:System.exit(0);
}
}
}
}


