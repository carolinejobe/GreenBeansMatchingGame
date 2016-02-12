import java.util.Date;
import java.util.TimerTask;


public class Timer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0L;

		while (elapsedTime < 2*60*1000) {
		    elapsedTime = (new Date()).getTime() - startTime;
		}
	}
}
