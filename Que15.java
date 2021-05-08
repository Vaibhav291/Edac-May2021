import java.util.*;

class Que15
{
   public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
     
     System.out.println("Enter 2 values");
     
     int i= sc.nextInt();
     int j= sc.nextInt();
     int temp;
    
     System.out.println(i);
     System.out.println(j);
     temp=i;
     i=j;
     j=temp;
   
     System.out.println("After swapping i: "+i);
     System.out.println("After swapping j: "+j);
}

}