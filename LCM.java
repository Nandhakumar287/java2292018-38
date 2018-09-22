import java.io.*;
import java.util.*;
  public class LCM{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Integer:");
      int a=sc.nextInt();
	  int ac=a;
	  System.out.println("Enter b Integer:");
      int b=sc.nextInt();
	  int bc=b;
      while(a != b)
        {
            if(a > b)
                a -= b;
            else
                b -= a;
        }
		int ans=(ac*bc)/a;
        System.out.println("L.C.M = " +ans);
     }
   }  
