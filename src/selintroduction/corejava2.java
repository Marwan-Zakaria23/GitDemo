package selintroduction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.print.DocFlavor.STRING;


public class corejava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr2= {1,6,7,8,9,5,4,3,2,23,22,45,24,32,54};
		 
		 for(int i=0;i<arr2.length;i++)
		if(arr2[i]  %2==0)
		{
			System.out.println(arr2[i]);
	    break;	
		}
	 
		else
		{
			 System.out.println(arr2[i]+"not multiple by 2"  );
	
		}
			List <String> a = new ArrayList<String>();
			a.add("marwan");
			a.add("ahmed");
			a.add("mohmed");
			{System.out.append(a.get(1));}

			for(int i=0; i<a.size();i++)
			
			{
				System.out.println(a.get(i));
			
			}

			System.out.println(222222222);
			for (String  val:a )
			
			System.out.println(val);
			{	
	}
			
			String[]  name={"marwan","mohmed","ahmed"};
			 	 List <String>  namearraylist= Arrays.asList(name);
		namearraylist.contains("marwan");
			

			
			
			
			 		
			  
		 
		 
		 
	}

}
