package alphaPackage;

import org.apache.logging.log4j.*;
 
public class Demo {
	
	private static Logger Log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
	
		Log.debug("I am debug"); 
		
		if(true) {
			Log.error("I am error"); 
			Log.info("I am info"); 

			
		} 
		
	}

}
