class overload
{

double area(double a,double b)
{
return a+b;

}

double area(double a,double b,double c)
{
return a+b-c;

}
}
class test
{
public static void main(String args[])
{

overload o1=new overload();
double f;
f=o1.area(25.5,15.1);
System.out.println(f);

f=o1.area(25.5,15.1,10.2);
System.out.println(f);
}
}
