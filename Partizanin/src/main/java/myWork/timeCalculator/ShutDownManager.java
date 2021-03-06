class ShutDownManager 
{ 
	public static void shutDownSystem() 
	{
		String property = System.getProperty("os.name" );		
		System.out.println( property );
		 
		if ( property.toLowerCase().contains("windows") )
		{
			String[] commands = { "shutdown", "-s" }; 
			
			try {
//do something before shutdown..
				Process process = Runtime.getRuntime().exec( commands );
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			} 
		}
		
		if ( property.toLowerCase().contains("linux") )
		{
			String[] commands = { "shutdown", "-p", "now" }; 
			
			try {
//do something before shutdown..
				Process process = Runtime.getRuntime().exec( commands );
				//process.waitFor();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			} 
		}		
	}
}
 
 
public class Main 
{	
	public static void main( String[] args ) 
	{	
		new ShutDownManager().shutDownSystem();		
	}
}
