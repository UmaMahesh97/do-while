public class arraytwo
{
public static void main(String[] args) {
int a[]= {1,2,3,4};
     int b[]= {3,4,5,6};
     int i,j,count=0;
     for(i=0;i<a.length;i++)
     {
         for(j=0;j<b.length;j++)
         {
             if (a[i]==b[j])
             {
                 count++;
                System.out.println(a[i]);
             }
         }
   
     }
     System.out.println("the total no of  common numbers are"+count);
}
}
