package Handsons;
import java.util.*;
import java.util.Scanner;
public class StringConcatination 
{
	public static void main(String[] args) 
	{	
		int count=0;
	         Scanner sc = new Scanner(System.in);
	         System.out.println("Inmate's name:");
	        String name = sc.nextLine();
	         System.out.println("Inmate's father's name:");
	        String fname = sc.nextLine();
	        
	        String s3=name.toUpperCase();
	        String s4=fname.toUpperCase();

	        char[] a1= s3.toCharArray();
	        char[] a2= s4.toCharArray();
	        for(int i=0;i<a1.length;i++)
	        {  
	            if(a1[i]>='A' && a1[i]<='Z')
	             count=1;

	            else {
	                System.out.print("Invalid name1");
	                count=0;
	                break; }
	        }

	        if(count==1)
	        {
	            for(int i=0;i<a2.length;i++)
	           {
	            if(a2[i]>='A' && a2[i]<='Z')
	            count=2;

	            else   {
	            System.out.print("Invalid name");
	            break; }
	       }  

	           }

	       if(count==2) {
	         System.out.print(s3+" "+s4);
	 }
	       /* StringConcatination obj = new  StringConcatination();  
	        
            String c=obj.concat(s3,s4);
            System.out.println(c);
   }
	String concat(String x, String y)
	  {
	      String z;
	     z = x + " " + y;
     return z;
	   }*/
}
}

