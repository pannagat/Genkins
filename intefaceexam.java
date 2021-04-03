interface intefaceexam
{

void area();
final double pi=3.14;
final double r=20.2;
}
class exam implements intefaceexam
{
void area()

{
a=pi*r*r;
System.out.println(a);
}
}

class test
{
public static void main(String args[])
{
intefaceexam e1=new exam2();

e1.area();
}
}


