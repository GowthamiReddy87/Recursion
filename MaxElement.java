public class MaxElement
{
public static int max(int arr[])
{
int max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
}
return max;
}
public static void main(String[] args)
{
int arr[]={2,6,1,8,3,7,5};
System.out.println(max(arr));
}
}