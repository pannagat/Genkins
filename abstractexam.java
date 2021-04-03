abstract class abstractexam
{
abstract void add();
int a,b,c;
}
class abstractexam2 extends abstractexam
{
void add()
{
c=a+b;
System.out.println(c);
}
}

class abstractexam3 extends abstractexam2
{
void add()
{
c=a-b;
System.out.println(c);
}
}
class test
{
public static void main(String args[])
{
abstractexam a1=new abstractexam();
a1.a=25;
a1.b=14;
a1.add();
}
}




