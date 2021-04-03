interface example
{
abstract void add();
int a,b,c;
}
class exam implements example
{
void add()
{
c=a*b;
System.out.println(c);
}
}
class exam2 implements example
{
c=a/b;
System.out.println(c);
}
}
class test
{
public static void main(String args[])
{
example e1=new exam2();
e1.a=86;
e1.b=2;
e1.add();
}
}


