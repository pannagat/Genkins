final class finalexam
{
double pi=3.14;
double r;
double a;
//final 
void add()
{
a=pi*r*r;
System.out.println(a);
}
}
class finalexam2 extends finalexam
{
void add()
{
a=2*pi*r;
System.out.println(a);
}
}


class test
{
public static void main(String args[])
{
finalexam2 f1=new finalexam2();
f1.pi=3.15;
f1.r=10.8;
f1.add();
}
}
