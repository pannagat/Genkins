interface example
{
void add();
final int a=86;
final int b=2;



}
class exam implements example
{
int c;
public void add()
{
c=a*b;
System.out.println(c);
}
}
class exam2 implements example
{
int c;
public void add()
{
c=a/b;
System.out.println(c);
}
}
class test
{
public static void main(String args[])
{
example e1=new exam();

e1.add();
}
}


