import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class HelloWorld {
	private static Logger logger = LogManager.getLogger(HelloWorld.class);
	

	public static void main(String[] args) {
		System.out.println("huhu");
		
		Configurator.setRootLevel(Level.ERROR);
		
		logger.trace("Trace Message!");
		logger.debug("Debug Message!");
		logger.info("Info Message!");
		logger.warn("Warn Message!");
		logger.error("Error Message!");
		logger.fatal("Fatal Message!");
		
		Person p1 = new Person("Susi");

	}

}
