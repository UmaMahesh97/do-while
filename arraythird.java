public class Main
{
public static void main(String[] args) {
int a[]={1,2,3,4};
int i,sum=0;
for(i=0;i<a.length;i++)
{
   if(i%2==0)
   {
       a[i]=a[i]*a[i]*a[i];
   }
   else
   {
       a[i]=a[i]*a[i];
   }
   sum=sum+a[i];
}
System.out.println(sum);
}
}

