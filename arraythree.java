public class arrayfour
{
public static void main(String[] args) {
int a[]={1,2,3,4,5,6};
int i,sum=0;
for(i=0;i<a.length;i++)
{
   if(i%2!=0)
   {
       sum=sum+a[i]*i;
   }
}
      System.out.println(sum);
}
}
