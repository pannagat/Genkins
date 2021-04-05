class duplicatearray

{
public static void main(String args[])

{
int arr[]=new int[]{10,25,36,4,4,36,2,2};
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
System.out.println(arr[j]);
}
}
}
}
}
