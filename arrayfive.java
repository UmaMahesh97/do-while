public class Main
{
public static void main(String[] args) {
   int a[]={ 1,2,3,4,5};
   int b[]={ 6,7,8,9,10};
   int i,j;
   int c[]=new int[5];

for(i=0;i<a.length;i++)
{
 
       if(i%2!=0)
       {
           c[i]=a[i];
       }
       else{
           c[i]=b[i];
       
           }
           System.out.println(c[i]);
}
}
}