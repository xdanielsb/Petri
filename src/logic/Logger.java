package logic;
/**
 * Singleton class with lazy initialization
 * @author  Daniel Santos and Guillem Sanyas
 */
public class Logger {
	private static Logger instance;
	private Logger() {
		
	}
	public synchronized static Logger getLogger() {
		if(instance == null) instance = new Logger();
		return instance;
	}
	public void log( String msg ) {
		System.out.println(msg);
	}
	
}
