package javaPrograms;

public class PallindromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="madam";
		
		
		    String rev="";
		    
		     for(int i=a.length()-1;i>=0;i--)
		     {
		    	 rev=rev+a.charAt(i);
		     }
	
		     System.out.println(rev);		     

	   if(a.equalsIgnoreCase(rev))
	   {
		   System.out.println("strin pallindrome");
	   }
	
	   else
	   {
		   System.out.println("String is not  a pallindrome");
	   }
	}

}
