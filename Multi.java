interface A{
int a=10;
void age();
}
interface B{
int a=20;
void age();

}
class Multi implements A,B{
public void age(){
float age=(A.a+B.a)/2;
System.out.println("average age is: "+age);
}
public static void main(String []arg){
Multi m=new Multi();
m.age();
}
}


