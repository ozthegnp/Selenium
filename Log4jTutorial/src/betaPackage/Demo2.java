package betaPackage;

import org.apache.logging.log4j.*;
 
public class Demo2 {
	
	private static Logger Log = LogManager.getLogger(Demo2.class.getName());

	public static void main(String[] args) {
	
		Log.debug("I am debug"); 
		
		if(true) {
			Log.error("I am error"); 
			Log.info("I am info"); 

			
		} 
		
	}

}
