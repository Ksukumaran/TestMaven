package basic2;

import org.apache.logging.log4j.*;

public class Logger {
	
	public static org.apache.logging.log4j.Logger log = LogManager.getLogger(Logger.class.getName());
	
	public static void main(String[] args) {
		log.debug("THis is a debug message");
		log.info("THis is an info message");
		log.error("THis is an error message");
		log.fatal("This is fatal");
		
	}
}
