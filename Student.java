import java.util.Scanner;
class Student{
int usn;
String name;
String branch;
String phone;

 public static void main(String args[]){

   Scanner sc=new Scanner(System.in);
System.out.println("enter no of student");
int n=sc.nextInt();
Student []s=new Student[n];
int i;
for(i=0;i<n;i++)

{
s[i]=new Student();
 System.out.println("student no"+(i+1));
   System.out.print("Enter Your ID : ");
   int id=sc.nextInt();
	s[i].usn=id;
   System.out.print("Enter Your Name : ");
   String name1=sc.next();
	s[i].name=name1;
   System.out.println("enter branch");
	String b=sc.next();
s[i].branch=b;
System.out.println("enter phone no");
String p=sc.next();
s[i].phone=p;
 }
for(i=0;i<n;i++)
{
System.out.println("name:"+s[i].name+"\t usn:"+s[i].usn+"\tbranch:"+s[i].branch+"\tphone:"+s[i].phone);

}
}
}

