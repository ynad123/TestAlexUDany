import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person {
	private static int globalIdCounter = 0;
	private static Logger logger = LogManager.getLogger(Person.class);
	
	
	private String name;
	private int id;
	
	public Person(String name) {
		this.name = name;
		this.id = globalIdCounter;
		globalIdCounter++;
		logger.debug("Info Message! Neue Person erzeugt, current counter: " + globalIdCounter);
	}
	
	public String toString() {
		return "Person: " + name;
	}
	
}
