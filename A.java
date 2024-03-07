public class A{

	public static void main(String[] args) {
		 int n=5;
	       for(int i=1;i<=n;i++)
	       {
	    	   for(int j=1;j<=n;j++)
	    	   {
	    		   if(i+j==n+1 ||  (i==j && i<=n/2+1))
	    		   {
	    			   System.out.print("*");
	    		   }
	    		   else
	    		   {
	    			   System.out.print(" ");
	    		   }
	    	   }
	    	   
	    	   for(int j=n;j<=n;j++)
	    	   {
	    		   if(i==5)
	    		   {
	    			   System.out.print("*");
	    		   }
	    		   else
	    		   {
	    			   System.out.print(" ");
	    		   }
	    	   }
	    	   System.out.print("  ");
	    	   for(int j=1;j<=n;j++)
	    	   {
	    		   if(j==1 && i<n/2+1 || i-j==n/2 || i+j==n+n/2+1 || j==n && i<=n/2+1)
	    		   {
	    			   System.out.print("*");
	    		   }
	    		   else
	    		   {
	    			   System.out.print(" ");
	    		   }
	    	   }
	    	   for(int j=n;j<=n;j++)
	    	   {
	    		   if(i==5)
	    		   {
	    			   System.out.print("*");
	    		   }
	    		   else
	    		   {
	    			   System.out.print(" ");
	    		   }
	    	   }
	    	   System.out.print("  ");
	    	   for(int j=1;j<=n;j++)
	    	   {
	    		   if(j==1 || j==n || i==(n+2)/2)
	    		   {
	    			   System.out.print("*");
	    		   }
	    		   else
	    		   {
	    			   System.out.print(" ");
	    		   }
	    	   }
	    	   
	    	   System.out.print("  ");
	    	   
	    	   for(int j=1;j<=n;j++)
	        	{
	        		if(i==1 || j==1 || i==n ||i==(n+2)/2)
	        		{
	        			System.out.print("*");
	        		}
	        		else
	        		{
	        			System.out.print(" ");
	        		}
	        	}
	    	   System.out.print("  ");
	    	   for(int j=1;j<=n;j++)
	        	{
	        		if(j==1 || (i==j && i<=n/2+1)|| i+j==n+1 && i<=n/2+1 || j==n)
	        		{
	        			System.out.print("*");
	        		}
	        		else
	        		{
	        			System.out.print(" ");
	        		}
	        	}
	    	   System.out.print("  ");
	    	   for(int j=1;j<=n;j++)
	    	   {
	    		   if(j==1 || j==n || i==(n+2)/2 || i==1)
	    		   {
	    			   System.out.print("*");
	    		   }
	    		   else
	    		   {
	    			   System.out.print(" ");
	    		   }
	    	   }
	    	   System.out.print("  ");
	    	   for(int j=1;j<=n;j++)
				{
					if(j==1 || i==j || j==n)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
	    	   System.out.print("  ");
	    	   for(int j=1;j<=n;j++)
				{
					if(i==1  || j==n/2+1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
	    	   System.out.print("  ");
	    	   for(int j=1;j<=n;j++)
	    	   {
	    		   if(j==1 || j==n || i==(n+2)/2)
	    		   {
	    			   System.out.print("*");
	    		   }
	    		   else
	    		   {
	    			   System.out.print(" ");
	    		   }
	    	   }
	    	   System.out.println( );
	       }
	}

}
