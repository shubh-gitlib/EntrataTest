package entrata.support;

import org.apache.log4j.Logger;

public class Log {
	// Initialize log4j instance
	private static Logger Log = Logger.getLogger(Log.class.getName());

	// Info level logs
	public static void info(String message) {
		Log.info(message);
	}
}
